package wf0;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.retail.salary_account.impl.R$string;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.MultipleWatchlistsFlowContract$PagerItem;
import com.revolut.retail.feature.pricing_plans.ui.impl.interactor.terms.PricingPlanTerms;
import ip0.zj;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import wh4.n;
import wj9.g;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296868a;

    public /* synthetic */ b(int i) {
        this.f296868a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        List listC;
        switch (this.f296868a) {
            case 0:
                Intrinsics.checkNotNullParameter((c) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((List) obj3, "<unused var>");
                return Unit.f186387a;
            case 1:
                Throwable error = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 2:
                Intrinsics.checkNotNullParameter((e0) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((List) obj3, "<unused var>");
                return Unit.f186387a;
            case 3:
                Intrinsics.checkNotNullParameter((d0) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((List) obj3, "<unused var>");
                return Unit.f186387a;
            case 4:
                Throwable error2 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list2 == null) {
                    return error2;
                }
                return null;
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 6:
                Throwable th10 = (Throwable) obj2;
                if (((nel.n) obj3) == null) {
                    return th10;
                }
                return null;
            case 7:
                Throwable th11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                if (tj0.a.a(th11)) {
                    listC = iii.c.e(4, "NO_CONNECTION_ERROR_ITEM_LIST_ID", true);
                } else {
                    Pair pair = ((th11 instanceof HttpException) && ((HttpException) th11).code() == 404) ? new Pair(Integer.valueOf(R$string.salary_promotion_error_404_title), Integer.valueOf(R$string.salary_promotion_error_404_subtitle)) : new Pair(Integer.valueOf(R$string.salary_promotion_error_title), Integer.valueOf(R$string.salary_promotion_error_subtitle));
                    FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_ITEM_LIST_ID", new TextLocalisedClause(((Number) pair.f186385a).intValue(), null, null, 14), new TextLocalisedClause(((Number) pair.f186386b).intValue(), null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 31712);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    listC = zhm.u.c(model);
                }
                return new wgb.m(null, null, listC);
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.u.c(new MultipleWatchlistsFlowContract$PagerItem.Error((Throwable) obj2));
            case 9:
                Throwable error3 = (Throwable) obj2;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.e eVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.e) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (eVar == null) {
                    return error3;
                }
                return null;
            case 10:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new wh4.p((List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), n.a.f297407a);
            case 11:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new wi6.o((List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null)));
            case 12:
                Throwable error4 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list3 == null) {
                    return error4;
                }
                return null;
            case 13:
                Throwable error5 = (Throwable) obj2;
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (pricingPlanSubscription == null) {
                    return error5;
                }
                return null;
            case 14:
                Data data = (Data) obj3;
                return Boolean.valueOf(Intrinsics.f(org.bouncycastle.jcajce.provider.digest.a.m((Data) obj2, data, "old", "new"), data.getContent()));
            case 15:
                Throwable error6 = (Throwable) obj2;
                PricingPlanTerms pricingPlanTerms = (PricingPlanTerms) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (pricingPlanTerms == null) {
                    return error6;
                }
                return null;
            case 16:
                Function1 defaultErrorItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider, "defaultErrorItemsProvider");
                return (List) defaultErrorItemsProvider.invoke(new iii.d(14, null, true, false, null));
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return wj8.k.f298010a;
            case 18:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new wj9.h(g.b.f298026a, (List) getDefaultErrorItems3.invoke(new iii.d(12, null, false, true, null)), false);
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 20:
                Throwable error7 = (Throwable) obj2;
                ec5.c cVar = (ec5.c) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (cVar == null) {
                    return error7;
                }
                return null;
            case 21:
                Throwable error8 = (Throwable) obj2;
                PricingPlanSubscription pricingPlanSubscription2 = (PricingPlanSubscription) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (pricingPlanSubscription2 == null) {
                    return error8;
                }
                return null;
            case 22:
                Function1 getDefaultErrorItem = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItem, "getDefaultErrorItem");
                return (List) getDefaultErrorItem.invoke(new iii.d(12, null, true, true, null));
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 24:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null));
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, true);
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            default:
                Function1 defaultFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke(new iii.d(14, null, false, false, null));
        }
    }

    public /* synthetic */ b(cli.n nVar, int i) {
        this.f296868a = i;
    }
}
