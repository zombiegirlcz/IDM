package xab;

import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginFragment f303809b;

    public /* synthetic */ d(LoginFragment loginFragment, int i) {
        this.f303808a = i;
        this.f303809b = loginFragment;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f303808a) {
            case 0:
                this.f303809b.W();
                return;
            case 1:
                this.f303809b.f82674d0 = false;
                return;
            case 2:
                this.f303809b.W();
                return;
            case 3:
                this.f303809b.L().z().M();
                return;
            default:
                LoginFragment loginFragment = this.f303809b;
                wl0.c cVar = loginFragment.q0;
                if (cVar == null) {
                    Intrinsics.r("biometricHelper");
                    throw null;
                }
                cVar.a();
                wl0.c cVar2 = loginFragment.q0;
                if (cVar2 != null) {
                    cVar2.b();
                    return;
                } else {
                    Intrinsics.r("biometricHelper");
                    throw null;
                }
        }
    }
}
