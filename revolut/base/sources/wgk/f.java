package wgk;

import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreen;
import com.revolut.feature.junior_onboarding.api.model.ConsentMechanics;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.retail.feature.pricing_plans.ui.impl.interactor.terms.PricingPlanTerms;
import do3.n;
import ggk.y;
import ip0.nb0;
import ip0.pb0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlin.text.a0;
import uh8.i;
import uh8.j;
import wh4.o;
import wh4.p;
import wi6.h;
import wj8.l;
import wj9.g;
import yhf.v;
import yhm.m;
import zh9.i0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297336a;

    public /* synthetic */ f(int i) {
        this.f297336a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        mh8.b bVar;
        Object optIn;
        String strV;
        int i = 0;
        switch (this.f297336a) {
            case 0:
                hha.d it8 = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new g(it8);
            case 1:
                dz3.c configuration = (dz3.c) obj2;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return new wh4.a(configuration, null);
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                n6.Companion.getClass();
                return new p(u.c(nb0.b(pb0.Companion, "repayment_account", true, 0, true, 20)), new o(new aw0.e(false, null, null, m6.a(), null, null, 55)));
            case 3:
                i it9 = (i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Intrinsics.checkNotNullParameter(it9, "<this>");
                String matchResult = it9.getMatchResult();
                mh8.b[] bVarArrValues = mh8.b.values();
                int length = bVarArrValues.length;
                while (true) {
                    if (i < length) {
                        bVar = bVarArrValues[i];
                        if (!a0.z(bVar.name(), matchResult, true)) {
                            i++;
                        }
                    } else {
                        bVar = null;
                    }
                }
                if (bVar == null) {
                    hx7.e.n(new IllegalArgumentException(j6.a.q("BE returns unknown matching result: ", it9.getMatchResult())));
                    bVar = mh8.b.NOT_MATCHED;
                }
                List<uh8.a> consents = it9.getConsents();
                ArrayList arrayList = new ArrayList();
                for (uh8.a aVar : consents) {
                    Intrinsics.checkNotNullParameter(aVar, "<this>");
                    try {
                        m.Companion companion = m.INSTANCE;
                        String mechanics = aVar.getMechanics();
                        if (Intrinsics.f(mechanics, "OPT_OUT")) {
                            if (aVar.getTitle() == null || aVar.getDefaultValue() == null) {
                                throw new IllegalArgumentException(("BE returns empty values: title = " + aVar.getTitle() + ", defaultValue = " + aVar.getDefaultValue() + ", for code = " + aVar.getCode()).toString());
                            }
                            optIn = new ConsentMechanics.OptOut(aVar.getCode(), aVar.getTitle(), aVar.getDefaultValue().booleanValue());
                        } else {
                            if (!Intrinsics.f(mechanics, "OPT_IN")) {
                                throw new IllegalArgumentException("BE returns unknown consent mechanics: " + aVar.getMechanics());
                            }
                            v6d.a aVarA = sh8.a.a(aVar.getCode());
                            if (aVarA == null) {
                                throw new IllegalArgumentException(("BE returns unknown consent code: " + aVar.getCode()).toString());
                            }
                            optIn = new ConsentMechanics.OptIn(aVarA);
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = m.INSTANCE;
                        Throwable thA = m.a(yhm.o.a(th10));
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                        optIn = null;
                    }
                    if (optIn != null) {
                        arrayList.add(optIn);
                    }
                }
                return new mh8.a(bVar, arrayList);
            case 4:
                j it10 = (j) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Intrinsics.checkNotNullParameter(it10, "<this>");
                String matchResult2 = it10.getMatchResult();
                if (Intrinsics.f(matchResult2, "MATCHED")) {
                    return mh8.b.MATCHED;
                }
                if (Intrinsics.f(matchResult2, "NOT_MATCHED")) {
                    return mh8.b.NOT_MATCHED;
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Unknown matchResult=", it10.getMatchResult(), " for enum JuniorMatchResult mapping"));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                return mh8.b.NOT_MATCHED;
            case 5:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.e = true;
                Json.f255101c = true;
                return Unit.f186387a;
            case 6:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                if (!update.c()) {
                    return h.a(update, null, null, update.i, update.k, update.f297812j, update.f297813l, null, null, null, null, null, null, 4035);
                }
                h0 h0Var2 = h0.f322473a;
                return h.a(update, null, null, h0Var2, h0Var2, h0Var2, h0Var2, null, null, null, null, null, null, 4035);
            case 7:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new wi6.o((List) getDefaultLoadingItems.invoke());
            case 8:
                v it11 = (v) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return u.c(it11);
            case 9:
                v it12 = (v) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return u.c(it12);
            case 10:
                Intrinsics.checkNotNullParameter((Data) obj2, "it");
                return Unit.f186387a;
            case 11:
                PricingPlanSubscription subscription = (PricingPlanSubscription) obj2;
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                return subscription.f81129a.f152287a;
            case 12:
                y it13 = (y) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f143799b;
            case 13:
                iha.g it14 = (iha.g) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f161322b;
            case 14:
                PricingPlanTerms it15 = (PricingPlanTerms) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f103308a;
            case 15:
                n user = (n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                Address address = user.k;
                boolean z = address != null;
                if (z) {
                    strV = a0.d.v(new Object[]{j6.a.q("en-", address.getCountry())}, 1, "https://www.revolut.com/%s/legal/paid-plans", "format(...)");
                } else {
                    if (z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strV = "https://www.revolut.com/legal/paid-plans";
                }
                return new PricingPlanTerms(strV, null, null);
            case 16:
                n user2 = (n) obj2;
                Intrinsics.checkNotNullParameter(user2, "user");
                Address address2 = user2.k;
                boolean z3 = address2 != null;
                if (z3) {
                    return a0.d.v(new Object[]{j6.a.q("en-", address2.getCountry())}, 1, "https://www.revolut.com/%s/legal/discounted-paid-plan-promotion", "format(...)");
                }
                if (z3) {
                    throw new NoWhenBranchMatchedException();
                }
                return "https://www.revolut.com/legal/discounted-paid-plan-promotion";
            case 17:
                l71.d userCompany = (l71.d) obj2;
                Intrinsics.checkNotNullParameter(userCompany, "userCompany");
                return Boolean.valueOf(userCompany.a() == UserCompanyRegion.PT);
            case 18:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return (data.getError() == null || data.getContent() != null) ? data : new Data(Boolean.FALSE, null, false, 6, null);
            case 19:
                PricingPlanSubscription it16 = (PricingPlanSubscription) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f81129a.f152287a;
            case 20:
                CellDetailsChevronDelegate.Model it17 = (CellDetailsChevronDelegate.Model) obj2;
                KProperty[] kPropertyArr = CFACInsuranceExpenseDetailsScreen.V;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(Intrinsics.f(it17.f51822a, "ID_REMOVE_EXPENSE_ACTION"));
            case 21:
                RowDelegate.Model it18 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = CFACInsuranceExpenseDetailsScreen.V;
                Intrinsics.checkNotNullParameter(it18, "it");
                Object obj3 = it18.u;
                if (obj3 instanceof File) {
                    return (File) obj3;
                }
                return null;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ListSubheaderDelegate.Model modelB = wj8.b.b();
                IntRange intRange = new IntRange(1, 4, 1);
                ArrayList arrayList2 = new ArrayList(w.t(intRange, 10));
                vim.f it19 = intRange.iterator();
                while (it19.f289625c) {
                    InputTextDelegate.Model model = new InputTextDelegate.Model(a0.d.n("LOADING_ITEM_", it19.nextInt()), null, null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, true, null, null, null, null, 0, 0, 0, 0, -2, 65471);
                    yp0.b.r(model, 0, 0, 0, 0, 15);
                    arrayList2.add(model);
                }
                return ue0.e.J(modelB, arrayList2);
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return l.f298011a;
            case 24:
                od0.i it20 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return (i0) it20.c();
            case 25:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return new wj9.h(g.a.f298025a, (List) getDefaultLoadingItems2.invoke(), false);
            case 26:
                wjd.a updateState = (wjd.a) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Data type = new Data(wl0.o.NONE, null, false, 6, null);
                updateState.getClass();
                Intrinsics.checkNotNullParameter(type, "type");
                return new wjd.a(type);
            case 27:
                wjd.a updateState2 = (wjd.a) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                Data type2 = new Data(null, null, true, 3, null);
                updateState2.getClass();
                Intrinsics.checkNotNullParameter(type2, "type");
                return new wjd.a(type2);
            case 28:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var3);
                return Boolean.FALSE;
            default:
                return wje.g.a((wje.g) obj2, null, null, false, null, null, false, false, false, 191);
        }
    }

    public /* synthetic */ f(cli.n nVar, int i) {
        this.f297336a = i;
    }
}
