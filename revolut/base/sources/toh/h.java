package toh;

import b9.w2;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$Page;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$ThemeInfo;
import com.revolut.feature.bank_account_switching.api.navigation.HowOverstapWorksDestination;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.SpendingAnalyticsAccount;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import d67.q;
import d67.s;
import d67.t;
import d67.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jkl.a3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.joda.time.Interval;
import tof.i3;
import yhm.r;
import zh9.u0;
import zhm.h0;
import zhm.q0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f273221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f273222c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(Object obj2, int i, Object obj3, Object obj4) {
        this.f273220a = i;
        this.f273221b = obj2;
        this.f273222c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x10d6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x10d9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 4482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: toh.h.a(java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj2) {
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f273221b;
        com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar = (com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b) this.f273222c;
        String str = (String) this.d;
        dii.g outputData = (dii.g) obj2;
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        ref$BooleanRef.f186407a = true;
        if (Intrinsics.f(outputData, dii.e.f115068a)) {
            bVar.l2(new uhb.i(bVar, str, null, 0), new yi5.b(26));
        } else if (Intrinsics.f(outputData, dii.f.f115069a)) {
            oki.h.D2(bVar.f83056x);
        } else if (!(outputData instanceof dii.b) && !(outputData instanceof dii.c) && !(outputData instanceof dii.d)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        com.revolut.sso.impl.ui.auth_rejected.a aVar = (com.revolut.sso.impl.ui.auth_rejected.a) this.f273221b;
        Clause clause = (Clause) this.f273222c;
        a3 a3Var = (a3) this.d;
        u outputData = (u) obj2;
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        if (outputData instanceof q) {
            aVar.C2(ukl.c.f280794a);
        } else if (outputData instanceof s) {
            if (clause == null) {
                throw new IllegalStateException("Unexpected primary action click without a label");
            }
            aVar.C2(ukl.e.f280796a);
        } else {
            if (!(outputData instanceof t)) {
                throw new IllegalStateException(("Unexpected output " + outputData).toString());
            }
            if (a3Var == null) {
                throw new IllegalStateException("Unexpected secondary action click");
            }
            aVar.C2(new ukl.d(a3Var));
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    private final Object d(Object obj2) {
        ?? arrayList;
        Data data = (Data) this.f273221b;
        GlobalThemeDeclaration globalThemeDeclaration = (GlobalThemeDeclaration) this.f273222c;
        com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b bVar = (com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) this.d;
        um2.a aVar = (um2.a) obj2;
        ThemeCustomisationContract$ThemeInfo themeCustomisationContract$ThemeInfo = (ThemeCustomisationContract$ThemeInfo) data.getContent();
        if (themeCustomisationContract$ThemeInfo != null) {
            wm2.b bVar2 = bVar.f63795y;
            List availableAccents = themeCustomisationContract$ThemeInfo.f63781g;
            bVar2.getClass();
            Intrinsics.checkNotNullParameter(availableAccents, "availableAccents");
            EnumEntries enumEntriesB = ThemeCustomisationContract$Page.b();
            arrayList = new ArrayList();
            for (Object obj3 : enumEntriesB) {
                if (((ThemeCustomisationContract$Page) obj3) != ThemeCustomisationContract$Page.ACCENT || availableAccents.size() > 1) {
                    arrayList.add(obj3);
                }
            }
        } else {
            arrayList = aVar.d;
        }
        return um2.a.a(aVar, null, data, null, arrayList, false, null, globalThemeDeclaration != null ? new AnimationRequest(false) : aVar.f281180g, null, 181);
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Map] */
    private final Object e(Object obj2) {
        Iterator it8;
        umd.b bVar;
        w2 w2Var = (w2) this.f273221b;
        lzi.m mVar = (lzi.m) this.f273222c;
        umd.l lVar = (umd.l) this.d;
        r rVar = (r) obj2;
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        lzi.h hVar = (lzi.h) rVar.f314201a;
        wmd.e eVar = (wmd.e) rVar.f314202b;
        wmd.i iVar = (wmd.i) rVar.f314203c;
        List list = lVar.f281297c;
        w2Var.getClass();
        List list2 = list;
        int iB = q0.b(w.t(list2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj3 : list2) {
            linkedHashMap.put(((i3) obj3).getId(), obj3);
        }
        String str = mVar.f200987a;
        dj0.d dVar = mVar.f200988b;
        dj0.d dVar2 = eVar.f298640a;
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = mVar.f200989c;
        List list3 = mVar.d;
        ArrayList arrayList = new ArrayList();
        Iterator it9 = list3.iterator();
        while (it9.hasNext()) {
            lzi.l lVar2 = (lzi.l) it9.next();
            i3 i3Var = (i3) linkedHashMap.get(lVar2.f200985b);
            if (i3Var == null) {
                bVar = null;
                it8 = it9;
            } else {
                dj0.d dVar3 = lVar2.f200986c;
                dj0.d dVar4 = (dj0.d) eVar.f298641b.get(lVar2.f200985b);
                if (dVar4 == null) {
                    it8 = it9;
                    dVar4 = new dj0.d(0L, dVar.f115083b);
                } else {
                    it8 = it9;
                }
                bVar = new umd.b(i3Var, dVar3, dVar4);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            it9 = it8;
        }
        return new umd.a(dVar, dVar2, iVar, analyticsSpendingPeriod$Interval, hVar, arrayList, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.revolut.retail.core.navigation.NaviCommand] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r7v5, types: [sri.m] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object g(Object obj2) {
        un2.c cVar = (un2.c) this.f273221b;
        mn2.a aVar = (mn2.a) this.f273222c;
        jf0.c cVar2 = (jf0.c) this.d;
        Boolean enabled = (Boolean) obj2;
        Intrinsics.checkNotNullParameter(enabled, "enabled");
        if (!enabled.booleanValue()) {
            return Boolean.FALSE;
        }
        ?? featureCommand = 0;
        featureCommand = 0;
        if (Intrinsics.f(cVar2.e(3), "how-it-works")) {
            int i = un2.a.f281339a[aVar.ordinal()];
            if (i == 1) {
                featureCommand = new FeatureCommand(new KompotOverlayFeatureConfig(HowOverstapWorksDestination.f63892a, yhi.b.BOTTOM_DIALOG, (Integer) featureCommand, 12));
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                IllegalStateException illegalStateException = new IllegalStateException("Unexpected service type:" + aVar);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            }
        } else {
            KompotDestination kompotDestinationC = un2.c.c(aVar, cVar2);
            if (kompotDestinationC != null) {
                featureCommand = u0.e(kompotDestinationC);
            }
        }
        if (featureCommand == 0) {
            return Boolean.FALSE;
        }
        cVar.f281344b.c(featureCommand);
        return Boolean.TRUE;
    }

    private final Object h(Object obj2) {
        ur5.c cVar = (ur5.c) this.f273221b;
        n9l.b bVar = (n9l.b) this.f273222c;
        xi0.b bVar2 = (xi0.b) this.d;
        List pockets = (List) obj2;
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        ArrayList<io3.d> arrayList = new ArrayList();
        for (Object obj3 : pockets) {
            if (!Intrinsics.f(((io3.d) obj3).f163147c, bVar2.f306286a)) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (io3.d dVar : arrayList) {
            xi0.a aVar = xi0.b.Companion;
            String str = dVar.f163147c;
            aVar.getClass();
            v1.c.A(arrayList2, xi0.a.a(str), bVar2);
        }
        return cVar.f282250b.c(arrayList2, bVar);
    }

    private final Object i(Object obj2) {
        String str;
        urj.n nVar = (urj.n) this.f273221b;
        Interval interval = (Interval) this.f273222c;
        AccountId accountId = (AccountId) this.d;
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        Set set = (Set) pair.f186385a;
        do3.n nVar2 = (do3.n) pair.f186386b;
        l5i.q qVar = nVar.C;
        he3.d dVar = he3.d.SPENDINGS;
        CategorisationFilter.Scope.PocketsIdSet pocketsIdSet = new CategorisationFilter.Scope.PocketsIdSet(set);
        if (accountId instanceof AccountId.Joint) {
            str = ((AccountId.Joint) accountId).f51412a;
        } else {
            if (!Intrinsics.f(accountId, AccountId.Personal.f51414a)) {
                throw new NoWhenBranchMatchedException();
            }
            str = nVar2.f116408a;
        }
        CategorisationFilter categorisationFilter = new CategorisationFilter(dVar, pocketsIdSet, interval, null, null, null, null, null, y0.b(str), null, 760);
        AnalyticsAccountsSelection.Companion companion = AnalyticsAccountsSelection.INSTANCE;
        SpendingAnalyticsAccount spendingAnalyticsAccountB = com.revolut.retail.feature.api.a.b(accountId);
        companion.getClass();
        return rd0.e.c(qVar.c(new ge3.b(categorisationFilter, AnalyticsAccountsSelection.Companion.a(spendingAnalyticsAccountB))), kotlin.coroutines.g.f186406a);
    }

    private final Object j(Object obj2) {
        urj.d dVar = (urj.d) this.f273221b;
        ie3.a aVar = (ie3.a) this.f273222c;
        AccountId accountId = (AccountId) this.d;
        urj.a update = (urj.a) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        Data goal = zi0.c.P(dVar, false, null, 3);
        update.getClass();
        Intrinsics.checkNotNullParameter(goal, "goal");
        return new urj.a(goal, aVar, accountId);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x09b0  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 2754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: toh.h.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ h(String str, String str2, List list) {
        this.f273220a = 13;
        this.f273221b = str;
        this.d = str2;
        this.f273222c = list;
    }

    public /* synthetic */ h(List list, String str, u3a.n nVar) {
        this.f273220a = 10;
        this.f273222c = list;
        this.f273221b = str;
        this.d = nVar;
    }

    public /* synthetic */ h(u9l.c cVar, List list, hbl.c cVar2, Function1 function1) {
        this.f273220a = 17;
        this.f273222c = list;
        this.f273221b = cVar2;
        this.d = function1;
    }
}
