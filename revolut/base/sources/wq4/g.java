package wq4;

import cm4.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f299410a;

    public g(p paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        this.f299410a = paymentData;
    }

    @Override // wq4.i
    public final List a() {
        p pVar = this.f299410a;
        qv0.i[] elements = {h.e(pVar), h.c(pVar), h.d(pVar), h.f(pVar)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }
}
