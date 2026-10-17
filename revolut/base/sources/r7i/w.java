package r7i;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f252253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f252254b;

    public w() {
        j8l.a[] elements = {j8l.a.CRYPTO, j8l.a.REVX_FIAT, j8l.a.FIAT};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f252253a = kotlin.collections.d.y0(elements);
        k1j.a[] elements2 = {k1j.a.CRYPTO, k1j.a.REVOLUT_X_FIAT, k1j.a.POCKETS};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        this.f252254b = kotlin.collections.d.y0(elements2);
    }
}
