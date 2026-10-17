package wvg;

import com.revolut.data.model.Data;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsAvailableRewardItem;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsAvailableRewards;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfo;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminder;
import com.revolut.feature.retail.salary_account.impl.model.salary_promotion.SalaryPromotionParams;
import com.revolut.feature.store.core.api.model.StoreProduct;
import com.revolut.feature.store.core.api.model.StoreProductOption;
import com.revolut.feature.store.core.api.model.StoreProductTerm;
import com.revolut.feature.store.core.api.model.StoreProductVariant;
import com.revolut.feature.store.core.api.model.StoreProductVariantValue;
import com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model.TotalValueChartFacade;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChart;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.t3;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f300389w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f300390x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f300390x = obj2;
    }

    private final Object b(Object obj2) {
        ArrayList arrayList;
        String str;
        String str2;
        x1e.s sVar;
        String str3 = (String) this.v;
        StoreProduct storeProduct = (StoreProduct) this.f300389w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ue0.c cVar = ((y1e.b) this.f300390x).f310366c;
        String str4 = "STORE_PRODUCT_STORAGE_" + str3;
        Intrinsics.checkNotNullParameter(storeProduct, "<this>");
        String str5 = storeProduct.f88629a;
        String str6 = storeProduct.f88630b;
        String str7 = storeProduct.f88631c;
        LocalDateTime localDateTime = storeProduct.d;
        String str8 = localDateTime != null ? localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) : null;
        String str9 = storeProduct.e;
        String str10 = storeProduct.f;
        Integer num = storeProduct.f88632g;
        String strName = storeProduct.f88633h.name();
        boolean z = storeProduct.i;
        ArrayList arrayList2 = storeProduct.k;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            StoreProductOption storeProductOption = (StoreProductOption) it8.next();
            arrayList3.add(new x1e.m(storeProductOption.f88638a, storeProductOption.f88639b, storeProductOption.f88640c.W()));
            it8 = it8;
            str5 = str5;
        }
        String str11 = str5;
        ArrayList arrayList4 = storeProduct.f88635l;
        ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
        for (Iterator it9 = arrayList4.iterator(); it9.hasNext(); it9 = it9) {
            StoreProductTerm storeProductTerm = (StoreProductTerm) it9.next();
            arrayList5.add(new x1e.p(storeProductTerm.f88644a, storeProductTerm.f88645b));
        }
        StoreProductVariant storeProductVariant = storeProduct.f88636m;
        if (storeProductVariant != null) {
            String str12 = storeProductVariant.f88646a;
            ArrayList arrayList6 = storeProductVariant.f88647b;
            arrayList = arrayList5;
            ArrayList arrayList7 = new ArrayList(zhm.w.t(arrayList6, 10));
            Iterator it10 = arrayList6.iterator();
            while (it10.hasNext()) {
                StoreProductVariantValue storeProductVariantValue = (StoreProductVariantValue) it10.next();
                arrayList7.add(new x1e.v(storeProductVariantValue.f88648a, storeProductVariantValue.f88650c, storeProductVariantValue.f88649b));
                it10 = it10;
                str6 = str6;
                str7 = str7;
            }
            str = str6;
            str2 = str7;
            sVar = new x1e.s(str12, arrayList7);
        } else {
            arrayList = arrayList5;
            str = str6;
            str2 = str7;
            sVar = null;
        }
        cVar.G(new x1e.j(str11, str, str2, str8, str9, str10, num, strName, z, arrayList3, arrayList, sVar, storeProduct.f88637n, storeProduct.f88634j), str4, wim.z.d(kotlin.jvm.internal.o0.b(x1e.j.class)));
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        String str = (String) this.v;
        CobrandedCardsAvailableRewards cobrandedCardsAvailableRewards = (CobrandedCardsAvailableRewards) this.f300389w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ue0.c cVar = ((y5b.c0) this.f300390x).f311027b;
        y5b.c0.Companion.getClass();
        String strA = y5b.x.a(str);
        Intrinsics.checkNotNullParameter(cobrandedCardsAvailableRewards, "<this>");
        String str2 = cobrandedCardsAvailableRewards.f82290a;
        String str3 = cobrandedCardsAvailableRewards.f82291b;
        ArrayList<CobrandedCardsAvailableRewardItem> arrayList = cobrandedCardsAvailableRewards.f82292c;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (CobrandedCardsAvailableRewardItem cobrandedCardsAvailableRewardItem : arrayList) {
            Intrinsics.checkNotNullParameter(cobrandedCardsAvailableRewardItem, "<this>");
            arrayList2.add(new w5b.c(cobrandedCardsAvailableRewardItem.f82288a, cobrandedCardsAvailableRewardItem.f82289b));
        }
        cVar.G(new w5b.f(str2, str3, arrayList2), strA, wim.z.d(kotlin.jvm.internal.o0.b(w5b.f.class)));
        return Unit.f186387a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v1 w5b.d3, still in use, count: 3, list:
          (r5v1 w5b.d3) from 0x016a: MOVE (r28v0 w5b.d3) = (r5v1 w5b.d3)
          (r5v1 w5b.d3) from 0x0115: MOVE (r28v2 w5b.d3) = (r5v1 w5b.d3)
          (r5v1 w5b.d3) from 0x0092: MOVE (r28v4 w5b.d3) = (r5v1 w5b.d3)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    private final java.lang.Object n(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wvg.i.n(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                i iVar = new i((j) this.f300390x, (Continuation) obj4, 0);
                iVar.v = (c) obj2;
                iVar.f300389w = (mwg.e) obj3;
                return iVar.invokeSuspend(Unit.f186387a);
            case 1:
                i iVar2 = new i((k) this.f300390x, (Continuation) obj4, 1);
                iVar2.v = (d) obj2;
                iVar2.f300389w = (List) obj3;
                return iVar2.invokeSuspend(Unit.f186387a);
            case 2:
                i iVar3 = new i((o) this.f300390x, (Continuation) obj4, 2);
                iVar3.v = (l) obj2;
                iVar3.f300389w = (PerformanceChart) obj3;
                return iVar3.invokeSuspend(Unit.f186387a);
            case 3:
                i iVar4 = new i((q) this.f300390x, (Continuation) obj4, 3);
                iVar4.v = (p) obj2;
                iVar4.f300389w = (mwg.i) obj3;
                return iVar4.invokeSuspend(Unit.f186387a);
            case 4:
                i iVar5 = new i((s) this.f300390x, (Continuation) obj4, 4);
                iVar5.v = (r) obj2;
                iVar5.f300389w = (List) obj3;
                return iVar5.invokeSuspend(Unit.f186387a);
            case 5:
                i iVar6 = new i((v) this.f300390x, (Continuation) obj4, 5);
                iVar6.v = (e) obj2;
                iVar6.f300389w = (TotalValueChartFacade) obj3;
                return iVar6.invokeSuspend(Unit.f186387a);
            case 6:
                i iVar7 = new i((e0) this.f300390x, (Continuation) obj4, 6);
                iVar7.v = (d1) obj2;
                iVar7.f300389w = (PerformanceChart) obj3;
                return iVar7.invokeSuspend(Unit.f186387a);
            case 7:
                i iVar8 = new i((g0) this.f300390x, (Continuation) obj4, 7);
                iVar8.v = (f1) obj2;
                iVar8.f300389w = (mwg.i) obj3;
                return iVar8.invokeSuspend(Unit.f186387a);
            case 8:
                i iVar9 = new i((t0) this.f300390x, (Continuation) obj4, 8);
                iVar9.v = (b2) obj2;
                iVar9.f300389w = (TotalValueChartFacade) obj3;
                return iVar9.invokeSuspend(Unit.f186387a);
            case 9:
                i iVar10 = new i((n1) this.f300390x, (Continuation) obj4, 9);
                iVar10.v = (h1) obj2;
                iVar10.f300389w = (xvg.a) obj3;
                return iVar10.invokeSuspend(Unit.f186387a);
            case 10:
                i iVar11 = new i((n1) this.f300390x, (Continuation) obj4, 10);
                iVar11.v = (o1) obj2;
                iVar11.f300389w = (xvg.a) obj3;
                return iVar11.invokeSuspend(Unit.f186387a);
            case 11:
                i iVar12 = new i((x1) this.f300390x, (Continuation) obj4, 11);
                iVar12.v = (i1) obj2;
                iVar12.f300389w = (xvg.b) obj3;
                return iVar12.invokeSuspend(Unit.f186387a);
            case 12:
                i iVar13 = new i((x1) this.f300390x, (Continuation) obj4, 12);
                iVar13.v = (p1) obj2;
                iVar13.f300389w = (xvg.b) obj3;
                return iVar13.invokeSuspend(Unit.f186387a);
            case 13:
                i iVar14 = new i((x5f.c) this.f300390x, (Continuation) obj4, 13);
                iVar14.v = (Data) obj2;
                iVar14.f300389w = (Data) obj3;
                return iVar14.invokeSuspend(Unit.f186387a);
            case 14:
                i iVar15 = new i((x8h.l0) this.f300390x, (Continuation) obj4, 14);
                iVar15.v = (Data) obj2;
                iVar15.f300389w = (Data) obj3;
                return iVar15.invokeSuspend(Unit.f186387a);
            case 15:
                i iVar16 = new i((xgb.a) this.f300390x, (Continuation) obj4, 15);
                iVar16.v = (SalaryPromotionParams) obj2;
                iVar16.f300389w = (egb.c) obj3;
                return iVar16.invokeSuspend(Unit.f186387a);
            case 16:
                String str = ((RegisteredIdentityId) obj2).f74764a;
                i iVar17 = new i((xjl.u) this.f300390x, (Continuation) obj4, 16);
                iVar17.v = str;
                iVar17.f300389w = (cjl.w) obj3;
                return iVar17.invokeSuspend(Unit.f186387a);
            case 17:
                i iVar18 = new i((xkf.f0) this.f300390x, (Continuation) obj4, 17);
                iVar18.v = (a3) obj2;
                iVar18.f300389w = (do3.n) obj3;
                return iVar18.invokeSuspend(Unit.f186387a);
            case 18:
                i iVar19 = new i((xkf.y0) this.f300390x, (Continuation) obj4, 18);
                iVar19.v = (t3) obj2;
                iVar19.f300389w = (a3) obj3;
                return iVar19.invokeSuspend(Unit.f186387a);
            case 19:
                i iVar20 = new i((xr3.u) this.f300390x, (Continuation) obj4, 19);
                iVar20.v = (xr3.t) obj2;
                iVar20.f300389w = (xp3.c) obj3;
                return iVar20.invokeSuspend(Unit.f186387a);
            case 20:
                i iVar21 = new i((xr3.f0) this.f300390x, (Continuation) obj4, 20);
                iVar21.v = (xr3.b0) obj2;
                iVar21.f300389w = (List) obj3;
                return iVar21.invokeSuspend(Unit.f186387a);
            case 21:
                i iVar22 = new i((xr3.f0) this.f300390x, (Continuation) obj4, 21);
                iVar22.v = (xr3.c0) obj2;
                iVar22.f300389w = (List) obj3;
                return iVar22.invokeSuspend(Unit.f186387a);
            case 22:
                i iVar23 = new i((com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.b) this.f300390x, (Continuation) obj4, 22);
                iVar23.v = (Data) obj2;
                iVar23.f300389w = (Data) obj3;
                return iVar23.invokeSuspend(Unit.f186387a);
            case 23:
                i iVar24 = new i((y1e.b) this.f300390x, (Continuation) obj4, 23);
                iVar24.v = (String) obj2;
                iVar24.f300389w = (StoreProduct) obj3;
                return iVar24.invokeSuspend(Unit.f186387a);
            case 24:
                i iVar25 = new i((y20.b1) this.f300390x, (Continuation) obj4, 24);
                iVar25.v = (v30.c0) obj2;
                iVar25.f300389w = (v50.a) obj3;
                return iVar25.invokeSuspend(Unit.f186387a);
            case 25:
                i iVar26 = new i((y5b.p) this.f300390x, (Continuation) obj4, 25);
                iVar26.v = (String) obj2;
                iVar26.f300389w = (CobrandedCardsValueReminder) obj3;
                return iVar26.invokeSuspend(Unit.f186387a);
            case 26:
                i iVar27 = new i((y5b.p) this.f300390x, (Continuation) obj4, 26);
                iVar27.v = (Pair) obj2;
                iVar27.f300389w = (CobrandedCardsValueReminder) obj3;
                return iVar27.invokeSuspend(Unit.f186387a);
            case 27:
                i iVar28 = new i((y5b.c0) this.f300390x, (Continuation) obj4, 27);
                iVar28.v = (String) obj2;
                iVar28.f300389w = (CobrandedCardsAvailableRewards) obj3;
                return iVar28.invokeSuspend(Unit.f186387a);
            case 28:
                i iVar29 = new i((y5b.c0) this.f300390x, (Continuation) obj4, 28);
                iVar29.v = (String) obj2;
                iVar29.f300389w = (CobrandedCardsPlanHubInfo) obj3;
                return iVar29.invokeSuspend(Unit.f186387a);
            default:
                i iVar30 = new i((y5b.g0) this.f300390x, (Continuation) obj4, 29);
                iVar30.v = (od0.i) obj2;
                iVar30.f300389w = (r5b.n) obj3;
                return iVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // gim.a
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 3366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wvg.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
