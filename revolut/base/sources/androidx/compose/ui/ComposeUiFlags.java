package androidx.compose.ui;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\u0003R\u001c\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\b\u0010\u0006\u0012\u0004\b\t\u0010\u0003R\u001c\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\n\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003R\u001c\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\f\u0010\u0006\u0012\u0004\b\r\u0010\u0003R\u001c\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003R\u001c\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0011\u0010\u0003R\u001c\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u0012\u0004\b\u0013\u0010\u0003R\u001c\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003R\u001c\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0017\u0010\u0003R\u001c\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u0012\u0004\b\u0019\u0010\u0003R\u001c\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003R\u001c\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001d\u0010\u0003R\u001c\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u0012\u0004\b\u001f\u0010\u0003R\u001c\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b \u0010\u0006\u0012\u0004\b!\u0010\u0003R\u001c\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\"\u0010\u0006\u0012\u0004\b#\u0010\u0003R\u001c\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b$\u0010\u0006\u0012\u0004\b%\u0010\u0003¨\u0006&"}, d2 = {"Landroidx/compose/ui/ComposeUiFlags;", "", "<init>", "()V", "", "isSemanticAutofillEnabled", "Z", "isSemanticAutofillEnabled$annotations", "isViewFocusFixEnabled", "isViewFocusFixEnabled$annotations", "isBypassUnfocusableComposeViewEnabled", "isBypassUnfocusableComposeViewEnabled$annotations", "isIgnoreInvalidPrevFocusRectEnabled", "isIgnoreInvalidPrevFocusRectEnabled$annotations", "areWindowInsetsRulersEnabled", "getAreWindowInsetsRulersEnabled$annotations", "isInitialFocusOnFocusableAvailable", "isInitialFocusOnFocusableAvailable$annotations", "isRequestFocusOnNonFocusableFocusTargetEnabled", "isRequestFocusOnNonFocusableFocusTargetEnabled$annotations", "isAdaptiveRefreshRateEnabled", "isAdaptiveRefreshRateEnabled$annotations", "isIndirectPointerNavigationGestureDetectorEnabled", "isIndirectPointerNavigationGestureDetectorEnabled$annotations", "isOptimizedFocusEventDispatchEnabled", "isOptimizedFocusEventDispatchEnabled$annotations", "isGraphicsLayerShapeSemanticsEnabled", "isGraphicsLayerShapeSemanticsEnabled$annotations", "isNestedScrollInteropIntegerPropagationEnabled", "isNestedScrollInteropIntegerPropagationEnabled$annotations", "isCanScrollUsingLastDownEventFixEnabled", "isCanScrollUsingLastDownEventFixEnabled$annotations", "isScrollCaptureCenteringEnabled", "isScrollCaptureCenteringEnabled$annotations", "isRectManagerOffsetUsageFromLayoutCoordinatesEnabled", "isRectManagerOffsetUsageFromLayoutCoordinatesEnabled$annotations", "isPinningFocusedAndroidViewsEnabled", "isPinningFocusedAndroidViewsEnabled$annotations", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposeUiFlags {
    public static boolean isInitialFocusOnFocusableAvailable;
    public static boolean isViewFocusFixEnabled;

    @NotNull
    public static final ComposeUiFlags INSTANCE = new ComposeUiFlags();
    public static boolean isSemanticAutofillEnabled = true;
    public static boolean isBypassUnfocusableComposeViewEnabled = true;
    public static boolean isIgnoreInvalidPrevFocusRectEnabled = true;
    public static boolean areWindowInsetsRulersEnabled = true;
    public static boolean isRequestFocusOnNonFocusableFocusTargetEnabled = true;
    public static boolean isAdaptiveRefreshRateEnabled = true;
    public static boolean isIndirectPointerNavigationGestureDetectorEnabled = true;
    public static boolean isOptimizedFocusEventDispatchEnabled = true;
    public static boolean isGraphicsLayerShapeSemanticsEnabled = true;
    public static boolean isNestedScrollInteropIntegerPropagationEnabled = true;
    public static boolean isCanScrollUsingLastDownEventFixEnabled = true;
    public static boolean isScrollCaptureCenteringEnabled = true;
    public static boolean isRectManagerOffsetUsageFromLayoutCoordinatesEnabled = true;
    public static boolean isPinningFocusedAndroidViewsEnabled = true;
    public static final int $stable = 8;

    private ComposeUiFlags() {
    }
}
