package lk6;

import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ljl.n1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends oki.h implements q {

    @NotNull
    public static final s Companion = new s();
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a f196230p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sf0.h f196231q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ogm.i f196232r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wj6.m f196233s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final hk6.k f196234t;
    public final cli.y u;

    public b0(cli.n stateMapper, j inputData, com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a openBankingBrazilInteractor, sf0.h serverErrorParser, ogm.i brazilOpenBankingErrorParser, wj6.m updatedLimitRelay, hk6.k updatedExpiryDateRelay) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(openBankingBrazilInteractor, "openBankingBrazilInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(brazilOpenBankingErrorParser, "brazilOpenBankingErrorParser");
        Intrinsics.checkNotNullParameter(updatedLimitRelay, "updatedLimitRelay");
        Intrinsics.checkNotNullParameter(updatedExpiryDateRelay, "updatedExpiryDateRelay");
        this.o = inputData;
        this.f196230p = openBankingBrazilInteractor;
        this.f196231q = serverErrorParser;
        this.f196232r = brazilOpenBankingErrorParser;
        this.f196233s = updatedLimitRelay;
        this.f196234t = updatedExpiryDateRelay;
        this.u = mra.d.b(this, new i(new Data(null, null, true, 3, null), null, null, null, null, null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(lk6.b0 r14, gim.c r15) {
        /*
            com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a r0 = r14.f196230p
            boolean r1 = r15 instanceof lk6.t
            if (r1 == 0) goto L15
            r1 = r15
            lk6.t r1 = (lk6.t) r1
            int r2 = r1.f196266x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f196266x = r2
            goto L1a
        L15:
            lk6.t r1 = new lk6.t
            r1.<init>(r14, r15)
        L1a:
            java.lang.Object r15 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f196266x
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L3e
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            lk6.b0 r0 = r1.u
            yhm.o.b(r15)
            goto La1
        L30:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L38:
            lk6.b0 r0 = r1.u
            yhm.o.b(r15)
            goto L74
        L3e:
            yhm.o.b(r15)
            lk6.j r15 = r14.o
            com.revolut.feature.external_accounts.api.model.brazil.payment_confirmation.BrazilPaymentConsentInput r15 = r15.f196246a
            boolean r3 = r15 instanceof com.revolut.feature.external_accounts.api.model.brazil.payment_confirmation.BrazilPaymentConsentInput.Regular
            if (r3 == 0) goto L79
            com.revolut.feature.external_accounts.api.model.brazil.payment_confirmation.BrazilPaymentConsentInput$Regular r15 = (com.revolut.feature.external_accounts.api.model.brazil.payment_confirmation.BrazilPaymentConsentInput.Regular) r15
            java.lang.String r9 = r15.f72235a
            java.lang.String r10 = r15.f72236b
            java.lang.String r11 = r15.f72237c
            java.lang.String r12 = r15.d
            r1.u = r14
            r1.f196266x = r5
            com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.b r0 = (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.b) r0
            lf6.a r15 = r0.f72410a
            r8 = r15
            lf6.j r8 = (lf6.j) r8
            r8.getClass()
            a41.j1 r7 = new a41.j1
            r13 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            vkm.v1 r15 = new vkm.v1
            r15.<init>(r7)
            kotlinx.coroutines.flow.Flow r15 = com.google.crypto.tink.shaded.protobuf.t1.E(r15)
            if (r15 != r2) goto L73
            goto L9f
        L73:
            r0 = r14
        L74:
            kotlinx.coroutines.flow.Flow r15 = (kotlinx.coroutines.flow.Flow) r15
        L76:
            r8 = r15
            r7 = r0
            goto La4
        L79:
            boolean r3 = r15 instanceof com.revolut.feature.external_accounts.api.model.brazil.payment_confirmation.BrazilPaymentConsentInput.Handoff
            if (r3 == 0) goto Lb8
            com.revolut.feature.external_accounts.api.model.brazil.payment_confirmation.BrazilPaymentConsentInput$Handoff r15 = (com.revolut.feature.external_accounts.api.model.brazil.payment_confirmation.BrazilPaymentConsentInput.Handoff) r15
            java.lang.String r15 = r15.f72234a
            r1.u = r14
            r1.f196266x = r4
            com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.b r0 = (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.b) r0
            lf6.a r0 = r0.f72410a
            lf6.j r0 = (lf6.j) r0
            r0.getClass()
            lb0.b0 r1 = new lb0.b0
            r3 = 7
            r1.<init>(r0, r15, r6, r3)
            vkm.v1 r15 = new vkm.v1
            r15.<init>(r1)
            kotlinx.coroutines.flow.Flow r15 = com.google.crypto.tink.shaded.protobuf.t1.E(r15)
            if (r15 != r2) goto La0
        L9f:
            return r2
        La0:
            r0 = r14
        La1:
            kotlinx.coroutines.flow.Flow r15 = (kotlinx.coroutines.flow.Flow) r15
            goto L76
        La4:
            le8.d r9 = new le8.d
            r15 = 11
            r9.<init>(r14, r6, r15)
            lk6.u r11 = new lk6.u
            r11.<init>(r14, r6)
            r12 = 2
            r10 = 0
            yji.l.a1(r7, r8, r9, r10, r11, r12)
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        Lb8:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: lk6.b0.I2(lk6.b0, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new kze.h(this, continuation, 23), new yi5.b(26));
        yji.l.a1(this, c8g.c.c(vkm.q.Q(new g48.r(mo3.a.g(this.u.B(new n1(5)), null, null, 3), 27), new k25.o(continuation, this, 11)), new lk4.g(this, 2)), null, null, new w(this, null), 3);
        yji.l.a1(this, this.f196233s.f297972b, null, null, new a0(this, null), 3);
        yji.l.a1(this, this.f196234t.f152860b, null, null, new y(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
