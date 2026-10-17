package ryd;

import com.revolut.core.model.account.AccountId;
import com.revolut.domain.models.statement.StatementTemplateId;
import com.revolut.feature.statements.api.models.CustomisationParameters;
import com.revolut.feature.statements.api.models.CustomisationSelection;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.feature.statements.api.models.StatementProductType;
import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.feature.statements.api.models.TaxPeriod;
import g48.r0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import le.u1;
import org.jetbrains.annotations.NotNull;
import rfm.f0;
import uyd.l0;
import uyd.m0;
import vkm.y;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements zxd.c {

    @NotNull
    public static final n Companion = new n();
    public static final TaxPeriod i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uyd.v f258357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final syd.b f258358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c31.e f258359c;
    public final ang.f d;
    public final xoj.a e;
    public final wsg.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r0 f258360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wsg.b f258361h;

    static {
        LocalDate localDate = LocalDate.parse("0000-01-01");
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        LocalDate localDate2 = LocalDate.parse("0000-12-31");
        Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
        i = new TaxPeriod(localDate, localDate2);
    }

    public w(uyd.v statementsRepository, syd.b statementsDataMapper, c31.e statementTemplatesRepository, ang.f userInteractor, xoj.a featuresInteractor, wsg.n walletInteractor, r0 jointAccountInteractor, wsg.b newWalletsInteractor) {
        Intrinsics.checkNotNullParameter(statementsRepository, "statementsRepository");
        Intrinsics.checkNotNullParameter(statementsDataMapper, "statementsDataMapper");
        Intrinsics.checkNotNullParameter(statementTemplatesRepository, "statementTemplatesRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(jointAccountInteractor, "jointAccountInteractor");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        this.f258357a = statementsRepository;
        this.f258358b = statementsDataMapper;
        this.f258359c = statementTemplatesRepository;
        this.d = userInteractor;
        this.e = featuresInteractor;
        this.f = walletInteractor;
        this.f258360g = jointAccountInteractor;
        this.f258361h = newWalletsInteractor;
    }

    public static y m(w wVar, vkm.d dVar) {
        wVar.getClass();
        return rd0.e.e(new y(new qna.n(dVar, wVar, 27), new u(4, 0, null)), h0.f322473a, new r3k.c(wVar, null));
    }

    public final efm.r c(efm.r rVar) {
        return pd.b.s(rVar, new d(this, 1));
    }

    public final ufm.i d() {
        yoj.c cVar = yoj.c.CRYPTO;
        yoj.d dVar = yoj.d.DISABLED;
        cpj.b bVar = (cpj.b) this.e;
        ufm.i iVar = new ufm.i(te0.w.J0(bVar.f(cVar, dVar), bVar.f(yoj.c.VAULTS_SAVINGS, dVar), bVar.f(yoj.c.COMMODITIES, dVar), bVar.f(yoj.c.WEALTH_TRADING, dVar)), new j(new k(0), 1), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final ufm.i e(StatementTemplateId id10) {
        Intrinsics.checkNotNullParameter(id10, "templateId");
        c31.e eVar = this.f258359c;
        Intrinsics.checkNotNullParameter(id10, "id");
        rfm.o oVar = new rfm.o(new c31.c(eVar, id10, 0));
        Intrinsics.checkNotNullExpressionValue(oVar, "fromCallable(...)");
        rfm.m mVar = new rfm.m(te0.w.h0(oVar), new rxb.f(24, new rxb.b(24)), 1);
        m70.a.c(t0.f186434a);
        f0 f0VarO = mVar.e("").o();
        Intrinsics.checkNotNullExpressionValue(f0VarO, "toSingle(...)");
        ufm.i iVar = new ufm.i(f0VarO, new j(new e(this, id10, 1), 2), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        ufm.i iVar2 = new ufm.i(iVar, new rxb.f(25, new d(this, 0)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }

    public final efm.r f(StatementProductType statementProductType, io3.l lVar, AccountId accountId) {
        io3.i iVar = io3.i.INTERNAL;
        io3.k[] elements = {io3.k.ACTIVE, io3.k.INACTIVE, io3.k.DELISTED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return nim.a.w(this.f.S(w4l.h.f294642c, kotlin.collections.d.y0(elements), lVar, iVar, accountId), new i(statementProductType, this));
    }

    public final efm.r g(String str, Set productTypes) {
        Intrinsics.checkNotNullParameter(productTypes, "productTypes");
        Intrinsics.checkNotNullParameter(productTypes, "productTypes");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = productTypes.iterator();
        while (it8.hasNext()) {
            String strH = u1.h((StatementProductType) it8.next(), (Map) this.f258358b.f266662a.getValue());
            if (strH != null) {
                arrayList.add(strH);
            }
        }
        Set productTypes2 = d0.i1(d0.O0(arrayList));
        uyd.h0 h0Var = (uyd.h0) this.f258357a;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(productTypes2, "productTypes");
        return pd.b.r(h0Var.f284203x.e(new uyd.u(str, productTypes2), w4l.i.f294643c), new qz9.o(productTypes, 29, this, str));
    }

    public final efm.r h(String groupId, String pocketId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        uyd.h0 h0Var = (uyd.h0) this.f258357a;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        return c(l(h0Var.A.e(new uyd.o(groupId, pocketId), w4l.i.f294643c), 2));
    }

    public final efm.r i(CustomisationParameters customisationParameters, CustomisationSelection customisationSelection, LocalDate fromDate, LocalDate toDate, StatementPeriodType statementPeriodType, StatementsFormat format) {
        Intrinsics.checkNotNullParameter(fromDate, "fromDate");
        Intrinsics.checkNotNullParameter(toDate, "toDate");
        Intrinsics.checkNotNullParameter(statementPeriodType, "statementPeriodType");
        Intrinsics.checkNotNullParameter(format, "format");
        return n(2, new krl.m(this, customisationParameters, customisationSelection, fromDate, toDate, statementPeriodType, format, 9));
    }

    public final efm.r j(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        uyd.h0 h0Var = (uyd.h0) this.f258357a;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        return c(l(h0Var.f284199r.f(new l0(groupId), true), 2));
    }

    public final efm.r k(String groupId, String pocketId, String str) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        uyd.h0 h0Var = (uyd.h0) this.f258357a;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        return c(l(h0Var.o.f(new m0(groupId, pocketId, str), true), 2));
    }

    public final efm.r l(efm.r rVar, int i2) {
        efm.r map = rVar.map(new j(new rxb.b(this, 27), 0));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Intrinsics.checkNotNullParameter(map, "<this>");
        efm.r rVarRetryWhen = map.retryWhen(new vf0.m(i2, 16));
        Intrinsics.checkNotNullExpressionValue(rVarRetryWhen, "retryWhen(...)");
        return ue0.e.H(rVarRetryWhen, h0.f322473a, new k(this, 1));
    }

    public final efm.r n(int i2, Function1 function1) {
        efm.r rVarSwitchMap = l((efm.r) function1.invoke(Boolean.FALSE), i2).switchMap(new rxb.f(28, new js7.c(23, function1)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return c(rVarSwitchMap);
    }
}
