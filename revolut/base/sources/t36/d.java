package t36;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f267662a;

    static {
        k1j.a[] elements = {k1j.a.POCKETS, k1j.a.CRYPTO, k1j.a.REVOLUT_X_FIAT};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f267662a = kotlin.collections.d.y0(elements);
    }
}
