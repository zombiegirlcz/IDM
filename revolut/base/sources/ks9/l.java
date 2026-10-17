package ks9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends yji.n implements d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wr9.e f189341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gte.a f189342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jt0.b f189343n;
    public final pak.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f189344p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mq9.f f189345q;

    public l(wr9.e memberDialogMapper, gte.a featureToggleInteractor, jt0.b groupsDebtsInteractor, pak.h groupSettingsInteractor, i settlingExtension, mq9.f paymentsGroupsInteractor) {
        Intrinsics.checkNotNullParameter(memberDialogMapper, "memberDialogMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(groupsDebtsInteractor, "groupsDebtsInteractor");
        Intrinsics.checkNotNullParameter(groupSettingsInteractor, "groupSettingsInteractor");
        Intrinsics.checkNotNullParameter(settlingExtension, "settlingExtension");
        Intrinsics.checkNotNullParameter(paymentsGroupsInteractor, "paymentsGroupsInteractor");
        this.f189341l = memberDialogMapper;
        this.f189342m = featureToggleInteractor;
        this.f189343n = groupsDebtsInteractor;
        this.o = groupSettingsInteractor;
        this.f189344p = settlingExtension;
        this.f189345q = paymentsGroupsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(ks9.l r9, com.revolut.feature.payments.groups.api.models.PaymentGroup r10, gim.c r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof ks9.k
            if (r0 == 0) goto L16
            r0 = r11
            ks9.k r0 = (ks9.k) r0
            int r1 = r0.f189337x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f189337x = r1
            goto L1b
        L16:
            ks9.k r0 = new ks9.k
            r0.<init>(r9, r11)
        L1b:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f189337x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.revolut.feature.payments.groups.api.models.PaymentGroup r10 = r0.u
            yhm.o.b(r11)
            goto L44
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            yhm.o.b(r11)
            pak.h r11 = r9.o
            r0.u = r10
            r0.f189337x = r3
            java.io.Serializable r11 = r11.b(r0)
            if (r11 != r1) goto L44
            return r1
        L44:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = zhm.w.t(r11, r1)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L55:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r11.next()
            xi0.b r1 = (xi0.b) r1
            java.lang.String r1 = r1.f306286a
            r0.add(r1)
            goto L55
        L67:
            java.util.Set r11 = zhm.d0.i1(r0)
            com.revolut.retail.feature.balance.picker.api.models.SupportedTargetCurrencies$Unordered r4 = new com.revolut.retail.feature.balance.picker.api.models.SupportedTargetCurrencies$Unordered
            r4.<init>(r11)
            l1j.c r11 = new l1j.c
            com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserInputData r0 = new com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserInputData
            k1j.d r1 = k1j.d.RETAIL
            com.revolut.feature.payments.groups.models.GroupSettings r2 = r10.f79290j
            xi0.b r3 = r2.f79507b
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.payments.groups.api.R$string.group_change_currency_picker_disclaimer
            r5 = 14
            r6 = 0
            r7.<init>(r2, r6, r6, r5)
            r8 = 18
            r2 = 0
            r5 = 0
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.<init>(r0)
            com.revolut.kompot.navigable.vc.ViewController r11 = r9.o2(r11)
            kp0.q r0 = new kp0.q
            r1 = 7
            r0.<init>(r9, r10, r1)
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_FADE r10 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_FADE.f98307a
            r9.N2(r11, r10, r0)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ks9.l.Z2(ks9.l, com.revolut.feature.payments.groups.api.models.PaymentGroup, gim.c):java.lang.Object");
    }
}
