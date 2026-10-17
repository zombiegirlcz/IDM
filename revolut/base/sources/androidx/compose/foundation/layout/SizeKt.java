package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001b\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001b\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\u0004\u001a#\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\n\u001a'\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\n\u001a;\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\u0004\u001a\u001b\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001d\u0010\u0004\u001a\u001b\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001f\u0010\u0004\u001a;\u0010\"\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u0001H\u0007¢\u0006\u0004\b!\u0010\u0019\u001a\u001d\u0010%\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010\u0004\u001a\u001d\u0010&\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b&\u0010\u0004\u001a\u001d\u0010'\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b'\u0010\u0004\u001a'\u0010,\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b,\u0010-\u001a'\u0010/\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010)\u001a\u00020.2\b\b\u0002\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b/\u00100\u001a'\u00102\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010)\u001a\u0002012\b\b\u0002\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b2\u00103\u001a'\u00105\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007¢\u0006\u0004\b4\u0010\n\"\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108\"\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108\"\u0014\u0010:\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108\"\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=\"\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=\"\u0014\u0010?\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010=\"\u0014\u0010@\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010=\"\u0014\u0010A\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010=\"\u0014\u0010B\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010=¨\u0006C"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "width", "width-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "height", "height-3ABfNKs", "size", "size-3ABfNKs", "size-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/DpSize;", "size-6HolHcs", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "min", "max", "widthIn-VpY3zN4", "widthIn", "heightIn-VpY3zN4", "heightIn", "minWidth", "minHeight", "maxWidth", "maxHeight", "sizeIn-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "sizeIn", "requiredWidth-3ABfNKs", "requiredWidth", "requiredHeight-3ABfNKs", "requiredHeight", "requiredSize-3ABfNKs", "requiredSize", "requiredSizeIn-qDBjuR0", "requiredSizeIn", "", "fraction", "fillMaxWidth", "fillMaxHeight", "fillMaxSize", "Landroidx/compose/ui/Alignment$Horizontal;", "align", "", "unbounded", "wrapContentWidth", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Vertical;", "wrapContentHeight", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment;", "wrapContentSize", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/Modifier;", "defaultMinSize-VpY3zN4", "defaultMinSize", "Landroidx/compose/foundation/layout/FillElement;", "FillWholeMaxWidth", "Landroidx/compose/foundation/layout/FillElement;", "FillWholeMaxHeight", "FillWholeMaxSize", "Landroidx/compose/foundation/layout/WrapContentElement;", "WrapContentWidthCenter", "Landroidx/compose/foundation/layout/WrapContentElement;", "WrapContentWidthStart", "WrapContentHeightCenter", "WrapContentHeightTop", "WrapContentSizeCenter", "WrapContentSizeTopStart", "foundation-layout"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class SizeKt {

    @NotNull
    private static final FillElement FillWholeMaxHeight;

    @NotNull
    private static final FillElement FillWholeMaxSize;

    @NotNull
    private static final FillElement FillWholeMaxWidth;

    @NotNull
    private static final WrapContentElement WrapContentHeightCenter;

    @NotNull
    private static final WrapContentElement WrapContentHeightTop;

    @NotNull
    private static final WrapContentElement WrapContentSizeCenter;

    @NotNull
    private static final WrapContentElement WrapContentSizeTopStart;

    @NotNull
    private static final WrapContentElement WrapContentWidthCenter;

    @NotNull
    private static final WrapContentElement WrapContentWidthStart;

    static {
        FillElement.Companion companion = FillElement.INSTANCE;
        FillWholeMaxWidth = companion.width(1.0f);
        FillWholeMaxHeight = companion.height(1.0f);
        FillWholeMaxSize = companion.size(1.0f);
        WrapContentElement.Companion companion2 = WrapContentElement.INSTANCE;
        Alignment.Companion companion3 = Alignment.INSTANCE;
        WrapContentWidthCenter = companion2.width(companion3.getCenterHorizontally(), false);
        WrapContentWidthStart = companion2.width(companion3.getStart(), false);
        WrapContentHeightCenter = companion2.height(companion3.getCenterVertically(), false);
        WrapContentHeightTop = companion2.height(companion3.getTop(), false);
        WrapContentSizeCenter = companion2.size(companion3.getCenter(), false);
        WrapContentSizeTopStart = companion2.size(companion3.getTopStart(), false);
    }

    @NotNull
    /* JADX INFO: renamed from: defaultMinSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m872defaultMinSizeVpY3zN4(@NotNull Modifier modifier, float f, float f4) {
        return modifier.then(new UnspecifiedConstraintsElement(f, f4, null));
    }

    /* JADX INFO: renamed from: defaultMinSize-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m873defaultMinSizeVpY3zN4$default(Modifier modifier, float f, float f4, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = Dp.INSTANCE.m3306getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f4 = Dp.INSTANCE.m3306getUnspecifiedD9Ej5fM();
        }
        return m872defaultMinSizeVpY3zN4(modifier, f, f4);
    }

    @NotNull
    public static final Modifier fillMaxHeight(@NotNull Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? FillWholeMaxHeight : FillElement.INSTANCE.height(f));
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxHeight(modifier, f);
    }

    @NotNull
    public static final Modifier fillMaxSize(@NotNull Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? FillWholeMaxSize : FillElement.INSTANCE.size(f));
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxSize(modifier, f);
    }

    @NotNull
    public static final Modifier fillMaxWidth(@NotNull Modifier modifier, float f) {
        return modifier.then(f == 1.0f ? FillWholeMaxWidth : FillElement.INSTANCE.width(f));
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxWidth(modifier, f);
    }

    @NotNull
    /* JADX INFO: renamed from: height-3ABfNKs, reason: not valid java name */
    public static final Modifier m874height3ABfNKs(@NotNull Modifier modifier, float f) {
        return modifier.then(new SizeElement(BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$height3ABfNKs$$inlined$debugInspectorInfo$1(f) : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    @NotNull
    /* JADX INFO: renamed from: heightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m875heightInVpY3zN4(@NotNull Modifier modifier, float f, float f4) {
        return modifier.then(new SizeElement(BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, f4, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$heightInVpY3zN4$$inlined$debugInspectorInfo$1(f, f4) : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* JADX INFO: renamed from: heightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m876heightInVpY3zN4$default(Modifier modifier, float f, float f4, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = Dp.INSTANCE.m3306getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f4 = Dp.INSTANCE.m3306getUnspecifiedD9Ej5fM();
        }
        return m875heightInVpY3zN4(modifier, f, f4);
    }

    @NotNull
    /* JADX INFO: renamed from: requiredHeight-3ABfNKs, reason: not valid java name */
    public static final Modifier m877requiredHeight3ABfNKs(@NotNull Modifier modifier, float f) {
        return modifier.then(new SizeElement(BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredHeight3ABfNKs$$inlined$debugInspectorInfo$1(f) : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    @NotNull
    /* JADX INFO: renamed from: requiredSize-3ABfNKs, reason: not valid java name */
    public static final Modifier m878requiredSize3ABfNKs(@NotNull Modifier modifier, float f) {
        return modifier.then(new SizeElement(f, f, f, f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredSize3ABfNKs$$inlined$debugInspectorInfo$1(f) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @NotNull
    /* JADX INFO: renamed from: requiredSizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m879requiredSizeInqDBjuR0(@NotNull Modifier modifier, float f, float f4, float f5, float f6) {
        return modifier.then(new SizeElement(f, f4, f5, f6, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredSizeInqDBjuR0$$inlined$debugInspectorInfo$1(f, f4, f5, f6) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: requiredSizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m880requiredSizeInqDBjuR0$default(Modifier modifier, float f, float f4, float f5, float f6, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = Dp.INSTANCE.m3306getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f4 = Dp.INSTANCE.m3306getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f5 = Dp.INSTANCE.m3306getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f6 = Dp.INSTANCE.m3306getUnspecifiedD9Ej5fM();
        }
        return m879requiredSizeInqDBjuR0(modifier, f, f4, f5, f6);
    }

    @NotNull
    /* JADX INFO: renamed from: requiredWidth-3ABfNKs, reason: not valid java name */
    public static final Modifier m881requiredWidth3ABfNKs(@NotNull Modifier modifier, float f) {
        return modifier.then(new SizeElement(f, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$requiredWidth3ABfNKs$$inlined$debugInspectorInfo$1(f) : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    @NotNull
    /* JADX INFO: renamed from: size-3ABfNKs, reason: not valid java name */
    public static final Modifier m882size3ABfNKs(@NotNull Modifier modifier, float f) {
        return modifier.then(new SizeElement(f, f, f, f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$size3ABfNKs$$inlined$debugInspectorInfo$1(f) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @NotNull
    /* JADX INFO: renamed from: size-6HolHcs, reason: not valid java name */
    public static final Modifier m883size6HolHcs(@NotNull Modifier modifier, long j2) {
        return m884sizeVpY3zN4(modifier, DpSize.m3322getWidthD9Ej5fM(j2), DpSize.m3321getHeightD9Ej5fM(j2));
    }

    @NotNull
    /* JADX INFO: renamed from: size-VpY3zN4, reason: not valid java name */
    public static final Modifier m884sizeVpY3zN4(@NotNull Modifier modifier, float f, float f4) {
        return modifier.then(new SizeElement(f, f4, f, f4, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$sizeVpY3zN4$$inlined$debugInspectorInfo$1(f, f4) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @NotNull
    /* JADX INFO: renamed from: sizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m885sizeInqDBjuR0(@NotNull Modifier modifier, float f, float f4, float f5, float f6) {
        return modifier.then(new SizeElement(f, f4, f5, f6, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1(f, f4, f5, f6) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: sizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m886sizeInqDBjuR0$default(Modifier modifier, float f, float f4, float f5, float f6, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = Dp.INSTANCE.m3306getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f4 = Dp.INSTANCE.m3306getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f5 = Dp.INSTANCE.m3306getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f6 = Dp.INSTANCE.m3306getUnspecifiedD9Ej5fM();
        }
        return m885sizeInqDBjuR0(modifier, f, f4, f5, f6);
    }

    @NotNull
    /* JADX INFO: renamed from: width-3ABfNKs, reason: not valid java name */
    public static final Modifier m887width3ABfNKs(@NotNull Modifier modifier, float f) {
        return modifier.then(new SizeElement(f, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$width3ABfNKs$$inlined$debugInspectorInfo$1(f) : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    @NotNull
    /* JADX INFO: renamed from: widthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m888widthInVpY3zN4(@NotNull Modifier modifier, float f, float f4) {
        return modifier.then(new SizeElement(f, BitmapDescriptorFactory.HUE_RED, f4, BitmapDescriptorFactory.HUE_RED, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SizeKt$widthInVpY3zN4$$inlined$debugInspectorInfo$1(f, f4) : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* JADX INFO: renamed from: widthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m889widthInVpY3zN4$default(Modifier modifier, float f, float f4, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = Dp.INSTANCE.m3306getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f4 = Dp.INSTANCE.m3306getUnspecifiedD9Ej5fM();
        }
        return m888widthInVpY3zN4(modifier, f, f4);
    }

    @NotNull
    public static final Modifier wrapContentHeight(@NotNull Modifier modifier, @NotNull Alignment.Vertical vertical, boolean z) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return modifier.then((!Intrinsics.f(vertical, companion.getCenterVertically()) || z) ? (!Intrinsics.f(vertical, companion.getTop()) || z) ? WrapContentElement.INSTANCE.height(vertical, z) : WrapContentHeightTop : WrapContentHeightCenter);
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier modifier, Alignment.Vertical vertical, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            vertical = Alignment.INSTANCE.getCenterVertically();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentHeight(modifier, vertical, z);
    }

    @NotNull
    public static final Modifier wrapContentSize(@NotNull Modifier modifier, @NotNull Alignment alignment, boolean z) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return modifier.then((!Intrinsics.f(alignment, companion.getCenter()) || z) ? (!Intrinsics.f(alignment, companion.getTopStart()) || z) ? WrapContentElement.INSTANCE.size(alignment, z) : WrapContentSizeTopStart : WrapContentSizeCenter);
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            alignment = Alignment.INSTANCE.getCenter();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentSize(modifier, alignment, z);
    }

    @NotNull
    public static final Modifier wrapContentWidth(@NotNull Modifier modifier, @NotNull Alignment.Horizontal horizontal, boolean z) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return modifier.then((!Intrinsics.f(horizontal, companion.getCenterHorizontally()) || z) ? (!Intrinsics.f(horizontal, companion.getStart()) || z) ? WrapContentElement.INSTANCE.width(horizontal, z) : WrapContentWidthStart : WrapContentWidthCenter);
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier modifier, Alignment.Horizontal horizontal, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            horizontal = Alignment.INSTANCE.getCenterHorizontally();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentWidth(modifier, horizontal, z);
    }
}
