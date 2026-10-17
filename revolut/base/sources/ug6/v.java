package ug6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import wf6.e0;
import xg6.x;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends me6.a {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final pe6.a f279968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final oe6.a f279969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f279970n;
    public final gte.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rh6.b f279971p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wj0.a f279972q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e0 f279973r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sri.m f279974s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qg6.f f279975t;
    public final x u;
    public final je6.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final u51.a f279976w;

    public v(pe6.a openBankingTopupResultMapper, oe6.a externalInstitutionsInteractor, e directLinkPayloadProcessor, gte.a featureToggleInteractor, rh6.b institutionAvailabilityStringProvider, wj0.a idempotencyKeyHolder, e0 openBankingDeeplinkResolver, sri.m navigator, qg6.f brazilPixMandateResultInteractor, x mandateInteractor, je6.e brazilPixMandateStatusDialogConfigFactory, u51.a topUpMethodsInteractor) {
        Intrinsics.checkNotNullParameter(openBankingTopupResultMapper, "openBankingTopupResultMapper");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(directLinkPayloadProcessor, "directLinkPayloadProcessor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(institutionAvailabilityStringProvider, "institutionAvailabilityStringProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(openBankingDeeplinkResolver, "openBankingDeeplinkResolver");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(brazilPixMandateResultInteractor, "brazilPixMandateResultInteractor");
        Intrinsics.checkNotNullParameter(mandateInteractor, "mandateInteractor");
        Intrinsics.checkNotNullParameter(brazilPixMandateStatusDialogConfigFactory, "brazilPixMandateStatusDialogConfigFactory");
        Intrinsics.checkNotNullParameter(topUpMethodsInteractor, "topUpMethodsInteractor");
        this.f279968l = openBankingTopupResultMapper;
        this.f279969m = externalInstitutionsInteractor;
        this.f279970n = directLinkPayloadProcessor;
        this.o = featureToggleInteractor;
        this.f279971p = institutionAvailabilityStringProvider;
        this.f279972q = idempotencyKeyHolder;
        this.f279973r = openBankingDeeplinkResolver;
        this.f279974s = navigator;
        this.f279975t = brazilPixMandateResultInteractor;
        this.u = mandateInteractor;
        this.v = brazilPixMandateStatusDialogConfigFactory;
        this.f279976w = topUpMethodsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum Z2(ug6.v r5, java.lang.String r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof ug6.i
            if (r0 == 0) goto L13
            r0 = r7
            ug6.i r0 = (ug6.i) r0
            int r1 = r0.f279953x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f279953x = r1
            goto L18
        L13:
            ug6.i r0 = new ug6.i
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f279953x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L4d
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r7)
            if (r6 != 0) goto L38
            goto L6f
        L38:
            oe6.a r5 = r5.f279969m
            w4l.h r7 = w4l.h.f294642c
            xg6.j r5 = (xg6.j) r5
            efm.r r5 = r5.c(r6, r7)
            r0.u = r6
            r0.f279953x = r3
            java.lang.Object r7 = nim.a.e(r5, r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution r7 = (com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution) r7
            if (r7 != 0) goto L66
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r7 = "No institution found for stored method top-up by id "
            java.lang.String r6 = j6.a.q(r7, r6)
            r5.<init>(r6)
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            rd0.d.a(r7, r4, r4, r5, r6)
            r7 = r4
        L66:
            if (r7 == 0) goto L6f
            io3.o r5 = r7.f66110g
            if (r5 == 0) goto L6f
            io3.n r5 = r5.f163167a
            return r5
        L6f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ug6.v.Z2(ug6.v, java.lang.String, gim.c):java.lang.Enum");
    }

    public static final void b3(v vVar) {
        tji.f fVarQ2 = vVar.q2();
        ((nh6.a) vVar.f279968l).getClass();
        yji.n.j2(vVar, fVarQ2.d(new y0(null, new z(new TextLocalisedClause(R$string.external_institutions_topup_oauth_failure_title, null, null, 14), new TextLocalisedClause(R$string.external_institutions_topup_oauth_failure_description, null, null, 14), new TextLocalisedClause(R$string.open_banking_common_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5)), null, new u(vVar, null), 3);
    }

    public final void c3() {
        q2().d(new y0(null, new z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_error_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5));
    }

    public final void d3() {
        tji.f fVarQ2 = q2();
        ((nh6.a) this.f279968l).getClass();
        fVarQ2.d(new mii.k("ID_DIALOG_SUCCESSFUL_PAYMENT", new TextLocalisedClause(R$string.open_banking_topup_submitted_toast_title, null, null, 14), null, null, null, 28));
    }

    public final void e3() {
        tji.f fVarQ2 = q2();
        ((nh6.a) this.f279968l).getClass();
        fVarQ2.d(new y0(null, new g0(new TextLocalisedClause(R$string.external_institutions_topup_progress_title, null, null, 14), new TextLocalisedClause(R$string.external_institutions_topup_progress_description, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380), false, 5));
    }

    public final void f3() {
        tji.f fVarQ2 = q2();
        this.f279971p.getClass();
        fVarQ2.d(new y0(null, new z(new TextLocalisedClause(R$string.india_core_topup_upi_selection_app_not_installed, null, null, 14), new TextLocalisedClause(R$string.india_core_topup_upi_selection_app_not_installed_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.dialog_balances_hide_button_primary, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5));
    }
}
