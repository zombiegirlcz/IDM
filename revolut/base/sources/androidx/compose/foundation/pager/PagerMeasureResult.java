package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BÑ\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u0004\u0018\u00010\u00002\u0006\u0010%\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(H\u0096\u0001¢\u0006\u0004\b)\u0010*R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b1\u00100R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b2\u00100R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b6\u00100R\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b7\u00100R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0010\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b;\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\b?\u0010>R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010.\u001a\u0004\bC\u00100R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u00108\u001a\u0004\bD\u0010:R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010HR\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u00108\u001a\u0004\bI\u0010:R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\bJ\u0010-R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\bK\u0010-R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010R\u001a\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020U8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0014\u0010Y\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u00100R\u0011\u0010[\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bZ\u0010:R\u0014\u0010]\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\\\u00100R\u0014\u0010_\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b^\u00100R \u0010d\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00060`8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bb\u0010cR\"\u0010i\u001a\u0010\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020(\u0018\u00010e8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006j"}, d2 = {"Landroidx/compose/foundation/pager/PagerMeasureResult;", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "", "Landroidx/compose/foundation/pager/MeasuredPage;", "visiblePagesInfo", "", "pageSize", "pageSpacing", "afterContentPadding", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "viewportStartOffset", "viewportEndOffset", "", "reverseLayout", "beyondViewportPageCount", "firstVisiblePage", "currentPage", "", "currentPageOffsetFraction", "firstVisiblePageScrollOffset", "canScrollForward", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "measureResult", "remeasureNeeded", "extraPagesBefore", "extraPagesAfter", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Constraints;", "childConstraints", "<init>", "(Ljava/util/List;IIILandroidx/compose/foundation/gestures/Orientation;IIZILandroidx/compose/foundation/pager/MeasuredPage;Landroidx/compose/foundation/pager/MeasuredPage;FIZLandroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/ui/layout/MeasureResult;ZLjava/util/List;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/unit/Density;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "delta", "copyWithScrollDeltaWithoutRemeasure", "(I)Landroidx/compose/foundation/pager/PagerMeasureResult;", "", "placeChildren", "()V", "Ljava/util/List;", "getVisiblePagesInfo", "()Ljava/util/List;", "I", "getPageSize", "()I", "getPageSpacing", "getAfterContentPadding", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getViewportStartOffset", "getViewportEndOffset", "Z", "getReverseLayout", "()Z", "getBeyondViewportPageCount", "Landroidx/compose/foundation/pager/MeasuredPage;", "getFirstVisiblePage", "()Landroidx/compose/foundation/pager/MeasuredPage;", "getCurrentPage", "F", "getCurrentPageOffsetFraction", "()F", "getFirstVisiblePageScrollOffset", "getCanScrollForward", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "getSnapPosition", "()Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "Landroidx/compose/ui/layout/MeasureResult;", "getRemeasureNeeded", "getExtraPagesBefore", "getExtraPagesAfter", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "J", "getChildConstraints-msEJaDk", "()J", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "viewportSize", "getBeforeContentPadding", "beforeContentPadding", "getCanScrollBackward", "canScrollBackward", "getWidth", "width", "getHeight", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "getRulers", "()Lkotlin/jvm/functions/Function1;", "rulers", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PagerMeasureResult implements PagerLayoutInfo, MeasureResult {
    private final int afterContentPadding;
    private final int beyondViewportPageCount;
    private final boolean canScrollForward;
    private final long childConstraints;

    @NotNull
    private final CoroutineScope coroutineScope;
    private final MeasuredPage currentPage;
    private final float currentPageOffsetFraction;

    @NotNull
    private final Density density;

    @NotNull
    private final List<MeasuredPage> extraPagesAfter;

    @NotNull
    private final List<MeasuredPage> extraPagesBefore;
    private final MeasuredPage firstVisiblePage;
    private final int firstVisiblePageScrollOffset;

    @NotNull
    private final MeasureResult measureResult;

    @NotNull
    private final Orientation orientation;
    private final int pageSize;
    private final int pageSpacing;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;

    @NotNull
    private final SnapPosition snapPosition;
    private final int viewportEndOffset;
    private final int viewportStartOffset;

    @NotNull
    private final List<MeasuredPage> visiblePagesInfo;

    public /* synthetic */ PagerMeasureResult(List list, int i, int i2, int i3, Orientation orientation, int i5, int i6, boolean z, int i21, MeasuredPage measuredPage, MeasuredPage measuredPage2, float f, int i22, boolean z3, SnapPosition snapPosition, MeasureResult measureResult, boolean z4, List list2, List list3, CoroutineScope coroutineScope, Density density, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, i2, i3, orientation, i5, i6, z, i21, measuredPage, measuredPage2, f, i22, z3, snapPosition, measureResult, z4, list2, list3, coroutineScope, density, j2);
    }

    public final PagerMeasureResult copyWithScrollDeltaWithoutRemeasure(int delta) {
        int i;
        int pageSpacing = getPageSpacing() + getPageSize();
        if (!this.remeasureNeeded && !getVisiblePagesInfo().isEmpty() && this.firstVisiblePage != null && (i = this.firstVisiblePageScrollOffset - delta) >= 0 && i < pageSpacing) {
            float f = pageSpacing != 0 ? delta / pageSpacing : BitmapDescriptorFactory.HUE_RED;
            float f4 = this.currentPageOffsetFraction - f;
            if (this.currentPage != null && f4 < 0.5f && f4 > -0.5f) {
                MeasuredPage measuredPage = (MeasuredPage) d0.b0(getVisiblePagesInfo());
                MeasuredPage measuredPage2 = (MeasuredPage) d0.m0(getVisiblePagesInfo());
                if (delta >= 0 ? Math.min(getViewportStartOffset() - measuredPage.getOffset(), getViewportEndOffset() - measuredPage2.getOffset()) > delta : Math.min((measuredPage.getOffset() + pageSpacing) - getViewportStartOffset(), (measuredPage2.getOffset() + pageSpacing) - getViewportEndOffset()) > (-delta)) {
                    List<MeasuredPage> visiblePagesInfo = getVisiblePagesInfo();
                    int size = visiblePagesInfo.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        visiblePagesInfo.get(i2).applyScrollDelta(delta);
                    }
                    List<MeasuredPage> list = this.extraPagesBefore;
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        list.get(i3).applyScrollDelta(delta);
                    }
                    List<MeasuredPage> list2 = this.extraPagesAfter;
                    int size3 = list2.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        list2.get(i5).applyScrollDelta(delta);
                    }
                    return new PagerMeasureResult(getVisiblePagesInfo(), getPageSize(), getPageSpacing(), getAfterContentPadding(), getOrientation(), getViewportStartOffset(), getViewportEndOffset(), getReverseLayout(), getBeyondViewportPageCount(), this.firstVisiblePage, this.currentPage, this.currentPageOffsetFraction - f, this.firstVisiblePageScrollOffset - delta, this.canScrollForward || delta > 0, getSnapPosition(), this.measureResult, this.remeasureNeeded, this.extraPagesBefore, this.extraPagesAfter, this.coroutineScope, this.density, this.childConstraints, null);
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    @NotNull
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getBeyondViewportPageCount() {
        return this.beyondViewportPageCount;
    }

    public final boolean getCanScrollBackward() {
        MeasuredPage measuredPage = this.firstVisiblePage;
        return ((measuredPage != null ? measuredPage.getIndex() : 0) == 0 && this.firstVisiblePageScrollOffset == 0) ? false : true;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* JADX INFO: renamed from: getChildConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }

    @NotNull
    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public final MeasuredPage getCurrentPage() {
        return this.currentPage;
    }

    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction;
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @NotNull
    public final List<MeasuredPage> getExtraPagesAfter() {
        return this.extraPagesAfter;
    }

    @NotNull
    public final List<MeasuredPage> getExtraPagesBefore() {
        return this.extraPagesBefore;
    }

    public final MeasuredPage getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    public final int getFirstVisiblePageScrollOffset() {
        return this.firstVisiblePageScrollOffset;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* JADX INFO: renamed from: getHeight */
    public int get$height() {
        return this.measureResult.get$height();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    @NotNull
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSize() {
        return this.pageSize;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSpacing() {
        return this.pageSpacing;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public Function1<RulerScope, Unit> getRulers() {
        return this.measureResult.getRulers();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    @NotNull
    public SnapPosition getSnapPosition() {
        return this.snapPosition;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* JADX INFO: renamed from: getViewportSize-YbymL2g */
    public long mo950getViewportSizeYbymL2g() {
        return IntSize.m3351constructorimpl((((long) get$height()) & BodyPartID.bodyIdMax) | (((long) get$width()) << 32));
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    @NotNull
    public List<MeasuredPage> getVisiblePagesInfo() {
        return this.visiblePagesInfo;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* JADX INFO: renamed from: getWidth */
    public int get$width() {
        return this.measureResult.get$width();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.measureResult.placeChildren();
    }

    private PagerMeasureResult(List<MeasuredPage> list, int i, int i2, int i3, Orientation orientation, int i5, int i6, boolean z, int i21, MeasuredPage measuredPage, MeasuredPage measuredPage2, float f, int i22, boolean z3, SnapPosition snapPosition, MeasureResult measureResult, boolean z4, List<MeasuredPage> list2, List<MeasuredPage> list3, CoroutineScope coroutineScope, Density density, long j2) {
        this.visiblePagesInfo = list;
        this.pageSize = i;
        this.pageSpacing = i2;
        this.afterContentPadding = i3;
        this.orientation = orientation;
        this.viewportStartOffset = i5;
        this.viewportEndOffset = i6;
        this.reverseLayout = z;
        this.beyondViewportPageCount = i21;
        this.firstVisiblePage = measuredPage;
        this.currentPage = measuredPage2;
        this.currentPageOffsetFraction = f;
        this.firstVisiblePageScrollOffset = i22;
        this.canScrollForward = z3;
        this.snapPosition = snapPosition;
        this.measureResult = measureResult;
        this.remeasureNeeded = z4;
        this.extraPagesBefore = list2;
        this.extraPagesAfter = list3;
        this.coroutineScope = coroutineScope;
        this.density = density;
        this.childConstraints = j2;
    }

    public PagerMeasureResult(List list, int i, int i2, int i3, Orientation orientation, int i5, int i6, boolean z, int i21, MeasuredPage measuredPage, MeasuredPage measuredPage2, float f, int i22, boolean z3, SnapPosition snapPosition, MeasureResult measureResult, boolean z4, List list2, List list3, CoroutineScope coroutineScope, Density density, long j2, int i32, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, i2, i3, orientation, i5, i6, z, i21, measuredPage, measuredPage2, f, i22, z3, snapPosition, measureResult, z4, (i32 & 131072) != 0 ? f0.f322471a : list2, (i32 & 262144) != 0 ? f0.f322471a : list3, coroutineScope, density, j2, null);
    }
}
