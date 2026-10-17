package po5;

import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pj3.b;
import pnh.a0;
import sd5.c;
import ufm.i;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f237888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wif.a f237889b;

    public a(c configurationInteractor, wif.a userFeaturesChecker) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        this.f237888a = configurationInteractor;
        this.f237889b = userFeaturesChecker;
    }

    public static /* synthetic */ i c(a aVar) {
        return aVar.b(new gn.a(8));
    }

    public final i a() {
        d0 d0VarFirstOrError = zi0.c.J(this.f237888a.a(false)).firstOrError();
        pjg.i iVar = new pjg.i(new a0(8), 26);
        d0VarFirstOrError.getClass();
        i iVar2 = new i(d0VarFirstOrError, iVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }

    public final i b(Function1 filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        d0 d0VarFirstOrError = this.f237889b.d(wog.a.CRYPTO_WITHDRAWALS).firstOrError();
        pjg.i iVar = new pjg.i(new b(this, filter, 6), 23);
        d0VarFirstOrError.getClass();
        i iVar2 = new i(d0VarFirstOrError, iVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }

    public final i d() {
        i iVar = new i(c(this), new pjg.i(new a0(7), 22), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final i e(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        i iVar = new i(c(this), new pjg.i(new ou5.a(6, currency), 24), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
