package i80;

import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import zhm.n;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[][] f159408a;

    public a(int[][] imageMatrix) {
        Intrinsics.checkNotNullParameter(imageMatrix, "imageMatrix");
        this.f159408a = imageMatrix;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!a.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.android.utils.barcode.Barcode");
        return n.b(this.f159408a, ((a) obj2).f159408a);
    }

    public final int hashCode() {
        return Arrays.deepHashCode(this.f159408a);
    }
}
