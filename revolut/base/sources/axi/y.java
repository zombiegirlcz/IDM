package axi;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorParams;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.airportlounges.impl.R$plurals;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreenContract$ErrorDialogPayload;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.e0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.y0;
import qvi.b;
import svi.i0;
import svi.o0;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends gim.i implements Function2 {
    public com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f10980w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c f10981x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f10981x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        y yVar = new y(this.f10981x, continuation);
        yVar.f10980w = obj2;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((qvi.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ServerErrorParams serverErrorParams;
        Object objI2;
        svi.y passType;
        TextLocalisedQuantityClause textLocalisedQuantityClause;
        y0 y0Var;
        com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c cVar = this.f10981x;
        fxi.c cVar2 = cVar.f99055p;
        cli.y yVar = cVar.D;
        qvi.b bVar = (qvi.b) this.f10980w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        int i2 = 12;
        if (i == 0) {
            yhm.o.b(obj2);
            if (Intrinsics.f(bVar, b.a.f249708a)) {
                cVar.H2(yVar, new ax9.a(11));
            } else if (Intrinsics.f(bVar, b.C1368b.f249709a)) {
                cVar.H2(yVar, new ax9.a(i2));
                this.f10980w = null;
                this.u = cVar;
                this.v = 1;
                objI2 = com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c.I2(cVar, this);
                if (objI2 == aVar) {
                    return aVar;
                }
            } else {
                if (!(bVar instanceof qvi.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar.H2(yVar, new ax9.a(13));
                qvi.a aVar2 = (qvi.a) bVar;
                if (aVar2.f249706a) {
                    cVar2.getClass();
                    cVar.X1(new y0(null, new e0((Clause) new TextLocalisedClause(R$string.offline_widget_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.offline_widget_description, null, null, 14), new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), (Parcelable) null, false, (AnalyticsProduct) null, 1012), false, 5));
                } else {
                    ServerError serverErrorA = cVar2.f138825a.a(aVar2.f249707b);
                    Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
                    dj0.d dVar = (serverErrorA == null || (serverErrorParams = serverErrorA.f51364c) == null) ? null : serverErrorParams.f51370a;
                    yji.l.a1(cVar, cVar.X1((numValueOf == null || numValueOf.intValue() != 1006 || dVar == null) ? new y0(null, new nii.z(new TextLocalisedClause(R$string.common_error_title, null, null, 14), null, new TextLocalisedClause(R$string.common_action_retry, null, null, 14), null, null, AirportLoungePassCheckoutScreenContract$ErrorDialogPayload.GenericError.f99044a, false, null, null, null, null, null, null, 32630), false, 5) : new y0(null, new nii.z(new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_checkout_insufficient_balance_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_checkout_insufficient_balance_dialog_description, zhm.u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_checkout_insufficient_balance_dialog_button_primary, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_checkout_insufficient_balance_dialog_button_secondary, null, null, 14), null, new AirportLoungePassCheckoutScreenContract$ErrorDialogPayload.InsufficientBalance(dVar), false, null, null, null, null, null, null, 32596), false, 5)), null, null, new com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.b(cVar, null), 3);
                }
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cVar = this.u;
        yhm.o.b(obj2);
        objI2 = obj2;
        com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c cVar3 = cVar;
        Pair pair = (Pair) objI2;
        fxi.c cVar4 = cVar3.f99055p;
        cli.y yVar2 = cVar3.D;
        if (cVar3.o.f99048c) {
            int i3 = ((l) ((j2) yVar2.f22677a).getValue()).f10951a;
            cVar4.getClass();
            y0Var = new y0(null, new j0((Clause) new TextLocalisedQuantityClause(R$plurals.airport_lounges_checkout_success_bottom_sheet_title, Integer.valueOf(i3), (List) null, (Style) null, 28), (Clause) new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_checkout_success_bottom_sheet_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_checkout_success_bottom_sheet_action, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076), false, 5);
        } else {
            j2 j2Var = (j2) yVar2.f22677a;
            j2 j2Var2 = (j2) yVar2.f22677a;
            o0 o0Var = (o0) ((l) j2Var.getValue()).k.getContent();
            if (o0Var == null || (passType = o0Var.f265959c) == null) {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "AirportLoungePassCheckoutScreenModel", "Can't show success dialog: pass type is unavailable", null, h0Var);
                return Unit.f186387a;
            }
            int i5 = ((l) j2Var2.getValue()).f10951a;
            i0 i0Var = (i0) ((l) j2Var2.getValue()).f10953c.getContent();
            dj0.d dVar2 = i0Var != null ? i0Var.f265922b.d : null;
            i0 i0Var2 = (i0) ((l) j2Var2.getValue()).f10953c.getContent();
            String str = i0Var2 != null ? i0Var2.f265922b.f265911c : null;
            cVar4.getClass();
            Intrinsics.checkNotNullParameter(passType, "passType");
            int i6 = fxi.b.f138824a[passType.ordinal()];
            if (i6 == 1 || i6 == 2) {
                textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.airport_lounges_checkout_success_purchased_entries, Integer.valueOf(i5), (List) null, (Style) null, 28);
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.airport_lounges_checkout_success_purchased_guest_entries, Integer.valueOf(i5), (List) null, (Style) null, 28);
            }
            y0Var = new y0(null, new j0((Clause) textLocalisedQuantityClause, (Clause) ((dVar2 == null || str == null) ? null : new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_checkout_success_saved, zhm.v.k(czi.b.a(dVar2, null, 7), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12)), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 5);
        }
        yji.l.a1(cVar3, cVar3.X1(y0Var), null, null, new z(cVar3, pair, null), 3);
        return Unit.f186387a;
    }
}
