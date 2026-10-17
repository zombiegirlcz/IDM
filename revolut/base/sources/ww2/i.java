package ww2;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.single.GooglePayOtpVerificationScreenContract$InputData;
import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import ha3.x;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ww2.l;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends oki.h implements j {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f300578t = TimeUnit.SECONDS.toMillis(5);
    public final l93.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ha3.f f300579p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c70.a f300580q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r70.c f300581r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f300582s;

    public i(cli.n stateMapper, GooglePayOtpVerificationScreenContract$InputData inputData, l93.f revolutCardsInteractor, ha3.f cardsConfigInteractor, c90.c uiResources, c70.a clipboard, r70.c hapticEngine) {
        o5l.g gVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(cardsConfigInteractor, "cardsConfigInteractor");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        this.o = revolutCardsInteractor;
        this.f300579p = cardsConfigInteractor;
        this.f300580q = clipboard;
        this.f300581r = hapticEngine;
        Data data = new Data(null, null, true, 3, null);
        RevolutCardOtp revolutCardOtp = inputData.f64504a;
        Data data2 = new Data(null, null, true, 3, null);
        int i = e.f300575a[uiResources.a().ordinal()];
        if (i == 1) {
            gVar = o5l.g.MDPI;
        } else if (i == 2) {
            gVar = o5l.g.HDPI;
        } else if (i == 3) {
            gVar = o5l.g.XHDPI;
        } else if (i == 4) {
            gVar = o5l.g.XXHDPI;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = o5l.g.XXXHDPI;
        }
        this.f300582s = mra.d.b(this, new k(data, revolutCardOtp, data2, gVar), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(ww2.i r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof ww2.h
            if (r0 == 0) goto L13
            r0 = r5
            ww2.h r0 = (ww2.h) r0
            int r1 = r0.f300577w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f300577w = r1
            goto L18
        L13:
            ww2.h r0 = new ww2.h
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f300577w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            l93.f r4 = r4.o
            ufm.b r4 = l93.f.e(r4)
            r0.f300577w = r3
            java.lang.Object r5 = nim.a.b(r4, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ww2.i.I2(ww2.i, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new g(this, null, 0), new wma.e(1, this, i.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 2));
    }

    public final void J2() {
        ((x) this.o).f.e();
        C2(l.a.f300586a);
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new eh1.g(11, f300578t, this, null), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f300582s;
    }
}
