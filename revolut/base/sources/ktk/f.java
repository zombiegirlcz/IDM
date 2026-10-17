package ktk;

import ael.d0;
import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.corporate_events.navigation.CorporateEventDetailsDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.r;
import grl.k9;
import java.time.LocalDate;
import jtk.k;
import jtk.m;
import jtk.o;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import nii.l0;
import nii.y0;
import phl.j;
import te0.w;
import tfm.n4;
import ufm.i;
import vkm.q;
import w4l.h;
import y7k.g0;
import yji.n;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends jtk.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jtk.d f189566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o f189567m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f189568n;
    public final vki.a o;

    public f(jtk.d inputData, o warningGroupProvider, k dialogMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(warningGroupProvider, "warningGroupProvider");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.f189566l = inputData;
        this.f189567m = warningGroupProvider;
        this.f189568n = dialogMapper;
        this.o = pyd.c.a(this, null);
    }

    @Override // yji.n
    public final void H2() {
        String instrumentRef = this.f189566l.f178527a;
        o oVar = this.f189567m;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(instrumentRef, "ref");
        n4 n4VarE = new i(((ael.k) oVar.f178543b).e(instrumentRef), new jof.a(25, new jt2.d(4)), 1).x().replay(1).e();
        Intrinsics.checkNotNullExpressionValue(n4VarE, "refCount(...)");
        d0 d0Var = oVar.f178542a;
        Intrinsics.checkNotNullParameter(instrumentRef, "ref");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vdl.o oVar2 = (vdl.o) d0Var.f3605b;
        oVar2.getClass();
        Intrinsics.checkNotNullParameter(instrumentRef, "ref");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vkm.d dVarB = oVar2.f288021q.b(instrumentRef, loadingStrategy);
        g gVar = g.f186406a;
        n4 n4VarE2 = rd0.e.c(dVarB, gVar).distinctUntilChanged().replay(1).e();
        Intrinsics.checkNotNullExpressionValue(n4VarE2, "refCount(...)");
        r rVarA = d0Var.a(instrumentRef, false);
        yhl.b bVar = oVar.f178544c;
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        LocalDate localDateW = oi0.d.W(bVar.d.a());
        LocalDate localDateMinusYears = localDateW.minusYears(1L);
        LocalDate localDatePlusYears = localDateW.plusYears(1L);
        j jVar = bVar.f314170a;
        jVar.getClass();
        h loadingStrategy2 = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
        Continuation continuation = null;
        r map = w.o(n4VarE, rVarA, n4VarE2, rd0.e.c(boh.f.e(nim.a.v(u0.m(rd0.e.b(jVar.f.e(new phl.a(instrumentRef, localDateMinusYears, localDatePlusYears, false, null, null, null), loadingStrategy2)), nim.a.v(new olf.e(((phl.f) bVar.f314171b).f236348a.f(new tk0.e("wealth_corporate_event_closed_banner_keys")), 15), new phc.e(14))), new g0(bVar, localDateW, 27)), new yed.g0(bVar, 12)), gVar), rd0.e.c(q.R(boh.f.e(boh.f.e(rd0.e.b(n4VarE), new m(oVar, 1)), new m(oVar, 2)), new hr4.b(3, 5, continuation)), gVar)).map(new jof.a(26, new m(oVar, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        n.l2(this, rd0.e.b(map), null, new krc.h(this, continuation, 7), 3);
    }

    @Override // jtk.b
    public final void Z2(String eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        T2(new kq5.d(this, eventId, null, 11), new yi5.b(27));
    }

    @Override // jtk.b
    public final void b3(kp3.a assetCorporateEvent) {
        Intrinsics.checkNotNullParameter(assetCorporateEvent, "assetCorporateEvent");
        A2(new CorporateEventDetailsDestination(assetCorporateEvent.f188164a.b(), false, false));
    }

    @Override // jtk.b
    public final void c3(String instrumentName) {
        Intrinsics.checkNotNullParameter(instrumentName, "instrumentName");
        this.f189568n.getClass();
        Intrinsics.checkNotNullParameter(instrumentName, "instrumentName");
        L2(new y0("warning_group_dialog_high_yield_bond", new l0(new TextLocalisedClause(R$string.wealth_details_banner_high_yield_bond_dialog_title, null, null, 14), new TextLocalisedClause(R$string.wealth_details_banner_high_yield_bond_dialog_description, u.c(instrumentName), null, 12), null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, false, null, 1012), false, 4));
    }

    @Override // jtk.b
    public final void d3(jtk.g warningReason) {
        Intrinsics.checkNotNullParameter(warningReason, "warningReason");
        k kVar = this.f189568n;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(warningReason, "warningReason");
        m4h.b bVar = kVar.f178537a;
        g3h.a aVar = warningReason.f178532a;
        nel.n nVar = warningReason.f178533b;
        lw0.a aVar2 = new lw0.a(bVar.c(aVar, nVar, null), bVar.a(warningReason.f178532a, nVar), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        n.P2(this, new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.o;
    }
}
