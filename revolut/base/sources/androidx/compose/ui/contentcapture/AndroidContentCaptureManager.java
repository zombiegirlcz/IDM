package androidx.compose.ui.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import fp0.l;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ukm.u;
import vc.s;
import zhm.d0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u0096\u00012\u00020\u00012\u00020\u0002:\u0006\u0097\u0001\u0098\u0001\u0096\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\fH\u0080@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001d\u0010\u0019J\u000f\u0010 \u001a\u00020\fH\u0000¢\u0006\u0004\b\u001f\u0010\u0019J\u000f\u0010\"\u001a\u00020\fH\u0000¢\u0006\u0004\b!\u0010\u0019J/\u0010,\u001a\u00020\f2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'H\u0001¢\u0006\u0004\b*\u0010+J'\u00103\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u00002\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.H\u0001¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u00020\fH\u0002¢\u0006\u0004\b4\u0010\u0019J\u001f\u00109\u001a\u00020\f2\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u001d\u0010>\u001a\u00020\f2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010D\u001a\u00020\f2\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\fH\u0002¢\u0006\u0004\bF\u0010\u0019J\u000f\u0010G\u001a\u00020\fH\u0002¢\u0006\u0004\bG\u0010\u0019J\u001d\u0010J\u001a\u0004\u0018\u00010I*\u0002052\u0006\u0010H\u001a\u00020@H\u0002¢\u0006\u0004\bJ\u0010KJ-\u0010N\u001a\u00020\f*\u0002052\u0018\u0010M\u001a\u0014\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\f0LH\u0002¢\u0006\u0004\bN\u0010OJ!\u0010R\u001a\u00020\f2\u0006\u0010P\u001a\u00020@2\b\u0010Q\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\f2\u0006\u0010P\u001a\u00020@H\u0002¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\fH\u0002¢\u0006\u0004\bV\u0010\u0019J\u001f\u0010X\u001a\u00020\f2\u0006\u0010H\u001a\u00020@2\u0006\u0010W\u001a\u000205H\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\f2\u0006\u0010W\u001a\u000205H\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\f2\u0006\u0010W\u001a\u000205H\u0002¢\u0006\u0004\b\\\u0010[J\u000f\u0010]\u001a\u00020\fH\u0002¢\u0006\u0004\b]\u0010\u0019J\u000f\u0010^\u001a\u00020\fH\u0002¢\u0006\u0004\b^\u0010\u0019J\u000f\u0010_\u001a\u00020\fH\u0002¢\u0006\u0004\b_\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010`\u001a\u0004\ba\u0010bR*\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR*\u0010h\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bh\u0010i\u0012\u0004\bn\u0010\u0019\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020p0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010t\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010w\u001a\u00020v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010z\u001a\u00020y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020\f0|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001f\u0010\u0080\u0001\u001a\u00020\u007f8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R.\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020<0;8@@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0005\b\u0088\u0001\u0010?R\u0018\u0010\u0089\u0001\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010uR \u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u0002070\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u008d\u0001\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u008f\u0001\u001a\u00020y8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010{R\u0018\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0017\u0010\u0095\u0001\u001a\u00020y8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u0099\u0001"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "Lkotlin/Function0;", "Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", "onContentCaptureSession", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onStart", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStop", "boundsUpdatesEventLoop$ui", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "boundsUpdatesEventLoop", "onSemanticsChange$ui", "()V", "onSemanticsChange", "onLayoutChange$ui", "onLayoutChange", "onShowTranslation$ui", "onShowTranslation", "onHideTranslation$ui", "onHideTranslation", "onClearTranslation$ui", "onClearTranslation", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "onCreateVirtualViewTranslationRequests$ui", "([J[ILjava/util/function/Consumer;)V", "onCreateVirtualViewTranslationRequests", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "onVirtualViewTranslationResponses$ui", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;Landroid/util/LongSparseArray;)V", "onVirtualViewTranslationResponses", "sendContentCaptureDisappearEvents", "Landroidx/compose/ui/semantics/SemanticsNode;", "newNode", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "oldNode", "sendContentCaptureAppearEvents", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/platform/SemanticsNodeCopy;)V", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/semantics/SemanticsNodeWithAdjustedBounds;", "newSemanticsNodes", "checkForContentCapturePropertyChanges", "(Landroidx/collection/IntObjectMap;)V", "", "id", "", "newText", "sendContentCaptureTextUpdateEvent", "(ILjava/lang/String;)V", "updateSemanticsCopy", "notifySubtreeStateChangeIfNeeded", "index", "Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "toViewStructure", "(Landroidx/compose/ui/semantics/SemanticsNode;I)Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "Lkotlin/Function2;", "action", "fastForEachReplacedVisibleChildren", "(Landroidx/compose/ui/semantics/SemanticsNode;Lkotlin/jvm/functions/Function2;)V", "virtualId", "viewStructure", "bufferContentCaptureViewAppeared", "(ILandroidx/compose/ui/platform/coreshims/ViewStructureCompat;)V", "bufferContentCaptureViewDisappeared", "(I)V", "notifyContentCaptureChanges", "node", "updateBuffersOnAppeared", "(ILandroidx/compose/ui/semantics/SemanticsNode;)V", "updateBuffersOnDisappeared", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", "updateTranslationOnAppeared", "showTranslatedText", "hideTranslatedText", "clearTranslatedText", "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Lkotlin/jvm/functions/Function0;", "getOnContentCaptureSession", "()Lkotlin/jvm/functions/Function0;", "setOnContentCaptureSession", "(Lkotlin/jvm/functions/Function0;)V", "contentCaptureSession", "Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", "getContentCaptureSession$ui", "()Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", "setContentCaptureSession$ui", "(Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;)V", "getContentCaptureSession$ui$annotations", "", "Landroidx/compose/ui/contentcapture/ContentCaptureEvent;", "bufferedEvents", "Ljava/util/List;", "", "SendRecurringContentCaptureEventsIntervalMillis", "J", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "translateStatus", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "", "currentSemanticsNodesInvalidated", "Z", "Lukm/u;", "boundsUpdateChannel", "Lukm/u;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler$ui", "()Landroid/os/Handler;", "currentSemanticsNodes", "Landroidx/collection/IntObjectMap;", "getCurrentSemanticsNodes$ui", "()Landroidx/collection/IntObjectMap;", "setCurrentSemanticsNodes$ui", "currentSemanticsNodesSnapshotTimestampMillis", "Landroidx/collection/MutableIntObjectMap;", "previousSemanticsNodes", "Landroidx/collection/MutableIntObjectMap;", "previousSemanticsRoot", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "contentCaptureChangeChecker", "Ljava/lang/Runnable;", "isEnabled$ui", "()Z", "isEnabled", "Companion", "TranslateStatus", "ViewTranslationHelperMethods", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidContentCaptureManager implements DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    private boolean checkingForSemanticsChanges;
    private ContentCaptureSessionWrapper contentCaptureSession;
    private long currentSemanticsNodesSnapshotTimestampMillis;

    @NotNull
    private Function0<? extends ContentCaptureSessionWrapper> onContentCaptureSession;

    @NotNull
    private SemanticsNodeCopy previousSemanticsRoot;

    @NotNull
    private final AndroidComposeView view;
    public static final int $stable = 8;

    @NotNull
    private final List<ContentCaptureEvent> bufferedEvents = new ArrayList();
    private long SendRecurringContentCaptureEventsIntervalMillis = 100;

    @NotNull
    private TranslateStatus translateStatus = TranslateStatus.SHOW_ORIGINAL;
    private boolean currentSemanticsNodesInvalidated = true;

    @NotNull
    private final u boundsUpdateChannel = s.a(1, null, null, 6);

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @NotNull
    private IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes = IntObjectMapKt.intObjectMapOf();

    @NotNull
    private MutableIntObjectMap<SemanticsNodeCopy> previousSemanticsNodes = IntObjectMapKt.mutableIntObjectMapOf();

    @NotNull
    private final Runnable contentCaptureChangeChecker = new l(this, 25);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SHOW_ORIGINAL", "SHOW_TRANSLATED", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TranslateStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TranslateStatus[] $VALUES;
        public static final TranslateStatus SHOW_ORIGINAL = new TranslateStatus("SHOW_ORIGINAL", 0);
        public static final TranslateStatus SHOW_TRANSLATED = new TranslateStatus("SHOW_TRANSLATED", 1);

        private static final /* synthetic */ TranslateStatus[] $values() {
            return new TranslateStatus[]{SHOW_ORIGINAL, SHOW_TRANSLATED};
        }

        static {
            TranslateStatus[] translateStatusArr$values = $values();
            $VALUES = translateStatusArr$values;
            $ENTRIES = s.n(translateStatusArr$values);
        }

        private TranslateStatus(String str, int i) {
        }

        public static TranslateStatus valueOf(String str) {
            return (TranslateStatus) Enum.valueOf(TranslateStatus.class, str);
        }

        public static TranslateStatus[] values() {
            return (TranslateStatus[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0007J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0007J \u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$ViewTranslationHelperMethods;", "", "<init>", "()V", "onCreateVirtualViewTranslationRequests", "", "contentCaptureManager", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "virtualIds", "", "supportedFormats", "", "requestsCollector", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "onVirtualViewTranslationResponses", "response", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "doTranslation", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewTranslationHelperMethods {

        @NotNull
        public static final ViewTranslationHelperMethods INSTANCE = new ViewTranslationHelperMethods();

        private ViewTranslationHelperMethods() {
        }

        private final void doTranslation(AndroidContentCaptureManager contentCaptureManager, LongSparseArray<ViewTranslationResponse> response) {
            TranslationResponseValue value;
            CharSequence text;
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
            SemanticsNode semanticsNode;
            AccessibilityAction accessibilityAction;
            Function1 function1;
            int size = response.size();
            for (int i = 0; i < size; i++) {
                long jKeyAt = response.keyAt(i);
                ViewTranslationResponse viewTranslationResponseK = k2.a.k(response.get(jKeyAt));
                if (viewTranslationResponseK != null && (value = viewTranslationResponseK.getValue("android:text")) != null && (text = value.getText()) != null && (semanticsNodeWithAdjustedBounds = contentCaptureManager.getCurrentSemanticsNodes$ui().get((int) jKeyAt)) != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetTextSubstitution())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onVirtualViewTranslationResponses$lambda$0(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
            INSTANCE.doTranslation(androidContentCaptureManager, longSparseArray);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onCreateVirtualViewTranslationRequests(@org.jetbrains.annotations.NotNull androidx.compose.ui.contentcapture.AndroidContentCaptureManager r15, @org.jetbrains.annotations.NotNull long[] r16, @org.jetbrains.annotations.NotNull int[] r17, @org.jetbrains.annotations.NotNull java.util.function.Consumer<android.view.translation.ViewTranslationRequest> r18) {
            /*
                r14 = this;
                r0 = r16
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L70
                r3 = r0[r2]
                androidx.collection.IntObjectMap r5 = r15.getCurrentSemanticsNodes$ui()
                int r3 = (int) r3
                java.lang.Object r3 = r5.get(r3)
                androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds r3 = (androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds) r3
                if (r3 == 0) goto L6b
                androidx.compose.ui.semantics.SemanticsNode r3 = r3.getSemanticsNode()
                if (r3 != 0) goto L1c
                goto L6b
            L1c:
                k2.a.o()
                androidx.compose.ui.platform.AndroidComposeView r4 = r15.getView()
                android.view.autofill.AutofillId r4 = r4.getAutofillId()
                int r5 = r3.getId()
                long r5 = (long) r5
                android.view.translation.ViewTranslationRequest$Builder r4 = k2.a.i(r4, r5)
                androidx.compose.ui.semantics.SemanticsConfiguration r3 = r3.getUnmergedConfig()
                androidx.compose.ui.semantics.SemanticsProperties r5 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
                androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r5.getText()
                java.lang.Object r3 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r3, r5)
                r5 = r3
                java.util.List r5 = (java.util.List) r5
                if (r5 == 0) goto L6b
                r12 = 62
                r13 = 0
                java.lang.String r6 = "\n"
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                java.lang.String r3 = androidx.compose.ui.util.ListUtilsKt.fastJoinToString$default(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                if (r3 == 0) goto L6b
                androidx.compose.ui.text.AnnotatedString r5 = new androidx.compose.ui.text.AnnotatedString
                r6 = 0
                r7 = 2
                r5.<init>(r3, r6, r7, r6)
                android.view.translation.TranslationRequestValue r3 = a41.g0.o(r5)
                k2.a.z(r4, r3)
                android.view.translation.ViewTranslationRequest r3 = k2.a.j(r4)
                r4 = r18
                r4.accept(r3)
                goto L6d
            L6b:
                r4 = r18
            L6d:
                int r2 = r2 + 1
                goto L4
            L70:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.ViewTranslationHelperMethods.onCreateVirtualViewTranslationRequests(androidx.compose.ui.contentcapture.AndroidContentCaptureManager, long[], int[], java.util.function.Consumer):void");
        }

        public final void onVirtualViewTranslationResponses(@NotNull final AndroidContentCaptureManager contentCaptureManager, @NotNull final LongSparseArray<ViewTranslationResponse> response) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (Intrinsics.f(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                doTranslation(contentCaptureManager, response);
            } else {
                contentCaptureManager.getView().post(new Runnable() { // from class: androidx.compose.ui.contentcapture.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidContentCaptureManager.ViewTranslationHelperMethods.onVirtualViewTranslationResponses$lambda$0(contentCaptureManager, response);
                    }
                });
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContentCaptureEventType.values().length];
            try {
                iArr[ContentCaptureEventType.VIEW_APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentCaptureEventType.VIEW_DISAPPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$sendContentCaptureAppearEvents$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "index", "", "child", "Landroidx/compose/ui/semantics/SemanticsNode;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.u implements Function2<Integer, SemanticsNode, Unit> {
        final /* synthetic */ SemanticsNodeCopy $oldNode;
        final /* synthetic */ AndroidContentCaptureManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SemanticsNodeCopy semanticsNodeCopy, AndroidContentCaptureManager androidContentCaptureManager) {
            super(2);
            this.$oldNode = semanticsNodeCopy;
            this.this$0 = androidContentCaptureManager;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
            invoke(((Number) obj2).intValue(), (SemanticsNode) obj3);
            return Unit.f186387a;
        }

        public final void invoke(int i, SemanticsNode semanticsNode) {
            if (this.$oldNode.getChildren().contains(semanticsNode.getId())) {
                return;
            }
            this.this$0.updateBuffersOnAppeared(i, semanticsNode);
            this.this$0.notifySubtreeStateChangeIfNeeded();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$updateBuffersOnAppeared$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "i", "", "child", "Landroidx/compose/ui/semantics/SemanticsNode;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C18971 extends kotlin.jvm.internal.u implements Function2<Integer, SemanticsNode, Unit> {
        public C18971() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
            invoke(((Number) obj2).intValue(), (SemanticsNode) obj3);
            return Unit.f186387a;
        }

        public final void invoke(int i, SemanticsNode semanticsNode) {
            AndroidContentCaptureManager.this.updateBuffersOnAppeared(i, semanticsNode);
        }
    }

    public AndroidContentCaptureManager(@NotNull AndroidComposeView androidComposeView, @NotNull Function0<? extends ContentCaptureSessionWrapper> function0) {
        this.view = androidComposeView;
        this.onContentCaptureSession = function0;
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), IntObjectMapKt.intObjectMapOf());
    }

    private final void bufferContentCaptureViewAppeared(int virtualId, ViewStructureCompat viewStructure) {
        if (viewStructure == null) {
            return;
        }
        this.bufferedEvents.add(new ContentCaptureEvent(virtualId, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_APPEAR, viewStructure));
    }

    private final void bufferContentCaptureViewDisappeared(int virtualId) {
        this.bufferedEvents.add(new ContentCaptureEvent(virtualId, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_DISAPPEAR, null));
    }

    private final void checkForContentCapturePropertyChanges(IntObjectMap<SemanticsNodeWithAdjustedBounds> newSemanticsNodes) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j2;
        char c2;
        long j3;
        int i;
        SemanticsNode semanticsNode;
        int i2;
        SemanticsNode semanticsNode2;
        long j5;
        int i3;
        long[] jArr3;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap = newSemanticsNodes;
        int[] iArr3 = intObjectMap.keys;
        long[] jArr4 = intObjectMap.metadata;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j16 = jArr4[i5];
            char c3 = 7;
            long j22 = -9187201950435737472L;
            if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i21 = 8 - ((~(i5 - length)) >>> 31);
                int i22 = 0;
                while (i22 < i21) {
                    if ((j16 & 255) < 128) {
                        int i32 = iArr3[(i5 << 3) + i22];
                        c2 = c3;
                        SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(i32);
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = intObjectMap.get(i32);
                        SemanticsNode semanticsNode3 = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                        if (semanticsNode3 == null) {
                            throw v7.v("no value for specified key");
                        }
                        if (semanticsNodeCopy == null) {
                            MutableScatterMap<SemanticsPropertyKey<?>, Object> props$ui = semanticsNode3.getUnmergedConfig().getProps$ui();
                            j3 = j22;
                            Object[] objArr = props$ui.keys;
                            long[] jArr5 = props$ui.metadata;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i33 = 0;
                                int i43 = i6;
                                while (true) {
                                    long j42 = jArr5[i33];
                                    iArr2 = iArr3;
                                    if ((((~j42) << c2) & j42 & j3) != j3) {
                                        int i59 = 8 - ((~(i33 - length2)) >>> 31);
                                        int i66 = 0;
                                        while (i66 < i59) {
                                            if ((j42 & 255) < 128) {
                                                i3 = i66;
                                                SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) objArr[(i33 << 3) + i66];
                                                SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                                                jArr3 = jArr4;
                                                if (Intrinsics.f(semanticsPropertyKey, semanticsProperties.getText())) {
                                                    List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode3.getUnmergedConfig(), semanticsProperties.getText());
                                                    sendContentCaptureTextUpdateEvent(semanticsNode3.getId(), String.valueOf(list != null ? (AnnotatedString) d0.d0(list) : null));
                                                }
                                            } else {
                                                i3 = i66;
                                                jArr3 = jArr4;
                                            }
                                            j42 >>= i43;
                                            i66 = i3 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        if (i59 != i43) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    if (i33 == length2) {
                                        break;
                                    }
                                    i33++;
                                    iArr3 = iArr2;
                                    jArr4 = jArr2;
                                    i43 = 8;
                                }
                            } else {
                                iArr2 = iArr3;
                                jArr2 = jArr4;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr4;
                            j3 = j22;
                            MutableScatterMap<SemanticsPropertyKey<?>, Object> props$ui2 = semanticsNode3.getUnmergedConfig().getProps$ui();
                            Object[] objArr2 = props$ui2.keys;
                            long[] jArr6 = props$ui2.metadata;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                int i74 = 0;
                                while (true) {
                                    long j46 = jArr6[i74];
                                    long[] jArr7 = jArr6;
                                    Object[] objArr3 = objArr2;
                                    if ((((~j46) << c2) & j46 & j3) != j3) {
                                        int i92 = 8 - ((~(i74 - length3)) >>> 31);
                                        int i96 = 0;
                                        while (i96 < i92) {
                                            if ((j46 & 255) < 128) {
                                                i2 = i96;
                                                SemanticsPropertyKey semanticsPropertyKey2 = (SemanticsPropertyKey) objArr3[(i74 << 3) + i96];
                                                SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
                                                semanticsNode2 = semanticsNode3;
                                                if (Intrinsics.f(semanticsPropertyKey2, semanticsProperties2.getText())) {
                                                    List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsProperties2.getText());
                                                    AnnotatedString annotatedString = list2 != null ? (AnnotatedString) d0.d0(list2) : null;
                                                    j5 = j16;
                                                    List list3 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig(), semanticsProperties2.getText());
                                                    AnnotatedString annotatedString2 = list3 != null ? (AnnotatedString) d0.d0(list3) : null;
                                                    if (!Intrinsics.f(annotatedString, annotatedString2)) {
                                                        sendContentCaptureTextUpdateEvent(semanticsNode2.getId(), String.valueOf(annotatedString2));
                                                    }
                                                }
                                                j46 >>= 8;
                                                i96 = i2 + 1;
                                                semanticsNode3 = semanticsNode2;
                                                j16 = j5;
                                            } else {
                                                i2 = i96;
                                                semanticsNode2 = semanticsNode3;
                                            }
                                            j5 = j16;
                                            j46 >>= 8;
                                            i96 = i2 + 1;
                                            semanticsNode3 = semanticsNode2;
                                            j16 = j5;
                                        }
                                        semanticsNode = semanticsNode3;
                                        j2 = j16;
                                        if (i92 != 8) {
                                            break;
                                        }
                                    } else {
                                        semanticsNode = semanticsNode3;
                                        j2 = j16;
                                    }
                                    if (i74 == length3) {
                                        break;
                                    }
                                    i74++;
                                    objArr2 = objArr3;
                                    jArr6 = jArr7;
                                    semanticsNode3 = semanticsNode;
                                    j16 = j2;
                                }
                            }
                            i = 8;
                        }
                        j2 = j16;
                        i = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr4;
                        j2 = j16;
                        c2 = c3;
                        j3 = j22;
                        i = i6;
                    }
                    j16 = j2 >> i;
                    i22++;
                    intObjectMap = newSemanticsNodes;
                    i6 = i;
                    c3 = c2;
                    j22 = j3;
                    iArr3 = iArr2;
                    jArr4 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr4;
                if (i21 != i6) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i5 == length) {
                return;
            }
            i5++;
            intObjectMap = newSemanticsNodes;
            iArr3 = iArr;
            jArr4 = jArr;
        }
    }

    private final void clearTranslatedText() {
        AccessibilityAction accessibilityAction;
        Function0 function0;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
        Object[] objArr = currentSemanticsNodes$ui.values;
        long[] jArr = currentSemanticsNodes$ui.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j2 = jArr[i];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j2) < 128) {
                        SemanticsConfiguration unmergedConfig$ui = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig();
                        if (SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getClearTextSubstitution())) != null && (function0 = (Function0) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j2 >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void contentCaptureChangeChecker$lambda$0(androidx.compose.ui.contentcapture.AndroidContentCaptureManager r4) {
        /*
            boolean r0 = r4.isEnabled$ui()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "ContentCapture:changeChecker"
            android.os.Trace.beginSection(r0)
            androidx.compose.ui.platform.AndroidComposeView r0 = r4.view     // Catch: java.lang.Throwable -> L45
            r1 = 1
            r2 = 0
            r3 = 0
            androidx.compose.ui.node.Owner.measureAndLayout$default(r0, r3, r1, r2)     // Catch: java.lang.Throwable -> L45
            r4.sendContentCaptureDisappearEvents()     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = "ContentCapture:sendAppearEvents"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L45
            androidx.compose.ui.platform.AndroidComposeView r0 = r4.view     // Catch: java.lang.Throwable -> L40
            androidx.compose.ui.semantics.SemanticsOwner r0 = r0.getSemanticsOwner()     // Catch: java.lang.Throwable -> L40
            androidx.compose.ui.semantics.SemanticsNode r0 = r0.getUnmergedRootSemanticsNode()     // Catch: java.lang.Throwable -> L40
            androidx.compose.ui.platform.SemanticsNodeCopy r1 = r4.previousSemanticsRoot     // Catch: java.lang.Throwable -> L40
            r4.sendContentCaptureAppearEvents(r0, r1)     // Catch: java.lang.Throwable -> L40
            kotlin.Unit r0 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L40
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L45
            androidx.collection.IntObjectMap r0 = r4.getCurrentSemanticsNodes$ui()     // Catch: java.lang.Throwable -> L45
            r4.checkForContentCapturePropertyChanges(r0)     // Catch: java.lang.Throwable -> L45
            r4.updateSemanticsCopy()     // Catch: java.lang.Throwable -> L45
            r4.checkingForSemanticsChanges = r3     // Catch: java.lang.Throwable -> L45
            android.os.Trace.endSection()
            return
        L40:
            r4 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L45
            throw r4     // Catch: java.lang.Throwable -> L45
        L45:
            r4 = move-exception
            android.os.Trace.endSection()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.contentCaptureChangeChecker$lambda$0(androidx.compose.ui.contentcapture.AndroidContentCaptureManager):void");
    }

    private final void fastForEachReplacedVisibleChildren(SemanticsNode semanticsNode, Function2<? super Integer, ? super SemanticsNode, Unit> function2) {
        List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
        int size = replacedChildren$ui.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui.get(i2);
            if (getCurrentSemanticsNodes$ui().containsKey(semanticsNode2.getId())) {
                function2.invoke(Integer.valueOf(i), semanticsNode2);
                i++;
            }
        }
    }

    private final void hideTranslatedText() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
        Object[] objArr = currentSemanticsNodes$ui.values;
        long[] jArr = currentSemanticsNodes$ui.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j2 = jArr[i];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j2) < 128) {
                        SemanticsConfiguration unmergedConfig$ui = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig();
                        if (Intrinsics.f(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.TRUE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j2 >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void notifyContentCaptureChanges() {
        ContentCaptureSessionWrapper contentCaptureSessionWrapper = this.contentCaptureSession;
        if (contentCaptureSessionWrapper == null || Build.VERSION.SDK_INT < 29 || this.bufferedEvents.isEmpty()) {
            return;
        }
        List<ContentCaptureEvent> list = this.bufferedEvents;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ContentCaptureEvent contentCaptureEvent = list.get(i);
            int i2 = WhenMappings.$EnumSwitchMapping$0[contentCaptureEvent.getType().ordinal()];
            if (i2 == 1) {
                ViewStructureCompat structureCompat = contentCaptureEvent.getStructureCompat();
                if (structureCompat != null) {
                    contentCaptureSessionWrapper.notifyViewAppeared(structureCompat.toViewStructure());
                }
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                AutofillId autofillIdNewAutofillId = contentCaptureSessionWrapper.newAutofillId(contentCaptureEvent.getId());
                if (autofillIdNewAutofillId != null) {
                    contentCaptureSessionWrapper.notifyViewDisappeared(autofillIdNewAutofillId);
                }
            }
        }
        contentCaptureSessionWrapper.flush();
        this.bufferedEvents.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeStateChangeIfNeeded() {
        this.boundsUpdateChannel.mo3647trySendJP2dKIU(Unit.f186387a);
    }

    private final void sendContentCaptureAppearEvents(SemanticsNode newNode, SemanticsNodeCopy oldNode) {
        fastForEachReplacedVisibleChildren(newNode, new AnonymousClass1(oldNode, this));
        List<SemanticsNode> replacedChildren$ui = newNode.getReplacedChildren$ui();
        int size = replacedChildren$ui.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = replacedChildren$ui.get(i);
            if (getCurrentSemanticsNodes$ui().containsKey(semanticsNode.getId()) && this.previousSemanticsNodes.containsKey(semanticsNode.getId())) {
                SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(semanticsNode.getId());
                if (semanticsNodeCopy == null) {
                    throw v7.v("node not present in pruned tree before this change");
                }
                sendContentCaptureAppearEvents(semanticsNode, semanticsNodeCopy);
            }
        }
    }

    private final void sendContentCaptureDisappearEvents() {
        MutableIntObjectMap<SemanticsNodeCopy> mutableIntObjectMap = this.previousSemanticsNodes;
        int[] iArr = mutableIntObjectMap.keys;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j2 = jArr[i];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j2) < 128) {
                        int i5 = iArr[(i << 3) + i3];
                        if (!getCurrentSemanticsNodes$ui().containsKey(i5)) {
                            bufferContentCaptureViewDisappeared(i5);
                            notifySubtreeStateChangeIfNeeded();
                        }
                    }
                    j2 >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void sendContentCaptureTextUpdateEvent(int id10, String newText) {
        ContentCaptureSessionWrapper contentCaptureSessionWrapper;
        if (Build.VERSION.SDK_INT >= 29 && (contentCaptureSessionWrapper = this.contentCaptureSession) != null) {
            AutofillId autofillIdNewAutofillId = contentCaptureSessionWrapper.newAutofillId(id10);
            if (autofillIdNewAutofillId == null) {
                throw v7.v("Invalid content capture ID");
            }
            contentCaptureSessionWrapper.notifyViewTextChanged(autofillIdNewAutofillId, newText);
        }
    }

    private final void showTranslatedText() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
        Object[] objArr = currentSemanticsNodes$ui.values;
        long[] jArr = currentSemanticsNodes$ui.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j2 = jArr[i];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j2) < 128) {
                        SemanticsConfiguration unmergedConfig$ui = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig();
                        if (Intrinsics.f(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j2 >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final ViewStructureCompat toViewStructure(SemanticsNode semanticsNode, int i) {
        AutofillIdCompat autofillId;
        AutofillId autofillId2;
        String strM2803toLegacyClassNameV4PA4sw;
        ContentCaptureSessionWrapper contentCaptureSessionWrapper = this.contentCaptureSession;
        if (contentCaptureSessionWrapper == null || Build.VERSION.SDK_INT < 29 || (autofillId = ViewCompatShims.getAutofillId(this.view)) == null) {
            return null;
        }
        if (semanticsNode.getParent() != null) {
            autofillId2 = contentCaptureSessionWrapper.newAutofillId(r4.getId());
            if (autofillId2 == null) {
                return null;
            }
        } else {
            autofillId2 = autofillId.toAutofillId();
        }
        ViewStructureCompat viewStructureCompatNewVirtualViewStructure = contentCaptureSessionWrapper.newVirtualViewStructure(autofillId2, semanticsNode.getId());
        if (viewStructureCompatNewVirtualViewStructure == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui.contains(semanticsProperties.getPassword())) {
            return null;
        }
        Bundle extras = viewStructureCompatNewVirtualViewStructure.getExtras();
        if (extras != null) {
            extras.putLong("android.view.contentcapture.EventTimestamp", this.currentSemanticsNodesSnapshotTimestampMillis);
            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
        }
        String str = (String) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getTestTag());
        if (str != null) {
            viewStructureCompatNewVirtualViewStructure.setId(semanticsNode.getId(), null, null, str);
        }
        if (((Boolean) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getIsTraversalGroup())) != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName("android.widget.ViewGroup");
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getText());
        if (list != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName("android.widget.TextView");
            viewStructureCompatNewVirtualViewStructure.setText(ListUtilsKt.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null));
        }
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getEditableText());
        if (annotatedString != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName("android.widget.EditText");
            viewStructureCompatNewVirtualViewStructure.setText(annotatedString);
        }
        List list2 = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getContentDescription());
        if (list2 != null) {
            viewStructureCompatNewVirtualViewStructure.setContentDescription(ListUtilsKt.fastJoinToString$default(list2, "\n", null, null, 0, null, null, 62, null));
        }
        Role role = (Role) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getRole());
        if (role != null && (strM2803toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m2803toLegacyClassNameV4PA4sw(role.getValue())) != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName(strM2803toLegacyClassNameV4PA4sw);
        }
        TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(unmergedConfig$ui);
        if (textLayoutResult != null) {
            TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
            viewStructureCompatNewVirtualViewStructure.setTextStyle(layoutInput.getDensity().getFontScale() * layoutInput.getDensity().getDensity() * TextUnit.m3370getValueimpl(layoutInput.getStyle().m2973getFontSizeXSAIIZE()), 0, 0, 0);
        }
        Rect boundsInParent$ui = semanticsNode.getBoundsInParent$ui();
        viewStructureCompatNewVirtualViewStructure.setDimens((int) boundsInParent$ui.getLeft(), (int) boundsInParent$ui.getTop(), 0, 0, (int) (boundsInParent$ui.getRight() - boundsInParent$ui.getLeft()), (int) (boundsInParent$ui.getBottom() - boundsInParent$ui.getTop()));
        return viewStructureCompatNewVirtualViewStructure;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBuffersOnAppeared(int index, SemanticsNode node) {
        if (isEnabled$ui()) {
            updateTranslationOnAppeared(node);
            bufferContentCaptureViewAppeared(node.getId(), toViewStructure(node, index));
            fastForEachReplacedVisibleChildren(node, new C18971());
        }
    }

    private final void updateBuffersOnDisappeared(SemanticsNode node) {
        if (isEnabled$ui()) {
            bufferContentCaptureViewDisappeared(node.getId());
            List<SemanticsNode> replacedChildren$ui = node.getReplacedChildren$ui();
            int size = replacedChildren$ui.size();
            for (int i = 0; i < size; i++) {
                updateBuffersOnDisappeared(replacedChildren$ui.get(i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateSemanticsCopy() {
        /*
            r16 = this;
            r0 = r16
            androidx.collection.MutableIntObjectMap<androidx.compose.ui.platform.SemanticsNodeCopy> r1 = r0.previousSemanticsNodes
            r1.clear()
            androidx.collection.IntObjectMap r1 = r0.getCurrentSemanticsNodes$ui()
            int[] r2 = r1.keys
            java.lang.Object[] r3 = r1.values
            long[] r1 = r1.metadata
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r6 = 0
        L17:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5d
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L31:
            if (r11 >= r9) goto L5b
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L57
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            r12 = r3[r12]
            androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds r12 = (androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds) r12
            androidx.collection.MutableIntObjectMap<androidx.compose.ui.platform.SemanticsNodeCopy> r14 = r0.previousSemanticsNodes
            androidx.compose.ui.platform.SemanticsNodeCopy r15 = new androidx.compose.ui.platform.SemanticsNodeCopy
            androidx.compose.ui.semantics.SemanticsNode r12 = r12.getSemanticsNode()
            androidx.collection.IntObjectMap r5 = r0.getCurrentSemanticsNodes$ui()
            r15.<init>(r12, r5)
            r14.set(r13, r15)
        L57:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L31
        L5b:
            if (r9 != r10) goto L62
        L5d:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L17
        L62:
            androidx.compose.ui.platform.SemanticsNodeCopy r1 = new androidx.compose.ui.platform.SemanticsNodeCopy
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.view
            androidx.compose.ui.semantics.SemanticsOwner r2 = r2.getSemanticsOwner()
            androidx.compose.ui.semantics.SemanticsNode r2 = r2.getUnmergedRootSemanticsNode()
            androidx.collection.IntObjectMap r3 = r0.getCurrentSemanticsNodes$ui()
            r1.<init>(r2, r3)
            r0.previousSemanticsRoot = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.updateSemanticsCopy():void");
    }

    private final void updateTranslationOnAppeared(SemanticsNode node) {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        Function1 function12;
        SemanticsConfiguration unmergedConfig$ui = node.getUnmergedConfig();
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution());
        if (this.translateStatus == TranslateStatus.SHOW_ORIGINAL && Intrinsics.f(bool, Boolean.TRUE)) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getShowTextSubstitution());
            if (accessibilityAction2 == null || (function12 = (Function1) accessibilityAction2.getAction()) == null) {
                return;
            }
            return;
        }
        if (this.translateStatus != TranslateStatus.SHOW_TRANSLATED || !Intrinsics.f(bool, Boolean.FALSE) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getShowTextSubstitution())) == null || (function1 = (Function1) accessibilityAction.getAction()) == null) {
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (skm.k0.b(r5, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0081 -> B:13:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r2 = r0.L$0
            ukm.g r2 = (ukm.g) r2
            yhm.o.b(r9)
        L2d:
            r9 = r2
            goto L48
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            java.lang.Object r2 = r0.L$0
            ukm.g r2 = (ukm.g) r2
            yhm.o.b(r9)
            goto L56
        L3f:
            yhm.o.b(r9)
            ukm.u r9 = r8.boundsUpdateChannel
            ukm.g r9 = r9.iterator()
        L48:
            r0.L$0 = r9
            r0.label = r4
            java.lang.Object r2 = r9.a(r0)
            if (r2 != r1) goto L53
            goto L83
        L53:
            r7 = r2
            r2 = r9
            r9 = r7
        L56:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L84
            r2.c()
            boolean r9 = r8.isEnabled$ui()
            if (r9 == 0) goto L6a
            r8.notifyContentCaptureChanges()
        L6a:
            boolean r9 = r8.checkingForSemanticsChanges
            if (r9 != 0) goto L77
            r8.checkingForSemanticsChanges = r4
            android.os.Handler r9 = r8.handler
            java.lang.Runnable r5 = r8.contentCaptureChangeChecker
            r9.post(r5)
        L77:
            long r5 = r8.SendRecurringContentCaptureEventsIntervalMillis
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r9 = skm.k0.b(r5, r0)
            if (r9 != r1) goto L2d
        L83:
            return r1
        L84:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.boundsUpdatesEventLoop$ui(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final IntObjectMap<SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes$ui() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsOwnerKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner(), -1, AndroidContentCaptureManager$currentSemanticsNodes$1.INSTANCE);
            this.currentSemanticsNodesSnapshotTimestampMillis = System.currentTimeMillis();
        }
        return this.currentSemanticsNodes;
    }

    @NotNull
    public final AndroidComposeView getView() {
        return this.view;
    }

    public final boolean isEnabled$ui() {
        return ContentCaptureManager.INSTANCE.isEnabled() && this.contentCaptureSession != null;
    }

    public final void onClearTranslation$ui() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        clearTranslatedText();
    }

    public final void onCreateVirtualViewTranslationRequests$ui(@NotNull long[] virtualIds, @NotNull int[] supportedFormats, @NotNull Consumer<ViewTranslationRequest> requestsCollector) {
        ViewTranslationHelperMethods.INSTANCE.onCreateVirtualViewTranslationRequests(this, virtualIds, supportedFormats, requestsCollector);
    }

    public final void onHideTranslation$ui() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        hideTranslatedText();
    }

    public final void onLayoutChange$ui() {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui()) {
            notifySubtreeStateChangeIfNeeded();
        }
    }

    public final void onSemanticsChange$ui() {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled$ui() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.contentCaptureChangeChecker);
    }

    public final void onShowTranslation$ui() {
        this.translateStatus = TranslateStatus.SHOW_TRANSLATED;
        showTranslatedText();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull LifecycleOwner owner) {
        this.contentCaptureSession = (ContentCaptureSessionWrapper) this.onContentCaptureSession.invoke();
        updateBuffersOnAppeared(-1, this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner owner) {
        updateBuffersOnDisappeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
        this.contentCaptureSession = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View v) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View v) {
        this.handler.removeCallbacks(this.contentCaptureChangeChecker);
        this.contentCaptureSession = null;
    }

    public final void onVirtualViewTranslationResponses$ui(@NotNull AndroidContentCaptureManager contentCaptureManager, @NotNull LongSparseArray<ViewTranslationResponse> response) {
        ViewTranslationHelperMethods.INSTANCE.onVirtualViewTranslationResponses(contentCaptureManager, response);
    }
}
