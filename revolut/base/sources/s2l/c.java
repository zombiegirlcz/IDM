package s2l;

import a2d.m;
import android.content.Context;
import com.revolut.feature.card_reader.tips.impl.data.network.CardReaderTipsService;
import com.revolut.feature.junior_graduation.impl.service.JuniorGraduationDebugService;
import com.revolut.feature.trading.impl.data.database.TradingDatabase;
import com.revolut.retail.feature_widgets.impl.network.WidgetService;
import e4m.e;
import ecm.q;
import fmc.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import ne0.n;
import retrofit2.Retrofit;
import rp0.p0;
import s3a.r;
import sf1.j;
import sf1.l;
import sg8.h;
import sri.o;
import vc.s;
import xe0.f;
import yji.d;
import zhm.q0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c implements e {
    public static m a(a31.a aVar, a31.a aVar2, a31.a aVar3) {
        return new m(aVar, aVar2, aVar3, 25);
    }

    public static fob.b b(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15, a31.a aVar16, a31.a aVar17, a31.a aVar18, a31.a aVar19, a31.a aVar20, a31.a aVar21, a31.a aVar22, a31.a aVar23, a31.a aVar24, a31.a aVar25, a31.a aVar26, a31.a aVar27, a31.a aVar28, a31.a aVar29, a31.a aVar30, a31.a aVar31, a31.a aVar32, a31.a aVar33, a31.a aVar34, a31.a aVar35) {
        return new fob.b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34, aVar35);
    }

    public static s79.c c(a31.a aVar, q qVar) {
        return new s79.c(aVar, qVar);
    }

    public static n d() {
        return s3a.q.a();
    }

    public static n e() {
        return s3a.q.a();
    }

    public static n f() {
        return s3a.q.a();
    }

    public static n g() {
        return s3a.q.a();
    }

    public static n h() {
        return s3a.q.a();
    }

    public static n i() {
        return s3a.q.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d j(r60.b extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        d dVar = (d) extension;
        s.k(dVar);
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d k(r60.b extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        d dVar = (d) extension;
        s.k(dVar);
        return dVar;
    }

    public static xe0.e l(je0.d mapper, f storageFactory, yk0.a databaseSessionProvider) {
        s7l.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "event_appearance", mapper, 0, null, 56);
    }

    public static hf8.b m(se8.e eVar, hf8.a juniorErrorResolverDelegateServerError, v60.e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(juniorErrorResolverDelegateServerError, "juniorErrorResolverDelegateServerError");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        return new hf8.b(u.c(juniorErrorResolverDelegateServerError), serverErrorsProvider);
    }

    public static JuniorGraduationDebugService n(Retrofit retrofit) {
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(JuniorGraduationDebugService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        JuniorGraduationDebugService juniorGraduationDebugService = (JuniorGraduationDebugService) objCreate;
        s.k(juniorGraduationDebugService);
        return juniorGraduationDebugService;
    }

    public static sri.m o(Context context) {
        s3a.u.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return o.c(context, null, null, 14);
    }

    public static sri.m p(Context context) {
        sf5.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return o.c(context, null, null, 14);
    }

    public static r60.d q(com.revolut.kompot.navigable.a controller, p0 displayer, he2.b dialogHostFinder) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(displayer, "displayer");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        return new r60.d(controller, displayer, dialogHostFinder);
    }

    public static r60.d r(com.revolut.kompot.navigable.a controller, p0 displayer, he2.b dialogHostFinder) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(displayer, "displayer");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        return new r60.d(controller, displayer, dialogHostFinder);
    }

    public static ve0.c s(je0.d objectMapper, f storageFactory) {
        s53.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.e(storageFactory, "card_reader_tips.pref", objectMapper, 12);
    }

    public static xe0.e t(je0.d mapper, yk0.a databaseSessionProvider, f storageFactory) {
        s3a.u.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "lite_app_home_storage", mapper, 1, null, 48);
    }

    public static CardReaderTipsService u(Retrofit retrofit) {
        s53.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(CardReaderTipsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CardReaderTipsService cardReaderTipsService = (CardReaderTipsService) objCreate;
        s.k(cardReaderTipsService);
        return cardReaderTipsService;
    }

    public static TradingDatabase v(z tradingDatabaseProvider) {
        s3f.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(tradingDatabaseProvider, "tradingDatabaseProvider");
        TradingDatabase tradingDatabase = (TradingDatabase) tradingDatabaseProvider.f136369b;
        s.k(tradingDatabase);
        return tradingDatabase;
    }

    public static f01.c w(se8.e eVar, z70.a contextProvider) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        return new f01.c(contextProvider.getContext());
    }

    public static WidgetService x(b bVar, Retrofit retrofit) {
        WidgetService widgetService = (WidgetService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", WidgetService.class, "create(...)");
        s.k(widgetService);
        return widgetService;
    }

    public static LinkedHashMap y(pf1.a currencyAccountUiMapper, pf1.a switchSalaryUiMapper, pf1.a jointAccountUiMapper, pf1.a personalPocketUiMapper, pf1.a groupPocketUiMapper, pf1.a jointPocketUiMapper, pf1.a budgetUiMapper, pf1.a incomeSorterUiMapper, pf1.a accountSwitchUiMapper, pf1.a linkedAccountUiMapper, pf1.a juniorAccountUiMapper, pf1.a proAccountUiMapper, pf1.a proPocketUiMapper, pf1.a proTaxPocketUiMapper, pf1.a juniorPocketUiMapper, pf1.a creditCardUiMapper, pf1.a creditBuilderCardUiMapper, pf1.a securedCreditCardUiMapper, pf1.a balanceTransferUiMapper, pf1.a loansUiMapper, pf1.a refinancingLoansUiMapper, pf1.a homeImprovementLoansUiMapper, pf1.a mortgagesUiMapper, pf1.a refinancingMortgagesUiMapper, pf1.a payLaterUiMapper, pf1.a overdraftUiMapper, pf1.a personalSavingsUiMapper, pf1.a jointSavingsUiMapper, pf1.a juniorSavingsUiMapper, pf1.a investSecuritiesAccountUiMapper, pf1.a investTaaIsaAccountUiMapper, pf1.a investTaaCustodianJIsaAccountUiMapper, pf1.a investTaaPersonalJIsaAccountUiMapper, pf1.a investTaaPeaAccountUiMapper, pf1.a investRoboAccountUiMapper, pf1.a investJointAccountUiMapper, pf1.a investMarginAccountUiMapper, pf1.a investGiaMarginAccountUiMapper, pf1.a investCommoditiesAccountUiMapper, pf1.a investBondsAccountUiMapper, pf1.a investEtfsAccountUiMapper, pf1.a investPrivateMarketsAccountUiMapper, pf1.a travelMilesUiMapper, pf1.a travelStaysUiMapper, pf1.a travelLoungesUiMapper, pf1.a travelAsftUiMapper, pf1.a travelExperiencesUiMapper, pf1.a transportUiMapper, pf1.a revPointsPocketUiMapper, pf1.a shopsUiMapper, pf1.a giftCardsUiMapper, pf1.a lifestylePartnersUiMapper, pf1.a lifestyleInsurancesUiMapper, pf1.a tradingUiMapper, pf1.a earnUiMapper, pf1.a learnUiMapper, pf1.a strategiesUiMapper, pf1.a revolutXUiMapper, pf1.a donationsMapper, pf1.a esimMapper, pf1.a studentUiMapper) {
        Iterator it8;
        pf1.a aVar;
        l.Companion.getClass();
        Intrinsics.checkNotNullParameter(currencyAccountUiMapper, "currencyAccountUiMapper");
        Intrinsics.checkNotNullParameter(switchSalaryUiMapper, "switchSalaryUiMapper");
        Intrinsics.checkNotNullParameter(jointAccountUiMapper, "jointAccountUiMapper");
        Intrinsics.checkNotNullParameter(personalPocketUiMapper, "personalPocketUiMapper");
        Intrinsics.checkNotNullParameter(groupPocketUiMapper, "groupPocketUiMapper");
        Intrinsics.checkNotNullParameter(jointPocketUiMapper, "jointPocketUiMapper");
        Intrinsics.checkNotNullParameter(budgetUiMapper, "budgetUiMapper");
        Intrinsics.checkNotNullParameter(incomeSorterUiMapper, "incomeSorterUiMapper");
        Intrinsics.checkNotNullParameter(accountSwitchUiMapper, "accountSwitchUiMapper");
        Intrinsics.checkNotNullParameter(linkedAccountUiMapper, "linkedAccountUiMapper");
        Intrinsics.checkNotNullParameter(juniorAccountUiMapper, "juniorAccountUiMapper");
        Intrinsics.checkNotNullParameter(proAccountUiMapper, "proAccountUiMapper");
        Intrinsics.checkNotNullParameter(proPocketUiMapper, "proPocketUiMapper");
        Intrinsics.checkNotNullParameter(proTaxPocketUiMapper, "proTaxPocketUiMapper");
        Intrinsics.checkNotNullParameter(juniorPocketUiMapper, "juniorPocketUiMapper");
        Intrinsics.checkNotNullParameter(creditCardUiMapper, "creditCardUiMapper");
        Intrinsics.checkNotNullParameter(creditBuilderCardUiMapper, "creditBuilderCardUiMapper");
        Intrinsics.checkNotNullParameter(securedCreditCardUiMapper, "securedCreditCardUiMapper");
        Intrinsics.checkNotNullParameter(balanceTransferUiMapper, "balanceTransferUiMapper");
        Intrinsics.checkNotNullParameter(loansUiMapper, "loansUiMapper");
        Intrinsics.checkNotNullParameter(refinancingLoansUiMapper, "refinancingLoansUiMapper");
        Intrinsics.checkNotNullParameter(homeImprovementLoansUiMapper, "homeImprovementLoansUiMapper");
        Intrinsics.checkNotNullParameter(mortgagesUiMapper, "mortgagesUiMapper");
        Intrinsics.checkNotNullParameter(refinancingMortgagesUiMapper, "refinancingMortgagesUiMapper");
        Intrinsics.checkNotNullParameter(payLaterUiMapper, "payLaterUiMapper");
        Intrinsics.checkNotNullParameter(overdraftUiMapper, "overdraftUiMapper");
        Intrinsics.checkNotNullParameter(personalSavingsUiMapper, "personalSavingsUiMapper");
        Intrinsics.checkNotNullParameter(jointSavingsUiMapper, "jointSavingsUiMapper");
        Intrinsics.checkNotNullParameter(juniorSavingsUiMapper, "juniorSavingsUiMapper");
        Intrinsics.checkNotNullParameter(investSecuritiesAccountUiMapper, "investSecuritiesAccountUiMapper");
        Intrinsics.checkNotNullParameter(investTaaIsaAccountUiMapper, "investTaaIsaAccountUiMapper");
        Intrinsics.checkNotNullParameter(investTaaCustodianJIsaAccountUiMapper, "investTaaCustodianJIsaAccountUiMapper");
        Intrinsics.checkNotNullParameter(investTaaPersonalJIsaAccountUiMapper, "investTaaPersonalJIsaAccountUiMapper");
        Intrinsics.checkNotNullParameter(investTaaPeaAccountUiMapper, "investTaaPeaAccountUiMapper");
        Intrinsics.checkNotNullParameter(investRoboAccountUiMapper, "investRoboAccountUiMapper");
        Intrinsics.checkNotNullParameter(investJointAccountUiMapper, "investJointAccountUiMapper");
        Intrinsics.checkNotNullParameter(investMarginAccountUiMapper, "investMarginAccountUiMapper");
        Intrinsics.checkNotNullParameter(investGiaMarginAccountUiMapper, "investGiaMarginAccountUiMapper");
        Intrinsics.checkNotNullParameter(investCommoditiesAccountUiMapper, "investCommoditiesAccountUiMapper");
        Intrinsics.checkNotNullParameter(investBondsAccountUiMapper, "investBondsAccountUiMapper");
        Intrinsics.checkNotNullParameter(investEtfsAccountUiMapper, "investEtfsAccountUiMapper");
        Intrinsics.checkNotNullParameter(investPrivateMarketsAccountUiMapper, "investPrivateMarketsAccountUiMapper");
        Intrinsics.checkNotNullParameter(travelMilesUiMapper, "travelMilesUiMapper");
        Intrinsics.checkNotNullParameter(travelStaysUiMapper, "travelStaysUiMapper");
        Intrinsics.checkNotNullParameter(travelLoungesUiMapper, "travelLoungesUiMapper");
        Intrinsics.checkNotNullParameter(travelAsftUiMapper, "travelAsftUiMapper");
        Intrinsics.checkNotNullParameter(travelExperiencesUiMapper, "travelExperiencesUiMapper");
        Intrinsics.checkNotNullParameter(transportUiMapper, "transportUiMapper");
        Intrinsics.checkNotNullParameter(revPointsPocketUiMapper, "revPointsPocketUiMapper");
        Intrinsics.checkNotNullParameter(shopsUiMapper, "shopsUiMapper");
        Intrinsics.checkNotNullParameter(giftCardsUiMapper, "giftCardsUiMapper");
        Intrinsics.checkNotNullParameter(lifestylePartnersUiMapper, "lifestylePartnersUiMapper");
        Intrinsics.checkNotNullParameter(lifestyleInsurancesUiMapper, "lifestyleInsurancesUiMapper");
        Intrinsics.checkNotNullParameter(tradingUiMapper, "tradingUiMapper");
        Intrinsics.checkNotNullParameter(earnUiMapper, "earnUiMapper");
        Intrinsics.checkNotNullParameter(learnUiMapper, "learnUiMapper");
        Intrinsics.checkNotNullParameter(strategiesUiMapper, "strategiesUiMapper");
        Intrinsics.checkNotNullParameter(revolutXUiMapper, "revolutXUiMapper");
        Intrinsics.checkNotNullParameter(donationsMapper, "donationsMapper");
        Intrinsics.checkNotNullParameter(esimMapper, "esimMapper");
        Intrinsics.checkNotNullParameter(studentUiMapper, "studentUiMapper");
        EnumEntries enumEntriesA = qf1.f.a();
        int iB = q0.b(w.t(enumEntriesA, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        Iterator it9 = enumEntriesA.iterator();
        while (it9.hasNext()) {
            Object next = it9.next();
            switch (j.f262262a[((qf1.f) next).ordinal()]) {
                case 1:
                    it8 = it9;
                    aVar = currencyAccountUiMapper;
                    break;
                case 2:
                    it8 = it9;
                    aVar = switchSalaryUiMapper;
                    break;
                case 3:
                    it8 = it9;
                    aVar = jointAccountUiMapper;
                    break;
                case 4:
                    it8 = it9;
                    aVar = personalPocketUiMapper;
                    break;
                case 5:
                    it8 = it9;
                    aVar = groupPocketUiMapper;
                    break;
                case 6:
                    it8 = it9;
                    aVar = jointPocketUiMapper;
                    break;
                case 7:
                    it8 = it9;
                    aVar = budgetUiMapper;
                    break;
                case 8:
                    it8 = it9;
                    aVar = incomeSorterUiMapper;
                    break;
                case 9:
                    it8 = it9;
                    aVar = accountSwitchUiMapper;
                    break;
                case 10:
                    it8 = it9;
                    aVar = linkedAccountUiMapper;
                    break;
                case 11:
                    it8 = it9;
                    aVar = juniorAccountUiMapper;
                    break;
                case 12:
                    it8 = it9;
                    aVar = personalSavingsUiMapper;
                    break;
                case 13:
                    it8 = it9;
                    aVar = jointSavingsUiMapper;
                    break;
                case 14:
                    it8 = it9;
                    aVar = juniorSavingsUiMapper;
                    break;
                case 15:
                    it8 = it9;
                    aVar = proAccountUiMapper;
                    break;
                case 16:
                    it8 = it9;
                    aVar = proPocketUiMapper;
                    break;
                case 17:
                    it8 = it9;
                    aVar = proTaxPocketUiMapper;
                    break;
                case 18:
                    it8 = it9;
                    aVar = juniorPocketUiMapper;
                    break;
                case 19:
                    it8 = it9;
                    aVar = creditCardUiMapper;
                    break;
                case 20:
                    it8 = it9;
                    aVar = creditBuilderCardUiMapper;
                    break;
                case 21:
                    it8 = it9;
                    aVar = securedCreditCardUiMapper;
                    break;
                case 22:
                    it8 = it9;
                    aVar = balanceTransferUiMapper;
                    break;
                case 23:
                    it8 = it9;
                    aVar = loansUiMapper;
                    break;
                case 24:
                    it8 = it9;
                    aVar = refinancingLoansUiMapper;
                    break;
                case 25:
                    it8 = it9;
                    aVar = homeImprovementLoansUiMapper;
                    break;
                case 26:
                    it8 = it9;
                    aVar = mortgagesUiMapper;
                    break;
                case 27:
                    it8 = it9;
                    aVar = refinancingMortgagesUiMapper;
                    break;
                case 28:
                    it8 = it9;
                    aVar = overdraftUiMapper;
                    break;
                case 29:
                    it8 = it9;
                    aVar = payLaterUiMapper;
                    break;
                case 30:
                    it8 = it9;
                    aVar = investSecuritiesAccountUiMapper;
                    break;
                case 31:
                    it8 = it9;
                    aVar = investTaaIsaAccountUiMapper;
                    break;
                case 32:
                    it8 = it9;
                    aVar = investTaaCustodianJIsaAccountUiMapper;
                    break;
                case 33:
                    it8 = it9;
                    aVar = investTaaPersonalJIsaAccountUiMapper;
                    break;
                case 34:
                    it8 = it9;
                    aVar = investTaaPeaAccountUiMapper;
                    break;
                case 35:
                    it8 = it9;
                    aVar = investRoboAccountUiMapper;
                    break;
                case 36:
                    it8 = it9;
                    aVar = investJointAccountUiMapper;
                    break;
                case 37:
                    it8 = it9;
                    aVar = investMarginAccountUiMapper;
                    break;
                case 38:
                    it8 = it9;
                    aVar = investGiaMarginAccountUiMapper;
                    break;
                case 39:
                    it8 = it9;
                    aVar = investCommoditiesAccountUiMapper;
                    break;
                case 40:
                    it8 = it9;
                    aVar = investBondsAccountUiMapper;
                    break;
                case 41:
                    it8 = it9;
                    aVar = investEtfsAccountUiMapper;
                    break;
                case 42:
                    it8 = it9;
                    aVar = investPrivateMarketsAccountUiMapper;
                    break;
                case 43:
                    it8 = it9;
                    aVar = travelMilesUiMapper;
                    break;
                case 44:
                    it8 = it9;
                    aVar = travelStaysUiMapper;
                    break;
                case 45:
                    it8 = it9;
                    aVar = travelLoungesUiMapper;
                    break;
                case 46:
                    it8 = it9;
                    aVar = travelAsftUiMapper;
                    break;
                case 47:
                    it8 = it9;
                    aVar = travelExperiencesUiMapper;
                    break;
                case 48:
                    it8 = it9;
                    aVar = revPointsPocketUiMapper;
                    break;
                case 49:
                    it8 = it9;
                    aVar = transportUiMapper;
                    break;
                case 50:
                    it8 = it9;
                    aVar = shopsUiMapper;
                    break;
                case 51:
                    it8 = it9;
                    aVar = giftCardsUiMapper;
                    break;
                case 52:
                    it8 = it9;
                    aVar = lifestylePartnersUiMapper;
                    break;
                case 53:
                    it8 = it9;
                    aVar = lifestyleInsurancesUiMapper;
                    break;
                case 54:
                    it8 = it9;
                    aVar = tradingUiMapper;
                    break;
                case 55:
                    it8 = it9;
                    aVar = earnUiMapper;
                    break;
                case 56:
                    it8 = it9;
                    aVar = learnUiMapper;
                    break;
                case 57:
                    it8 = it9;
                    aVar = strategiesUiMapper;
                    break;
                case 58:
                    it8 = it9;
                    aVar = revolutXUiMapper;
                    break;
                case 59:
                    it8 = it9;
                    aVar = donationsMapper;
                    break;
                case 60:
                    it8 = it9;
                    aVar = esimMapper;
                    break;
                case 61:
                    it8 = it9;
                    aVar = studentUiMapper;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            linkedHashMap.put(next, aVar);
            it9 = it8;
        }
        return linkedHashMap;
    }

    public static r z(s3a.s sVar) {
        r rVar = (r) sVar.b();
        s.k(rVar);
        return rVar;
    }
}
