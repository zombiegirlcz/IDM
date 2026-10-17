package p0e;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.feature.statements.impl.ui.statement_of_fees.screen.StatementOfFeesScreen;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ryd.w;
import uyd.h0;
import uyd.t;
import vkm.j2;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ StatementOfFeesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(StatementOfFeesScreen statementOfFeesScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = statementOfFeesScreen;
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
        StatementOfFeesScreen statementOfFeesScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) ((f) statementOfFeesScreen.L.getValue())).B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                final j jVar = (j) ((f) statementOfFeesScreen.L.getValue());
                d dVar = (d) ((j2) jVar.u.f22677a).getValue();
                zxd.c cVar = jVar.f231523q;
                StatementPeriod statementPeriod = dVar.f231513b;
                if (statementPeriod == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                LocalDate fromDate = statementPeriod.getStart();
                StatementPeriod statementPeriod2 = dVar.f231513b;
                if (statementPeriod2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                LocalDate toDate = statementPeriod2.getEnd();
                String str = jVar.o.f231514a;
                w wVar = (w) cVar;
                wVar.getClass();
                Intrinsics.checkNotNullParameter(fromDate, "fromDate");
                Intrinsics.checkNotNullParameter(toDate, "toDate");
                h0 h0Var = (h0) wVar.f258357a;
                h0Var.getClass();
                Intrinsics.checkNotNullParameter(fromDate, "fromDate");
                Intrinsics.checkNotNullParameter(toDate, "toDate");
                w4l.f fVar = h0Var.f;
                if (str == null) {
                    str = null;
                }
                final int i2 = 0;
                final int i3 = 1;
                l.a1(jVar, ue8.c.i0(byd.g.a(byd.g.c(rd0.e.b(wVar.l(fVar.e(new t(str, fromDate, toDate), w4l.i.f294643c), 2)), jVar.X(), jVar.f231525s.d(), new Function1() { // from class: p0e.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i2) {
                            case 0:
                                Throwable error = (Throwable) obj3;
                                Intrinsics.checkNotNullParameter(error, "error");
                                j jVar2 = jVar;
                                ServerError serverErrorA = jVar2.f231526t.a(error);
                                if (serverErrorA == null || serverErrorA.f51362a != 9401) {
                                    return jVar2.f231525s.c(error);
                                }
                                return null;
                            default:
                                vyd.a aVar3 = jVar.f231525s;
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
                }, new Function1() { // from class: p0e.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i3) {
                            case 0:
                                Throwable error = (Throwable) obj3;
                                Intrinsics.checkNotNullParameter(error, "error");
                                j jVar2 = jVar;
                                ServerError serverErrorA = jVar2.f231526t.a(error);
                                if (serverErrorA == null || serverErrorA.f51362a != 9401) {
                                    return jVar2.f231525s.c(error);
                                }
                                return null;
                            default:
                                vyd.a aVar3 = jVar.f231525s;
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
                })), jVar), null, null, new i(jVar, null, 2), 3);
                return Unit.f186387a;
        }
    }
}
