package ij4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class d extends q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, t60.a.class, "isNotEmpty", "isNotEmpty()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        t60.a p0 = (t60.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(p0.a());
    }
}
