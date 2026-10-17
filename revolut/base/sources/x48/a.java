package x48;

import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.donations.api.interactor.CharitiesCollectionsInteractor$CollectionNotFoundException;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.managed_portfolio_benchmark.ManagedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.managed_portfolio_benchmark.ManagedPortfolioBenchmarkScreenContract$ModalStep;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.wealth.resources.R$string;
import grl.k9;
import ip0.zj;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import x4e.l;
import x64.o;
import x84.n;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f302801a;

    public /* synthetic */ a(int i) {
        this.f302801a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f302801a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (pair == null) {
                    return error;
                }
                return null;
            case 1:
                l.a aVar = l.Companion;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 2:
                Throwable error2 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (model == null) {
                    return error2;
                }
                return null;
            case 3:
                Throwable error3 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model2 = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (model2 == null) {
                    return error3;
                }
                return null;
            case 4:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                List list = (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
                m70.a.c(t0.f186434a);
                return new o(hb4.o.a(""), list);
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 6:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ManagedPortfolioBenchmarkScreenContract$ModalStep step = (ManagedPortfolioBenchmarkScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof ManagedPortfolioBenchmarkScreenContract$ModalStep.BenchmarkDescription)) {
                    throw new NoWhenBranchMatchedException();
                }
                ManagedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData managedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData = ((ManagedPortfolioBenchmarkScreenContract$ModalStep.BenchmarkDescription) step).f91329a;
                lw0.a aVar2 = new lw0.a(new TextClause(managedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData.f91325a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, 30);
                aw0.e eVar = new aw0.e(false, new TextClause(managedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData.f91326b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null, new n6(new TextLocalisedClause(R$string.managed_portfolios_template_details_benchmark_details_button_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 53);
                k9 k9Var = k9.RoboAdvisor;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            case 7:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null));
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 9:
                Throwable th10 = (Throwable) obj2;
                if (((fo3.c) obj3) == null) {
                    return th10;
                }
                return null;
            case 10:
                Throwable th11 = (Throwable) obj2;
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                if (th11 != null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th11, h0Var);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Neither content nor error provided");
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                }
                return (List) defaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 11:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new x82.c(null, (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null)));
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new n(false, u.c(new FullScreenStateDelegate.Model("ID_ERROR_ITEM", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_outstanding_debts_debts_hub_error_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_outstanding_debts_debts_hub_error_action_title, null, null, 14), false, null, null, false, 0, 0, 32596)));
            case 13:
                Throwable error4 = (Throwable) obj2;
                xi0.b bVar = (xi0.b) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (bVar == null) {
                    return error4;
                }
                return null;
            case 14:
                Throwable error5 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (bool == null) {
                    return error5;
                }
                return null;
            case 15:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 16:
                Throwable error6 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list2 == null) {
                    return error6;
                }
                return null;
            case 17:
                Throwable error7 = (Throwable) obj2;
                yt8.c cVar = (yt8.c) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (cVar == null) {
                    return error7;
                }
                return null;
            case 18:
                Throwable error8 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (list3 != null) {
                    return error8;
                }
                return null;
            case 19:
                Throwable error9 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list4 == null) {
                    return error9;
                }
                return null;
            case 20:
                Throwable error10 = (Throwable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (bool2 == null) {
                    return error10;
                }
                return null;
            case 21:
                ((Boolean) obj2).getClass();
                return AccountId.Personal.f51414a;
            case 22:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                String str = "Error while mapping RegisteredIdentityInfo Data: " + ((Throwable) obj2);
                return new x9b.e(x9b.k.a(f0.f322471a));
            case 24:
                Function1 defaultFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke(new iii.d(14, null, false, false, null));
            case 25:
                Function1 defaultFactory2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultFactory2, "defaultFactory");
                return (List) defaultFactory2.invoke(new iii.d(14, null, true, false, null));
            case 26:
                Function1 defaultFactory3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultFactory3, "defaultFactory");
                return (List) defaultFactory3.invoke(new iii.d(14, null, false, false, null));
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                if (((Throwable) obj2) instanceof CharitiesCollectionsInteractor$CollectionNotFoundException) {
                    return xb6.i.b();
                }
                FullScreenStateDelegate.Model model3 = new FullScreenStateDelegate.Model("ERROR_BLOCK_ID", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31680);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                return new xb6.f(u.c(model3), null, null, 30);
            case 28:
                Throwable error11 = (Throwable) obj2;
                Map map = (Map) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (map == null) {
                    return error11;
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f302801a = i;
    }
}
