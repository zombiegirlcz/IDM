package ev4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.statement.CreditCardStatementScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import cp4.m0;
import dp4.c1;
import eu4.b0;
import ip0.kx;
import ip0.mx;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ll4.c0;
import om4.x2;
import om4.y3;
import rp0.y;
import zh9.u0;
import zhm.d0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CreditCardStatementScreenContract$InputData f129726p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f129727q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final al4.n f129728r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final al4.q f129729s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sv4.a f129730t;
    public final an4.e u;
    public final hk0.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ang.f f129731w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g f129732x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(CreditCardStatementScreenContract$InputData inputData, j60.a bottomDialogExtension, al4.n creditCardInteractor, al4.q creditCardProductInteractor, sv4.a dialogFactory, an4.e navigationFactory, hk0.a networkFileRepository, ang.f userInteractor, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(navigationFactory, "navigationFactory");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f129726p = inputData;
        this.f129727q = bottomDialogExtension;
        this.f129728r = creditCardInteractor;
        this.f129729s = creditCardProductInteractor;
        this.f129730t = dialogFactory;
        this.u = navigationFactory;
        this.v = networkFileRepository;
        this.f129731w = userInteractor;
        this.f129732x = new g(cl4.p.PRINTABLE, new Data(null, null, true, 3, null));
    }

    public static final Object y2(q qVar, gim.i iVar) {
        al4.n nVar = qVar.f129728r;
        String facilityId = qVar.f129726p.f69656a;
        String cycleId = qVar.B2().e;
        x2 x2Var = (x2) nVar;
        x2Var.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(cycleId, "cycleId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        c1 c1Var = x2Var.f226745a;
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(cycleId, "cycleId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.x(mo3.a.g(c1Var.o.b(new m0(facilityId, cycleId), loadingStrategy), null, new b0(16), 1), iVar);
    }

    public final f A2() {
        return (f) zi0.c.I(((g) t2()).f129710b);
    }

    public final c0 B2() {
        f fVar = (f) ((g) t2()).f129710b.getContent();
        c0 c0Var = fVar != null ? fVar.f129708c : null;
        if (c0Var != null) {
            return c0Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        final int i = 1;
        final int i2 = 0;
        yji.l.a1(this, rd0.e.n(nim.a.v(u0.i(nim.a.v(vkm.q.Q(new dr2.l(vkm.q.r(new b0(17), q2()), 1), new dz6.n(continuation, this, 20)), new eul.d(14)), nim.a.v(((y3) this.f129729s).e(w4l.h.f294642c, true), new Function1(this) { // from class: ev4.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f129721b;

            {
                this.f129721b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object obj3;
                switch (i) {
                    case 0:
                        yhm.r rVar = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        List list = (List) rVar.f314201a;
                        xi0.b bVar = (xi0.b) rVar.f314202b;
                        do3.n nVar = (do3.n) rVar.f314203c;
                        q qVar = this.f129721b;
                        String str = qVar.f129726p.f69656a;
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                Object next = it8.next();
                                LocalDate localDate = ((c0) next).f196508a;
                                f fVar = (f) ((g) qVar.t2()).f129710b.getContent();
                                c0 c0Var = fVar != null ? fVar.f129708c : null;
                                if (Intrinsics.f(localDate, c0Var != null ? c0Var.f196508a : null)) {
                                    obj3 = next;
                                }
                            }
                        }
                        c0 c0Var2 = (c0) obj3;
                        if (c0Var2 == null) {
                            c0Var2 = (c0) d0.o0(list);
                        }
                        return new f(str, bVar, c0Var2, list, do3.q.y(nVar));
                    default:
                        List<yw4.p> it9 = (List) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        for (yw4.p pVar : it9) {
                            if (Intrinsics.f(pVar.f317325a, this.f129721b.f129726p.f69656a)) {
                                return pVar.d;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
        }), this.f129731w.j(w4l.j.f294644c)), new Function1(this) { // from class: ev4.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f129721b;

            {
                this.f129721b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object obj3;
                switch (i2) {
                    case 0:
                        yhm.r rVar = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        List list = (List) rVar.f314201a;
                        xi0.b bVar = (xi0.b) rVar.f314202b;
                        do3.n nVar = (do3.n) rVar.f314203c;
                        q qVar = this.f129721b;
                        String str = qVar.f129726p.f69656a;
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                Object next = it8.next();
                                LocalDate localDate = ((c0) next).f196508a;
                                f fVar = (f) ((g) qVar.t2()).f129710b.getContent();
                                c0 c0Var = fVar != null ? fVar.f129708c : null;
                                if (Intrinsics.f(localDate, c0Var != null ? c0Var.f196508a : null)) {
                                    obj3 = next;
                                }
                            }
                        }
                        c0 c0Var2 = (c0) obj3;
                        if (c0Var2 == null) {
                            c0Var2 = (c0) d0.o0(list);
                        }
                        return new f(str, bVar, c0Var2, list, do3.q.y(nVar));
                    default:
                        List<yw4.p> it9 = (List) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        for (yw4.p pVar : it9) {
                            if (Intrinsics.f(pVar.f317325a, this.f129721b.f129726p.f69656a)) {
                                return pVar.d;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
        }), h0.f322473a), null, null, new enb.f(this, continuation, 25), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f129732x;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void z2(yx4.b item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f317544a;
        Continuation continuation = null;
        switch (str.hashCode()) {
            case -384172452:
                if (str.equals("id_cell_action_statement_balance")) {
                    n2(new o(this, continuation, 3), new whi.b(6));
                    return;
                }
                break;
            case 961405721:
                if (str.equals("id_action_next_button")) {
                    int i = m.f129722a[((g) t2()).f129709a.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        n2(new o(this, continuation, 1), new whi.b(6));
                        return;
                    }
                    String url2 = ((x2) this.f129728r).q(A2().f129706a, B2().f196509b);
                    TextLocalisedClause title = new TextLocalisedClause(R$string.credit_statement_screen_title, null, null, 14);
                    an4.e eVar = this.u;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(url2, "url");
                    Intrinsics.checkNotNullParameter(title, "title");
                    C1(new BridgeDestination(eVar.f6557a.c(title, url2)));
                    return;
                }
                break;
            case 1289041444:
                if (str.equals("id_tab_pdf")) {
                    x2(new eul.d(12));
                    return;
                }
                break;
            case 1472048858:
                if (str.equals("id_cell_action_interest")) {
                    n2(new o(this, continuation, 2), new whi.b(6));
                    return;
                }
                break;
            case 1808683881:
                if (str.equals("id_tab_excel")) {
                    x2(new eul.d(13));
                    return;
                }
                break;
            case 1918729248:
                if (str.equals("ERROR_STATE_ID")) {
                    n2(new o(this, continuation, 0), new whi.b(6));
                    return;
                }
                break;
        }
        Object obj2 = item.f317545b;
        boolean z = obj2 instanceof s;
        j60.a aVar = this.f129727q;
        if (!z) {
            if (obj2 instanceof kx) {
                YearMonth yearMonth = ((kx) obj2).f165093b;
                for (c0 c0Var : A2().d) {
                    if (Intrinsics.f(pyd.c.h0(c0Var.f196508a), yearMonth)) {
                        x2(new eu7.c(c0Var, 2));
                        j60.a.v(aVar, false, null, 3);
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            return;
        }
        s sVar = (s) obj2;
        YearMonth firstMonth = sVar.f129733a;
        YearMonth lastMonth = sVar.f129734b;
        YearMonth selectedMonth = sVar.f129735c;
        this.f129730t.getClass();
        Intrinsics.checkNotNullParameter(firstMonth, "firstMonth");
        Intrinsics.checkNotNullParameter(lastMonth, "lastMonth");
        Intrinsics.checkNotNullParameter(selectedMonth, "selectedMonth");
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.credit_statement_choose_month, null, null, 14), null, null, 30);
        mx mxVar = new mx("id_month_picker", selectedMonth.getYear(), selectedMonth, firstMonth, lastMonth);
        yp0.b.l(mxVar, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
        aVar.x(new y(u.c(mxVar), tVar, rp0.l.WINDOW, null, null, null, 1016));
    }
}
