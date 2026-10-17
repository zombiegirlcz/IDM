package a5k;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.database.models.transactioncategory.mapper.CustomTransactionCategoryMapperKt;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.budgeting.CreateCustomCategoryDto;
import com.revolut.data.network.models.budgeting.CustomCategoryDto;
import com.revolut.data.network.services.TransactionCategoriesService;
import com.revolut.domain.models.transactions.CategoryColor;
import com.revolut.domain.models.transactions.CategoryImage;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.pay_later.api.R$string;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.PocketDetailsScreenContract$InputData;
import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import com.revolut.tracking.v3.OpenCreditEntryPointContext;
import g1i.i0;
import grl.m2;
import grl.r2;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import le.u1;
import zh9.r0;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1485c;
    public final Object d;
    public final Object e;

    public /* synthetic */ s(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f1483a = i;
        this.f1484b = obj2;
        this.f1485c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v35, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3;
        Object arrayList;
        List list;
        Data data;
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies;
        dj0.d totalBalance;
        zh9.i iVar;
        zh9.h hVar;
        String str;
        amd.g gVar;
        Object arrayList2;
        List list2;
        int i = this.f1483a;
        int i2 = 15;
        int i3 = 0;
        Object obj4 = null;
        Object obj5 = this.e;
        Object obj6 = this.f1484b;
        Object obj7 = this.d;
        Object obj8 = this.f1485c;
        switch (i) {
            case 0:
                t.Z2((t) obj6, (skm.l) obj8, new f((qua.p) obj7, ((Boolean) obj2).booleanValue(), (AccountId) obj5));
                return Unit.f186387a;
            case 1:
                List results = (List) obj2;
                Intrinsics.checkNotNullParameter(results, "results");
                o97.m mVar = (o97.m) obj6;
                if (mVar != o97.m.INVEST) {
                    throw new IllegalStateException("provide handling for " + mVar);
                }
                Iterator it8 = results.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (((o97.o) next).f223122a == mVar) {
                            obj3 = next;
                        }
                    } else {
                        obj3 = null;
                    }
                }
                o97.o oVar = (o97.o) obj3;
                if (oVar == null || (list = oVar.f223123b) == null) {
                    arrayList = zhm.f0.f322471a;
                } else {
                    b4f.b bVar = (b4f.b) obj8;
                    arrayList = new ArrayList();
                    for (Object obj9 : list) {
                        if (bVar.b((String) obj9)) {
                            arrayList.add(obj9);
                        }
                    }
                }
                return new b4d.c((zsc.d) obj5, i2, (zsc.d) obj7, arrayList);
            case 2:
                TypeCheckerState typeCheckerState = (TypeCheckerState) obj8;
                TypeSystemContext typeSystemContext = (TypeSystemContext) obj7;
                RigidTypeMarker rigidTypeMarker = (RigidTypeMarker) obj5;
                TypeCheckerState.ForkPointContext runForkingPoint = (TypeCheckerState.ForkPointContext) obj2;
                Intrinsics.checkNotNullParameter(runForkingPoint, "$this$runForkingPoint");
                Iterator it9 = ((AbstractCollection) obj6).iterator();
                while (it9.hasNext()) {
                    runForkingPoint.fork(new gkm.a(typeCheckerState, typeSystemContext, (RigidTypeMarker) it9.next(), rigidTypeMarker));
                }
                return Unit.f186387a;
            case 3:
                String str2 = ((WalletId) obj2).f66106a;
                Intrinsics.checkNotNullParameter(str2, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                krj.d dVar = ((grj.i) obj6).f146036a;
                dj0.d amount = (dj0.d) obj8;
                String budgetId = (String) obj7;
                String budgetingCategory = (String) obj5;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(budgetId, "budgetId");
                Intrinsics.checkNotNullParameter(str2, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                Intrinsics.checkNotNullParameter(budgetingCategory, "budgetingCategory");
                efm.d0<jrj.c> d0VarUpdateWalletBudget = dVar.f188880a.updateWalletBudget(budgetId, str2, new jrj.b(amount.f115082a, amount.f115083b.f306286a, foh.i.D(budgetingCategory)));
                km2.b bVar2 = new km2.b(25, new kpj.a(14));
                d0VarUpdateWalletBudget.getClass();
                ufm.i iVar2 = new ufm.i(d0VarUpdateWalletBudget, bVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                ufm.i iVar3 = new ufm.i(new ufm.f(iVar2, new km2.b(26, new kog.k(dVar, 13)), 3), new km2.b(27, new kpj.a(i2)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                return te0.w.i0(iVar3);
            case 4:
                hea.o update = (hea.o) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data data2 = (Data) obj6;
                try {
                    Object content = data2.getContent();
                    data = new Data(content != null ? ((dda.a) content).f113159a : null, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                dda.k kVar = (dda.k) obj8;
                if (kVar == null) {
                    kVar = update.f151649g;
                }
                dda.k kVar2 = kVar;
                com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar = (com.revolut.feature.pockets.impl.details_v2.pocket_details.a) obj7;
                PocketDetailsScreenContract$InputData pocketDetailsScreenContract$InputData = aVar.o;
                if (pocketDetailsScreenContract$InputData.d && !((o8b.c) aVar.f80864x).g() && aVar.M2(update.f151646a) != null && !pocketDetailsScreenContract$InputData.f80848g) {
                    i3 = 1;
                }
                return hea.o.a(update, null, i3, (Data) obj5, data, null, null, kVar2, null, false, null, null, false, null, null, false, 32433);
            case 5:
                String str3 = ((WalletId) obj2).f66106a;
                Intrinsics.checkNotNullParameter(str3, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-nonNullWalletId$0");
                g31.h hVar2 = ((le3.b0) obj6).d;
                String name = (String) obj8;
                CategoryImage icon = (CategoryImage) obj7;
                CategoryColor color = (CategoryColor) obj5;
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(color, "color");
                Intrinsics.checkNotNullParameter(str3, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                TransactionCategoriesService transactionCategoriesService = hVar2.f140179a;
                String strH = u1.h(icon, CustomTransactionCategoryMapperKt.getTransactionCategoryImageMapper());
                if (strH == null) {
                    strH = "";
                }
                String strH2 = u1.h(color, CustomTransactionCategoryMapperKt.getTransactionCategoryColorMapper());
                efm.d0<CustomCategoryDto> d0VarCreateCategory = transactionCategoriesService.createCategory(new CreateCustomCategoryDto(name, strH, strH2 != null ? strH2 : ""), str3);
                i0 i0Var = new i0(6, new g0f.f(str3, hVar2, 24));
                d0VarCreateCategory.getClass();
                ufm.i iVar4 = new ufm.i(d0VarCreateCategory, i0Var, 1);
                Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                return te0.w.i0(iVar4);
            case 6:
                List entryPointUiModels = (List) obj2;
                Intrinsics.checkNotNullParameter(entryPointUiModels, "entryPointUiModels");
                osd.e eVar = (osd.e) obj6;
                ppk.f fVar = eVar.d;
                List list3 = (List) obj8;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it10 = list3.iterator();
                while (it10.hasNext()) {
                    arrayList3.add(((CreditCard) it10.next()).f69798l);
                }
                return nim.a.v(cp5.c.D(fVar, arrayList3, (xi0.b) obj7), new knd.t((List) obj8, (xi0.b) obj7, entryPointUiModels, eVar, (cl4.a) obj5, 2));
            case 7:
                ClassDescriptor classDescriptor = (ClassDescriptor) obj6;
                RawSubstitution rawSubstitution = (RawSubstitution) obj8;
                SimpleType simpleType = (SimpleType) obj7;
                JavaTypeAttributes javaTypeAttributes = (JavaTypeAttributes) obj5;
                KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj2;
                RawSubstitution.Companion companion = RawSubstitution.Companion;
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
                if (classId == null || (classDescriptorFindClassAcrossModuleDependencies = kotlinTypeRefiner.findClassAcrossModuleDependencies(classId)) == null || classDescriptorFindClassAcrossModuleDependencies.equals(classDescriptor)) {
                    return null;
                }
                return (SimpleType) rawSubstitution.a(simpleType, classDescriptorFindClassAcrossModuleDependencies, javaTypeAttributes).f186385a;
            case 8:
                List exchangeRates = (List) obj2;
                xi0.b bVar3 = (xi0.b) obj8;
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                List plans = (List) obj6;
                if (plans.isEmpty()) {
                    totalBalance = new dj0.d(0L, bVar3);
                } else {
                    dj0.d.Companion.getClass();
                    dj0.d dVarJ = dj0.d.e;
                    for (Object obj10 : plans) {
                        int i5 = i3 + 1;
                        if (i3 < 0) {
                            zhm.v.s();
                            throw null;
                        }
                        dVarJ = i3 == 0 ? uc0.b.j(u0.s((r0) obj10), exchangeRates, bVar3) : pyd.c.O(dVarJ, uc0.b.j(u0.s((r0) obj10), exchangeRates, bVar3));
                        i3 = i5;
                    }
                    totalBalance = pyd.c.i0(dVarJ);
                }
                amd.b bVar4 = amd.b.PAY_LATER;
                zh9.i0 i0Var2 = (zh9.i0) ((od0.i) obj7).f224257a;
                xh9.d dVar2 = (xh9.d) obj5;
                dVar2.getClass();
                boolean z = dVar2 instanceof xh9.b;
                Intrinsics.checkNotNullParameter(plans, "plans");
                Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
                amd.e eVar2 = amd.e.PAY_LATER;
                List listC = (i0Var2 == null || (hVar = (iVar = i0Var2.f322286b).f) == null || (str = hVar.f322267a) == null) ? zhm.f0.f322471a : zhm.u.c(new amd.f(new TextLocalisedClause(R$string.pay_later_home_actions_pay_later, null, null, 14), null, sx4.f.b(3, null, null, iVar.e), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.pay_later_amount_to_repay, null, null, 14), LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_time_and_money, R$attr.uikit_colorWhite, R$attr.uikit_colorTeal), null, new amd.z(u0.n(plans).size(), str), 162));
                if (i0Var2 == null && z) {
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_net_worth_promo_model_pay_later_title, null, null, 14);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_net_worth_promo_model_pay_later_description, null, null, 14);
                    LayeredImage layeredImageI = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_time_and_money, R$attr.uikit_colorWhite, R$attr.uikit_colorTeal);
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_net_worth_promo_model_pay_later_action, null, null, 14);
                    amd.c0 c0Var = new amd.c0(bVar4, NetWorthAccount.Personal.f87455a);
                    AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
                    OpenCreditEntryPointContext.a aVarNewBuilder = OpenCreditEntryPointContext.newBuilder();
                    aVarNewBuilder.h(r2.TOTAL_WEALTH);
                    aVarNewBuilder.i(m2.BUY_NOW_PAY_LATER);
                    w0 w0VarA = aVarNewBuilder.a();
                    companion2.getClass();
                    gVar = new amd.g(layeredImageI, textLocalisedClause, textLocalisedClause2, textLocalisedClause3, c0Var, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA)));
                } else {
                    gVar = null;
                }
                amd.j jVar = new amd.j(bVar4, zhm.u.c(new amd.d(eVar2, listC, zhm.v.l(gVar), totalBalance)), null, false, null, 28);
                if (mra.d.x(jVar)) {
                    return jVar;
                }
                return null;
            default:
                List results2 = (List) obj2;
                Intrinsics.checkNotNullParameter(results2, "results");
                o97.m mVar2 = (o97.m) obj6;
                if (mVar2 != o97.m.INVEST) {
                    throw new IllegalStateException("provide handling for " + mVar2);
                }
                Iterator it11 = results2.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next2 = it11.next();
                        if (((o97.o) next2).f223122a == mVar2) {
                            obj4 = next2;
                        }
                    }
                }
                o97.o oVar2 = (o97.o) obj4;
                if (oVar2 == null || (list2 = oVar2.f223123b) == null) {
                    arrayList2 = zhm.f0.f322471a;
                } else {
                    b4f.b bVar5 = (b4f.b) obj8;
                    arrayList2 = new ArrayList();
                    for (Object obj11 : list2) {
                        if (bVar5.b((String) obj11)) {
                            arrayList2.add(obj11);
                        }
                    }
                }
                return new a9j.n((zsc.h) obj7, 19, (zsc.m) obj5, arrayList2);
        }
    }

    public /* synthetic */ s(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f1483a = i;
        this.f1484b = obj2;
        this.f1485c = obj3;
        this.d = obj5;
        this.e = obj6;
    }
}
