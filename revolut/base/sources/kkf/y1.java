package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f185025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vlf.b f185026b;

    public y1(klf.h0 commonDataSource, vlf.b commonUiMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        this.f185025a = commonDataSource;
        this.f185026b = commonUiMapper;
    }

    public final cmf.p a() {
        klf.h0 h0Var = this.f185025a;
        return new cmf.p(new t38.e(h0Var.d(), 24, new iyg.b0(h0Var.j(), 25), new ael.l0(3, this, y1.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Ljava/lang/String;)Ljava/util/List;", 4, 13)), new i0(10), zhm.f0.f322471a, "Initiator");
    }
}
