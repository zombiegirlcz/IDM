package com.revolut.feature.external_accounts.impl.ui.link.penny_topup;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.network.exceptions.NetworkConnectException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.PennyTopUpFlowContract$Step;
import com.revolut.kompot.common.R$string;
import hg0.n;
import ke6.d0;
import kotlin.jvm.internal.Intrinsics;
import nii.e0;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import v60.e;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends h implements hn6.b {

    @NotNull
    public static final hn6.d Companion = new hn6.d();
    public final PennyTopUpFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r10.a f73041p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mn6.a f73042q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sf0.h f73043r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f73044s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d0 f73045t;
    public final oe6.a u;
    public final i v;

    public d(PennyTopUpFlowContract$InputData inputData, r10.a ibanScreenDataLoader, mn6.a pollingControllerExtension, sf0.h serverErrorParser, e serverErrorsProvider, d0 pennyVerificationDeeplinkParser, oe6.a externalInstitutionsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(ibanScreenDataLoader, "ibanScreenDataLoader");
        Intrinsics.checkNotNullParameter(pollingControllerExtension, "pollingControllerExtension");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(pennyVerificationDeeplinkParser, "pennyVerificationDeeplinkParser");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        this.o = inputData;
        this.f73041p = ibanScreenDataLoader;
        this.f73042q = pollingControllerExtension;
        this.f73043r = serverErrorParser;
        this.f73044s = serverErrorsProvider;
        this.f73045t = pennyVerificationDeeplinkParser;
        this.u = externalInstitutionsInteractor;
        this.v = d8l.d.a(this, new hfb.d(this, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.external_accounts.impl.ui.link.penny_topup.d r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof hn6.e
            if (r0 == 0) goto L13
            r0 = r6
            hn6.e r0 = (hn6.e) r0
            int r1 = r0.f154072w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f154072w = r1
            goto L18
        L13:
            hn6.e r0 = new hn6.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f154072w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L54
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            oe6.a r4 = r4.u
            w4l.h r6 = w4l.h.f294642c
            xg6.j r4 = (xg6.j) r4
            efm.r r4 = r4.c(r5, r6)
            efm.d0 r4 = r4.firstOrError()
            java.lang.String r5 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            zhm.h0 r5 = zhm.h0.f322473a
            ufm.f r4 = ue0.e.t(r4, r5)
            r0.f154072w = r3
            java.lang.Object r6 = nim.a.b(r4, r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.external_accounts.impl.ui.link.penny_topup.d.I2(com.revolut.feature.external_accounts.impl.ui.link.penny_topup.d, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.TextLocalisedClause J2(java.lang.Throwable r3) {
        /*
            r2 = this;
            sf0.h r0 = r2.f73043r
            com.revolut.core.error.data.model.ServerError r3 = r0.a(r3)
            v60.e r0 = r2.f73044s
            if (r3 == 0) goto L19
            int r3 = r3.f51362a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1 = r0
            ao0.a r1 = (ao0.a) r1
            v60.c r3 = r1.b(r3)
            if (r3 != 0) goto L23
        L19:
            ao0.a r0 = (ao0.a) r0
            r0.getClass()
            v60.b r3 = new v60.b
            r3.<init>()
        L23:
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = ofm.q.O(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.external_accounts.impl.ui.link.penny_topup.d.J2(java.lang.Throwable):com.revolut.core.ui_kit.models.TextLocalisedClause");
    }

    public final void K2() {
        i iVar = this.v;
        h.r2(iVar);
        h.t2(this, iVar, new PennyTopUpFlowContract$Step.Institutions(this.o.f73023b), false, null, false, 12);
    }

    @Override // yki.j
    public final void M0() {
        PennyTopUpFlowContract$InputData pennyTopUpFlowContract$InputData = this.o;
        String str = pennyTopUpFlowContract$InputData.f;
        if (str != null) {
            l2(new n(this, str, null, 13), new hm3.b(this, str, 7));
        } else {
            h.t2(this, this.v, new PennyTopUpFlowContract$Step.Institutions(pennyTopUpFlowContract$InputData.f73023b), false, null, false, 12);
        }
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        l.a1(this, X1(throwable instanceof NetworkConnectException ? new y0(null, new e0((Clause) new TextLocalisedClause(R$string.common_offline_state_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.common_offline_state_description, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), (Parcelable) null, false, (AnalyticsProduct) null, 1012), false, 5) : new y0("ERROR_STATUS_DIALOG_ID", new z(J2(throwable), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4)), null, null, null, 7);
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
