package lv4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.statement.details.page.CreditCardStatementPageScreenContract$InputData;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import om4.f4;
import om4.x2;
import om4.y3;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.t0;
import yhm.m;
import zh9.u0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class b0 extends oki.h implements o {

    @NotNull
    public static final u Companion = new u();
    public final CreditCardStatementPageScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final al4.n f200285p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ang.f f200286q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f15.a f200287r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lal.a f200288s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ssi.m f200289t;
    public final al4.q u;
    public final f4 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final cli.y f200290w;

    public b0(CreditCardStatementPageScreenContract$InputData inputData, al4.n creditCardInteractor, ang.f userInteractor, f15.a getCreditHelpExtension, lal.a creditCardStatementsInteractor, ssi.m transactionsWidgetActionExtension, al4.q creditCardProductInteractor, f4 creditCardStatementUpcomingPaymentsInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(getCreditHelpExtension, "getCreditHelpExtension");
        Intrinsics.checkNotNullParameter(creditCardStatementsInteractor, "creditCardStatementsInteractor");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtension, "transactionsWidgetActionExtension");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(creditCardStatementUpcomingPaymentsInteractor, "creditCardStatementUpcomingPaymentsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f200285p = creditCardInteractor;
        this.f200286q = userInteractor;
        this.f200287r = getCreditHelpExtension;
        this.f200288s = creditCardStatementsInteractor;
        this.f200289t = transactionsWidgetActionExtension;
        this.u = creditCardProductInteractor;
        this.v = creditCardStatementUpcomingPaymentsInteractor;
        this.f200290w = mra.d.b(this, new g(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), f0.f322471a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        CreditCardStatementPageScreenContract$InputData creditCardStatementPageScreenContract$InputData = this.o;
        String str = creditCardStatementPageScreenContract$InputData.f69691a;
        x2 x2Var = (x2) this.f200285p;
        w4l.j jVar = w4l.j.f294644c;
        int i = 3;
        Continuation continuation = null;
        final int i2 = 0;
        akg.n nVarV = nim.a.v(boh.f.e(vkm.q.R(x2Var.s(str, jVar), new hr4.b(i, 8, continuation)), new Function1(this) { // from class: lv4.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f200312b;

            {
                this.f200312b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Continuation continuation2;
                Object next;
                switch (i2) {
                    case 0:
                        List statements = (List) obj2;
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        b0 b0Var = this.f200312b;
                        CreditCardStatementPageScreenContract$InputData creditCardStatementPageScreenContract$InputData2 = b0Var.o;
                        Iterator it8 = statements.iterator();
                        while (true) {
                            continuation2 = null;
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((vl4.i) next).f290264b, creditCardStatementPageScreenContract$InputData2.f69692b)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        vl4.i iVar = (vl4.i) next;
                        boolean z = (iVar != null ? iVar.f : null) == vl4.c.PAST;
                        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                        ref$BooleanRef.f186407a = true;
                        al4.n nVar = b0Var.f200285p;
                        String str2 = creditCardStatementPageScreenContract$InputData2.f69691a;
                        LocalDate localDate = creditCardStatementPageScreenContract$InputData2.f69692b;
                        w4l.j jVar2 = w4l.j.f294644c;
                        return u0.m(nim.a.u(new ack.o(14, ref$BooleanRef, b0Var, continuation2, z), ((x2) nVar).r(str2, localDate, z ? jVar2 : w4l.i.f294643c)), nim.a.v(b0Var.f200286q.j(jVar2), y.f));
                    default:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        vl4.g statement = (vl4.g) pair.f186385a;
                        yw4.p pVar = (yw4.p) pair.f186386b;
                        f4 f4Var = this.f200312b.v;
                        String facilityId = pVar.f317325a;
                        String pocketId = pVar.f317326b;
                        xi0.b currency = pVar.d;
                        f4Var.getClass();
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        Intrinsics.checkNotNullParameter(statement, "statement");
                        return rd0.e.b(((mce.d) f4Var.d).b(new nce.b(f4.a(facilityId, pocketId, statement), currency.f306286a), new ProductAccountDescriptor$Value.Main(com.revolut.feature.credit.models.a.b(facilityId), ProductId.CREDIT), RecurringPaymentAccount.Personal.f89320a));
                }
            }
        }), new lsl.b(24));
        h0 h0Var = h0.f322473a;
        yji.l.a1(this, vkm.q.q(rd0.e.n(nVarV, h0Var)), null, null, new z(this, null, 0), 3);
        lsl.b bVar = new lsl.b(25);
        cli.y yVar = this.f200290w;
        yji.l.a1(this, rd0.e.n(vkm.q.Q(vkm.q.r(new lnk.o(16), new t0(yVar.B(bVar), 1)), new li2.f(continuation, this, 13)), h0Var), null, null, new z(this, null, 1), 3);
        final int i3 = 1;
        yji.l.a1(this, rd0.e.n(c6d.b.i(u0.m(new dr2.l(vkm.q.r(new lnk.o(17), new t0(yVar.B(new lsl.b(26)), 1)), 3), vkm.q.R(((y3) this.u).f(creditCardStatementPageScreenContract$InputData.f69691a, jVar), new hr4.b(i, 7, continuation))), new Function1(this) { // from class: lv4.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f200312b;

            {
                this.f200312b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Continuation continuation2;
                Object next;
                switch (i3) {
                    case 0:
                        List statements = (List) obj2;
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        b0 b0Var = this.f200312b;
                        CreditCardStatementPageScreenContract$InputData creditCardStatementPageScreenContract$InputData2 = b0Var.o;
                        Iterator it8 = statements.iterator();
                        while (true) {
                            continuation2 = null;
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((vl4.i) next).f290264b, creditCardStatementPageScreenContract$InputData2.f69692b)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        vl4.i iVar = (vl4.i) next;
                        boolean z = (iVar != null ? iVar.f : null) == vl4.c.PAST;
                        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                        ref$BooleanRef.f186407a = true;
                        al4.n nVar = b0Var.f200285p;
                        String str2 = creditCardStatementPageScreenContract$InputData2.f69691a;
                        LocalDate localDate = creditCardStatementPageScreenContract$InputData2.f69692b;
                        w4l.j jVar2 = w4l.j.f294644c;
                        return u0.m(nim.a.u(new ack.o(14, ref$BooleanRef, b0Var, continuation2, z), ((x2) nVar).r(str2, localDate, z ? jVar2 : w4l.i.f294643c)), nim.a.v(b0Var.f200286q.j(jVar2), y.f));
                    default:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        vl4.g statement = (vl4.g) pair.f186385a;
                        yw4.p pVar = (yw4.p) pair.f186386b;
                        f4 f4Var = this.f200312b.v;
                        String facilityId = pVar.f317325a;
                        String pocketId = pVar.f317326b;
                        xi0.b currency = pVar.d;
                        f4Var.getClass();
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        Intrinsics.checkNotNullParameter(statement, "statement");
                        return rd0.e.b(((mce.d) f4Var.d).b(new nce.b(f4.a(facilityId, pocketId, statement), currency.f306286a), new ProductAccountDescriptor$Value.Main(com.revolut.feature.credit.models.a.b(facilityId), ProductId.CREDIT), RecurringPaymentAccount.Personal.f89320a));
                }
            }
        }), h0Var), null, null, new x(this, null), 3);
    }

    public final f I2() {
        return (f) zi0.c.I(((g) ((j2) this.f200290w.f22677a).getValue()).f200297a);
    }

    public final void J2(List list) throws Throwable {
        Object objA;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            C2(new h(list, I2().f200296b));
            objA = Unit.f186387a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f200290w;
    }
}
