package dee;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.common.TravelHotelsRoomsSelectionScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.amenities_filter.TravelHotelsRoomAmenitiesFilterScreen;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import dej.t1;
import dkb.j;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113400a;

    public /* synthetic */ a0(int i) {
        this.f113400a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f113400a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new r((List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)));
            case 1:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelHotelsRoomsSelectionScreenContract$ModalStep step = (TravelHotelsRoomsSelectionScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof TravelHotelsRoomsSelectionScreenContract$ModalStep.Amenities) {
                    return new TravelHotelsRoomAmenitiesFilterScreen();
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                Throwable error = (Throwable) obj2;
                EsimProfile esimProfile = (EsimProfile) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (esimProfile == null) {
                    return error;
                }
                return null;
            case 3:
                Throwable error2 = (Throwable) obj2;
                dej.a0 a0Var = (dej.a0) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (a0Var == null) {
                    return error2;
                }
                return null;
            case 4:
                Throwable error3 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list == null) {
                    return error3;
                }
                return null;
            case 5:
                Throwable error4 = (Throwable) obj2;
                t1 t1Var = (t1) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (t1Var == null) {
                    return error4;
                }
                return null;
            case 6:
                Throwable error5 = (Throwable) obj2;
                EsimProfile esimProfile2 = (EsimProfile) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (esimProfile2 == null) {
                    return error5;
                }
                return null;
            case 7:
                Throwable th10 = (Throwable) obj2;
                if (((Map) obj3) == null) {
                    return th10;
                }
                return null;
            case 8:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                int i = R$string.refinancing_account_details_home_title;
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, zhm.u.c(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                return new dh4.l(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textLocalisedClause, null, (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)), false);
            case 9:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null));
            case 10:
                ((Boolean) obj2).booleanValue();
                return zhm.f0.f322471a;
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 12:
                Throwable error6 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list2 == null) {
                    return error6;
                }
                return null;
            case 13:
                Throwable error7 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list3 == null) {
                    return error7;
                }
                return null;
            case 14:
                Throwable error8 = (Throwable) obj2;
                ec5.c cVar = (ec5.c) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (cVar == null) {
                    return error8;
                }
                return null;
            case 15:
                Throwable error9 = (Throwable) obj2;
                th8.a aVar = (th8.a) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (aVar == null) {
                    return error9;
                }
                return null;
            case 16:
                Throwable error10 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list4 == null) {
                    return error10;
                }
                return null;
            case 17:
                Throwable error11 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (iVar == null) {
                    return error11;
                }
                return null;
            case 18:
                Throwable error12 = (Throwable) obj2;
                od0.i iVar2 = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (iVar2 == null) {
                    return error12;
                }
                return null;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new djc.t(djc.k.f115307a, iii.c.b(null, null, 6, true), false);
            case 20:
                Throwable error13 = (Throwable) obj2;
                dj0.d dVar = (dj0.d) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (dVar == null) {
                    return error13;
                }
                return null;
            case 21:
                Throwable error14 = (Throwable) obj2;
                List list5 = (List) obj3;
                Intrinsics.checkNotNullParameter(error14, "error");
                if (list5 == null) {
                    return error14;
                }
                return null;
            case 22:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new dk9.s(null, (List) getDefaultErrorItems4.invoke(new iii.d(12, null, false, true, null)));
            case 23:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                j.a aVar2 = dkb.j.Companion;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new dkb.g((List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, true, null)), false);
            case 24:
                Throwable error15 = (Throwable) obj2;
                od0.i iVar3 = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error15, "error");
                if (iVar3 == null) {
                    return error15;
                }
                return null;
            case 25:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                List list6 = (List) getDefaultErrorItems6.invoke(ynj.h.f315483a);
                yp0.b.k(list6, 0, 0, 0, 0, 31);
                return list6;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 27:
                Throwable error16 = (Throwable) obj2;
                qha.a aVar3 = (qha.a) obj3;
                Intrinsics.checkNotNullParameter(error16, "error");
                if (aVar3 == null) {
                    return error16;
                }
                return null;
            case 28:
                Throwable th11 = (Throwable) obj2;
                if (((PricingPlanSubscription) obj3) == null) {
                    return th11;
                }
                return null;
            default:
                Function1 getDefaultErrorItems7 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return getDefaultErrorItems7.invoke(new iii.d(12, null, false, true, null));
        }
    }
}
