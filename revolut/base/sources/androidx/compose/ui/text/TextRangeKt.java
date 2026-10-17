package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0000\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000b\u001a\u0013\u0010\u0007\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\r\u001a!\u0010\u000e\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u0015"}, d2 = {"substring", "", "", "range", "Landroidx/compose/ui/text/TextRange;", "substring-FDrldGo", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "TextRange", "start", "", "end", "(II)J", "index", "(I)J", "coerceIn", "minimumValue", "maximumValue", "coerceIn-8ffj60Q", "(JII)J", "packWithCheck", "", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class TextRangeKt {
    public static final long TextRange(int i, int i2) {
        return TextRange.m2948constructorimpl(packWithCheck(i, i2));
    }

    /* JADX INFO: renamed from: coerceIn-8ffj60Q, reason: not valid java name */
    public static final long m2965coerceIn8ffj60Q(long j2, int i, int i2) {
        int iM2959getStartimpl = TextRange.m2959getStartimpl(j2);
        if (iM2959getStartimpl < i) {
            iM2959getStartimpl = i;
        }
        if (iM2959getStartimpl > i2) {
            iM2959getStartimpl = i2;
        }
        int iM2954getEndimpl = TextRange.m2954getEndimpl(j2);
        if (iM2954getEndimpl >= i) {
            i = iM2954getEndimpl;
        }
        if (i <= i2) {
            i2 = i;
        }
        return (iM2959getStartimpl == TextRange.m2959getStartimpl(j2) && i2 == TextRange.m2954getEndimpl(j2)) ? j2 : TextRange(iM2959getStartimpl, i2);
    }

    private static final long packWithCheck(int i, int i2) {
        if (!(i >= 0 && i2 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        return (((long) i2) & BodyPartID.bodyIdMax) | (((long) i) << 32);
    }

    @NotNull
    /* JADX INFO: renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m2966substringFDrldGo(@NotNull CharSequence charSequence, long j2) {
        return charSequence.subSequence(TextRange.m2957getMinimpl(j2), TextRange.m2956getMaximpl(j2)).toString();
    }

    public static final long TextRange(int i) {
        return TextRange(i, i);
    }
}
