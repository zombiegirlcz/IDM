package uw2;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.card_add_to_googlepay.impl.R$string;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationScreenContract$InputData;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends oki.h implements i {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f283527t = TimeUnit.SECONDS.toMillis(5);
    public final GooglePayMultipleOtpVerificationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l93.f f283528p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c70.a f283529q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r70.c f283530r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f283531s;

    public g(cli.n stateMapper, GooglePayMultipleOtpVerificationScreenContract$InputData inputData, l93.f revolutCardsInteractor, c70.a clipboard, r70.c hapticEngine, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f283528p = revolutCardsInteractor;
        this.f283529q = clipboard;
        this.f283530r = hapticEngine;
        this.f283531s = mra.d.b(this, new j(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(uw2.g r5, gim.c r6) {
        /*
            l93.f r0 = r5.f283528p
            boolean r1 = r6 instanceof uw2.f
            if (r1 == 0) goto L15
            r1 = r6
            uw2.f r1 = (uw2.f) r1
            int r2 = r1.f283526w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f283526w = r2
            goto L1a
        L15:
            uw2.f r1 = new uw2.f
            r1.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f283526w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            ufm.b r6 = l93.f.e(r0)
            r1.f283526w = r4
            java.lang.Object r6 = nim.a.b(r6, r1)
            if (r6 != r2) goto L41
            return r2
        L41:
            java.util.List r6 = (java.util.List) r6
            kotlin.jvm.internal.Intrinsics.h(r6)
            cli.y r1 = r5.f283531s
            boolean r2 = r6.isEmpty()
            uw2.k$a r3 = uw2.k.a.f283536a
            if (r2 == 0) goto L5b
            ha3.x r0 = (ha3.x) r0
            z6l.s r6 = r0.f
            r6.e()
            r5.C2(r3)
            goto L8e
        L5b:
            java.lang.Object r2 = r1.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            uw2.j r2 = (uw2.j) r2
            com.revolut.data.model.Data r2 = r2.f283535a
            java.lang.Object r2 = r2.getContent()
            java.util.List r2 = (java.util.List) r2
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 == 0) goto L84
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L79
            goto L84
        L79:
            eh1.d r0 = new eh1.d
            r3 = 11
            r0.<init>(r2, r3, r6)
            r5.H2(r1, r0)
            goto L8e
        L84:
            ha3.x r0 = (ha3.x) r0
            z6l.s r6 = r0.f
            r6.e()
            r5.C2(r3)
        L8e:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uw2.g.I2(uw2.g, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new uea.e(this, null, 29), new yi5.b(26));
    }

    public final void J2(String str) {
        this.f283529q.a(null, str, false);
        if (c70.a.g()) {
            return;
        }
        r70.c.b(this.f283530r, 3);
        X1(new mii.k("TOAST_DIALOG_ID", new TextLocalisedClause(R$string.google_pay_verification_toast_title, null, null, 14), null, null, null, 28));
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new eh1.g(7, f283527t, this, null), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f283531s;
    }
}
