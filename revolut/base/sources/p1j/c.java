package p1j;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f231945a;

    static {
        k1j.a[] elements = {k1j.a.CRYPTO, k1j.a.COMMODITIES};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f231945a = kotlin.collections.d.y0(elements);
    }
}
