package fe9;

import bfh.e;
import com.revolut.core.ui_kit.delegates.u;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.pricingplans.models.family.FamilyPlanState;
import do3.n;
import efm.k;
import ff4.e0;
import ff4.s;
import ip0.c0;
import ip0.og;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import jel.m1;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import org.bouncycastle.asn1.eac.CertificateBody;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134481a;

    public /* synthetic */ f(int i) {
        this.f134481a = i;
    }

    /* JADX WARN: Type inference failed for: r1v96, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        oha.a aVar;
        Object next2;
        int i = this.f134481a;
        ee9.b bVar = ee9.b.f125156a;
        switch (i) {
            case 0:
                j updateState = (j) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                updateState.getClass();
                return new j(bVar);
            case 1:
                j updateState2 = (j) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                updateState2.getClass();
                return new j(bVar);
            case 2:
                j updateState3 = (j) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                updateState3.getClass();
                return new j(ee9.d.f125158a);
            case 3:
                fee.e update = (fee.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data transactions = new Data(null, null, true, 3, null);
                update.getClass();
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return new fee.e(transactions);
            case 4:
                Function0 loadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(loadingItems, "loadingItems");
                return (List) loadingItems.invoke();
            case 5:
                jel.c it8 = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof m1) {
                    return (m1) it8;
                }
                return null;
            case 6:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.getCause();
            case 7:
                ff4.i update2 = (ff4.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return ff4.i.a(update2, null, null, null, null, null, CertificateBody.profileType);
            case 8:
                ff4.i iVar = (ff4.i) obj2;
                return ff4.i.a(iVar, null, null, null, null, Data.copy$default(iVar.f, null, null, true, 3, null), 191);
            case 9:
                return new ax4.b(0);
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                m70.a.c(t0.f186434a);
                TextLocalisedClause textLocalisedClauseA = e0.a("");
                List listC = u.c(new c0("ID_LOADING_ACTION_ITEM", u.b.f54794a, R$attr.uikit_dp0, 0, 56));
                IntRange intRange = new IntRange(1, 15, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                vim.f it10 = intRange.iterator();
                while (it10.f289625c) {
                    og ogVar = new og(a0.d.n("ID_LOADING_ITEM_", it10.nextInt() - 1));
                    yp0.b.l(ogVar, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(ogVar);
                }
                return new s(d0.E0(arrayList, listC), textLocalisedClauseA, null, null, null, null, null, null, null, false, false, null, null, 6684);
            case 11:
                lf8.f configuration = (lf8.f) obj2;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return configuration.f;
            case 12:
                lf8.f configuration2 = (lf8.f) obj2;
                Intrinsics.checkNotNullParameter(configuration2, "configuration");
                return configuration2.f194670b;
            case 13:
                lf8.f it11 = (lf8.f) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.d;
            case 14:
                lf8.f configuration3 = (lf8.f) obj2;
                Intrinsics.checkNotNullParameter(configuration3, "configuration");
                return configuration3.f194669a;
            case 15:
                qf8.a it12 = (qf8.a) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f245274a;
            case 16:
                lf8.f configuration4 = (lf8.f) obj2;
                Intrinsics.checkNotNullParameter(configuration4, "configuration");
                return configuration4.e;
            case 17:
                zec.a it13 = (zec.a) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(it13.getAppNeedsUpdate());
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return e.a.f14987a;
            case 19:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return FamilyPlanState.Empty.f81188a;
            case 20:
                PricingPlanSubscription subscription = (PricingPlanSubscription) obj2;
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                return subscription.f81129a;
            case 21:
                PricingPlanSubscription it14 = (PricingPlanSubscription) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f81129a;
            case 22:
                List plans = (List) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                Iterator it15 = plans.iterator();
                while (true) {
                    if (it15.hasNext()) {
                        next = it15.next();
                        hha.d dVar = (hha.d) next;
                        Lazy lazy = hha.s.f152339a;
                        Intrinsics.checkNotNullParameter(dVar, "<this>");
                        if (dVar.f152291h.isEmpty()) {
                        }
                    } else {
                        next = null;
                    }
                }
                hha.d dVar2 = (hha.d) next;
                if (dVar2 != null) {
                    oha.e.Companion.getClass();
                    oha.e type = oha.e.f225330b;
                    Lazy lazy2 = hha.s.f152339a;
                    Intrinsics.checkNotNullParameter(dVar2, "<this>");
                    Intrinsics.checkNotNullParameter(type, "type");
                    ArrayList arrayList2 = dVar2.i;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        if (((oha.a) obj3).f225325b.equals(type)) {
                            arrayList3.add(obj3);
                        }
                    }
                    Iterator it16 = arrayList3.iterator();
                    while (true) {
                        if (it16.hasNext()) {
                            next2 = it16.next();
                            oha.b bVar2 = oha.c.Companion;
                            oha.c productCode = ((oha.a) next2).f225324a;
                            bVar2.getClass();
                            Intrinsics.checkNotNullParameter(productCode, "productCode");
                            if (kotlin.text.d0.J(productCode.f225329a, "FX_FREE_", false)) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    aVar = (oha.a) next2;
                } else {
                    aVar = null;
                }
                Long l2 = aVar != null ? aVar.d : null;
                if (l2 == null) {
                    return rfm.h.f253943a;
                }
                rfm.u uVarG = k.g(new dj0.d(l2.longValue(), dVar2.d));
                Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                return uVarG;
            case 23:
                List<hha.d> plans2 = (List) obj2;
                Intrinsics.checkNotNullParameter(plans2, "plans");
                for (hha.d dVar3 : plans2) {
                    if (dVar3.f152296p) {
                        return dVar3;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 24:
                List plans3 = (List) obj2;
                Intrinsics.checkNotNullParameter(plans3, "plans");
                return Boolean.valueOf(!plans3.isEmpty());
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Optional.empty();
            case 26:
                rha.b it17 = (rha.b) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Optional.ofNullable(it17.f254392a.get("plan_change"));
            case 27:
                n it18 = (n) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return new pha.a(it18.f116423x);
            case 28:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255100b = false;
                Json.f255101c = true;
                return Unit.f186387a;
            default:
                bla.c it19 = (bla.c) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Boolean.valueOf(it19 == bla.c.ENABLED);
        }
    }
}
