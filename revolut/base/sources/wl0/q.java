package wl0;

import android.content.Context;
import android.os.Handler;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.FragmentActivity;
import com.revolut.core.android.R$anim;
import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t70.x;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends FingerprintManagerCompat.AuthenticationCallback implements zl0.c {

    @NotNull
    public static final p Companion = new p();
    public static final Integer[] f = {1020, 1021, 1022};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f298360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f298361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vfg.p f298362c;
    public CancellationSignal d;
    public final x e;

    public q(a biometricCallback, f promptInfo, vfg.p cryptoObjectProvider) {
        Intrinsics.checkNotNullParameter(biometricCallback, "biometricCallback");
        Intrinsics.checkNotNullParameter(promptInfo, "promptInfo");
        Intrinsics.checkNotNullParameter(cryptoObjectProvider, "cryptoObjectProvider");
        this.f298360a = biometricCallback;
        this.f298361b = promptInfo;
        this.f298362c = cryptoObjectProvider;
        x xVar = new x(this, 27);
        this.e = xVar;
        promptInfo.d.postDelayed(xVar, 200L);
    }

    @Override // zl0.c
    public final rm0.j a(LoginFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return d(contextRequireContext);
    }

    @Override // zl0.c
    public final void b() {
        this.f298361b.d.removeCallbacks(this.e);
        CancellationSignal cancellationSignal = this.d;
        if (cancellationSignal != null) {
            try {
                cancellationSignal.cancel();
                Unit unit = Unit.f186387a;
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
        }
    }

    @Override // zl0.c
    public final rm0.j c(FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return d(activity);
    }

    public final rm0.j d(Context context) {
        rm0.i iVarA = this.f298362c.a();
        if (!(iVarA instanceof rm0.e)) {
            if (iVarA instanceof rm0.j) {
                return (rm0.j) iVarA;
            }
            throw new NoWhenBranchMatchedException();
        }
        try {
            FingerprintManagerCompat.CryptoObject cryptoObject = new FingerprintManagerCompat.CryptoObject((Cipher) ((rm0.e) iVarA).f255150a);
            this.d = new CancellationSignal();
            FingerprintManagerCompat fingerprintManagerCompatFrom = FingerprintManagerCompat.from(context);
            Intrinsics.checkNotNullExpressionValue(fingerprintManagerCompatFrom, "from(...)");
            fingerprintManagerCompatFrom.authenticate(cryptoObject, 0, this.d, this, (Handler) null);
            return rm0.d.f255149a;
        } catch (Throwable th10) {
            return new rm0.f(th10);
        }
    }

    public final void e(CharSequence charSequence) {
        f fVar = this.f298361b;
        fVar.d.removeCallbacks(this.e);
        TextView textView = fVar.d;
        textView.setText(charSequence);
        textView.startAnimation(AnimationUtils.loadAnimation(textView.getContext(), R$anim.shake));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wl0.a] */
    @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence errString) {
        Intrinsics.checkNotNullParameter(errString, "errString");
        CancellationSignal cancellationSignal = this.d;
        if (cancellationSignal != null ? cancellationSignal.isCanceled() : false) {
            return;
        }
        ?? r06 = this.f298360a;
        if (i != 5) {
            f fVar = this.f298361b;
            if (i == 7 || i == 9) {
                e(fVar.f298351c);
                r06.a(l.f298357a);
                return;
            } else if (i != 10) {
                e(fVar.f298350b);
                r06.a(new k(o.FINGERPRINT));
                return;
            }
        }
        r06.a(j.f298355a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, wl0.a] */
    @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
    public final void onAuthenticationFailed() {
        CancellationSignal cancellationSignal = this.d;
        if (cancellationSignal != null ? cancellationSignal.isCanceled() : false) {
            return;
        }
        e(this.f298361b.f298350b);
        this.f298360a.a(new k(o.FINGERPRINT));
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, wl0.a] */
    @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence helpString) {
        Intrinsics.checkNotNullParameter(helpString, "helpString");
        CancellationSignal cancellationSignal = this.d;
        if ((cancellationSignal != null ? cancellationSignal.isCanceled() : false) || kotlin.collections.d.I(f, Integer.valueOf(i))) {
            return;
        }
        e(this.f298361b.f298350b);
        this.f298360a.a(new k(o.FINGERPRINT));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, wl0.a] */
    @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManagerCompat.AuthenticationResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        CancellationSignal cancellationSignal = this.d;
        if (cancellationSignal != null ? cancellationSignal.isCanceled() : false) {
            return;
        }
        Cipher cipher = result.getCryptoObject().getCipher();
        ?? r06 = this.f298360a;
        if (cipher == null) {
            r06.a(new k(o.FINGERPRINT));
        } else {
            r06.a(new m(cipher, o.FINGERPRINT));
        }
        this.f298361b.d.removeCallbacks(this.e);
    }
}
