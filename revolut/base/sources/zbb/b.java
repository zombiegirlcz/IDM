package zbb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f320865b = new b();

    /* JADX WARN: Illegal instructions before constructor call */
    private b() {
        k1j.a[] elements = {k1j.a.POCKETS, k1j.a.CRYPTO, k1j.a.COMMODITIES};
        Intrinsics.checkNotNullParameter(elements, "elements");
        super(kotlin.collections.d.y0(elements));
    }
}
