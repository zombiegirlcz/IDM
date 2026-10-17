package androidx.compose.foundation.pager;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.gestures.snapping.SnapPositionKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import k37.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0003\u001a\u0085\u0002\u0010/\u001a\u00020,*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2*\u0010(\u001a&\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$\u0012\u0004\u0012\u00020'0#2\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00190)H\u0000¢\u0006\u0004\b-\u0010.\u001aO\u00104\u001a\b\u0012\u0004\u0012\u0002020\u00192\u0006\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002020$H\u0002¢\u0006\u0004\b4\u00105\u001aG\u00107\u001a\b\u0012\u0004\u0012\u0002020\u00192\u0006\u00106\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002020$H\u0002¢\u0006\u0004\b7\u00108\u001aO\u0010<\u001a\u0004\u0018\u0001022\u0006\u00109\u001a\u00020\u00012\f\u0010:\u001a\b\u0012\u0004\u0012\u0002020\u00192\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b<\u0010=\u001a{\u00103\u001a\u000202*\u00020\u00002\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010A\u001a\u00020@2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00012\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00190)H\u0002¢\u0006\u0004\bB\u0010C\u001a\u0093\u0001\u0010M\u001a\b\u0012\u0004\u0012\u0002020L*\u00020\u00002\f\u0010D\u001a\b\u0012\u0004\u0012\u0002020\u00192\f\u0010E\u001a\b\u0012\u0004\u0012\u0002020\u00192\f\u0010F\u001a\b\u0012\u0004\u0012\u0002020\u00192\u0006\u0010G\u001a\u00020\u00012\u0006\u0010H\u001a\u00020\u00012\u0006\u0010I\u001a\u00020\u00012\u0006\u0010J\u001a\u00020\u00012\u0006\u0010K\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0002¢\u0006\u0004\bM\u0010N¨\u0006O"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "", "pageCount", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "pagerItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenPages", "currentPage", "currentPageOffset", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "", "reverseLayout", "Landroidx/compose/ui/unit/IntOffset;", "visualPageOffset", "pageAvailableSize", "beyondViewportPageCount", "", "pinnedPages", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/ui/layout/Placeable;", "placeablesCache", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "measurePager-7L1iB3k", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function3;Landroidx/collection/MutableIntObjectMap;)Landroidx/compose/foundation/pager/PagerMeasureResult;", "measurePager", "currentLastPage", "pagesCount", "Landroidx/compose/foundation/pager/MeasuredPage;", "getAndMeasure", "createPagesAfterList", "(IIILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "currentFirstPage", "createPagesBeforeList", "(IILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "viewportSize", "visiblePagesInfo", "itemSize", "calculateNewCurrentPage", "(ILjava/util/List;IIILandroidx/compose/foundation/gestures/snapping/SnapPosition;I)Landroidx/compose/foundation/pager/MeasuredPage;", "index", "childConstraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getAndMeasure-G5IdpRk", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZILandroidx/collection/MutableIntObjectMap;)Landroidx/compose/foundation/pager/MeasuredPage;", "pages", "extraPagesBefore", "extraPagesAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "pagesScrollOffset", "", "calculatePagesOffsets", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIILandroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/Density;II)Ljava/util/List;", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class PagerMeasureKt {
    private static final MeasuredPage calculateNewCurrentPage(int i, List<MeasuredPage> list, int i2, int i3, int i5, SnapPosition snapPosition, int i6) {
        MeasuredPage measuredPage;
        if (list.isEmpty()) {
            measuredPage = null;
        } else {
            MeasuredPage measuredPage2 = list.get(0);
            MeasuredPage measuredPage3 = measuredPage2;
            float f = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i, i2, i3, i5, measuredPage3.getOffset(), measuredPage3.getIndex(), snapPosition, i6));
            int iJ = v.j(list);
            if (1 <= iJ) {
                int i21 = 1;
                while (true) {
                    MeasuredPage measuredPage4 = list.get(i21);
                    MeasuredPage measuredPage5 = measuredPage4;
                    float f4 = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i, i2, i3, i5, measuredPage5.getOffset(), measuredPage5.getIndex(), snapPosition, i6));
                    if (Float.compare(f, f4) < 0) {
                        f = f4;
                        measuredPage2 = measuredPage4;
                    }
                    if (i21 == iJ) {
                        break;
                    }
                    i21++;
                }
            }
            measuredPage = measuredPage2;
        }
        return measuredPage;
    }

    private static final List<MeasuredPage> calculatePagesOffsets(LazyLayoutMeasureScope lazyLayoutMeasureScope, List<MeasuredPage> list, List<MeasuredPage> list2, List<MeasuredPage> list3, int i, int i2, int i3, int i5, int i6, Orientation orientation, boolean z, Density density, int i21, int i22) {
        ArrayList arrayList;
        int i32 = i6;
        int i33 = i22 + i21;
        int i43 = orientation == Orientation.Vertical ? i2 : i;
        int i59 = 0;
        boolean z3 = i3 < Math.min(i43, i5);
        if (z3 && i32 != 0) {
            InlineClassHelperKt.throwIllegalStateException("non-zero pagesScrollOffset=" + i32);
        }
        ArrayList arrayList2 = new ArrayList(list3.size() + list2.size() + list.size());
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                InlineClassHelperKt.throwIllegalArgumentException("No extra pages");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i59 < size) {
                iArr[i59] = i22;
                i59++;
            }
            int[] iArr2 = new int[size];
            Arrangement.HorizontalOrVertical horizontalOrVerticalM837spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m837spacedBy0680j_4(lazyLayoutMeasureScope.mo765toDpu2uoSUM(i21));
            if (orientation == Orientation.Vertical) {
                horizontalOrVerticalM837spacedBy0680j_4.arrange(density, i43, iArr, iArr2);
                arrayList = arrayList2;
            } else {
                arrayList = arrayList2;
                horizontalOrVerticalM837spacedBy0680j_4.arrange(density, i43, iArr, LayoutDirection.Ltr, iArr2);
            }
            IntRange intRangeQ = kotlin.collections.d.Q(iArr2);
            kotlin.ranges.c cVarM = intRangeQ;
            if (z) {
                cVarM = kotlin.ranges.f.m(intRangeQ);
            }
            int i66 = cVarM.f186448a;
            int i74 = cVarM.f186449b;
            int i92 = cVarM.f186450c;
            if ((i92 > 0 && i66 <= i74) || (i92 < 0 && i74 <= i66)) {
                while (true) {
                    int size2 = iArr2[i66];
                    MeasuredPage measuredPage = list.get(calculatePagesOffsets$reverseAware(i66, z, size));
                    if (z) {
                        size2 = (i43 - size2) - measuredPage.getSize();
                    }
                    measuredPage.position(size2, i, i2);
                    arrayList.add(measuredPage);
                    if (i66 == i74) {
                        break;
                    }
                    i66 += i92;
                }
            }
        } else {
            arrayList = arrayList2;
            int size3 = list2.size();
            int i96 = i32;
            for (int i99 = 0; i99 < size3; i99++) {
                MeasuredPage measuredPage2 = list2.get(i99);
                i96 -= i33;
                measuredPage2.position(i96, i, i2);
                arrayList.add(measuredPage2);
            }
            int size4 = list.size();
            for (int i100 = 0; i100 < size4; i100++) {
                MeasuredPage measuredPage3 = list.get(i100);
                measuredPage3.position(i32, i, i2);
                arrayList.add(measuredPage3);
                i32 += i33;
            }
            int size5 = list3.size();
            while (i59 < size5) {
                MeasuredPage measuredPage4 = list3.get(i59);
                measuredPage4.position(i32, i, i2);
                arrayList.add(measuredPage4);
                i32 += i33;
                i59++;
            }
        }
        return arrayList;
    }

    private static final int calculatePagesOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    private static final List<MeasuredPage> createPagesAfterList(int i, int i2, int i3, List<Integer> list, Function1<? super Integer, MeasuredPage> function1) {
        int iMin = Math.min(i3, (i2 - i) - 1) + i;
        int i5 = i + 1;
        ArrayList arrayList = null;
        if (i5 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i5)));
                if (i5 == iMin) {
                    break;
                }
                i5++;
            }
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            int iIntValue = list.get(i6).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? f0.f322471a : arrayList;
    }

    private static final List<MeasuredPage> createPagesBeforeList(int i, int i2, List<Integer> list, Function1<? super Integer, MeasuredPage> function1) {
        int iMax = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (iMax <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i3)));
                if (i3 == iMax) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int iIntValue = list.get(i5).intValue();
            if (iIntValue < iMax) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? f0.f322471a : arrayList;
    }

    /* JADX INFO: renamed from: getAndMeasure-G5IdpRk, reason: not valid java name */
    private static final MeasuredPage m951getAndMeasureG5IdpRk(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j2, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j3, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z, int i2, MutableIntObjectMap<List<Placeable>> mutableIntObjectMap) {
        List<Placeable> list;
        Object key = pagerLazyLayoutItemProvider.getKey(i);
        List<Placeable> list2 = mutableIntObjectMap.get(i);
        if (list2 != null) {
            list = list2;
        } else {
            List<Measurable> listCompose = lazyLayoutMeasureScope.compose(i);
            int size = listCompose.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(listCompose.get(i3).mo2530measureBRTryo0(j2));
            }
            mutableIntObjectMap.set(i, arrayList);
            list = arrayList;
        }
        return new MeasuredPage(i, i2, list, j3, key, orientation, horizontal, vertical, layoutDirection, z, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v25, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v26, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r18v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v6, types: [java.util.List] */
    @NotNull
    /* JADX INFO: renamed from: measurePager-7L1iB3k, reason: not valid java name */
    public static final PagerMeasureResult m952measurePager7L1iB3k(@NotNull final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, @NotNull final PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i2, int i3, int i5, int i6, int i21, int i22, long j2, @NotNull final Orientation orientation, final Alignment.Vertical vertical, final Alignment.Horizontal horizontal, final boolean z, final long j3, final int i32, int i33, @NotNull List<Integer> list, @NotNull SnapPosition snapPosition, @NotNull MutableState<Unit> mutableState, @NotNull CoroutineScope coroutineScope, @NotNull Density density, @NotNull Function3 function3, @NotNull final MutableIntObjectMap<List<Placeable>> mutableIntObjectMap) {
        int i43;
        int i59;
        int i66;
        int i74;
        MeasuredPage measuredPage;
        List list2;
        ?? arrayList;
        ?? arrayList2;
        int i92;
        int i96;
        if (i3 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("negative beforeContentPadding");
        }
        if (i5 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("negative afterContentPadding");
        }
        int i99 = i32 + i6;
        if (i99 < 0) {
            i99 = 0;
        }
        int i100 = i33;
        if (i100 > i) {
            i100 = i;
        }
        Orientation orientation2 = Orientation.Vertical;
        final long jConstraints$default = ConstraintsKt.Constraints$default(0, orientation == orientation2 ? Constraints.m3279getMaxWidthimpl(j2) : i32, 0, orientation != orientation2 ? Constraints.m3278getMaxHeightimpl(j2) : i32, 5, null);
        int i101 = 1;
        if (i <= 0) {
            return new PagerMeasureResult(f0.f322471a, i32, i6, i5, orientation, -i3, i2 + i5, false, i100, null, null, BitmapDescriptorFactory.HUE_RED, 0, false, snapPosition, (MeasureResult) function3.invoke(Integer.valueOf(Constraints.m3281getMinWidthimpl(j2)), Integer.valueOf(Constraints.m3280getMinHeightimpl(j2)), new l0g.a(i101)), false, null, null, coroutineScope, density, jConstraints$default, 393216, null);
        }
        int i102 = i100;
        int i103 = i21;
        int i104 = i22;
        while (i103 > 0 && i104 > 0) {
            i103--;
            i104 -= i99;
        }
        int i105 = i104 * (-1);
        if (i103 >= i) {
            i103 = i - 1;
            i105 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i106 = -i3;
        int i107 = (i6 < 0 ? i6 : 0) + i106;
        int i108 = i105 + i107;
        int iMax = 0;
        while (i108 < 0 && i103 > 0) {
            int i109 = i103 - 1;
            MeasuredPage measuredPageM951getAndMeasureG5IdpRk = m951getAndMeasureG5IdpRk(lazyLayoutMeasureScope, i109, jConstraints$default, pagerLazyLayoutItemProvider, j3, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i32, mutableIntObjectMap);
            arrayDeque.add(0, measuredPageM951getAndMeasureG5IdpRk);
            iMax = Math.max(iMax, measuredPageM951getAndMeasureG5IdpRk.getCrossAxisSize());
            i108 += i99;
            i107 = i107;
            i103 = i109;
        }
        if (i108 < i107) {
            i108 = i107;
        }
        int i110 = i108 - i107;
        int i111 = i2 + i5;
        int i112 = i111 >= 0 ? i111 : 0;
        int i113 = i103;
        int i114 = -i110;
        int i115 = i113;
        int i116 = 0;
        boolean z3 = false;
        while (i116 < arrayDeque.size()) {
            if (i114 >= i112) {
                arrayDeque.remove(i116);
                Unit unit = Unit.f186387a;
                z3 = true;
            } else {
                i115++;
                i114 += i99;
                i116++;
            }
        }
        int i117 = i110;
        int i118 = i115;
        boolean z4 = z3;
        while (i118 < i && (i114 < i112 || i114 <= 0 || arrayDeque.isEmpty())) {
            int i119 = i118;
            int i120 = i117;
            int i121 = i107;
            MeasuredPage measuredPageM951getAndMeasureG5IdpRk2 = m951getAndMeasureG5IdpRk(lazyLayoutMeasureScope, i119, jConstraints$default, pagerLazyLayoutItemProvider, j3, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i32, mutableIntObjectMap);
            int i122 = i112;
            int i123 = i - 1;
            i114 += i119 == i123 ? i32 : i99;
            if (i114 > i121 || i119 == i123) {
                int iMax2 = Math.max(iMax, measuredPageM951getAndMeasureG5IdpRk2.getCrossAxisSize());
                arrayDeque.addLast(measuredPageM951getAndMeasureG5IdpRk2);
                i92 = i113;
                iMax = iMax2;
                i96 = i120;
            } else {
                i92 = i119 + 1;
                i96 = i120 - i99;
                Unit unit2 = Unit.f186387a;
                z4 = true;
            }
            i107 = i121;
            i118 = i119 + 1;
            i113 = i92;
            i117 = i96;
            i112 = i122;
        }
        int i124 = i118;
        int i125 = i117;
        if (i114 < i2) {
            int i126 = i2 - i114;
            i66 = i125 - i126;
            i114 += i126;
            i59 = i113;
            while (i66 < i3 && i59 > 0) {
                int i127 = i59 - 1;
                MeasuredPage measuredPageM951getAndMeasureG5IdpRk3 = m951getAndMeasureG5IdpRk(lazyLayoutMeasureScope, i127, jConstraints$default, pagerLazyLayoutItemProvider, j3, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i32, mutableIntObjectMap);
                arrayDeque.add(0, measuredPageM951getAndMeasureG5IdpRk3);
                iMax = Math.max(iMax, measuredPageM951getAndMeasureG5IdpRk3.getCrossAxisSize());
                i66 += i99;
                i124 = i124;
                i59 = i127;
            }
            i43 = i124;
            if (i66 < 0) {
                i114 += i66;
                i66 = 0;
            }
        } else {
            i43 = i124;
            i59 = i113;
            i66 = i125;
        }
        if (i66 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid currentFirstPageScrollOffset");
        }
        int i128 = i114;
        int i129 = -i66;
        MeasuredPage measuredPage2 = (MeasuredPage) arrayDeque.first();
        if (i3 > 0 || i6 < 0) {
            int size = arrayDeque.size();
            i74 = i129;
            int i130 = 0;
            while (i130 < size && i66 != 0 && i99 <= i66 && i130 != v.j(arrayDeque)) {
                i66 -= i99;
                i130++;
                measuredPage2 = (MeasuredPage) arrayDeque.get(i130);
            }
        } else {
            i74 = i129;
        }
        int i131 = i66;
        MeasuredPage measuredPage3 = measuredPage2;
        final int i132 = 0;
        List<MeasuredPage> listCreatePagesBeforeList = createPagesBeforeList(i59, i102, list, new Function1() { // from class: l1.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i133 = i132;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i133) {
                    case 0:
                        return PagerMeasureKt.measurePager_7L1iB3k$lambda$10(lazyLayoutMeasureScope, jConstraints$default, pagerLazyLayoutItemProvider, j3, orientation, horizontal, vertical, z, i32, mutableIntObjectMap, iIntValue);
                    default:
                        return PagerMeasureKt.measurePager_7L1iB3k$lambda$12(lazyLayoutMeasureScope, jConstraints$default, pagerLazyLayoutItemProvider, j3, orientation, horizontal, vertical, z, i32, mutableIntObjectMap, iIntValue);
                }
            }
        });
        int size2 = listCreatePagesBeforeList.size();
        for (int i133 = 0; i133 < size2; i133++) {
            iMax = Math.max(iMax, listCreatePagesBeforeList.get(i133).getCrossAxisSize());
        }
        final int i134 = 1;
        List<MeasuredPage> listCreatePagesAfterList = createPagesAfterList(((MeasuredPage) arrayDeque.last()).getIndex(), i, i102, list, new Function1() { // from class: l1.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i1332 = i134;
                int iIntValue = ((Integer) obj2).intValue();
                switch (i1332) {
                    case 0:
                        return PagerMeasureKt.measurePager_7L1iB3k$lambda$10(lazyLayoutMeasureScope, jConstraints$default, pagerLazyLayoutItemProvider, j3, orientation, horizontal, vertical, z, i32, mutableIntObjectMap, iIntValue);
                    default:
                        return PagerMeasureKt.measurePager_7L1iB3k$lambda$12(lazyLayoutMeasureScope, jConstraints$default, pagerLazyLayoutItemProvider, j3, orientation, horizontal, vertical, z, i32, mutableIntObjectMap, iIntValue);
                }
            }
        });
        int size3 = listCreatePagesAfterList.size();
        int i135 = 0;
        while (i135 < size3) {
            iMax = Math.max(iMax, listCreatePagesAfterList.get(i135).getCrossAxisSize());
            i135++;
            i102 = i102;
        }
        int i136 = i102;
        boolean z6 = Intrinsics.f(measuredPage3, arrayDeque.first()) && listCreatePagesBeforeList.isEmpty() && listCreatePagesAfterList.isEmpty();
        Orientation orientation3 = Orientation.Vertical;
        int iM3292constrainWidthK40F9xA = ConstraintsKt.m3292constrainWidthK40F9xA(j2, orientation == orientation3 ? iMax : i128);
        if (orientation == orientation3) {
            iMax = i128;
        }
        int iM3291constrainHeightK40F9xA = ConstraintsKt.m3291constrainHeightK40F9xA(j2, iMax);
        int i137 = i43;
        int i138 = i99;
        List<MeasuredPage> listCalculatePagesOffsets = calculatePagesOffsets(lazyLayoutMeasureScope, arrayDeque, listCreatePagesBeforeList, listCreatePagesAfterList, iM3292constrainWidthK40F9xA, iM3291constrainHeightK40F9xA, i128, i2, i74, orientation, z, lazyLayoutMeasureScope, i6, i32);
        if (z6) {
            measuredPage = measuredPage3;
            list2 = listCalculatePagesOffsets;
        } else {
            ArrayList arrayList3 = new ArrayList(listCalculatePagesOffsets.size());
            int size4 = listCalculatePagesOffsets.size();
            int i139 = 0;
            while (i139 < size4) {
                MeasuredPage measuredPage4 = listCalculatePagesOffsets.get(i139);
                MeasuredPage measuredPage5 = measuredPage4;
                MeasuredPage measuredPage6 = measuredPage3;
                int i140 = i138;
                if (measuredPage5.getIndex() >= ((MeasuredPage) arrayDeque.first()).getIndex() && measuredPage5.getIndex() <= ((MeasuredPage) arrayDeque.last()).getIndex()) {
                    arrayList3.add(measuredPage4);
                }
                i139++;
                i138 = i140;
                measuredPage3 = measuredPage6;
            }
            measuredPage = measuredPage3;
            list2 = arrayList3;
        }
        int i141 = i138;
        if (listCreatePagesBeforeList.isEmpty()) {
            arrayList = f0.f322471a;
        } else {
            arrayList = new ArrayList(listCalculatePagesOffsets.size());
            int size5 = listCalculatePagesOffsets.size();
            for (int i142 = 0; i142 < size5; i142++) {
                MeasuredPage measuredPage7 = listCalculatePagesOffsets.get(i142);
                if (measuredPage7.getIndex() < ((MeasuredPage) arrayDeque.first()).getIndex()) {
                    arrayList.add(measuredPage7);
                }
            }
        }
        ?? r182 = arrayList;
        if (listCreatePagesAfterList.isEmpty()) {
            arrayList2 = f0.f322471a;
        } else {
            arrayList2 = new ArrayList(listCalculatePagesOffsets.size());
            int size6 = listCalculatePagesOffsets.size();
            for (int i143 = 0; i143 < size6; i143++) {
                MeasuredPage measuredPage8 = listCalculatePagesOffsets.get(i143);
                if (measuredPage8.getIndex() > ((MeasuredPage) arrayDeque.last()).getIndex()) {
                    arrayList2.add(measuredPage8);
                }
            }
        }
        ?? r192 = arrayList2;
        int i144 = 1;
        MeasuredPage measuredPageCalculateNewCurrentPage = calculateNewCurrentPage(i2 + i3 + i5, list2, i3, i5, i32, snapPosition, i);
        return new PagerMeasureResult(list2, i32, i6, i5, orientation, i106, i111, z, i136, measuredPage, measuredPageCalculateNewCurrentPage, i141 == 0 ? BitmapDescriptorFactory.HUE_RED : kotlin.ranges.f.f((snapPosition.position(r0, i32, i3, i5, measuredPageCalculateNewCurrentPage != null ? measuredPageCalculateNewCurrentPage.getIndex() : 0, i) - (measuredPageCalculateNewCurrentPage != null ? measuredPageCalculateNewCurrentPage.getOffset() : 0)) / i141, -0.5f, 0.5f), i131, i137 < i || i128 > i2, snapPosition, (MeasureResult) function3.invoke(Integer.valueOf(iM3292constrainWidthK40F9xA), Integer.valueOf(iM3291constrainHeightK40F9xA), new kzc.a(mutableState, listCalculatePagesOffsets, i144)), z4, r182, r192, coroutineScope, density, jConstraints$default, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasuredPage measurePager_7L1iB3k$lambda$10(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j2, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j3, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, boolean z, int i, MutableIntObjectMap mutableIntObjectMap, int i2) {
        return m951getAndMeasureG5IdpRk(lazyLayoutMeasureScope, i2, j2, pagerLazyLayoutItemProvider, j3, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i, mutableIntObjectMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasuredPage measurePager_7L1iB3k$lambda$12(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j2, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j3, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, boolean z, int i, MutableIntObjectMap mutableIntObjectMap, int i2) {
        return m951getAndMeasureG5IdpRk(lazyLayoutMeasureScope, i2, j2, pagerLazyLayoutItemProvider, j3, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i, mutableIntObjectMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measurePager_7L1iB3k$lambda$18(MutableState mutableState, List list, Placeable.PlacementScope placementScope) {
        placementScope.withMotionFrameOfReferencePlacement(new t(list, 20));
        ObservableScopeInvalidator.m936attachToScopeimpl(mutableState);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measurePager_7L1iB3k$lambda$18$0(List list, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((MeasuredPage) list.get(i)).place(placementScope);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measurePager_7L1iB3k$lambda$3(Placeable.PlacementScope placementScope) {
        return Unit.f186387a;
    }
}
