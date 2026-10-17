package rmc;

import akg.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nmc.k;
import q2j.j;
import qmc.h;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements q1h.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f255241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f255242b;

    public g(h portfolioInfoProvider, k roboTransactionMapper, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        Intrinsics.checkNotNullParameter(roboTransactionMapper, "roboTransactionMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f255241a = portfolioInfoProvider;
        this.f255242b = userInteractor;
    }

    @Override // q1h.f
    public final n a(List trades) {
        Intrinsics.checkNotNullParameter(trades, "trades");
        return nim.a.v(u0.m(this.f255242b.j(w4l.h.f294642c), glc.a.c(this.f255241a)), new j(trades, this));
    }
}
