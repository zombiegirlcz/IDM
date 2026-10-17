package lnk;

import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.gallery_picker.PersonalisationGalleryTileModel;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.domain.models.topup.AutoTopUpState;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.a;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.ScreenerAllCollectionsRedesignContract$CollectionsPagerItem;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.page.ScreenerCollectionsPageContract$InputData;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.page.ScreenerCollectionsPageScreen;
import com.revolut.kompot.common.R$string;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetFieldDefinitions;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreenContract$ModalStep;
import ip0.zj;
import java.util.List;
import java.util.Optional;
import jsl.h0;
import jsl.j0;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lv4.s;
import lv6.q;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class o implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197308a;

    public /* synthetic */ o(int i) {
        this.f197308a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        switch (this.f197308a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new j((List) getDefaultErrorItems.invoke(new iii.d(12, null, false, true, null)), null, null, null);
            case 1:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof PersonalisationGalleryTileModel);
            case 2:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof lp0.c);
            case 3:
                ali.b PagerCoordinator = (ali.b) obj2;
                ScreenerAllCollectionsRedesignContract$CollectionsPagerItem pagerItem = (ScreenerAllCollectionsRedesignContract$CollectionsPagerItem) data;
                Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                Intrinsics.checkNotNullParameter(pagerItem, "pagerItem");
                return new ScreenerCollectionsPageScreen(new ScreenerCollectionsPageContract$InputData(pagerItem));
            case 4:
                Function1 getDefaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null));
            case 5:
                Throwable th10 = (Throwable) obj2;
                if (((CustomAssetFieldDefinitions) data) == null) {
                    return th10;
                }
                return null;
            case 6:
                Function1 defaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return new ls4.l((List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null)), new ls4.k(null, false));
            case 7:
                Throwable error = (Throwable) obj2;
                uzi.b bVar = (uzi.b) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (bVar == null) {
                    return error;
                }
                return null;
            case 8:
                Throwable error2 = (Throwable) obj2;
                Optional optional = (Optional) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (optional == null) {
                    return error2;
                }
                return null;
            case 9:
                Throwable error3 = (Throwable) obj2;
                tsl.f fVar = (tsl.f) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (fVar == null) {
                    return error3;
                }
                return null;
            case 10:
                Throwable th11 = (Throwable) obj2;
                if (((tsl.a) data) == null) {
                    return th11;
                }
                return null;
            case 11:
                Throwable th12 = (Throwable) obj2;
                if (((tsl.a) data) == null) {
                    return th12;
                }
                return null;
            case 12:
                Function1 getDefaultErrorItems3 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new j0(h0.f178214a, (List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null)));
            case 13:
                Function1 getDefaultErrorItems4 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new lt7.k(null, null, null, (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null)), false);
            case 14:
                Function1 getDefaultErrorItems5 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, true, null));
            case 15:
                Throwable error4 = (Throwable) obj2;
                InvestOrderReviewScreenContract$ModalStep.ScheduleSettings scheduleSettings = (InvestOrderReviewScreenContract$ModalStep.ScheduleSettings) data;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (scheduleSettings == null) {
                    return error4;
                }
                return null;
            case 16:
                vl4.g old2 = (vl4.g) obj2;
                vl4.g gVar = (vl4.g) data;
                Intrinsics.checkNotNullParameter(old2, "old");
                Intrinsics.checkNotNullParameter(gVar, "new");
                return Boolean.valueOf(Intrinsics.f(old2.f290260s, gVar.f290260s) && old2.i.equals(gVar.i));
            case 17:
                vl4.g old3 = (vl4.g) obj2;
                vl4.g gVar2 = (vl4.g) data;
                Intrinsics.checkNotNullParameter(old3, "old");
                Intrinsics.checkNotNullParameter(gVar2, "new");
                return Boolean.valueOf(Intrinsics.f(old3.f290249b, gVar2.f290249b) && Intrinsics.f(old3.f290250c, gVar2.f290250c) && Intrinsics.f(old3.d, gVar2.d));
            case 18:
                Function1 errorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(errorItems, "errorItems");
                return new s(null, (List) errorItems.invoke(new iii.d(14, null, true, false, null)));
            case 19:
                Function1 getDefaultErrorItems6 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return new q((List) getDefaultErrorItems6.invoke(new iii.d(12, null, true, true, null)), a.C0488a.f73750a);
            case 20:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("FINANCIALS_ERROR_LIST_ID", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31684);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return u.c(model);
            case 21:
                Function1 getDefaultErrorItems7 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return (List) getDefaultErrorItems7.invoke(new iii.d(14, null, true, false, null));
            case 22:
                Data featureData = (Data) obj2;
                Data optInData = (Data) data;
                Intrinsics.checkNotNullParameter(featureData, "featureData");
                Intrinsics.checkNotNullParameter(optInData, "optInData");
                return new Pair(featureData, optInData);
            case 23:
                Function1 getDefaultErrorItems8 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems8, "getDefaultErrorItems");
                return (List) getDefaultErrorItems8.invoke(new iii.d(14, null, true, false, null));
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 25:
                Throwable error5 = (Throwable) obj2;
                Boolean bool = (Boolean) data;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (bool == null) {
                    return error5;
                }
                return null;
            case 26:
                Throwable error6 = (Throwable) obj2;
                AutoTopUpState autoTopUpState = (AutoTopUpState) data;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (autoTopUpState == null) {
                    return error6;
                }
                return null;
            case 27:
                Throwable error7 = (Throwable) obj2;
                fo3.c cVar = (fo3.c) data;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (cVar == null) {
                    return error7;
                }
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            default:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_error_something_went_wrong, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                int i = R$drawable.uikit_icn_24_retry;
                Integer numValueOf = Integer.valueOf(R$attr.uikit_colorAccent);
                Float fValueOf = Float.valueOf(16.0f);
                return yp0.b.g(u.c(new RowDelegate.Model("ID_PASS_ACTIVITY_ERROR_ITEM", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_lounges, new Color.Solid(R$attr.uikit_colorGreyTone50), new Color.Solid(R$attr.uikit_colorGreyTone10)), null, null, false, null, false, 62), textLocalisedClause, null, 0, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new ImageClause(i, numValueOf, fValueOf, fValueOf, 16), new TextLocalisedClause(R.string.common_action_try_again, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10))), null, null, 0, null, true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)), lxi.f.a(), null, 0, 0, 126);
        }
    }

    public /* synthetic */ o(Object obj2, int i) {
        this.f197308a = i;
    }
}
