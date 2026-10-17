package azd;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.feature.statements.impl.ui.annual_fee.screen.AnnualFeeScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ryd.w;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AnnualFeeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AnnualFeeScreen annualFeeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = annualFeeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AnnualFeeScreen annualFeeScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k) ((f) annualFeeScreen.L.getValue())).B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                final k kVar = (k) ((f) annualFeeScreen.L.getValue());
                d dVar = (d) ((j2) kVar.u.f22677a).getValue();
                StatementPeriod statementPeriod = dVar.f11442b;
                if (statementPeriod == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int year = statementPeriod.getStart().getYear();
                StatementPeriod statementPeriod2 = dVar.f11442b;
                if (statementPeriod2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int year2 = statementPeriod2.getEnd().getYear();
                if (year != year2) {
                    throw new IllegalArgumentException(a0.d.g(year, year2, "From date year should be equal to the To date year: ", " - ").toString());
                }
                zxd.c cVar = kVar.f11452q;
                AccountId accountId = kVar.o.f11443a;
                if (!(accountId instanceof AccountId.Joint)) {
                    accountId = null;
                }
                AccountId.Joint joint = (AccountId.Joint) accountId;
                String str = joint != null ? joint.f51413b : null;
                w wVar = (w) cVar;
                wVar.getClass();
                final int i2 = 0;
                final int i3 = 1;
                yji.l.a1(kVar, ue8.c.i0(byd.g.a(byd.g.c(rd0.e.b(wVar.n(2, new a94.e(wVar, year, str, 12))), kVar.X(), kVar.f11454s.d(), new Function1() { // from class: azd.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i2) {
                            case 0:
                                Throwable error = (Throwable) obj3;
                                Intrinsics.checkNotNullParameter(error, "error");
                                k kVar2 = kVar;
                                ServerError serverErrorA = kVar2.f11455t.a(error);
                                if (serverErrorA == null || serverErrorA.f51362a != 9401) {
                                    return kVar2.f11454s.c(error);
                                }
                                return null;
                            default:
                                vyd.a aVar3 = kVar.f11454s;
                                StatementUrlState content = (StatementUrlState) obj3;
                                Intrinsics.checkNotNullParameter(content, "content");
                                if (content instanceof StatementUrlState.InPreparation) {
                                    return aVar3.b(((StatementUrlState.InPreparation) content).getEmail());
                                }
                                if (content instanceof StatementUrlState.Ready) {
                                    return aVar3.a();
                                }
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                }, new Function1() { // from class: azd.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i3) {
                            case 0:
                                Throwable error = (Throwable) obj3;
                                Intrinsics.checkNotNullParameter(error, "error");
                                k kVar2 = kVar;
                                ServerError serverErrorA = kVar2.f11455t.a(error);
                                if (serverErrorA == null || serverErrorA.f51362a != 9401) {
                                    return kVar2.f11454s.c(error);
                                }
                                return null;
                            default:
                                vyd.a aVar3 = kVar.f11454s;
                                StatementUrlState content = (StatementUrlState) obj3;
                                Intrinsics.checkNotNullParameter(content, "content");
                                if (content instanceof StatementUrlState.InPreparation) {
                                    return aVar3.b(((StatementUrlState.InPreparation) content).getEmail());
                                }
                                if (content instanceof StatementUrlState.Ready) {
                                    return aVar3.a();
                                }
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                })), kVar), null, null, new j(kVar, null, 2), 3);
                return Unit.f186387a;
        }
    }
}
