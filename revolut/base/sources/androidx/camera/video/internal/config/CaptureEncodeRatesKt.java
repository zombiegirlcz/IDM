package androidx.camera.video.internal.config;

import android.util.Rational;
import androidx.camera.core.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rim.d;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "captureRate", "Landroid/util/Rational;", "captureToEncodeRatio", "toEncodeRate", "(ILandroid/util/Rational;)I", "encodeRate", "toCaptureRate", "ratio", "", "isInvalidCaptureToEncodeRatio", "(Landroid/util/Rational;)Z", "camera-video"}, k = 2, mv = {2, 1, 0}, xi = 48)
public abstract class CaptureEncodeRatesKt {
    private static final boolean isInvalidCaptureToEncodeRatio(Rational rational) {
        return Intrinsics.f(rational, Rational.NaN) || Intrinsics.f(rational, Rational.ZERO) || Intrinsics.f(rational, Rational.NEGATIVE_INFINITY) || Intrinsics.f(rational, Rational.POSITIVE_INFINITY);
    }

    public static final int toCaptureRate(int i, Rational rational) {
        if (rational == null) {
            return i;
        }
        if (!isInvalidCaptureToEncodeRatio(rational)) {
            return d.c(rational.floatValue() * i);
        }
        Logger.w("CaptureEncodeRates", "Invalid capture-to-encode ratio: " + rational);
        return i;
    }

    public static final int toEncodeRate(int i, Rational rational) {
        if (rational == null) {
            return i;
        }
        if (!isInvalidCaptureToEncodeRatio(rational)) {
            return d.c(i / rational.floatValue());
        }
        Logger.w("CaptureEncodeRates", "Invalid capture-to-encode ratio: " + rational);
        return i;
    }
}
