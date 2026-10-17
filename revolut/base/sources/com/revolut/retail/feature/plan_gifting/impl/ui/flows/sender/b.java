package com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender;

import ack.e;
import ack.f;
import android.os.Parcelable;
import cck.c;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.plan_gifting.impl.R$string;
import com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.PlanGiftingSenderFlowContract$Step;
import eck.l;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.y0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import r10.t;
import rp0.k1;
import tbk.d;
import wp5.y;
import yki.i;
import z9h.n;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements ack.b {

    @NotNull
    public static final ack.h Companion = new ack.h();
    public final i A;
    public final cl3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f102489p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f102490q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f102491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tbk.h f102492s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t1j.b f102493t;
    public final qbk.b u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f102494w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zjh.i f102495x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k1 f102496y;
    public final String z;

    public b(i90.b uuidUtils, cl3.a contactsInteractor, c dialogMapper, l statusMapper, t planGiftingReceiversInteractor, tbk.h planGiftingSenderInteractor, t1j.b giftingEligibilityInteractor, qbk.b eligibilityErrorDialogProvider, e inputData, d initialBirthdaySharingRequestedInteractor, zjh.i birthdaySharingEnabledProvider, k1 shotDialogDisplayer) {
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(statusMapper, "statusMapper");
        Intrinsics.checkNotNullParameter(planGiftingReceiversInteractor, "planGiftingReceiversInteractor");
        Intrinsics.checkNotNullParameter(planGiftingSenderInteractor, "planGiftingSenderInteractor");
        Intrinsics.checkNotNullParameter(giftingEligibilityInteractor, "giftingEligibilityInteractor");
        Intrinsics.checkNotNullParameter(eligibilityErrorDialogProvider, "eligibilityErrorDialogProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(initialBirthdaySharingRequestedInteractor, "initialBirthdaySharingRequestedInteractor");
        Intrinsics.checkNotNullParameter(birthdaySharingEnabledProvider, "birthdaySharingEnabledProvider");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        this.o = contactsInteractor;
        this.f102489p = dialogMapper;
        this.f102490q = statusMapper;
        this.f102491r = planGiftingReceiversInteractor;
        this.f102492s = planGiftingSenderInteractor;
        this.f102493t = giftingEligibilityInteractor;
        this.u = eligibilityErrorDialogProvider;
        this.v = inputData;
        this.f102494w = initialBirthdaySharingRequestedInteractor;
        this.f102495x = birthdaySharingEnabledProvider;
        this.f102496y = shotDialogDisplayer;
        this.z = y.u(uuidUtils, "toString(...)");
        this.A = d8l.d.a(this, new f(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof ack.j
            if (r0 == 0) goto L13
            r0 = r5
            ack.j r0 = (ack.j) r0
            int r1 = r0.f3172w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3172w = r1
            goto L18
        L13:
            ack.j r0 = new ack.j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f3172w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L55
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            r10.t r4 = r4.f102491r
            r4.getClass()
            akg.n r4 = r10.t.j(r4)
            jcj.n r5 = new jcj.n
            r2 = 13
            r5.<init>(r2)
            akg.n r4 = nim.a.v(r4, r5)
            r5 = 3
            r2 = 0
            jhi.b r4 = mo3.a.g(r4, r2, r2, r5)
            r0.f3172w = r3
            java.lang.Object r5 = vkm.q.z(r4, r0)
            if (r5 != r1) goto L55
            return r1
        L55:
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L62
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L60
            goto L62
        L60:
            r4 = 0
            goto L63
        L62:
            r4 = r3
        L63:
            r4 = r4 ^ r3
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b.I2(com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b, gim.c):java.lang.Object");
    }

    public static final void J2(b bVar, boolean z) {
        bVar.f102490q.getClass();
        yji.l.a1(bVar, bVar.X1(new y0(null, z ? new j0((Clause) new TextLocalisedClause(R$string.premium_birthday_sharing_success_dialog_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.premium_birthday_sharing_success_dialog_friends_birthdays_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(R$string.premium_birthday_sharing_success_dialog_friends_birthdays_action, null, null, 14), null), true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4044) : new j0((Clause) new TextLocalisedClause(R$string.premium_birthday_sharing_success_dialog_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.premium_birthday_sharing_success_dialog_notify_future_birthdays_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(R$string.premium_birthday_sharing_success_dialog_notify_future_birthdays_action, null, null, 14), null), true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4044), false, 5)), null, null, new a07.d(bVar, null, 16), 3);
    }

    public final void K2(boolean z) {
        h.t2(this, this.A, new PlanGiftingSenderFlowContract$Step.SelectContact(this.v.f3166a), z, null, false, 12);
    }

    @Override // yki.j
    public final void M0() {
        e eVar = this.v;
        if (eVar instanceof ack.d) {
            h.u2(this, this.A, new PlanGiftingSenderFlowContract$Step.SendGift(((ack.d) eVar).f3164b, eVar.f3166a), null, 6);
            return;
        }
        Intrinsics.i(eVar, "null cannot be cast to non-null type com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.PlanGiftingSenderFlowContract.InputData.Default");
        ack.c cVar = (ack.c) eVar;
        if (!((Boolean) n.h(Boolean.TYPE, this.f102494w.f269554a.f296243a, "INITIAL_BIRTHDAY_SHARING_REQUESTED_KEY", Boolean.FALSE)).booleanValue() || cVar.f3162b == kbk.a.FORCE_SHOW) {
            l2(new a(this, null), new yi5.b(26));
        } else {
            K2(true);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.A;
    }
}
