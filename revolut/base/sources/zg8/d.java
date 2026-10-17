package zg8;

import a0e.r;
import aii.u;
import android.content.Intent;
import android.net.Uri;
import brc.m;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig;
import com.revolut.feature.backgroundpicker.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.profile.website.flow.a;
import com.revolut.feature.junior_graduation.api.navigation.IdentificationFlowPublicContract$OutputData;
import com.revolut.feature.junior_graduation.impl.ui.flow.identification.IdentificationFlowContract$Step;
import com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow.JuniorAccountDetailsFlowContract$Step;
import com.revolut.feature.junior_tasks.api.navigation.JuniorTasksEditDestination;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.ChallengesOverviewContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.ChallengesOverviewContract$Step;
import com.revolut.feature.pay_later.api.PayLaterApi$Toggles;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.feature.pay_later.api.navigation.RightToCancelDescriptor;
import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoRootFlowV2Contract$Step;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.common.transition.ZoomTarget;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import eq8.a0;
import eq8.v;
import eq8.w;
import eq8.x;
import eq8.y;
import gh8.e;
import gh8.f;
import gh8.g;
import gh8.h;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import mii.k;
import nii.y0;
import nii.z;
import vkm.j2;
import x07.c;
import yji.l;
import zfd.s;
import zh9.i;
import zh9.t;
import zh9.u0;
import zhm.d0;
import zhm.h0;
import zje.j;
import zq5.j0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d extends q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        u uVarB;
        boolean zEquals;
        int i = this.f;
        int i2 = 24;
        int i3 = 25;
        boolean z = false;
        int i5 = 14;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        int i6 = 26;
        Continuation continuation = null;
        switch (i) {
            case 0:
                h p0 = (h) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                com.revolut.feature.junior_graduation.impl.ui.flow.identification.a aVar = (com.revolut.feature.junior_graduation.impl.ui.flow.identification.a) this.receiver;
                yki.a aVar2 = aVar.f76931r;
                if (p0 instanceof g) {
                    yg8.c cVar = aVar.f76929p;
                    String otp = ((g) p0).f143885a;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(otp, "otp");
                    if (cVar.f313572a.a("com.revolut.junior")) {
                        Uri uri2 = ((f80.b) cVar.f313574c).f(j6.a.q("revolut-junior://app/graduation/2fa?code=", otp));
                        Intrinsics.checkNotNullParameter("android.intent.action.VIEW", "action");
                        Intrinsics.checkNotNullParameter(uri2, "uri");
                        uVarB = new ExternalDestination.ByIntent(new Intent("android.intent.action.VIEW", uri2), null);
                    } else {
                        uVarB = cVar.f313573b.b("com.revolut.junior", gh0.d.GOOGLE);
                    }
                    aVar.C1(uVarB);
                } else if (p0 instanceof f) {
                    oki.h.r2(aVar2);
                    oki.h.t2(aVar, aVar2, new IdentificationFlowContract$Step.GraduationNotAvailableYetScreen(((f) p0).f143884a), false, null, false, 12);
                } else {
                    if (!(p0 instanceof e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.C2(IdentificationFlowPublicContract$OutputData.Success.f76912a);
                }
                return Unit.f186387a;
            case 1:
                String p03 = (String) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                return Boolean.valueOf(((Set) this.receiver).contains(p03));
            case 2:
                j p010 = (j) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                com.revolut.feature.tab.crypto.impl.ui.v2.a aVar3 = (com.revolut.feature.tab.crypto.impl.ui.v2.a) this.receiver;
                oki.h.t2(aVar3, aVar3.f89816p, new TabCryptoRootFlowV2Contract$Step.AccountPicker(p010.f322796a, p010.f322797b), false, com.revolut.kompot.common.transition.a.d(TransitionAnimation.INSTANCE, new ZoomTarget.ViewId(R$id.uikit_accountSwitcherPagerIndicatorButton), new HomeOverlayConfig(true)), false, 10);
                return Unit.f186387a;
            case 3:
                i p011 = (i) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                zk9.c cVar2 = (zk9.c) this.receiver;
                cVar2.getClass();
                zh9.h hVar = p011.f;
                String str = hVar != null ? hVar.f322267a : null;
                return (((jte.d) cVar2.f).c(PayLaterApi$Toggles.PayLaterCancellation14Days.f78804c) && p011.f322284h && str != null) ? u0.f(new ControllerDestination.Stack(new RightToCancelDescriptor(str), null, true)) : new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) PayLaterKompotFeatureConfig.DeactivationNavigationDestination.f78824a, false, (Integer) null, 0, 61));
            case 4:
                NaviCommand p012 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                zk9.c cVar3 = (zk9.c) this.receiver;
                cVar3.getClass();
                pfm.h hVar2 = new pfm.h(new xza.a(cVar3, p012, 16), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2;
            case 5:
                Throwable p013 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                zm2.j jVar = (zm2.j) this.receiver;
                jVar.getClass();
                if (!(p013 instanceof ServerErrorException)) {
                    if (p013 instanceof IllegalStateException) {
                        jVar.I2();
                    }
                    return Boolean.valueOf(z);
                }
                if (((ServerErrorException) p013).f.f51362a == 11140) {
                    l.b1(jVar, jVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.image_cropper_upload_error_inappropriate_title, null, null, 14), new TextLocalisedClause(R$string.image_cropper_upload_error_inappropriate_subtitle, null, null, 14), new TextLocalisedClause(R$string.image_cropper_upload_error_inappropriate_cta, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5)), null, new s(jVar, continuation, i5), 3);
                } else {
                    jVar.I2();
                }
                z = true;
                return Boolean.valueOf(z);
            case 6:
                bo8.i p014 = (bo8.i) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow.a aVar4 = (com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow.a) this.receiver;
                yki.a aVar5 = aVar4.f77276r;
                if (p014 instanceof bo8.h) {
                    bo8.h hVar3 = (bo8.h) p014;
                    oki.h.w2(aVar5, new JuniorAccountDetailsFlowContract$Step.ReviewPaymentLinkConsent(hVar3.f17316a, hVar3.f17317b, hVar3.f17318c), bottom_dialog);
                } else if (p014 instanceof bo8.e) {
                    oki.h.t2(aVar4, aVar5, new JuniorAccountDetailsFlowContract$Step.CustomAmount(((bo8.e) p014).f17312a), false, null, false, 14);
                } else if (p014 instanceof bo8.f) {
                    aVar4.H2(aVar4.f77275q, new zmb.c(15));
                    aVar4.f77274p.getClass();
                    l.a1(aVar4, aVar4.X1(new k("DIALOG_ID_CUSTOM_LINK_CANCELED", new TextLocalisedClause(com.revolut.feature.junior_payment_links.impl.R$string.junior_payment_links_custom_amount_screen_shot_dialog_link_cancelled, null, null, 14), null, null, null, 28)), null, null, null, 7);
                } else {
                    if (!(p014 instanceof bo8.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.t2(aVar4, aVar5, new JuniorAccountDetailsFlowContract$Step.ParentAccountDetails(((bo8.g) p014).f17315a), false, null, false, 14);
                }
                return Unit.f186387a;
            case 7:
                ti8.f p015 = (ti8.f) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow.a aVar6 = (com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow.a) this.receiver;
                aVar6.getClass();
                if (Intrinsics.f(p015, ti8.d.f271447a)) {
                    l.a1(aVar6, aVar6.X1(new k("DIALOG_ID_PAYMENT_LINK_ENABLED", new TextLocalisedClause(com.revolut.feature.junior_settings.impl.R$string.youth_settings_enable_payment_links_sheet_toast_enabled, null, null, 14), null, null, null, 28)), null, null, null, 7);
                } else if (!Intrinsics.f(p015, ti8.e.f271448a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 8:
                a0 p016 = (a0) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b bVar = (com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b) this.receiver;
                bVar.getClass();
                ChallengesOverviewContract$InputData challengesOverviewContract$InputData = bVar.o;
                if (p016 instanceof eq8.u) {
                    bVar.C1(new JuniorTasksEditDestination(challengesOverviewContract$InputData.f77385a, null, 12));
                } else if (p016 instanceof x) {
                    oki.h.w2(bVar.f77400t, new ChallengesOverviewContract$Step.Details(((x) p016).f128406a), bottom_dialog);
                } else if (p016 instanceof v) {
                    bVar.l2(new zah.f(bVar, ((v) p016).f128404a, continuation, i2), new yi5.b(i6));
                } else if (p016 instanceof w) {
                    bVar.C1(new JuniorTasksEditDestination(challengesOverviewContract$InputData.f77385a, ((w) p016).f128405a, 12));
                } else if (p016 instanceof y) {
                    bVar.l2(new zah.f(bVar, zp8.c.f324188a, continuation, i3), new yi5.b(i6));
                } else {
                    if (!(p016 instanceof eq8.z)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.l2(new zah.f(bVar, new zp8.d(((eq8.z) p016).f128408a), continuation, i3), new yi5.b(i6));
                }
                return Unit.f186387a;
            case 9:
                cq8.k p017 = (cq8.k) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b bVar2 = (com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b) this.receiver;
                bVar2.getClass();
                if (p017 instanceof cq8.h) {
                    bVar2.l2(new zah.f(bVar2, ((cq8.h) p017).f108029a, continuation, i2), new yi5.b(i6));
                } else if (p017 instanceof cq8.i) {
                    bVar2.C1(new JuniorTasksEditDestination(bVar2.o.f77385a, ((cq8.i) p017).f108030a, 12));
                } else {
                    if (!(p017 instanceof cq8.j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2.l2(new zah.f(bVar2, new zp8.d(((cq8.j) p017).f108031a), continuation, i3), new yi5.b(i6));
                }
                return Unit.f186387a;
            case 10:
                hq8.k p018 = (hq8.k) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b bVar3 = (com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b) this.receiver;
                if (p018 instanceof hq8.i) {
                    bVar3.f77397q.c3(((hq8.i) p018).f154631a, true);
                } else {
                    bVar3.getClass();
                    if (!(p018 instanceof hq8.j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.w2(bVar3.f77400t, new ChallengesOverviewContract$Step.TaxesBreakdown(((hq8.j) p018).f154632a), bottom_dialog);
                }
                return Unit.f186387a;
            case 11:
                gq8.c p019 = (gq8.c) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b bVar4 = (com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b) this.receiver;
                if (p019 != null) {
                    oki.h.w2(bVar4.f77400t, new ChallengesOverviewContract$Step.GmfBreakdown(p019.f145594a), bottom_dialog);
                    return Unit.f186387a;
                }
                bVar4.getClass();
                throw new NoWhenBranchMatchedException();
            case 12:
                List sendRecipients = (List) obj2;
                Intrinsics.checkNotNullParameter(sendRecipients, "p0");
                j0 j0Var = (j0) this.receiver;
                j0Var.getClass();
                Intrinsics.checkNotNullParameter(sendRecipients, "sendRecipients");
                return d0.P0(sendRecipients, new oh3.e(new t(j0Var, 2), j0Var, 29));
            case 13:
                m p020 = (m) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.a aVar7 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.a) this.receiver;
                if (p020 instanceof m) {
                    aVar7.C2(zqc.g.f324453a);
                    return Unit.f186387a;
                }
                aVar7.getClass();
                throw new NoWhenBranchMatchedException();
            case 14:
                avj.f p021 = (avj.f) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a.I2((com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a) this.receiver, p021);
                return Unit.f186387a;
            case 15:
                avj.f p022 = (avj.f) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a.I2((com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a) this.receiver, p022);
                return Unit.f186387a;
            case 16:
                avj.f p023 = (avj.f) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a.I2((com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a) this.receiver, p023);
                return Unit.f186387a;
            case 17:
                String p024 = (String) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                ((ihm.b) this.receiver).onNext(p024);
                return Unit.f186387a;
            case 18:
                Throwable p025 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                return ((vyd.a) ((byd.a) this.receiver)).c(p025);
            case 19:
                com.revolut.feature.freelancer.impl.ui.profile.website.flow.a p026 = (com.revolut.feature.freelancer.impl.ui.profile.website.flow.a) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                com.revolut.feature.freelancer.impl.ui.profile.a aVar8 = (com.revolut.feature.freelancer.impl.ui.profile.a) this.receiver;
                aVar8.getClass();
                if (!Intrinsics.f(p026, a.C0493a.f74083a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar8.B2();
                return Unit.f186387a;
            case 20:
                x07.c p027 = (x07.c) obj2;
                Intrinsics.checkNotNullParameter(p027, "p0");
                com.revolut.feature.freelancer.impl.ui.profile.a aVar9 = (com.revolut.feature.freelancer.impl.ui.profile.a) this.receiver;
                aVar9.getClass();
                if (!Intrinsics.f(p027, c.a.f301525a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar9.B2();
                return Unit.f186387a;
            case 21:
                f0e.b p028 = (f0e.b) obj2;
                Intrinsics.checkNotNullParameter(p028, "p0");
                com.revolut.feature.statements.impl.ui.documents_hub.a aVar10 = (com.revolut.feature.statements.impl.ui.documents_hub.a) this.receiver;
                aVar10.getClass();
                String str2 = p028.f131106a;
                cli.y yVar = aVar10.A;
                String str3 = ((zzd.q) ((j2) yVar.f22677a).getValue()).f326690c;
                if (str3 == null) {
                    zEquals = false;
                } else {
                    DocumentsHubProduct.Companion companion = DocumentsHubProduct.INSTANCE;
                    zEquals = str2.equals(str3);
                }
                if (!zEquals) {
                    a0e.q qVar = (a0e.q) aVar10.f88365t;
                    qVar.f360t.setValue(null);
                    j2 j2Var = qVar.u;
                    r rVar = (r) j2Var.getValue();
                    if (rVar == null) {
                        rVar = qVar.v;
                    }
                    qVar.v = rVar;
                    j2Var.setValue(null);
                    aVar10.H2(yVar, new zzd.u(p028, 0));
                }
                return Unit.f186387a;
            case 22:
                Throwable p029 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p029, "p0");
                com.revolut.feature.topup_screen.impl.google_pay.flow.b bVar5 = (com.revolut.feature.topup_screen.impl.google_pay.flow.b) this.receiver;
                bVar5.getClass();
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, p029, h0Var);
                bVar5.C2(new ste.m(p029));
                return Boolean.TRUE;
            default:
                Throwable p030 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p030, "p0");
                com.revolut.feature.topup_screen.impl.google_pay.flow.b bVar6 = (com.revolut.feature.topup_screen.impl.google_pay.flow.b) this.receiver;
                bVar6.getClass();
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, p030, h0Var2);
                bVar6.C2(new ste.m(p030));
                return Boolean.TRUE;
        }
    }
}
