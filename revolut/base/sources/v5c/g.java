package v5c;

import android.app.Activity;
import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends oki.h implements dli.b {
    public final Activity o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ryc.a f286194p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sh5.d f286195q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f286196r;

    public g(Activity activity, ryc.a inlineInstaller, sh5.d cryptoFcaDisclaimerWidget, h stateMapper) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(inlineInstaller, "inlineInstaller");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = activity;
        this.f286194p = inlineInstaller;
        this.f286195q = cryptoFcaDisclaimerWidget;
        this.f286196r = mra.d.b(this, new d(((gi5.d) cryptoFcaDisclaimerWidget).b(null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new f(this, null, 1), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f286196r;
    }
}
