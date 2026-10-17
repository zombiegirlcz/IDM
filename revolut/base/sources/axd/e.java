package axd;

import android.os.Parcelable;
import aw0.n6;
import axi.q;
import aye.i;
import aye.l;
import b47.j;
import b5e.k;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.impl.ui.trophy_room.bottom_sheet.RevPointsTrophyRoomBottomSheetScreen;
import com.revolut.feature.rev_points.impl.ui.trophy_room.bottom_sheet.RevPointsTrophyRoomBottomSheetScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.trophy_room.home.RevPointsTrophyRoomHomeScreenContract$ModalStep;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.a;
import grl.k9;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n33.p;
import nel.n;
import x2h.b;
import zhm.f0;
import zzb.o;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10929a;

    public /* synthetic */ e(int i) {
        this.f10929a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f10929a) {
            case 0:
                d validate = (d) obj2;
                d it8 = (d) obj3;
                Intrinsics.checkNotNullParameter(validate, "$this$validate");
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(validate.R0().e(validate.f()));
            case 1:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new q((List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null)), null, a.C0604a.f99054a);
            case 2:
                Throwable error = (Throwable) obj2;
                lv3.a aVar = (lv3.a) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (aVar == null) {
                    return error;
                }
                return null;
            case 3:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return new l((List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null)), i.f11143a);
            case 4:
                Throwable error2 = (Throwable) obj2;
                zw7.c cVar = (zw7.c) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (cVar == null) {
                    return error2;
                }
                return null;
            case 5:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return o.a.f326657a;
            case 10:
                Function1 errorItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorItemsProvider, "errorItemsProvider");
                return (List) errorItemsProvider.invoke(new iii.d(12, null, true, true, null));
            case 11:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                RevPointsTrophyRoomHomeScreenContract$ModalStep modalStep = (RevPointsTrophyRoomHomeScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(modalStep, "modalStep");
                if (!Intrinsics.f(modalStep, RevPointsTrophyRoomHomeScreenContract$ModalStep.TotalSaved.f83923a)) {
                    if (modalStep instanceof RevPointsTrophyRoomHomeScreenContract$ModalStep.BottomSheet) {
                        return new RevPointsTrophyRoomBottomSheetScreen(new RevPointsTrophyRoomBottomSheetScreenContract$InputData(((RevPointsTrophyRoomHomeScreenContract$ModalStep.BottomSheet) modalStep).f83922a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.rev_points_trophy_room_info_bottom_sheet_title, null, null, 14), new TextLocalisedClause(R$string.rev_points_trophy_room_info_bottom_sheet_subtitle, null, null, 14), null, null, false, 28);
                aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.rev_points_trophy_room_info_bottom_sheet_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var = k9.RevPoints;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            case 12:
                Function1 getDefaultItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultItems, "getDefaultItems");
                return (List) getDefaultItems.invoke(new iii.d(12, null, true, true, null));
            case 13:
                Throwable error3 = (Throwable) obj2;
                p pVar = (p) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (pVar == null) {
                    return error3;
                }
                return null;
            case 14:
                Throwable error4 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list == null) {
                    return error4;
                }
                return null;
            case 15:
                Throwable error5 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list2 == null) {
                    return error5;
                }
                return null;
            case 16:
                Throwable error6 = (Throwable) obj2;
                n33.o oVar = (n33.o) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (oVar == null) {
                    return error6;
                }
                return null;
            case 17:
                Throwable error7 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (bool == null) {
                    return error7;
                }
                return null;
            case 18:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null));
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 20:
                Throwable error8 = (Throwable) obj2;
                CombinedWatchlistContext combinedWatchlistContext = (CombinedWatchlistContext) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (combinedWatchlistContext == null) {
                    return error8;
                }
                return null;
            case 21:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, false, true, null));
            case 22:
                Throwable error9 = (Throwable) obj2;
                n61.d dVar = (n61.d) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (dVar == null) {
                    return error9;
                }
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return j.a();
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 25:
                Throwable error10 = (Throwable) obj2;
                n nVar = (n) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (nVar == null) {
                    return error10;
                }
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return k.f12499a;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return b.C1676b.f302573a;
            case 28:
                Throwable error11 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (model == null) {
                    return error11;
                }
                return null;
            default:
                Throwable error12 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model2 = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (model2 == null) {
                    return error12;
                }
                return null;
        }
    }

    public /* synthetic */ e(cli.n nVar, int i) {
        this.f10929a = i;
    }
}
