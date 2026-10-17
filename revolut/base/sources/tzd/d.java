package tzd;

import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.feature.statements.impl.ui.crypto_statement.screen.CryptoStatementScreen;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q97.g3;
import ryd.w;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CryptoStatementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CryptoStatementScreen cryptoStatementScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cryptoStatementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        efm.r rVarN;
        int i = this.u;
        CryptoStatementScreen cryptoStatementScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((t) ((f) cryptoStatementScreen.O.getValue())).B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                final t tVar = (t) ((f) cryptoStatementScreen.O.getValue());
                zxd.c cVar = tVar.f275941q;
                g gVar = (g) ((j2) tVar.u.f22677a).getValue();
                int i2 = q.f275936a[tVar.f275944t.f275925a.ordinal()];
                final int i3 = 1;
                if (i2 == 1) {
                    StatementPeriod statementPeriod = gVar.f275927b;
                    if (statementPeriod == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    LocalDate fromDate = statementPeriod.getStart();
                    StatementPeriod statementPeriod2 = gVar.f275927b;
                    if (statementPeriod2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    LocalDate toDate = statementPeriod2.getEnd();
                    StatementsFormat format = gVar.f275928c.b();
                    w wVar = (w) cVar;
                    wVar.getClass();
                    Intrinsics.checkNotNullParameter(fromDate, "fromDate");
                    Intrinsics.checkNotNullParameter(toDate, "toDate");
                    Intrinsics.checkNotNullParameter(format, "format");
                    rVarN = wVar.n(2, new ryd.h(wVar, fromDate, toDate, format, 0));
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    StatementPeriod statementPeriod3 = gVar.f275927b;
                    if (statementPeriod3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    LocalDate fromDate2 = statementPeriod3.getStart();
                    StatementPeriod statementPeriod4 = gVar.f275927b;
                    if (statementPeriod4 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    LocalDate toDate2 = statementPeriod4.getEnd();
                    StatementsFormat format2 = gVar.f275928c.b();
                    w wVar2 = (w) cVar;
                    wVar2.getClass();
                    Intrinsics.checkNotNullParameter(fromDate2, "fromDate");
                    Intrinsics.checkNotNullParameter(toDate2, "toDate");
                    Intrinsics.checkNotNullParameter(format2, "format");
                    rVarN = wVar2.n(2, new ryd.h(wVar2, fromDate2, toDate2, format2, 1));
                }
                final int i5 = 0;
                yji.l.b1(tVar, new g3(mo3.a.g(byd.g.c(rd0.e.b(o70.a.f(pd.b.t(rVarN, new twg.a(gVar, tVar, 12)))), tVar.X(), tVar.f275942r.d(), new Function1() { // from class: tzd.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i5) {
                            case 0:
                                Throwable it8 = (Throwable) obj3;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return tVar.f275942r.c(it8);
                            default:
                                vyd.a aVar3 = tVar.f275942r;
                                p pVar = (p) obj3;
                                if (pVar instanceof l) {
                                    return aVar3.b(((l) pVar).f275933a);
                                }
                                if (pVar instanceof o) {
                                    return aVar3.a();
                                }
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                }, new Function1() { // from class: tzd.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i3) {
                            case 0:
                                Throwable it8 = (Throwable) obj3;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return tVar.f275942r.c(it8);
                            default:
                                vyd.a aVar3 = tVar.f275942r;
                                p pVar = (p) obj3;
                                if (pVar instanceof l) {
                                    return aVar3.b(((l) pVar).f275933a);
                                }
                                if (pVar instanceof o) {
                                    return aVar3.a();
                                }
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                }), null, new tw8.g(13), 1), 23), null, new r(tVar, null, 2), 3);
                return Unit.f186387a;
        }
    }
}
