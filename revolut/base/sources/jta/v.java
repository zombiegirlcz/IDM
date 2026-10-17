package jta;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.raffle.impl.data.models.RaffleCampaign$ShareInfo;
import com.revolut.feature.raffle.impl.screen.raffle.RaffleScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import wli.x;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends oki.h implements j {

    @NotNull
    public static final q Companion = new q();
    public final zsa.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f178463p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h60.d f178464q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vh5.a f178465r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s70.a f178466s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f178467t;

    public v(cli.n stateMapper, RaffleScreenContract$InputData inputData, zsa.d raffleInteractor, x deeplinkHandler, h60.d animationControllerExtension, vh5.a cryptoPermissionModelExtension, s70.a intentProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(raffleInteractor, "raffleInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(animationControllerExtension, "animationControllerExtension");
        Intrinsics.checkNotNullParameter(cryptoPermissionModelExtension, "cryptoPermissionModelExtension");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.o = raffleInteractor;
        this.f178463p = deeplinkHandler;
        this.f178464q = animationControllerExtension;
        this.f178465r = cryptoPermissionModelExtension;
        this.f178466s = intentProvider;
        this.f178467t = mra.d.b(this, new e(new Data(null, null, false, 7, null), inputData.f81641a), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(jta.v r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof jta.u
            if (r0 == 0) goto L13
            r0 = r6
            jta.u r0 = (jta.u) r0
            int r1 = r0.f178462x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f178462x = r1
            goto L18
        L13:
            jta.u r0 = new jta.u
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f178462x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            wli.x r4 = r4.f178463p
            lg0.a r6 = lg0.a.OPEN_BROWSER
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.u = r5
            r0.f178462x = r3
            java.lang.Object r6 = r4.L1(r5, r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 != 0) goto L5f
            zhm.h0 r4 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            java.lang.String r0 = "Unable to handle deeplink "
            java.lang.String r5 = j6.a.q(r0, r5)
            r0 = 0
            java.lang.String r1 = "RaffleScreenModel"
            rd0.d.a(r6, r1, r5, r0, r4)
        L5f:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: jta.v.I2(jta.v, java.lang.String, gim.c):java.lang.Object");
    }

    public static y0 J2() {
        return new y0("RAFFLE_LOAD_ERROR_ID", new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4);
    }

    @Override // yji.l
    public final void I1() {
        String campaignId = ((e) ((j2) this.f178467t.f22677a).getValue()).f178440a;
        zsa.d dVar = this.o;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        cta.c cVar = dVar.f324860a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, c8g.c.d(new z75.f(cVar.d.b(campaignId, loadingStrategy), 22), new p(this, 0)), null, null, new jij.h(this, (Continuation) null, 27), 3);
    }

    public final void K2() {
        RaffleCampaign$ShareInfo raffleCampaign$ShareInfo;
        com.revolut.feature.raffle.impl.data.models.b bVar = (com.revolut.feature.raffle.impl.data.models.b) ((e) ((j2) this.f178467t.f22677a).getValue()).f178441b.getContent();
        if (bVar == null || (raffleCampaign$ShareInfo = bVar.f81634h) == null) {
            return;
        }
        C2(new h(raffleCampaign$ShareInfo));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f178467t;
    }
}
