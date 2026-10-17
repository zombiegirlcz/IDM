package com.revolut.feature.topup_screen.impl.mcy.account_verification;

import aw0.f4;
import b94.p;
import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import gul.n;
import gzg.a0;
import h0f.e;
import h0f.g;
import h0f.i;
import h0f.j;
import h0f.k;
import h0f.l;
import h0f.m;
import h0f.o;
import h0f.q;
import h0f.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import tnb.g0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends h implements g {

    @NotNull
    public static final q Companion = new q();
    public final McyTopupAccountVerificationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d3j.b f91071p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vte.a f91072q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j0f.a f91073r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j0f.b f91074s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g0 f91075t;
    public final y u;

    public c(McyTopupAccountVerificationScreenContract$InputData inputData, d3j.b beneficiaryInteractor, vte.a topUpInteractor, j0f.a accountNumberValidator, j0f.b ifscValidator, g0 indiaStoredMethodDetailInteractor, o stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(topUpInteractor, "topUpInteractor");
        Intrinsics.checkNotNullParameter(accountNumberValidator, "accountNumberValidator");
        Intrinsics.checkNotNullParameter(ifscValidator, "ifscValidator");
        Intrinsics.checkNotNullParameter(indiaStoredMethodDetailInteractor, "indiaStoredMethodDetailInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f91071p = beneficiaryInteractor;
        this.f91072q = topUpInteractor;
        this.f91073r = accountNumberValidator;
        this.f91074s = ifscValidator;
        this.f91075t = indiaStoredMethodDetailInteractor;
        this.u = d.b(this, new e(inputData.getF91069b(), 15), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.topup_screen.impl.mcy.account_verification.c r5, com.revolut.feature.topup_screen.impl.mcy.account_verification.McyTopupAccountVerificationScreenContract$InputData.FromDeeplink r6, gim.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof com.revolut.feature.topup_screen.impl.mcy.account_verification.b
            if (r0 == 0) goto L13
            r0 = r7
            com.revolut.feature.topup_screen.impl.mcy.account_verification.b r0 = (com.revolut.feature.topup_screen.impl.mcy.account_verification.b) r0
            int r1 = r0.f91070w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91070w = r1
            goto L18
        L13:
            com.revolut.feature.topup_screen.impl.mcy.account_verification.b r0 = new com.revolut.feature.topup_screen.impl.mcy.account_verification.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f91070w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L4e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            tnb.g0 r7 = r5.f91075t
            java.lang.String r6 = r6.f91065a
            r0.f91070w = r3
            java.lang.Object r7 = r7.f272384b
            cve.c r7 = (cve.c) r7
            cve.b r2 = new cve.b
            r3 = 0
            r4 = 0
            r2.<init>(r7, r6, r4, r3)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r6, r2, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            yte.e r7 = (yte.e) r7
            cli.y r6 = r5.u
            gvi.s r0 = new gvi.s
            r1 = 9
            r0.<init>(r5, r7, r1)
            r5.H2(r6, r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.mcy.account_verification.c.I2(com.revolut.feature.topup_screen.impl.mcy.account_verification.c, com.revolut.feature.topup_screen.impl.mcy.account_verification.McyTopupAccountVerificationScreenContract$InputData$FromDeeplink, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new r(this, null, 0), new yi5.b(26));
    }

    public final void J2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof k;
        y yVar = this.u;
        if (z) {
            final InputTextDelegate.TextData textData = ((k) event).f148393a;
            String str = textData.f52597a;
            if (Intrinsics.f(str, "LIST_ID_INPUT_ACCOUNT_NUMBER")) {
                final int i = 0;
                H2(yVar, new Function1(this) { // from class: h0f.p

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.revolut.feature.topup_screen.impl.mcy.account_verification.c f148399b;

                    {
                        this.f148399b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i) {
                            case 0:
                                e update = (e) obj2;
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                return e.a(update, this.f148399b.f91073r.validate(textData.f52598b.toString()), null, null, null, 30);
                            default:
                                e update2 = (e) obj2;
                                Intrinsics.checkNotNullParameter(update2, "$this$update");
                                return e.a(update2, null, this.f148399b.f91074s.validate(textData.f52598b.toString()), null, null, 29);
                        }
                    }
                });
                return;
            } else {
                if (Intrinsics.f(str, "LIST_ID_INPUT_IFSC_CODE")) {
                    final int i2 = 1;
                    H2(yVar, new Function1(this) { // from class: h0f.p

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.revolut.feature.topup_screen.impl.mcy.account_verification.c f148399b;

                        {
                            this.f148399b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i2) {
                                case 0:
                                    e update = (e) obj2;
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    return e.a(update, this.f148399b.f91073r.validate(textData.f52598b.toString()), null, null, null, 30);
                                default:
                                    e update2 = (e) obj2;
                                    Intrinsics.checkNotNullParameter(update2, "$this$update");
                                    return e.a(update2, null, this.f148399b.f91074s.validate(textData.f52598b.toString()), null, null, 29);
                            }
                        }
                    });
                    return;
                }
                return;
            }
        }
        if (event instanceof h0f.h) {
            f4 f4Var = ((h0f.h) event).f148390a;
            if (f4Var.f10304b) {
                H2(yVar, new p(f4Var, 4));
                return;
            }
            return;
        }
        Continuation continuation = null;
        if (event.equals(l.f148394a)) {
            l2(new r(this, continuation, 1), new yi5.b(26));
        } else if (event.equals(j.f148392a)) {
            B2();
        } else {
            if (!event.equals(i.f148391a)) {
                throw new NoWhenBranchMatchedException();
            }
            C1(new SharedHelpDestination((SharedHelpDestination.InputData) null, 3));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.u.B(new a0(8)), new g6f.l(continuation, this, 21)), null, new n(this, continuation, 12), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
