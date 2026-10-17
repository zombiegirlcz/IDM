package gp3;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.corporate_events.impl.ui.screen.details.CorporateEventDetailsContract$Step;
import com.revolut.feature.retail.corporate_events.common.delegates.widget.mappers.content.EventContentMapper$EventInfoDialogContent;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.models.NoActiveTravelException;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145240a;

    public /* synthetic */ n(int i) {
        this.f145240a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        List listC;
        switch (this.f145240a) {
            case 0:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CorporateEventDetailsContract$Step step = (CorporateEventDetailsContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof CorporateEventDetailsContract$Step.EventInfoDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                EventContentMapper$EventInfoDialogContent eventContentMapper$EventInfoDialogContent = ((CorporateEventDetailsContract$Step.EventInfoDialog) step).f66123a;
                lw0.a aVar = new lw0.a(eventContentMapper$EventInfoDialogContent.f82634a, eventContentMapper$EventInfoDialogContent.f82635b, null, null, false, 28);
                k9 k9Var = k9.Trading;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 4:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new gpb.m(gpb.j.f145418a, (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)));
            case 5:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new gpd.d((List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, false, null)));
            case 6:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                List list = (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
                gq4.f fVar = gq4.f.f145547a;
                return new gq4.l(list, fVar, fVar);
            case 7:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, false, false, null));
            case 8:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new gqd.k((List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, false, null)), gqd.g.f145683a);
            case 9:
                Throwable error = (Throwable) obj2;
                l35.e eVar = (l35.e) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (eVar == null) {
                    return error;
                }
                return null;
            case 10:
                Throwable error2 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list2 == null) {
                    return error2;
                }
                return null;
            case 11:
                Throwable error3 = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (pair == null) {
                    return error3;
                }
                return null;
            case 12:
                Throwable error4 = (Throwable) obj2;
                Pair pair2 = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (pair2 == null) {
                    return error4;
                }
                return null;
            case 13:
                Throwable error5 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (iVar == null) {
                    return error5;
                }
                return null;
            case 14:
                Throwable error6 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list3 == null) {
                    return error6;
                }
                return null;
            case 15:
                Throwable error7 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list4 == null) {
                    return error7;
                }
                return null;
            case 16:
                Throwable error8 = (Throwable) obj2;
                he3.a aVar2 = (he3.a) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (aVar2 == null) {
                    return error8;
                }
                return null;
            case 17:
                Throwable error9 = (Throwable) obj2;
                Set set = (Set) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (set == null) {
                    return error9;
                }
                return null;
            case 18:
                Throwable error10 = (Throwable) obj2;
                List list5 = (List) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list5 == null) {
                    return error10;
                }
                return null;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 25:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                if (((Throwable) obj2) instanceof NoActiveTravelException) {
                    listC = u.c(new FullScreenStateDelegate.Model("EMPTY_TRAVEL_ID", new TextLocalisedClause(R$string.analytics_travel_mode_empty_title, null, null, 14), null, new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_travel, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 52, 52, 31), (Clause) null, 190)), new l6(8, new TextLocalisedClause(R$string.analytics_travel_mode_empty_cta, null, null, 14), null, h4.ACCENT), null, false, null, null, null, 2020));
                    yp0.b.k(listC, 0, 0, 0, 0, 31);
                } else {
                    listC = (List) getDefaultErrorItems6.invoke(new iii.d(12, null, true, true, null));
                }
                return new gtd.h(listC, gtd.d.f146581a);
            case 26:
                Throwable th10 = (Throwable) obj2;
                if (((yhm.r) obj3) == null) {
                    return th10;
                }
                return null;
            case 27:
                if (((Boolean) obj2).booleanValue()) {
                    return hu8.a.b();
                }
                return null;
            case 28:
                if (((Boolean) obj2).booleanValue()) {
                    return hu8.a.b();
                }
                return null;
            default:
                Throwable error11 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (bool == null) {
                    return error11;
                }
                return null;
        }
    }

    public /* synthetic */ n(Object obj2, int i) {
        this.f145240a = i;
    }
}
