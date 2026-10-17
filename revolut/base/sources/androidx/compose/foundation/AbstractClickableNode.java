package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.HoverInteraction$Enter;
import androidx.compose.foundation.interaction.HoverInteraction$Exit;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.g1;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\b!\u0018\u0000 x2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0002wxBM\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u00104\u001a\u00020\u000eH\u0002J\n\u00107\u001a\u0004\u0018\u00010$H&J\f\u00108\u001a\u00020\u0016*\u000209H\u0016JS\u0010:\u001a\u00020\u00162\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0004¢\u0006\u0002\b;J\u0018\u0010<\u001a\u00020\u00162\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020\u0016H\u0016J\u0006\u0010B\u001a\u00020\u0016J\b\u0010C\u001a\u00020\u0016H\u0016J\u0006\u0010D\u001a\u00020\u0016J\b\u0010E\u001a\u00020\u0016H\u0004J\u0010\u0010F\u001a\u00020\u00162\u0006\u0010G\u001a\u00020\u000eH\u0002J\b\u0010H\u001a\u00020\u0016H\u0002J\b\u0010I\u001a\u00020\u0016H\u0002J'\u0010J\u001a\u00020\u00162\u0006\u0010K\u001a\u00020L2\u0006\u0010?\u001a\u00020@2\u0006\u0010M\u001a\u00020NH\u0016¢\u0006\u0004\bO\u0010PJ\b\u0010Q\u001a\u00020\u0016H\u0016J\u0015\u0010R\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020S¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020SH$¢\u0006\u0004\bW\u0010UJ\u0017\u0010X\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020SH$¢\u0006\u0004\bY\u0010UJ\b\u0010Z\u001a\u00020\u0016H\u0014J\u0015\u0010[\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020S¢\u0006\u0004\b\\\u0010UJ\n\u0010_\u001a\u00020\u0016*\u000209J\u000f\u0010`\u001a\u0004\u0018\u00010\u0016H\u0004¢\u0006\u0002\u0010aJ\u001f\u0010d\u001a\u00020\u00162\u0006\u0010e\u001a\u00020.2\u0006\u0010f\u001a\u00020\u000eH\u0004¢\u0006\u0004\bg\u0010hJ\u001f\u0010i\u001a\u00020\u00162\u0006\u0010e\u001a\u00020.2\u0006\u0010f\u001a\u00020\u000eH\u0004¢\u0006\u0004\bj\u0010hJ\u0010\u0010k\u001a\u00020\u00162\u0006\u0010f\u001a\u00020\u000eH\u0004J\u001c\u0010l\u001a\u00020\u0016*\u00020m2\u0006\u0010e\u001a\u00020.H\u0084@¢\u0006\u0004\bn\u0010oJ\b\u0010p\u001a\u00020\u000eH\u0002J\b\u0010q\u001a\u00020\u0016H\u0002J\b\u0010r\u001a\u00020\u0016H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020(0,X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0004\n\u0002\u0010/R\u0010\u00100\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010]\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b^\u0010\u001bR\u0010\u0010b\u001a\u0004\u0018\u00010cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010s\u001a\u00020tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010v¨\u0006y"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/input/indirect/IndirectPointerInputModifierNode;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indicationNodeFactory", "Landroidx/compose/foundation/IndicationNodeFactory;", "useLocalIndication", "", "enabled", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "value", "getEnabled", "()Z", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "focusableNode", "Landroidx/compose/foundation/FocusableNode;", "localIndicationNodeFactory", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "indicationNode", "Landroidx/compose/ui/node/DelegatableNode;", "pressInteraction", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "hoverInteraction", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "currentKeyPressInteractions", "Landroidx/collection/MutableLongObjectMap;", "centerOffset", "Landroidx/compose/ui/geometry/Offset;", "J", "indirectPointerPressInteraction", "indirectPointerEventPressPosition", "userProvidedInteractionSource", "lazilyCreateIndication", "shouldLazilyCreateIndication", "indirectPointerClickDetector", "Landroidx/compose/foundation/AbstractClickableNode$IndirectPointerClickDetector;", "createPointerInputNodeIfNeeded", "applyAdditionalSemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "updateCommon", "updateCommon-O2vRcR0", "onIndirectPointerEvent", "event", "Landroidx/compose/ui/input/indirect/IndirectPointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "onCancelIndirectPointerInput", "onAttach", "onObservedReadsChanged", "onDetach", "disposeInteractions", "onFocusChange", "isFocused", "recreateIndicationIfNeeded", "initializeIndicationAndInteractionSourceIfNeeded", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onCancelPointerInput", "onKeyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onClickKeyDownEvent", "onClickKeyDownEvent-ZmokQxo", "onClickKeyUpEvent", "onClickKeyUpEvent-ZmokQxo", "onCancelKeyInput", "onPreKeyEvent", "onPreKeyEvent-ZmokQxo", "shouldMergeDescendantSemantics", "getShouldMergeDescendantSemantics", "applySemantics", "resetPointerInputHandler", "()Lkotlin/Unit;", "delayJob", "Lkotlinx/coroutines/Job;", "handlePressInteractionStart", "offset", "indirectPointer", "handlePressInteractionStart-3MmeM6k", "(JZ)V", "handlePressInteractionRelease", "handlePressInteractionRelease-3MmeM6k", "handlePressInteractionCancel", "handlePressInteraction", "Landroidx/compose/foundation/gestures/PressGestureScope;", "handlePressInteraction-d-4ec7I", "(Landroidx/compose/foundation/gestures/PressGestureScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delayPressInteraction", "emitHoverEnter", "emitHoverExit", "traverseKey", "", "getTraverseKey", "()Ljava/lang/Object;", "IndirectPointerClickDetector", "TraverseKey", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode, SemanticsModifierNode, TraversableNode, CompositionLocalConsumerModifierNode, ObserverModifierNode, IndirectPointerInputModifierNode {
    private long centerOffset;

    @NotNull
    private final MutableLongObjectMap<PressInteraction.Press> currentKeyPressInteractions;
    private Job delayJob;
    private boolean enabled;

    @NotNull
    private final FocusableNode focusableNode;
    private HoverInteraction$Enter hoverInteraction;
    private DelegatableNode indicationNode;
    private IndicationNodeFactory indicationNodeFactory;
    private IndirectPointerClickDetector indirectPointerClickDetector;
    private Offset indirectPointerEventPressPosition;
    private PressInteraction.Press indirectPointerPressInteraction;
    private MutableInteractionSource interactionSource;
    private boolean lazilyCreateIndication;
    private IndicationNodeFactory localIndicationNodeFactory;

    @NotNull
    private Function0<Unit> onClick;
    private String onClickLabel;
    private SuspendingPointerInputModifierNode pointerInputNode;
    private PressInteraction.Press pressInteraction;
    private Role role;
    private final boolean shouldAutoInvalidate;

    @NotNull
    private final Object traverseKey;
    private boolean useLocalIndication;
    private MutableInteractionSource userProvidedInteractionSource;

    /* JADX INFO: renamed from: TraverseKey, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode$IndirectPointerClickDetector;", "", "Landroidx/compose/foundation/AbstractClickableNode;", "node", "<init>", "(Landroidx/compose/foundation/AbstractClickableNode;)V", "Landroidx/compose/ui/input/indirect/IndirectPointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Lkotlin/Function0;", "", "onClick", "processRawEvent", "(Landroidx/compose/ui/input/indirect/IndirectPointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/jvm/functions/Function0;)V", "resetDetector", "()V", "Landroidx/compose/foundation/AbstractClickableNode;", "getNode", "()Landroidx/compose/foundation/AbstractClickableNode;", "Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;", "downEvent", "Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IndirectPointerClickDetector {
        private IndirectPointerInputChange downEvent;

        @NotNull
        private final AbstractClickableNode node;

        public IndirectPointerClickDetector(@NotNull AbstractClickableNode abstractClickableNode) {
            this.node = abstractClickableNode;
        }

        public final void processRawEvent(@NotNull IndirectPointerEvent pointerEvent, @NotNull PointerEventPass pass, @NotNull Function0<Unit> onClick) {
            int i = 0;
            if (pass != PointerEventPass.Main) {
                if (pass != PointerEventPass.Final || this.downEvent == null) {
                    return;
                }
                List<IndirectPointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                while (i < size) {
                    IndirectPointerInputChange indirectPointerInputChange = changes.get(i);
                    if (indirectPointerInputChange.getIsConsumed() && !indirectPointerInputChange.equals(this.downEvent)) {
                        resetDetector();
                        return;
                    }
                    i++;
                }
                return;
            }
            IndirectPointerInputChange indirectPointerInputChange2 = this.downEvent;
            if (indirectPointerInputChange2 == null) {
                List<IndirectPointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (ClickableKt.changedToDownIgnoreConsumed(changes2.get(i2))) {
                        IndirectPointerInputChange indirectPointerInputChange3 = pointerEvent.getChanges().get(0);
                        this.downEvent = indirectPointerInputChange3;
                        this.node.m594handlePressInteractionStart3MmeM6k(indirectPointerInputChange3.getPosition(), true);
                        indirectPointerInputChange3.consume();
                        return;
                    }
                }
                return;
            }
            List<IndirectPointerInputChange> changes3 = pointerEvent.getChanges();
            int size3 = changes3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                if (ClickableKt.isMovingIgnoreConsumed(changes3.get(i3))) {
                    if (Math.abs(Offset.m1833getDistanceimpl(Offset.m1838minusMKHz9U(pointerEvent.getChanges().get(0).getPosition(), indirectPointerInputChange2.getPosition()))) > ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.node, CompositionLocalsKt.getLocalViewConfiguration())).getTouchSlop()) {
                        resetDetector();
                        return;
                    }
                    return;
                }
            }
            List<IndirectPointerInputChange> changes4 = pointerEvent.getChanges();
            int size4 = changes4.size();
            for (int i5 = 0; i5 < size4; i5++) {
                if (!ClickableKt.changedToUp(changes4.get(i5))) {
                    List<IndirectPointerInputChange> changes5 = pointerEvent.getChanges();
                    int size5 = changes5.size();
                    while (i < size5) {
                        if (changes5.get(i).getIsConsumed()) {
                            resetDetector();
                            return;
                        }
                        i++;
                    }
                    return;
                }
            }
            pointerEvent.getChanges().get(0).consume();
            this.node.m593handlePressInteractionRelease3MmeM6k(indirectPointerInputChange2.getPosition(), true);
            onClick.invoke();
            this.downEvent = null;
        }

        public final void resetDetector() {
            if (this.downEvent != null) {
                this.downEvent = null;
                this.node.handlePressInteractionCancel(true);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.AbstractClickableNode$TraverseKey, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode$TraverseKey;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z3, String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, indicationNodeFactory, z, z3, str, role, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$0(AbstractClickableNode abstractClickableNode) {
        abstractClickableNode.onClick.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean delayPressInteraction() {
        return ClickableKt.hasScrollableContainer(this) || Clickable_androidKt.isComposeRootInScrollableContainer(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitHoverEnter() {
        if (this.hoverInteraction == null) {
            HoverInteraction$Enter hoverInteraction$Enter = new HoverInteraction$Enter();
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                e0.C(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverEnter$1$1(mutableInteractionSource, hoverInteraction$Enter, null), 3);
            }
            this.hoverInteraction = hoverInteraction$Enter;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitHoverExit() {
        HoverInteraction$Enter hoverInteraction$Enter = this.hoverInteraction;
        if (hoverInteraction$Enter != null) {
            HoverInteraction$Exit hoverInteraction$Exit = new HoverInteraction$Exit(hoverInteraction$Enter);
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                e0.C(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverExit$1$1$1(mutableInteractionSource, hoverInteraction$Exit, null), 3);
            }
            this.hoverInteraction = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handlePressInteractionCancel$lambda$0$0$0(MutableInteractionSource mutableInteractionSource, PressInteraction.Cancel cancel, Throwable th10) {
        mutableInteractionSource.tryEmit(cancel);
        return Unit.f186387a;
    }

    private final void initializeIndicationAndInteractionSourceIfNeeded() {
        if (this.indicationNode != null) {
            return;
        }
        IndicationNodeFactory indicationNodeFactory = this.useLocalIndication ? this.localIndicationNodeFactory : this.indicationNodeFactory;
        if (indicationNodeFactory != null) {
            if (this.interactionSource == null) {
                this.interactionSource = InteractionSourceKt.MutableInteractionSource();
            }
            this.focusableNode.update(this.interactionSource);
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            Intrinsics.h(mutableInteractionSource);
            DelegatableNode delegatableNodeCreate = indicationNodeFactory.create(mutableInteractionSource);
            delegate(delegatableNodeCreate);
            this.indicationNode = delegatableNodeCreate;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFocusChange(boolean r18) {
        /*
            r17 = this;
            r0 = r17
            if (r18 == 0) goto L8
            r0.initializeIndicationAndInteractionSourceIfNeeded()
            return
        L8:
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r0.interactionSource
            r2 = 0
            if (r1 == 0) goto L6e
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r1 = r0.currentKeyPressInteractions
            java.lang.Object[] r3 = r1.values
            long[] r1 = r1.metadata
            int r4 = r1.length
            int r4 = r4 + (-2)
            r5 = 3
            if (r4 < 0) goto L5e
            r6 = 0
            r7 = r6
        L1b:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L35:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            androidx.compose.foundation.interaction.PressInteraction$Press r13 = (androidx.compose.foundation.interaction.PressInteraction.Press) r13
            kotlinx.coroutines.CoroutineScope r14 = r0.getCoroutineScope()
            androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1 r15 = new androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1
            r15.<init>(r0, r13, r2)
            skm.e0.C(r14, r2, r2, r15, r5)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L35
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r4) goto L5e
            int r7 = r7 + 1
            goto L1b
        L5e:
            androidx.compose.foundation.interaction.PressInteraction$Press r1 = r0.indirectPointerPressInteraction
            if (r1 == 0) goto L6e
            kotlinx.coroutines.CoroutineScope r3 = r0.getCoroutineScope()
            androidx.compose.foundation.AbstractClickableNode$onFocusChange$2$1 r4 = new androidx.compose.foundation.AbstractClickableNode$onFocusChange$2$1
            r4.<init>(r0, r1, r2)
            skm.e0.C(r3, r2, r2, r4, r5)
        L6e:
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r1 = r0.currentKeyPressInteractions
            r1.clear()
            r0.indirectPointerPressInteraction = r2
            r0.onCancelKeyInput()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.onFocusChange(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onObservedReadsChanged$lambda$0(AbstractClickableNode abstractClickableNode) {
        Indication indication = (Indication) CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractClickableNode, IndicationKt.getLocalIndication());
        if (!(indication instanceof IndicationNodeFactory)) {
            InlineClassHelperKt.throwIllegalArgumentException(ClickableKt.unsupportedIndicationExceptionMessage(indication));
        }
        IndicationNodeFactory indicationNodeFactory = abstractClickableNode.localIndicationNodeFactory;
        IndicationNodeFactory indicationNodeFactory2 = (IndicationNodeFactory) indication;
        abstractClickableNode.localIndicationNodeFactory = indicationNodeFactory2;
        if (indicationNodeFactory != null && !Intrinsics.f(indicationNodeFactory2, indicationNodeFactory)) {
            abstractClickableNode.recreateIndicationIfNeeded();
        }
        return Unit.f186387a;
    }

    private final void recreateIndicationIfNeeded() {
        DelegatableNode delegatableNode = this.indicationNode;
        if (delegatableNode == null && this.lazilyCreateIndication) {
            return;
        }
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.indicationNode = null;
        initializeIndicationAndInteractionSourceIfNeeded();
    }

    private final boolean shouldLazilyCreateIndication() {
        return this.userProvidedInteractionSource == null;
    }

    public void applyAdditionalSemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Role role = this.role;
        if (role != null) {
            SemanticsPropertiesKt.m2838setRolekuIjeqM(semanticsPropertyReceiver, role.getValue());
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.onClickLabel, new e1.a(this, 1));
        if (this.enabled) {
            this.focusableNode.applySemantics(semanticsPropertyReceiver);
        } else {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        applyAdditionalSemantics(semanticsPropertyReceiver);
    }

    public abstract SuspendingPointerInputModifierNode createPointerInputNodeIfNeeded();

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void disposeInteractions() {
        /*
            r15 = this;
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = r15.interactionSource
            if (r0 == 0) goto L74
            androidx.compose.foundation.interaction.PressInteraction$Press r1 = r15.pressInteraction
            if (r1 == 0) goto L10
            androidx.compose.foundation.interaction.PressInteraction$Cancel r2 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
            r2.<init>(r1)
            r0.tryEmit(r2)
        L10:
            androidx.compose.foundation.interaction.PressInteraction$Press r1 = r15.indirectPointerPressInteraction
            if (r1 == 0) goto L1c
            androidx.compose.foundation.interaction.PressInteraction$Cancel r2 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
            r2.<init>(r1)
            r0.tryEmit(r2)
        L1c:
            androidx.compose.foundation.interaction.HoverInteraction$Enter r1 = r15.hoverInteraction
            if (r1 == 0) goto L28
            androidx.compose.foundation.interaction.HoverInteraction$Exit r2 = new androidx.compose.foundation.interaction.HoverInteraction$Exit
            r2.<init>(r1)
            r0.tryEmit(r2)
        L28:
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r1 = r15.currentKeyPressInteractions
            java.lang.Object[] r2 = r1.values
            long[] r1 = r1.metadata
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L74
            r4 = 0
            r5 = r4
        L35:
            r6 = r1[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L6f
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L4f:
            if (r10 >= r8) goto L6d
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L69
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            androidx.compose.foundation.interaction.PressInteraction$Press r11 = (androidx.compose.foundation.interaction.PressInteraction.Press) r11
            androidx.compose.foundation.interaction.PressInteraction$Cancel r12 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
            r12.<init>(r11)
            r0.tryEmit(r12)
        L69:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L4f
        L6d:
            if (r8 != r9) goto L74
        L6f:
            if (r5 == r3) goto L74
            int r5 = r5 + 1
            goto L35
        L74:
            r0 = 0
            r15.pressInteraction = r0
            r15.indirectPointerPressInteraction = r0
            r15.indirectPointerEventPressPosition = r0
            r15.hoverInteraction = r0
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r0 = r15.currentKeyPressInteractions
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.disposeInteractions():void");
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: getShouldMergeDescendantSemantics */
    public final boolean getMergeDescendants() {
        return true;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    @NotNull
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    /* JADX INFO: renamed from: handlePressInteraction-d-4ec7I, reason: not valid java name */
    public final Object m592handlePressInteractiond4ec7I(@NotNull PressGestureScope pressGestureScope, long j2, @NotNull Continuation<? super Unit> continuation) {
        Object objO;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        return (mutableInteractionSource == null || (objO = e0.o(new AbstractClickableNode$handlePressInteraction$2$1(pressGestureScope, j2, mutableInteractionSource, this, null), continuation)) != fim.a.COROUTINE_SUSPENDED) ? Unit.f186387a : objO;
    }

    public final void handlePressInteractionCancel(boolean indirectPointer) {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            Job job2 = this.delayJob;
            if (job2 == null || !job2.d()) {
                PressInteraction.Press press = indirectPointer ? this.indirectPointerPressInteraction : this.pressInteraction;
                if (press != null) {
                    PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                    Job job3 = (Job) getCoroutineScope().getCoroutineContext().get(g1.f263979a);
                    e0.C(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionCancel$1$1$1(mutableInteractionSource, cancel, job3 != null ? job3.k(new e1.b(mutableInteractionSource, cancel, 0)) : null, null), 3);
                }
            } else {
                Job job4 = this.delayJob;
                if (job4 != null) {
                    job4.f(null);
                }
            }
            if (indirectPointer) {
                this.indirectPointerPressInteraction = null;
            } else {
                this.pressInteraction = null;
            }
        }
    }

    /* JADX INFO: renamed from: handlePressInteractionRelease-3MmeM6k, reason: not valid java name */
    public final void m593handlePressInteractionRelease3MmeM6k(long offset, boolean indirectPointer) {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            Job job2 = this.delayJob;
            if (job2 == null || !job2.d()) {
                PressInteraction.Press press = indirectPointer ? this.indirectPointerPressInteraction : this.pressInteraction;
                if (press != null) {
                    e0.C(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$2$1(press, mutableInteractionSource, null), 3);
                }
            } else {
                job2.f(null);
                e0.C(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$1(job2, offset, mutableInteractionSource, null), 3);
            }
            if (indirectPointer) {
                this.indirectPointerPressInteraction = null;
            } else {
                this.pressInteraction = null;
            }
        }
    }

    /* JADX INFO: renamed from: handlePressInteractionStart-3MmeM6k, reason: not valid java name */
    public final void m594handlePressInteractionStart3MmeM6k(long offset, boolean indirectPointer) {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            PressInteraction.Press press = new PressInteraction.Press(offset, null);
            if (delayPressInteraction()) {
                this.delayJob = e0.C(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$1(mutableInteractionSource, press, indirectPointer, this, null), 3);
                return;
            }
            if (indirectPointer) {
                this.indirectPointerPressInteraction = press;
            } else {
                this.pressInteraction = press;
            }
            e0.C(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$2(mutableInteractionSource, press, null), 3);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        onObservedReadsChanged();
        if (!this.lazilyCreateIndication) {
            initializeIndicationAndInteractionSourceIfNeeded();
        }
        if (this.enabled) {
            delegate(this.focusableNode);
        }
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public void onCancelIndirectPointerInput() {
        IndirectPointerClickDetector indirectPointerClickDetector = this.indirectPointerClickDetector;
        if (indirectPointerClickDetector != null) {
            indirectPointerClickDetector.resetDetector();
        }
    }

    public void onCancelKeyInput() {
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        HoverInteraction$Enter hoverInteraction$Enter;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null && (hoverInteraction$Enter = this.hoverInteraction) != null) {
            mutableInteractionSource.tryEmit(new HoverInteraction$Exit(hoverInteraction$Enter));
        }
        this.hoverInteraction = null;
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.onCancelPointerInput();
        }
    }

    /* JADX INFO: renamed from: onClickKeyDownEvent-ZmokQxo, reason: not valid java name */
    public abstract boolean mo595onClickKeyDownEventZmokQxo(@NotNull KeyEvent event);

    /* JADX INFO: renamed from: onClickKeyUpEvent-ZmokQxo, reason: not valid java name */
    public abstract boolean mo596onClickKeyUpEventZmokQxo(@NotNull KeyEvent event);

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        disposeInteractions();
        if (this.userProvidedInteractionSource == null) {
            this.interactionSource = null;
        }
        DelegatableNode delegatableNode = this.indicationNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.indicationNode = null;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public void onIndirectPointerEvent(@NotNull IndirectPointerEvent event, @NotNull PointerEventPass pass) {
        initializeIndicationAndInteractionSourceIfNeeded();
        if (this.enabled) {
            if (this.indirectPointerClickDetector == null) {
                this.indirectPointerClickDetector = new IndirectPointerClickDetector(this);
            }
            IndirectPointerClickDetector indirectPointerClickDetector = this.indirectPointerClickDetector;
            if (indirectPointerClickDetector != null) {
                indirectPointerClickDetector.processRawEvent(event, pass, this.onClick);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[RETURN] */
    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onKeyEvent-ZmokQxo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo597onKeyEventZmokQxo(@org.jetbrains.annotations.NotNull android.view.KeyEvent r10) {
        /*
            r9 = this;
            r9.initializeIndicationAndInteractionSourceIfNeeded()
            long r0 = androidx.compose.ui.input.key.KeyEvent_androidKt.m2395getKeyZmokQxo(r10)
            boolean r2 = r9.enabled
            r3 = 3
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L45
            boolean r2 = androidx.compose.foundation.ClickableKt.m627access$isPressZmokQxo(r10)
            if (r2 == 0) goto L45
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r2 = r9.currentKeyPressInteractions
            boolean r2 = r2.containsKey(r0)
            if (r2 != 0) goto L3b
            androidx.compose.foundation.interaction.PressInteraction$Press r2 = new androidx.compose.foundation.interaction.PressInteraction$Press
            long r7 = r9.centerOffset
            r2.<init>(r7, r5)
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r7 = r9.currentKeyPressInteractions
            r7.set(r0, r2)
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = r9.interactionSource
            if (r0 == 0) goto L39
            kotlinx.coroutines.CoroutineScope r0 = r9.getCoroutineScope()
            androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1 r1 = new androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1
            r1.<init>(r9, r2, r5)
            skm.e0.C(r0, r5, r5, r1, r3)
        L39:
            r0 = r4
            goto L3c
        L3b:
            r0 = r6
        L3c:
            boolean r10 = r9.mo595onClickKeyDownEventZmokQxo(r10)
            if (r10 != 0) goto L6e
            if (r0 == 0) goto L6f
            goto L6e
        L45:
            boolean r2 = r9.enabled
            if (r2 == 0) goto L6f
            boolean r2 = androidx.compose.foundation.ClickableKt.m626access$isClickZmokQxo(r10)
            if (r2 == 0) goto L6f
            androidx.collection.MutableLongObjectMap<androidx.compose.foundation.interaction.PressInteraction$Press> r2 = r9.currentKeyPressInteractions
            java.lang.Object r0 = r2.remove(r0)
            androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
            if (r0 == 0) goto L6c
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r9.interactionSource
            if (r1 == 0) goto L69
            kotlinx.coroutines.CoroutineScope r1 = r9.getCoroutineScope()
            androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2 r2 = new androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2
            r2.<init>(r9, r0, r5)
            skm.e0.C(r1, r5, r5, r2, r3)
        L69:
            r9.mo596onClickKeyUpEventZmokQxo(r10)
        L6c:
            if (r0 == 0) goto L6f
        L6e:
            return r4
        L6f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.mo597onKeyEventZmokQxo(android.view.KeyEvent):boolean");
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        if (this.useLocalIndication) {
            ObserverModifierNodeKt.observeReads(this, new e1.a(this, 0));
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public void mo598onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds) {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNodeCreatePointerInputNodeIfNeeded;
        long jM3360getCenterozmzZPI = IntSizeKt.m3360getCenterozmzZPI(bounds);
        this.centerOffset = Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m3334getXimpl(jM3360getCenterozmzZPI))) << 32) | (((long) Float.floatToRawIntBits(IntOffset.m3335getYimpl(jM3360getCenterozmzZPI))) & BodyPartID.bodyIdMax));
        initializeIndicationAndInteractionSourceIfNeeded();
        if (this.enabled && pass == PointerEventPass.Main) {
            int iM2440getType7fucELk = pointerEvent.getType();
            PointerEventType.Companion companion = PointerEventType.INSTANCE;
            if (PointerEventType.m2445equalsimpl0(iM2440getType7fucELk, companion.m2446getEnter7fucELk())) {
                e0.C(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$1(this, null), 3);
            } else if (PointerEventType.m2445equalsimpl0(iM2440getType7fucELk, companion.m2447getExit7fucELk())) {
                e0.C(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$2(this, null), 3);
            }
        }
        if (this.pointerInputNode == null && (suspendingPointerInputModifierNodeCreatePointerInputNodeIfNeeded = createPointerInputNodeIfNeeded()) != null) {
            this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(suspendingPointerInputModifierNodeCreatePointerInputNodeIfNeeded);
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.mo598onPointerEventH0pRuoY(pointerEvent, pass, bounds);
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onPreKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo599onPreKeyEventZmokQxo(@NotNull KeyEvent event) {
        return false;
    }

    public final Unit resetPointerInputHandler() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode == null) {
            return null;
        }
        suspendingPointerInputModifierNode.resetPointerInputHandler();
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX INFO: renamed from: updateCommon-O2vRcR0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m600updateCommonO2vRcR0(androidx.compose.foundation.interaction.MutableInteractionSource r3, androidx.compose.foundation.IndicationNodeFactory r4, boolean r5, boolean r6, java.lang.String r7, androidx.compose.ui.semantics.Role r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r9) {
        /*
            r2 = this;
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = r2.userProvidedInteractionSource
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r3)
            r1 = 1
            if (r0 != 0) goto L12
            r2.disposeInteractions()
            r2.userProvidedInteractionSource = r3
            r2.interactionSource = r3
            r3 = r1
            goto L13
        L12:
            r3 = 0
        L13:
            androidx.compose.foundation.IndicationNodeFactory r0 = r2.indicationNodeFactory
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r4)
            if (r0 != 0) goto L1e
            r2.indicationNodeFactory = r4
            r3 = r1
        L1e:
            boolean r4 = r2.useLocalIndication
            if (r4 == r5) goto L2a
            r2.useLocalIndication = r5
            if (r5 == 0) goto L29
            r2.onObservedReadsChanged()
        L29:
            r3 = r1
        L2a:
            boolean r4 = r2.enabled
            if (r4 == r6) goto L43
            if (r6 == 0) goto L36
            androidx.compose.foundation.FocusableNode r4 = r2.focusableNode
            r2.delegate(r4)
            goto L3e
        L36:
            androidx.compose.foundation.FocusableNode r4 = r2.focusableNode
            r2.undelegate(r4)
            r2.disposeInteractions()
        L3e:
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(r2)
            r2.enabled = r6
        L43:
            java.lang.String r4 = r2.onClickLabel
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r7)
            if (r4 != 0) goto L50
            r2.onClickLabel = r7
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(r2)
        L50:
            androidx.compose.ui.semantics.Role r4 = r2.role
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r8)
            if (r4 != 0) goto L5d
            r2.role = r8
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(r2)
        L5d:
            r2.onClick = r9
            boolean r4 = r2.lazilyCreateIndication
            boolean r5 = r2.shouldLazilyCreateIndication()
            if (r4 == r5) goto L74
            boolean r4 = r2.shouldLazilyCreateIndication()
            r2.lazilyCreateIndication = r4
            if (r4 != 0) goto L74
            androidx.compose.ui.node.DelegatableNode r4 = r2.indicationNode
            if (r4 != 0) goto L74
            goto L75
        L74:
            r1 = r3
        L75:
            if (r1 == 0) goto L7a
            r2.recreateIndicationIfNeeded()
        L7a:
            androidx.compose.foundation.FocusableNode r3 = r2.focusableNode
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = r2.interactionSource
            r3.update(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.m600updateCommonO2vRcR0(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory, boolean, boolean, java.lang.String, androidx.compose.ui.semantics.Role, kotlin.jvm.functions.Function0):void");
    }

    private AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z3, String str, Role role, Function0<Unit> function0) {
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.useLocalIndication = z;
        this.onClickLabel = str;
        this.role = role;
        this.enabled = z3;
        this.onClick = function0;
        this.focusableNode = new FocusableNode(this.interactionSource, Focusability.INSTANCE.m1805getSystemDefinedLCbbffg(), new AbstractClickableNode$focusableNode$1(this), null);
        this.currentKeyPressInteractions = LongObjectMapKt.mutableLongObjectMapOf();
        this.centerOffset = Offset.INSTANCE.m1845getZeroF1C5BW0();
        this.userProvidedInteractionSource = this.interactionSource;
        this.lazilyCreateIndication = shouldLazilyCreateIndication();
        this.traverseKey = INSTANCE;
    }
}
