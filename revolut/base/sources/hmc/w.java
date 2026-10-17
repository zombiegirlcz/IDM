package hmc;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.q0;
import xzg.o0;
import zh9.u0;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class w implements dlc.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qmc.b f153666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final emc.e f153667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zjh.f f153668c;
    public final tzg.m d;
    public final a0e.w e;

    public w(qmc.b roboContextProvider, emc.e templatesInteractor, zjh.f portfolioInteractor, tzg.m wealthAccountsInteractor, a0e.w templateChangeStateProvider) {
        Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(templateChangeStateProvider, "templateChangeStateProvider");
        this.f153666a = roboContextProvider;
        this.f153667b = templatesInteractor;
        this.f153668c = portfolioInteractor;
        this.d = wealthAccountsInteractor;
        this.e = templateChangeStateProvider;
    }

    public final q0 a() {
        q0 q0VarA = this.f153666a.a();
        WealthAccountType wealthAccountType = WealthAccountType.ROBO;
        tzg.m mVar = this.d;
        final int i = 1;
        akg.n nVarI = u0.i(q0VarA, xam.a.h(new v(this, null), nim.a.v(tzg.m.a(mVar, wealthAccountType), new Function1(this) { // from class: hmc.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f153665b;

            {
                this.f153665b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                b0 b0Var;
                ArrayList arrayList;
                a0 zVar;
                a0 yVar;
                switch (i) {
                    case 0:
                        yhm.r rVar = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        ilc.a aVar = (ilc.a) rVar.f314201a;
                        Map map = (Map) rVar.f314202b;
                        WealthAccount wealthAccount = (WealthAccount) rVar.f314203c;
                        if (zhm.v.k(o0.ONBOARDING, o0.SUSPENDED, o0.ACTIVE).contains(wealthAccount.getF95255c())) {
                            Set<Map.Entry> setEntrySet = map.entrySet();
                            arrayList = new ArrayList(zhm.w.t(setEntrySet, 10));
                            for (Map.Entry entry : setEntrySet) {
                                alc.n portfolio = (alc.n) entry.getKey();
                                List templates = (List) entry.getValue();
                                String str = portfolio.f6207a;
                                List<Template> list = templates;
                                for (Template template : list) {
                                    if (Intrinsics.f(template.f95706a, portfolio.e)) {
                                        for (Template template2 : list) {
                                            if (Intrinsics.f(template2.f95706a, portfolio.f)) {
                                                a0e.w wVar = this.f153665b.e;
                                                o0 accountState = wealthAccount.getF95255c();
                                                Intrinsics.checkNotNullParameter(accountState, "accountState");
                                                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                                                Intrinsics.checkNotNullParameter(templates, "templates");
                                                String str2 = portfolio.f6211h;
                                                LocalDate localDate = portfolio.f6210g;
                                                if (str2 != null) {
                                                    for (Template template3 : list) {
                                                        if (Intrinsics.f(template3.f95706a, str2)) {
                                                        }
                                                    }
                                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                                }
                                                template3 = null;
                                                if (template3 != null) {
                                                    yVar = new y(template3);
                                                } else {
                                                    if (accountState != o0.ACTIVE) {
                                                        zVar = new z(null);
                                                    } else {
                                                        LocalDate localDateE = ((l80.f) wVar.f375a).e();
                                                        zVar = (localDate.isBefore(localDateE) || localDate.equals(localDateE)) ? x.f153669a : new z(localDate);
                                                    }
                                                    yVar = zVar;
                                                }
                                                arrayList.add(new b0(str, template, template2, yVar, wealthAccount.getF95255c() == o0.ACTIVE));
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            b0Var = null;
                        } else {
                            b0Var = null;
                            arrayList = null;
                        }
                        return new c0(aVar, arrayList != null ? (b0) d0.d0(arrayList) : b0Var);
                    default:
                        WealthAccount it8 = (WealthAccount) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list2 = ((WealthAccount.Robo) it8).f95237c;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list2) {
                            this.f153665b.getClass();
                            if (zhm.v.k(com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE, com.revolut.shared.feature.wealth.models.trading_accounts.a.SUSPENDED).contains(((TradingAccount.Portfolio) obj3).f105211b)) {
                                arrayList2.add(obj3);
                            }
                        }
                        return arrayList2;
                }
            }
        })), tzg.m.a(mVar, wealthAccountType));
        final int i2 = 0;
        return rd0.e.n(nim.a.v(nVarI, new Function1(this) { // from class: hmc.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f153665b;

            {
                this.f153665b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                b0 b0Var;
                ArrayList arrayList;
                a0 zVar;
                a0 yVar;
                switch (i2) {
                    case 0:
                        yhm.r rVar = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        ilc.a aVar = (ilc.a) rVar.f314201a;
                        Map map = (Map) rVar.f314202b;
                        WealthAccount wealthAccount = (WealthAccount) rVar.f314203c;
                        if (zhm.v.k(o0.ONBOARDING, o0.SUSPENDED, o0.ACTIVE).contains(wealthAccount.getF95255c())) {
                            Set<Map.Entry> setEntrySet = map.entrySet();
                            arrayList = new ArrayList(zhm.w.t(setEntrySet, 10));
                            for (Map.Entry entry : setEntrySet) {
                                alc.n portfolio = (alc.n) entry.getKey();
                                List templates = (List) entry.getValue();
                                String str = portfolio.f6207a;
                                List<Template> list = templates;
                                for (Template template : list) {
                                    if (Intrinsics.f(template.f95706a, portfolio.e)) {
                                        for (Template template2 : list) {
                                            if (Intrinsics.f(template2.f95706a, portfolio.f)) {
                                                a0e.w wVar = this.f153665b.e;
                                                o0 accountState = wealthAccount.getF95255c();
                                                Intrinsics.checkNotNullParameter(accountState, "accountState");
                                                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                                                Intrinsics.checkNotNullParameter(templates, "templates");
                                                String str2 = portfolio.f6211h;
                                                LocalDate localDate = portfolio.f6210g;
                                                if (str2 != null) {
                                                    for (Template template3 : list) {
                                                        if (Intrinsics.f(template3.f95706a, str2)) {
                                                        }
                                                    }
                                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                                }
                                                template3 = null;
                                                if (template3 != null) {
                                                    yVar = new y(template3);
                                                } else {
                                                    if (accountState != o0.ACTIVE) {
                                                        zVar = new z(null);
                                                    } else {
                                                        LocalDate localDateE = ((l80.f) wVar.f375a).e();
                                                        zVar = (localDate.isBefore(localDateE) || localDate.equals(localDateE)) ? x.f153669a : new z(localDate);
                                                    }
                                                    yVar = zVar;
                                                }
                                                arrayList.add(new b0(str, template, template2, yVar, wealthAccount.getF95255c() == o0.ACTIVE));
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            b0Var = null;
                        } else {
                            b0Var = null;
                            arrayList = null;
                        }
                        return new c0(aVar, arrayList != null ? (b0) d0.d0(arrayList) : b0Var);
                    default:
                        WealthAccount it8 = (WealthAccount) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list2 = ((WealthAccount.Robo) it8).f95237c;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list2) {
                            this.f153665b.getClass();
                            if (zhm.v.k(com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE, com.revolut.shared.feature.wealth.models.trading_accounts.a.SUSPENDED).contains(((TradingAccount.Portfolio) obj3).f105211b)) {
                                arrayList2.add(obj3);
                            }
                        }
                        return arrayList2;
                }
            }
        }), h0.f322473a);
    }
}
