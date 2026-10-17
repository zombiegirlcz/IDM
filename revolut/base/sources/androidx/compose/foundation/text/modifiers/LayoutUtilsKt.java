package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0013\u001a\u00020\u0004*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"finalConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxIntrinsicWidth", "", "finalConstraints-tfFHcEY", "(JZIF)J", "finalMaxWidth", "", "finalMaxWidth-tfFHcEY", "(JZIF)I", "finalMaxLines", "maxLinesIn", "finalMaxLines-xdlQI24", "(ZII)I", "isEllipsis", "isEllipsis-MW5-ApA", "(I)Z", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class LayoutUtilsKt {
    /* JADX INFO: renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m1109finalConstraintstfFHcEY(long j2, boolean z, int i, float f) {
        return Constraints.INSTANCE.m3286fitPrioritizingWidthZbe2FdA(0, m1111finalMaxWidthtfFHcEY(j2, z, i, f), 0, Constraints.m3278getMaxHeightimpl(j2));
    }

    /* JADX INFO: renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m1110finalMaxLinesxdlQI24(boolean z, int i, int i2) {
        if ((z || !m1112isEllipsisMW5ApA(i)) && i2 >= 1) {
            return i2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m1111finalMaxWidthtfFHcEY(long j2, boolean z, int i, float f) {
        int iM3279getMaxWidthimpl = ((z || m1112isEllipsisMW5ApA(i)) && Constraints.m3275getHasBoundedWidthimpl(j2)) ? Constraints.m3279getMaxWidthimpl(j2) : Integer.MAX_VALUE;
        return Constraints.m3281getMinWidthimpl(j2) == iM3279getMaxWidthimpl ? iM3279getMaxWidthimpl : f.g(TextDelegateKt.ceilToIntPx(f), Constraints.m3281getMinWidthimpl(j2), iM3279getMaxWidthimpl);
    }

    /* JADX INFO: renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m1112isEllipsisMW5ApA(int i) {
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        return TextOverflow.m3259equalsimpl0(i, companion.m3263getEllipsisgIe3tQ8()) || TextOverflow.m3259equalsimpl0(i, companion.m3265getStartEllipsisgIe3tQ8()) || TextOverflow.m3259equalsimpl0(i, companion.m3264getMiddleEllipsisgIe3tQ8());
    }
}
