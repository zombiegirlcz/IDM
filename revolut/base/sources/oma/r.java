package oma;

import android.os.SystemClock;
import au0.j4;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.EmailVerificationFlowContract$State;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferBridgeFeatureConfig;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.sso.api.phone.change.RevolutSsoChangePhoneFlowDestination;
import com.revolut.ui.push.PushEventTrackerService;
import ip0.tm0;
import ip0.um0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ozc.g0;
import ozc.s0;
import pyc.c0;
import pyc.h0;
import qc0.y0;
import qza.b0;
import rp0.k1;
import rp0.y;
import vkm.j2;
import wim.z;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f226804b;

    public /* synthetic */ r(Object obj2, int i) {
        this.f226803a = i;
        this.f226804b = obj2;
    }

    @Override // kfm.a
    public final void run() {
        String strI;
        Object value;
        switch (this.f226803a) {
            case 0:
                s sVar = (s) this.f226804b;
                ln.a aVar = sVar.f226805b;
                ((jma.i) sVar.f226806c).getClass();
                aVar.a(vhi.c.c(new RevolutSsoChangePhoneFlowDestination(new RevolutSsoChangePhoneFlowDestination.InputData(cjl.o.DIALOG)), yhi.b.SOLID, null, false, 12));
                return;
            case 1:
                ooa.b bVar = (ooa.b) ((ooa.d) this.f226804b).f227022c;
                bVar.f227016b.getValue(bVar, ooa.b.d[0]).set(Boolean.TRUE);
                return;
            case 2:
                oyc.c cVar = (oyc.c) this.f226804b;
                cVar.f230939b.remove("MEMORY_CACHE_INCOME_SOURCES_KEY");
                cVar.f230939b.remove("MEMORY_CACHE_SUBMISSIONS_STATE_KEY");
                return;
            case 3:
                te0.e eVarA0 = ((s0) ((ozc.t) ((g0) this.f226804b).f231270j).f231329b).A0();
                Intrinsics.checkNotNullParameter(eVarA0, "<this>");
                od0.i.Companion.getClass();
                eVarA0.set(od0.i.f224256b);
                return;
            case 4:
                com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c cVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c) this.f226804b;
                EmailVerificationFlowContract$State emailVerificationFlowContract$State = cVar2.z;
                cVar2.f67631q.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                emailVerificationFlowContract$State.getClass();
                cVar2.z = new EmailVerificationFlowContract$State(jElapsedRealtime);
                return;
            case 5:
                ((pae.g) this.f226804b).f234547a.onNext(new FinishCommand(null, null, null, 7));
                return;
            case 6:
                pc7.e eVar = (pc7.e) this.f226804b;
                eVar.f234827a.b(new fc7.d(zj2.a.a(eVar.f234829c, com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE), 1)));
                return;
            case 7:
                pjg.p pVar = (pjg.p) this.f226804b;
                opi.d dVar = pVar.f236769m;
                xig.b bVar2 = pVar.f236772q;
                TrustedMerchant.Approved merchant = pVar.f236771p.f94439a;
                ((fjg.a) bVar2).getClass();
                Intrinsics.checkNotNullParameter(merchant, "merchant");
                String str = null;
                ((opi.b) dVar).Z(new y(u.c(new um0("REMOVE_TRUSTED_MERCHANT_BUTTON_ID", new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.trusted_merchants_decline_dialog_confirm_button, null, null, 14), false, null, str, 56), new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.trusted_merchants_decline_dialog_cancel_button, null, null, 14), false, str, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016)), new rp0.t(new TextLocalisedClause(R$string.trusted_merchants_decline_dialog_title, u.c(merchant.f94406c), null, 12), new TextLocalisedClause(R$string.trusted_merchants_decline_dialog_description, null, null, 14), null, 28), null, null, null, null, "TRUSTED_MERCHANT_DETAILS_DELEGATES_KEY", null, null, null, 3836));
                return;
            case 8:
                pri.g gVar = (pri.g) this.f226804b;
                synchronized (gVar.f239037a) {
                    gVar.f239037a.remove("LAUNCH_JUNIOR_CARD_ORDER");
                    Unit unit = Unit.f186387a;
                }
                return;
            case 9:
                px7.i iVar = (px7.i) this.f226804b;
                KProperty[] kPropertyArr = px7.i.d;
                iVar.f240580b.getValue(iVar, px7.i.d[0]).set(px7.i.e);
                return;
            case 10:
                pyb.s sVar2 = (pyb.s) this.f226804b;
                sVar2.f240752c.a();
                sVar2.d.a();
                return;
            case 11:
                pyc.t tVar = (pyc.t) ((c0) this.f226804b).f240757j;
                String note = (String) ((h0) tVar.f240799b).A0().get();
                Intrinsics.checkNotNullParameter(note, "note");
                ((h0) tVar.f240799b).D0().set(note);
                return;
            case 12:
                ((pyc.g0) this.f226804b).f248734a.onNext(u0.f(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true)));
                return;
            case 13:
                ((q81.d) this.f226804b).a();
                return;
            case 14:
                y0 y0Var = (y0) this.f226804b;
                j4 j4Var = j4.FROM_CLICKED_BUTTON;
                e0m.e.b(((rpi.b) y0Var.f244507q).f256387h, true);
                ((xpi.c) y0Var.f244508r).N(j4Var);
                return;
            case 15:
                qhc.b bVar3 = (qhc.b) this.f226804b;
                bVar3.f246601c.clear();
                bVar3.f246600b.clear();
                return;
            case 16:
                ((qi3.n) this.f226804b).f246650b.onNext(new FinishCommand(0, null, null, 6));
                return;
            case 17:
                ((qse.i) this.f226804b).f.h(Unit.f186387a);
                return;
            case 18:
                PushEventTrackerService pushEventTrackerService = (PushEventTrackerService) this.f226804b;
                PushEventTrackerService.Companion aVar2 = PushEventTrackerService.INSTANCE;
                pushEventTrackerService.stopSelf();
                return;
            case 19:
                ((b0) ((qza.k) this.f226804b).f250465c).x0().set(qza.h.ERROR);
                return;
            case 20:
                rx7.n nVar = (rx7.n) this.f226804b;
                KProperty[] kPropertyArr2 = rx7.n.f258078g;
                te0.j jVar = nVar.f258081b;
                KProperty[] kPropertyArr3 = rx7.n.f258078g;
                jVar.getValue(nVar, kPropertyArr3[0]).set(rx7.n.f258079h);
                nVar.f258082c.getValue(nVar, kPropertyArr3[1]).set(rx7.n.i);
                nVar.d.getValue(nVar, kPropertyArr3[2]).set(rx7.n.f258080j);
                nVar.e.getValue(nVar, kPropertyArr3[3]).set(Boolean.FALSE);
                return;
            case 21:
                ((k1) ((s9b.p) this.f226804b).f261165q).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "ID_DEFAULT_PROFILE_DIALOG_SUCCESS", new TextLocalisedClause(com.revolut.feature.retail.global_accounts.impl.R$string.user_country_profiles_country_profiles_manage_screen_banner_title, null, null, 14), null, null, null, 60));
                return;
            case 22:
                byte[] bArr = (byte[]) ((Map) this.f226804b).get(155);
                if (bArr != null) {
                    byte[] bArr2 = bArr.length != 0 ? bArr : null;
                    if (bArr2 == null || (strI = jli.g.i(bArr2)) == null) {
                        return;
                    }
                    String hexString = Integer.toHexString(155);
                    Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
                    ea1.b.a("EMV finalization plain tag [" + hexString + "] = " + strI, fa1.k.ERROR);
                    return;
                }
                return;
            case 23:
                ((sc7.j) this.f226804b).f261658a.b(new FeatureCommand(new TransferBridgeFeatureConfig.ChatTransfer(false)));
                return;
            case 24:
                ((sce.e) this.f226804b).e.f261515b.onNext(Unit.f186387a);
                return;
            case 25:
                ((sl3.b) this.f226804b).f264098b.G(Boolean.FALSE, "contacts_permission", z.d(o0.b(Boolean.TYPE)));
                return;
            case 26:
                ((sl3.k) this.f226804b).f264118j.onNext(Unit.f186387a);
                return;
            case 27:
                j2 j2Var = ((sp5.j) this.f226804b).f264900n.f308115a;
                do {
                    value = j2Var.getValue();
                } while (!j2Var.h(value, null));
                return;
            case 28:
                ((twj.f) this.f226804b).f275039c.I0("WORKFLOW_STEP_ID");
                return;
            default:
                tx7.c cVar3 = (tx7.c) this.f226804b;
                KProperty[] kPropertyArr4 = tx7.c.d;
                cVar3.f275341b.getValue(cVar3, tx7.c.d[0]).set(tx7.c.e);
                return;
        }
    }
}
