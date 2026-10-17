package eed;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.add_card_to_google_pay_shared.impl.R$string;
import com.revolut.feature.junior_onboarding.api.model.OnboardingTerms;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.a;
import dj9.u;
import dj9.z;
import eig.t;
import ej9.d;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125175a;

    public /* synthetic */ a(int i) {
        this.f125175a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f125175a) {
            case 0:
                Throwable error = (Throwable) obj2;
                SavingsProductData savingsProductData = (SavingsProductData) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (savingsProductData == null) {
                    return error;
                }
                return null;
            case 1:
                Throwable error2 = (Throwable) obj2;
                s sVar = (s) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (sVar == null) {
                    return error2;
                }
                return null;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 3:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(10, null, false, false, "ERROR_ASSETS_ITEM_LIST_ID"));
            case 4:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(10, null, false, false, "ERROR_MORE_ITEM_LIST_ID"));
            case 5:
                zf0.c langKey = (zf0.c) obj2;
                String scope = (String) obj3;
                Intrinsics.checkNotNullParameter(langKey, "langKey");
                Intrinsics.checkNotNullParameter(scope, "scope");
                return new Pair(langKey, scope);
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 8:
                Function1 defaultItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
                return (List) defaultItems.invoke(new iii.d(14, null, false, false, null));
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new a.C0590a(null, null, null);
            case 10:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, false, true, null));
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new TextLocalisedClause(R$string.x_pay_otp_verification_title, null, null, 14);
            case 12:
                Throwable error3 = (Throwable) obj2;
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (pricingPlanSubscription == null) {
                    return error3;
                }
                return null;
            case 13:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new eh8.i(eh8.f.f125754a, null, (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null)));
            case 14:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 15:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 16:
                Throwable error4 = (Throwable) obj2;
                io3.d dVar = (io3.d) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (dVar == null) {
                    return error4;
                }
                return null;
            case 17:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 18:
                Throwable error5 = (Throwable) obj2;
                OnboardingTerms onboardingTerms = (OnboardingTerms) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (onboardingTerms == null) {
                    return error5;
                }
                return null;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new eic.s(eic.j.f126475a, eic.f.f126470a, iii.c.b(null, null, 6, true));
            case 20:
                List list = (List) obj3;
                Intrinsics.h(list);
                ((List) obj2).addAll(list);
                return Unit.f186387a;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return t.a(u.c(t.d("ERROR_AIRLINES_AND_ACCOUNTS_ITEM_ID")), t.b());
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return u.c(t.d("ERROR_TRANSACTIONS_ITEM_ID"));
            case 23:
                String acc2 = (String) obj2;
                CoroutineContext.Element element = (CoroutineContext.Element) obj3;
                Intrinsics.checkNotNullParameter(acc2, "acc");
                Intrinsics.checkNotNullParameter(element, "element");
                if (acc2.length() == 0) {
                    return element.toString();
                }
                return acc2 + ", " + element;
            case 24:
                Throwable error6 = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (pair == null) {
                    return error6;
                }
                return null;
            case 25:
                Throwable error7 = (Throwable) obj2;
                Pair pair2 = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (pair2 == null) {
                    return error7;
                }
                return null;
            case 26:
                z dto = (z) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto, "dto");
                return dto;
            case 27:
                dj9.a dto2 = (dj9.a) obj3;
                Intrinsics.checkNotNullParameter((d.a) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto2, "dto");
                return dto2;
            case 28:
                z dto3 = (z) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto3, "dto");
                return dto3;
            default:
                dj9.u newState = (dj9.u) obj2;
                ((Integer) obj3).intValue();
                Intrinsics.checkNotNullParameter(newState, "newState");
                return Boolean.valueOf(newState instanceof u.b);
        }
    }
}
