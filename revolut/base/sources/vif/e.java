package vif;

import com.revolut.feature.transactions.impl.data.network.DeFiTransactionsService;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ufm.i;
import v1.m;
import vgk.g;
import vh2.j;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiTransactionsService f289594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xv5.c f289595b;

    public e(DeFiTransactionsService deFiTransactionsService, xv5.c baseCurrencyInteractor) {
        Intrinsics.checkNotNullParameter(deFiTransactionsService, "deFiTransactionsService");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        this.f289594a = deFiTransactionsService;
        this.f289595b = baseCurrencyInteractor;
    }

    @Override // vif.f
    public final d0 a(String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return d(new j(this, 8));
    }

    @Override // vif.f
    public final d0 b(long j2, String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return d(new d(this, j2, 1));
    }

    @Override // vif.f
    public final d0 c(long j2, String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return d(new d(this, j2, 0));
    }

    public final i d(Function1 function1) {
        d0 d0VarFirstOrError = xv5.c.b(this.f289595b).firstOrError();
        c cVar = new c(new g(22), 0);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, cVar, 1);
        od0.i.Companion.getClass();
        i iVar2 = new i(iVar.o(od0.i.f224256b), new c(new m(5, function1), 1), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }
}
