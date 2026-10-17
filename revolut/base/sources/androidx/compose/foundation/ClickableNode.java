package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import gim.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010$JS\u0010'\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b%\u0010&J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0004¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0004¢\u0006\u0004\b-\u0010+R\u001a\u0010/\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\f\n\u0004\b/\u00100\u0012\u0004\b1\u0010$R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Landroidx/compose/foundation/ClickableNode;", "Landroidx/compose/foundation/AbstractClickableNode;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/IndicationNodeFactory;", "indicationNodeFactory", "", "useLocalIndication", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/IntSize;", "size", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-hWWAJMo", "(J)J", "getExtendedTouchPadding", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "createPointerInputNodeIfNeeded", "()Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "()V", "update-O2vRcR0", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)V", "update", "Landroidx/compose/ui/input/key/KeyEvent;", "event", "onClickKeyDownEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onClickKeyDownEvent", "onClickKeyUpEvent-ZmokQxo", "onClickKeyUpEvent", "isSuspendingPointerInputEnabled", "Z", "isSuspendingPointerInputEnabled$annotations", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "downEvent", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ClickableNode extends AbstractClickableNode {
    private PointerInputChange downEvent;
    private final boolean isSuspendingPointerInputEnabled;

    /* JADX INFO: renamed from: androidx.compose.foundation.ClickableNode$createPointerInputNodeIfNeeded$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements PointerInputEventHandler {

        /* JADX INFO: renamed from: androidx.compose.foundation.ClickableNode$createPointerInputNodeIfNeeded$1$1, reason: invalid class name and collision with other inner class name */
        @gim.d(c = "androidx.compose.foundation.ClickableNode$createPointerInputNodeIfNeeded$1$1", f = "Clickable.kt", l = {885}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "offset", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C00301 extends i implements Function3 {
            /* synthetic */ long J$0;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ClickableNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00301(ClickableNode clickableNode, Continuation<? super C00301> continuation) {
                super(3, continuation);
                this.this$0 = clickableNode;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                return m641invoked4ec7I((PressGestureScope) obj2, ((Offset) obj3).getPackedValue(), (Continuation) obj4);
            }

            /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
            public final Object m641invoked4ec7I(PressGestureScope pressGestureScope, long j2, Continuation<? super Unit> continuation) {
                C00301 c00301 = new C00301(this.this$0, continuation);
                c00301.L$0 = pressGestureScope;
                c00301.J$0 = j2;
                return c00301.invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                    long j2 = this.J$0;
                    if (this.this$0.getEnabled()) {
                        ClickableNode clickableNode = this.this$0;
                        this.label = 1;
                        if (clickableNode.m592handlePressInteractiond4ec7I(pressGestureScope, j2, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            }
        }

        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$0(ClickableNode clickableNode, Offset offset) {
            if (clickableNode.getEnabled()) {
                clickableNode.getOnClick().invoke();
            }
            return Unit.f186387a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            Object objDetectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new C00301(ClickableNode.this, null), new c(ClickableNode.this, 3), continuation);
            return objDetectTapAndPress == fim.a.COROUTINE_SUSPENDED ? objDetectTapAndPress : Unit.f186387a;
        }
    }

    public /* synthetic */ ClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z3, String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, indicationNodeFactory, z, z3, str, role, function0);
    }

    /* JADX INFO: renamed from: getExtendedTouchPadding-hWWAJMo, reason: not valid java name */
    private final long m639getExtendedTouchPaddinghWWAJMo(long size) {
        long jMo769toSizeXkaWNTQ = DelegatableNodeKt.requireDensity(this).mo769toSizeXkaWNTQ(((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration())).mo2637getMinimumTouchTargetSizeMYxV2XQ());
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (jMo769toSizeXkaWNTQ >> 32)) - ((int) (size >> 32))) / 2.0f;
        return Size.m1862constructorimpl((((long) Float.floatToRawIntBits(Math.max(BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (jMo769toSizeXkaWNTQ & BodyPartID.bodyIdMax)) - ((int) (size & BodyPartID.bodyIdMax))) / 2.0f)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fMax) << 32));
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public SuspendingPointerInputModifierNode createPointerInputNodeIfNeeded() {
        if (this.isSuspendingPointerInputEnabled) {
            return SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AnonymousClass1());
        }
        return null;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        super.onCancelPointerInput();
        if (this.downEvent != null) {
            this.downEvent = null;
            handlePressInteractionCancel(false);
        }
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* JADX INFO: renamed from: onClickKeyDownEvent-ZmokQxo */
    public final boolean mo595onClickKeyDownEventZmokQxo(@NotNull KeyEvent event) {
        return false;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* JADX INFO: renamed from: onClickKeyUpEvent-ZmokQxo */
    public final boolean mo596onClickKeyUpEventZmokQxo(@NotNull KeyEvent event) {
        getOnClick().invoke();
        return true;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo598onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds) {
        super.mo598onPointerEventH0pRuoY(pointerEvent, pass, bounds);
        if (this.isSuspendingPointerInputEnabled) {
            return;
        }
        if (pass != PointerEventPass.Main) {
            if (pass != PointerEventPass.Final || this.downEvent == null) {
                return;
            }
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i = 0; i < size; i++) {
                PointerInputChange pointerInputChange = changes.get(i);
                if (pointerInputChange.isConsumed() && !pointerInputChange.equals(this.downEvent)) {
                    this.downEvent = null;
                    handlePressInteractionCancel(false);
                    return;
                }
            }
            return;
        }
        PointerInputChange pointerInputChange2 = this.downEvent;
        if (pointerInputChange2 == null) {
            if (TapGestureDetectorKt.isChangedToDown$default(pointerEvent, true, false, 2, null)) {
                PointerInputChange pointerInputChange3 = pointerEvent.getChanges().get(0);
                pointerInputChange3.consume();
                this.downEvent = pointerInputChange3;
                if (getEnabled()) {
                    m594handlePressInteractionStart3MmeM6k(pointerInputChange3.getPosition(), false);
                    return;
                }
                return;
            }
            return;
        }
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!PointerEventKt.changedToUp(changes2.get(i2))) {
                long jM639getExtendedTouchPaddinghWWAJMo = m639getExtendedTouchPaddinghWWAJMo(bounds);
                List<PointerInputChange> changes3 = pointerEvent.getChanges();
                int size3 = changes3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    PointerInputChange pointerInputChange4 = changes3.get(i3);
                    if (pointerInputChange4.isConsumed() || PointerEventKt.m2443isOutOfBoundsjwHxaWs(pointerInputChange4, bounds, jM639getExtendedTouchPaddinghWWAJMo)) {
                        this.downEvent = null;
                        handlePressInteractionCancel(false);
                        return;
                    }
                }
                return;
            }
        }
        pointerEvent.getChanges().get(0).consume();
        if (getEnabled()) {
            m593handlePressInteractionRelease3MmeM6k(pointerInputChange2.getPosition(), false);
            getOnClick().invoke();
        }
        this.downEvent = null;
    }

    /* JADX INFO: renamed from: update-O2vRcR0, reason: not valid java name */
    public final void m640updateO2vRcR0(MutableInteractionSource interactionSource, IndicationNodeFactory indicationNodeFactory, boolean useLocalIndication, boolean enabled, String onClickLabel, Role role, @NotNull Function0<Unit> onClick) {
        m600updateCommonO2vRcR0(interactionSource, indicationNodeFactory, useLocalIndication, enabled, onClickLabel, role, onClick);
    }

    private ClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z3, String str, Role role, Function0<Unit> function0) {
        super(mutableInteractionSource, indicationNodeFactory, z, z3, str, role, function0, null);
        this.isSuspendingPointerInputEnabled = (ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled && ComposeFoundationFlags.isNonSuspendingPointerInputInClickableEnabled) ? false : true;
    }
}
