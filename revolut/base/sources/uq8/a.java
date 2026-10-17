package uq8;

import a31.i;
import kotlin.jvm.internal.Intrinsics;
import rfm.j;
import te8.d0;
import wsg.n;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f282112a;

    public a(d0 juniorWalletBalanceProvider, n walletsInteractor) {
        Intrinsics.checkNotNullParameter(juniorWalletBalanceProvider, "juniorWalletBalanceProvider");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        this.f282112a = juniorWalletBalanceProvider;
    }

    public final j a(String juniorWalletId, boolean z) {
        Intrinsics.checkNotNullParameter(juniorWalletId, "juniorWalletId");
        efm.d0 d0VarFirstOrError = this.f282112a.a(juniorWalletId).firstOrError();
        up5.d0 d0Var = new up5.d0(8, new i(this, juniorWalletId, 16, z));
        d0VarFirstOrError.getClass();
        j jVar = new j(d0VarFirstOrError, d0Var, 2);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
        return jVar;
    }
}
