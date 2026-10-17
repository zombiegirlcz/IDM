package e9h;

import com.revolut.core.model.account.AccountId;
import do2.o;
import e8e.y;
import efm.r;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import te0.w;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f123990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0h.a f123991c;

    public /* synthetic */ a(d dVar, h0h.a aVar, int i) {
        this.f123989a = i;
        this.f123990b = dVar;
        this.f123991c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List currencyPairs = (List) obj2;
        switch (this.f123989a) {
            case 0:
                Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
                d dVar = this.f123990b;
                dVar.getClass();
                return kli.a.h(currencyPairs.isEmpty() ? zi0.c.j(f0.f322471a) : nim.a.w(dVar.f123998b.e(currencyPairs, n9l.b.SEC_3), new y(12)), dVar.b(currencyPairs, this.f123991c));
            default:
                Intrinsics.checkNotNullParameter(currencyPairs, "availableCurrencies");
                d dVar2 = this.f123990b;
                r rVarB = xv5.c.b(dVar2.e);
                r rVarC = e.c(dVar2.f.a(), g.f186406a);
                r rVarX = dVar2.d.x(AccountId.Personal.f51414a).x();
                Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                return w.m(rVarB, rVarC, rVarX).map(new e8h.c(10, new o(currencyPairs, 10))).switchMap(new e8h.c(11, new a(dVar2, this.f123991c, 0)));
        }
    }
}
