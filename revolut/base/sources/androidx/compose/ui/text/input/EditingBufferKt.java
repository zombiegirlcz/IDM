package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class EditingBufferKt {
    /* JADX INFO: renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m3050updateRangeAfterDeletepWDy79M(long j2, long j3) {
        int iM2955getLengthimpl;
        int iM2957getMinimpl = TextRange.m2957getMinimpl(j2);
        int iM2956getMaximpl = TextRange.m2956getMaximpl(j2);
        if (TextRange.m2961intersects5zctL8(j3, j2)) {
            if (TextRange.m2949contains5zctL8(j3, j2)) {
                iM2957getMinimpl = TextRange.m2957getMinimpl(j3);
                iM2956getMaximpl = iM2957getMinimpl;
            } else {
                if (TextRange.m2949contains5zctL8(j2, j3)) {
                    iM2955getLengthimpl = TextRange.m2955getLengthimpl(j3);
                } else if (TextRange.m2950containsimpl(j3, iM2957getMinimpl)) {
                    iM2957getMinimpl = TextRange.m2957getMinimpl(j3);
                    iM2955getLengthimpl = TextRange.m2955getLengthimpl(j3);
                } else {
                    iM2956getMaximpl = TextRange.m2957getMinimpl(j3);
                }
                iM2956getMaximpl -= iM2955getLengthimpl;
            }
        } else if (iM2956getMaximpl > TextRange.m2957getMinimpl(j3)) {
            iM2957getMinimpl -= TextRange.m2955getLengthimpl(j3);
            iM2955getLengthimpl = TextRange.m2955getLengthimpl(j3);
            iM2956getMaximpl -= iM2955getLengthimpl;
        }
        return TextRangeKt.TextRange(iM2957getMinimpl, iM2956getMaximpl);
    }
}
