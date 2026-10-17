package androidx.media3.exoplayer;

import android.text.TextUtils;
import androidx.media3.common.Format;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class DecoderReuseEvaluation {
    public final String decoderName;
    public final int discardReasons;
    public final Format newFormat;
    public final Format oldFormat;
    public final int result;

    public DecoderReuseEvaluation(String str, Format format, Format format2, int i, int i2) {
        Preconditions.checkArgument(i == 0 || i2 == 0);
        Preconditions.checkArgument(true ^ TextUtils.isEmpty(str));
        this.decoderName = str;
        this.oldFormat = (Format) Preconditions.checkNotNull(format);
        this.newFormat = (Format) Preconditions.checkNotNull(format2);
        this.result = i;
        this.discardReasons = i2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && DecoderReuseEvaluation.class == obj2.getClass()) {
            DecoderReuseEvaluation decoderReuseEvaluation = (DecoderReuseEvaluation) obj2;
            if (this.result == decoderReuseEvaluation.result && this.discardReasons == decoderReuseEvaluation.discardReasons && this.decoderName.equals(decoderReuseEvaluation.decoderName) && this.oldFormat.equals(decoderReuseEvaluation.oldFormat) && this.newFormat.equals(decoderReuseEvaluation.newFormat)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.newFormat.hashCode() + ((this.oldFormat.hashCode() + p.a.c((((527 + this.result) * 31) + this.discardReasons) * 31, 31, this.decoderName)) * 31);
    }
}
