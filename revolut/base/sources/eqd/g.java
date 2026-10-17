package eqd;

import cli.y;
import cqh.m;
import kotlin.jvm.internal.Intrinsics;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends oki.h implements dli.b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d1h.e f128443p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f128444q;

    public g(i stateMapper, c inputData, d1h.e disclaimersControllerModelExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(disclaimersControllerModelExtension, "disclaimersControllerModelExtension");
        this.o = inputData;
        this.f128443p = disclaimersControllerModelExtension;
        this.f128444q = mra.d.b(this, new b(new a(inputData.f128435a, inputData.f128436b, inputData.f128437c), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, new m(((gah.e) this.f128443p).Z2(u.c(this.o.d)), this, 28), null, null, new enb.f(this, null, 16), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f128444q;
    }
}
