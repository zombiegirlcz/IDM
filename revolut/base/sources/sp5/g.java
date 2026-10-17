package sp5;

import com.revolut.feature.crypto.withdraw.api.CryptoWithdrawApi$Toggles;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawOrder;
import com.revolut.feature.crypto.withdraw.impl.network.CryptoWithdrawService;
import dp5.j0;
import dp5.q1;
import efm.d0;
import hp5.l;
import hp5.o;
import ko5.m;
import ko5.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mp.p;
import pfm.t;
import rfm.f0;
import sdi.k;
import sl3.r;
import te0.w;
import up5.a0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f264889b;

    public /* synthetic */ g(j jVar, int i) {
        this.f264888a = i;
        this.f264889b = jVar;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        f0 f0VarF;
        String str;
        String str2;
        int i = this.f264888a;
        j jVar = this.f264889b;
        switch (i) {
            case 0:
                jVar.f264900n.a(xq5.c.SUBMITTING);
                return Unit.f186387a;
            case 1:
                qp5.d action = (qp5.d) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                ap5.b bVar = jVar.f264894c;
                if (!((jte.d) jVar.f264899m).c(CryptoWithdrawApi$Toggles.CryptoWithdrawFeesUsingToken.f71058c) || (str = action.k) == null || (str2 = action.f248277l) == null) {
                    String str3 = action.f248271a;
                    wk5.a aVar = action.f248272b;
                    dj0.d dVar = action.f248273c;
                    String str4 = dVar.f115083b.f306286a;
                    long j2 = dVar.f115082a;
                    String str5 = action.d;
                    Long l2 = action.e;
                    Long l3 = action.f;
                    Long l4 = action.f248274g;
                    long j3 = action.f248275h;
                    boolean z = action.i;
                    String str6 = action.f248276j;
                    String str7 = action.k;
                    n request = new n(str3, aVar, str4, j2, str5, j3, l3, l2, l4, z, str6, str7);
                    Intrinsics.checkNotNullParameter(request, "request");
                    p pVar = bVar.f8096c;
                    g4e.b bVar2 = g4e.c.Companion;
                    pfm.a aVarR = pVar.r(null);
                    o oVar = (o) bVar.f8094a;
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(request, "request");
                    CryptoWithdrawService cryptoWithdrawService = oVar.f154482a;
                    Intrinsics.checkNotNullParameter(request, "<this>");
                    d0<j0> d0VarExecuteWithdrawOrder = cryptoWithdrawService.executeWithdrawOrder(new q1(str3, u1.g(aVar, wk5.b.f298250a), str4, j2, str5, j3, l3, l2, l4, z, str6, str7));
                    l lVar = l.f;
                    h35.c cVar = new h35.c(4);
                    d0VarExecuteWithdrawOrder.getClass();
                    ufm.f fVar = new ufm.f(new ufm.i(d0VarExecuteWithdrawOrder, cVar, 1), new hp5.b(new hp5.a(oVar, 4), 6), 3);
                    Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                    f0VarF = aVarR.f(w.i0(fVar));
                    Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
                } else {
                    m request2 = new m(str2, str);
                    Intrinsics.checkNotNullParameter(request2, "request");
                    f0VarF = bVar.f8096c.r(new wj0.b("IDEMPOTENCY_TAG_CRYPTO_WITHDRAW_V2")).f(((o) bVar.f8094a).d(request2));
                    Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
                }
                rfm.l lVar2 = new rfm.l(new ufm.f(f0VarF, new r(new g(jVar, 0), 28), 2), new oma.r(jVar, 27), 5);
                Intrinsics.checkNotNullExpressionValue(lVar2, "doFinally(...)");
                pfm.a aVar2 = new pfm.a(new rfm.l(new ufm.f(lVar2, new r(new k(jVar, action, 14), 29), 2), new rzc.b(jVar, action, 13), 7).g(sjg.a.a(jVar.f264898l)), new h(0, new g(jVar, 2)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return aVar2;
            default:
                CryptoWithdrawOrder cryptoWithdrawOrder = (CryptoWithdrawOrder) obj2;
                Intrinsics.checkNotNullParameter(cryptoWithdrawOrder, "cryptoWithdrawOrder");
                qp5.b bVar3 = new qp5.b((dj0.d) cryptoWithdrawOrder.f71098c.getValue(), cryptoWithdrawOrder.f71096a.f71101a);
                up5.b bVar4 = jVar.e;
                String transactionId = cryptoWithdrawOrder.f71096a.f71101a;
                a0 a0Var = (a0) bVar4;
                a0Var.getClass();
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                up5.e eVar = (up5.e) a0Var.f281852b;
                te0.e value = eVar.o.getValue(eVar, up5.e.v[13]);
                od0.i.Companion.getClass();
                t tVarZ0 = w.z0(value, od0.h.a(transactionId));
                j61.b bVar5 = jVar.d;
                return efm.b.j(tVarZ0, j61.b.c(bVar5), j61.b.b(bVar5), jVar.f264895g.c0(bVar3));
        }
    }
}
