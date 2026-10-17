package zl0;

import androidx.fragment.app.FragmentActivity;
import az0.l1;
import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import rm0.e0;
import rm0.q;
import yhm.j;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f323155a;

    public e(wl0.a biometricCallback, a promptInfoFactory, q cipherProvider, wl0.c biometricHelper, e0 securityFeatureToggles) {
        Intrinsics.checkNotNullParameter(biometricCallback, "biometricCallback");
        Intrinsics.checkNotNullParameter(promptInfoFactory, "promptInfoFactory");
        Intrinsics.checkNotNullParameter(cipherProvider, "cipherProvider");
        Intrinsics.checkNotNullParameter(biometricHelper, "biometricHelper");
        Intrinsics.checkNotNullParameter(securityFeatureToggles, "securityFeatureToggles");
        this.f323155a = j.b(new l1(biometricHelper, biometricCallback, promptInfoFactory, cipherProvider, securityFeatureToggles, 10));
    }

    @Override // zl0.c
    public final rm0.j a(LoginFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return ((c) this.f323155a.getValue()).a(fragment);
    }

    @Override // zl0.c
    public final void b() {
        ((c) this.f323155a.getValue()).b();
    }

    @Override // zl0.c
    public final rm0.j c(FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return ((c) this.f323155a.getValue()).c(activity);
    }
}
