package wtl;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanBenefitGroupItem;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleEndsOn;
import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import dii.g;
import dkk.a0;
import efm.r;
import hha.u;
import hha.w;
import hha.x;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lim.q;
import nkm.y;
import od0.i;
import pfm.h;
import pfm.m;
import qfm.j0;
import qfm.j1;
import tof.q6;
import xd2.n;
import xg6.k;
import xif.s;
import xlk.j;
import xnd.l0;
import xnd.n0;
import zhm.d0;
import zhm.f0;
import zhm.q0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f300039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f300040c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(Object obj2, int i, Object obj3, Object obj4) {
        this.f300038a = i;
        this.f300039b = obj2;
        this.f300040c = obj3;
        this.d = obj4;
    }

    private final Object a(Object obj2) {
        xif.e eVar = (xif.e) this.f300039b;
        q6[] q6VarArr = (q6[]) this.f300040c;
        AccountId accountId = (AccountId) this.d;
        Integer pendingListSize = (Integer) obj2;
        Intrinsics.checkNotNullParameter(pendingListSize, "pendingListSize");
        if (pendingListSize.intValue() <= 0) {
            return m.f235744a;
        }
        pfm.a aVarE = ((s) eVar.f306351a).b((q6[]) Arrays.copyOf(q6VarArr, q6VarArr.length)).e(ue0.e.v(eVar.f306352b.k0(accountId)));
        h hVar = new h(new j1(aVarE.B(), new k(new n(29), 12), 2), 3);
        return new h(new j0(hVar.B(), new k(new xif.c(0), 13), 2), 3);
    }

    private final Object b(Object obj2) {
        Object next;
        ArrayList<u> arrayList = (ArrayList) this.f300039b;
        final j jVar = (j) this.f300040c;
        hha.d dVar = (hha.d) this.d;
        do3.n user = (do3.n) obj2;
        Intrinsics.checkNotNullParameter(user, "user");
        w wVar = w.UNKNOWN;
        ArrayList arrayList2 = new ArrayList();
        for (u uVar : arrayList) {
            Iterator it8 = dVar.e.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (((x) next).f152369a.equals(uVar)) {
                    break;
                }
            }
            x xVar = (x) next;
            PlanBenefitGroupItem.Single single = xVar != null ? new PlanBenefitGroupItem.Single(xVar) : null;
            if (single != null) {
                arrayList2.add(single);
            }
        }
        xlk.b bVar = new xlk.b(wVar, arrayList2);
        xlk.a aVar = xlk.a.EXPANDED;
        jVar.getClass();
        q qVarQ = d0.Q(arrayList2);
        final int i = 0;
        nkm.h hVarN = y.n(qVarQ, new Function1() { // from class: xlk.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                hha.y yVarB;
                PlanBenefitGroupItem item = (PlanBenefitGroupItem) obj3;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(item, "item");
                        if (item instanceof PlanBenefitGroupItem.Single) {
                            yVarB = ((PlanBenefitGroupItem.Single) item).f102644a.f152370b;
                        } else {
                            if (!(item instanceof PlanBenefitGroupItem.Combined)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            jVar.getClass();
                            yVarB = j.b((PlanBenefitGroupItem.Combined) item);
                        }
                        return Boolean.valueOf(yVarB == hha.y.ENABLED);
                    default:
                        Intrinsics.checkNotNullParameter(item, "item");
                        jVar.getClass();
                        boolean zContains = true;
                        if (item instanceof PlanBenefitGroupItem.Single) {
                            x xVar2 = ((PlanBenefitGroupItem.Single) item).f102644a;
                            u.Companion.getClass();
                            u[] elements = {u.f152360r, u.f152361s, u.f152362t, u.u};
                            Intrinsics.checkNotNullParameter(elements, "elements");
                            zContains = true ^ kotlin.collections.d.y0(elements).contains(xVar2.f152369a);
                        } else if (!(item instanceof PlanBenefitGroupItem.Combined)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Boolean.valueOf(zContains);
                }
            }
        });
        final int i2 = 1;
        List sources = y.J(y.x(y.n(hVarN, new Function1() { // from class: xlk.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                hha.y yVarB;
                PlanBenefitGroupItem item = (PlanBenefitGroupItem) obj3;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(item, "item");
                        if (item instanceof PlanBenefitGroupItem.Single) {
                            yVarB = ((PlanBenefitGroupItem.Single) item).f102644a.f152370b;
                        } else {
                            if (!(item instanceof PlanBenefitGroupItem.Combined)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            jVar.getClass();
                            yVarB = j.b((PlanBenefitGroupItem.Combined) item);
                        }
                        return Boolean.valueOf(yVarB == hha.y.ENABLED);
                    default:
                        Intrinsics.checkNotNullParameter(item, "item");
                        jVar.getClass();
                        boolean zContains = true;
                        if (item instanceof PlanBenefitGroupItem.Single) {
                            x xVar2 = ((PlanBenefitGroupItem.Single) item).f102644a;
                            u.Companion.getClass();
                            u[] elements = {u.f152360r, u.f152361s, u.f152362t, u.u};
                            Intrinsics.checkNotNullParameter(elements, "elements");
                            zContains = true ^ kotlin.collections.d.y0(elements).contains(xVar2.f152369a);
                        } else if (!(item instanceof PlanBenefitGroupItem.Combined)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Boolean.valueOf(zContains);
                }
            }
        }), new xf0.j(jVar, dVar, 13)));
        Intrinsics.checkNotNullParameter(sources, "sources");
        r rVarDefaultIfEmpty = r.combineLatest(sources, new a0(new dmj.a(21), 5)).defaultIfEmpty(f0.f322471a);
        Intrinsics.checkNotNullExpressionValue(rVarDefaultIfEmpty, "defaultIfEmpty(...)");
        r map = rVarDefaultIfEmpty.map(new k(new ryd.f(jVar, bVar, dVar, aVar, user, 16), 26));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    private final Object c(Object obj2) {
        aim.e eVar = (aim.e) this.f300039b;
        List list = (List) this.f300040c;
        AccountId.Joint joint = (AccountId.Joint) this.d;
        List accounts = (List) obj2;
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        List list2 = accounts;
        int iB = q0.b(zhm.w.t(list2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj3 : list2) {
            linkedHashMap.put(((l0) obj3).f307419a, obj3);
        }
        od0.h hVar = i.Companion;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it8 = eVar.iterator();
        while (it8.hasNext()) {
            l0 l0Var = (l0) linkedHashMap.get((AccountId) it8.next());
            if (l0Var != null) {
                arrayList.add(l0Var);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            l0 l0Var2 = (l0) linkedHashMap.get((AccountId) it9.next());
            if (l0Var2 != null) {
                arrayList2.add(l0Var2);
            }
        }
        n0 n0Var = new n0(arrayList, arrayList2, joint != null);
        hVar.getClass();
        return od0.h.a(n0Var);
    }

    private final Object d(Object obj2) {
        com.revolut.feature.user_declarations.shared.flows.income.screen.b bVar = (com.revolut.feature.user_declarations.shared.flows.income.screen.b) this.f300039b;
        String str = (String) this.f300040c;
        xi0.b bVar2 = (xi0.b) this.d;
        xng.h update = (xng.h) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        return xng.h.a(update, null, null, bVar.f94632p.b(str, bVar2.f306286a), str, 511);
    }

    private final Object e(Object obj2) throws Throwable {
        com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a aVar = (com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a) this.f300039b;
        MobileScreenParams.TaxResidenciesCollection.PrimaryCountryReplacement primaryCountryReplacement = (MobileScreenParams.TaxResidenciesCollection.PrimaryCountryReplacement) this.f300040c;
        List list = (List) this.d;
        g result = (g) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof dii.e) {
            aVar.O2(primaryCountryReplacement, zhm.u.c(com.revolut.shared.feature.workflow.engine.api.models.a.TAX_RESIDENCY_SELF_CERTIFICATION_AGREED), list);
        } else if (!(result instanceof dii.f)) {
            if (!(result instanceof dii.b) && !(result instanceof dii.c) && !(result instanceof dii.d)) {
                throw new NoWhenBranchMatchedException();
            }
            hx7.e.n(new IllegalArgumentException("Unexpected dialog result " + result));
        }
        return Unit.f186387a;
    }

    private final Object g(Object obj2) {
        String str = (String) this.f300039b;
        LocalDate localDate = (LocalDate) this.f300040c;
        xpf.h hVar = (xpf.h) this.d;
        xpf.a updateState = (xpf.a) obj2;
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        if (!Intrinsics.f(str, "DATE_PICKER_SCHEDULE_DATE_FIELD_ID")) {
            return Intrinsics.f(str, "DATE_PICKER_END_DATE_FIELD_ID") ? xpf.a.a(updateState, TransferScheduleData.a(((xpf.a) hVar.t2()).f307958a, 0L, null, new TransferScheduleEndsOn.Date(ebm.a.P(localDate)), 3)) : updateState;
        }
        long jP = ebm.a.P(localDate);
        TransferScheduleData transferScheduleData = ((xpf.a) hVar.t2()).f307958a;
        TransferScheduleEndsOn transferScheduleEndsOn = ((xpf.a) hVar.t2()).f307958a.f104287c;
        if ((transferScheduleEndsOn instanceof TransferScheduleEndsOn.Date) && jP > ((TransferScheduleEndsOn.Date) transferScheduleEndsOn).f104288a) {
            transferScheduleEndsOn = TransferScheduleEndsOn.Never.f104289a;
        }
        return xpf.a.a(updateState, TransferScheduleData.a(transferScheduleData, jP, null, transferScheduleEndsOn, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object h(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wtl.f.h(java.lang.Object):java.lang.Object");
    }

    private final Object i(Object obj2) {
        BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) this.f300039b;
        Clause clause = (Clause) this.f300040c;
        dsh.e eVar = (dsh.e) this.d;
        xsh.h it8 = (xsh.h) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return xsh.h.a(it8, model, clause, eVar, 13);
    }

    /* JADX WARN: Removed duplicated region for block: B:232:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0551 A[Catch: all -> 0x046f, TryCatch #2 {all -> 0x046f, blocks: (B:180:0x046b, B:184:0x0475, B:185:0x04ad, B:187:0x04b3, B:191:0x04c2, B:195:0x04d1, B:199:0x04e0, B:203:0x04ef, B:207:0x04fe, B:224:0x0531, B:225:0x053c, B:226:0x053d, B:230:0x0548, B:234:0x0557, B:238:0x0563, B:237:0x055f, B:233:0x0551, B:228:0x0542, B:229:0x0545, B:206:0x04f8, B:202:0x04e9, B:198:0x04da, B:194:0x04cb, B:190:0x04bc, B:183:0x0472), top: B:412:0x0469 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x055f A[Catch: all -> 0x046f, TryCatch #2 {all -> 0x046f, blocks: (B:180:0x046b, B:184:0x0475, B:185:0x04ad, B:187:0x04b3, B:191:0x04c2, B:195:0x04d1, B:199:0x04e0, B:203:0x04ef, B:207:0x04fe, B:224:0x0531, B:225:0x053c, B:226:0x053d, B:230:0x0548, B:234:0x0557, B:238:0x0563, B:237:0x055f, B:233:0x0551, B:228:0x0542, B:229:0x0545, B:206:0x04f8, B:202:0x04e9, B:198:0x04da, B:194:0x04cb, B:190:0x04bc, B:183:0x0472), top: B:412:0x0469 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0701  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r35) throws com.revolut.feature.wealth.api.domain.model.ExchangePocketIsDisabledError {
        /*
            Method dump skipped, instruction units count: 2666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wtl.f.invoke(java.lang.Object):java.lang.Object");
    }
}
