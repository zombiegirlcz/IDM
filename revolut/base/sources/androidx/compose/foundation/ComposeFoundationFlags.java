package androidx.compose.foundation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\u0003R\u001c\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\b\u0010\u0006\u0012\u0004\b\t\u0010\u0003R\u001c\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\n\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003R\u001c\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\f\u0010\u0006\u0012\u0004\b\r\u0010\u0003R\u001c\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003R\u001c\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0011\u0010\u0003R\u001c\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u0012\u0004\b\u0013\u0010\u0003R\u001c\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003R\u001c\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0017\u0010\u0003R\u001c\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u0012\u0004\b\u0019\u0010\u0003¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/ComposeFoundationFlags;", "", "<init>", "()V", "", "isDetectTapGesturesImmediateCoroutineDispatchEnabled", "Z", "isDetectTapGesturesImmediateCoroutineDispatchEnabled$annotations", "isNewContextMenuEnabled", "isNewContextMenuEnabled$annotations", "isSmartSelectionEnabled", "isSmartSelectionEnabled$annotations", "isPausableCompositionInPrefetchEnabled", "isPausableCompositionInPrefetchEnabled$annotations", "isNonSuspendingPointerInputInClickableEnabled", "isNonSuspendingPointerInputInClickableEnabled$annotations", "isTextFieldDpadNavigationEnabled", "isTextFieldDpadNavigationEnabled$annotations", "isKeepInViewFocusObservationChangeEnabled", "isKeepInViewFocusObservationChangeEnabled$annotations", "isNonSuspendingPointerInputInDraggableEnabled", "isNonSuspendingPointerInputInDraggableEnabled$annotations", "isMouseWheel1DAxisLockingEnabled", "isMouseWheel1DAxisLockingEnabled$annotations", "isCacheWindowForPagerEnabled", "isCacheWindowForPagerEnabled$annotations", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposeFoundationFlags {
    public static boolean isCacheWindowForPagerEnabled;

    @NotNull
    public static final ComposeFoundationFlags INSTANCE = new ComposeFoundationFlags();
    public static boolean isDetectTapGesturesImmediateCoroutineDispatchEnabled = true;
    public static boolean isNewContextMenuEnabled = true;
    public static boolean isSmartSelectionEnabled = true;
    public static boolean isPausableCompositionInPrefetchEnabled = true;
    public static boolean isNonSuspendingPointerInputInClickableEnabled = true;
    public static boolean isTextFieldDpadNavigationEnabled = true;
    public static boolean isKeepInViewFocusObservationChangeEnabled = true;
    public static boolean isNonSuspendingPointerInputInDraggableEnabled = true;
    public static boolean isMouseWheel1DAxisLockingEnabled = true;
    public static final int $stable = 8;

    private ComposeFoundationFlags() {
    }
}
