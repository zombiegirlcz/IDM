package eh1;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.add_card_to_google_pay_shared.impl.R$string;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationScreenContract$InputData;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends oki.h implements k {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f125687t = TimeUnit.SECONDS.toMillis(5);
    public final GooglePayMultipleOtpVerificationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k7i.i f125688p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c70.a f125689q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r70.c f125690r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f125691s;

    public i(cli.n stateMapper, GooglePayMultipleOtpVerificationScreenContract$InputData inputData, k7i.i sharedCardsInteractor, c70.a clipboard, r70.c hapticEngine) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sharedCardsInteractor, "sharedCardsInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        this.o = inputData;
        this.f125688p = sharedCardsInteractor;
        this.f125689q = clipboard;
        this.f125690r = hapticEngine;
        this.f125691s = mra.d.b(this, new l(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(eh1.i r5, gim.c r6) {
        /*
            k7i.i r0 = r5.f125688p
            boolean r1 = r6 instanceof eh1.h
            if (r1 == 0) goto L15
            r1 = r6
            eh1.h r1 = (eh1.h) r1
            int r2 = r1.f125686w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f125686w = r2
            goto L1a
        L15:
            eh1.h r1 = new eh1.h
            r1.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f125686w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.Object r6 = r0.f182069b
            l93.f r6 = (l93.f) r6
            ufm.b r6 = l93.f.e(r6)
            r1.f125686w = r4
            java.lang.Object r6 = nim.a.b(r6, r1)
            if (r6 != r2) goto L45
            return r2
        L45:
            java.util.List r6 = (java.util.List) r6
            kotlin.jvm.internal.Intrinsics.h(r6)
            cli.y r1 = r5.f125691s
            boolean r2 = r6.isEmpty()
            eh1.m$a r3 = eh1.m.a.f125696a
            if (r2 == 0) goto L63
            java.lang.Object r6 = r0.f182069b
            l93.f r6 = (l93.f) r6
            ha3.x r6 = (ha3.x) r6
            z6l.s r6 = r6.f
            r6.e()
            r5.C2(r3)
            goto L99
        L63:
            java.lang.Object r2 = r1.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            eh1.l r2 = (eh1.l) r2
            com.revolut.data.model.Data r2 = r2.f125695a
            java.lang.Object r2 = r2.getContent()
            java.util.List r2 = (java.util.List) r2
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 == 0) goto L8b
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L81
            goto L8b
        L81:
            eh1.d r0 = new eh1.d
            r3 = 0
            r0.<init>(r2, r3, r6)
            r5.H2(r1, r0)
            goto L99
        L8b:
            java.lang.Object r6 = r0.f182069b
            l93.f r6 = (l93.f) r6
            ha3.x r6 = (ha3.x) r6
            z6l.s r6 = r6.f
            r6.e()
            r5.C2(r3)
        L99:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: eh1.i.I2(eh1.i, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new ec8.c(this, null, 8), new yi5.b(26));
    }

    public final void J2(String str) {
        this.f125689q.a(null, str, false);
        if (c70.a.g()) {
            return;
        }
        r70.c.b(this.f125690r, 3);
        X1(new mii.k("TOAST_DIALOG_ID", new TextLocalisedClause(R$string.google_pay_verification_toast_title, null, null, 14), null, null, null, 28));
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new g(0, f125687t, this, null), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f125691s;
    }
}
