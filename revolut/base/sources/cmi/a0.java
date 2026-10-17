package cmi;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.revolut.navigation.deeplink.api.SharedDeeplinkApi$Toggles$DeeplinkUnifiedEnabled;
import kotlin.jvm.internal.Intrinsics;
import skm.d0;
import skm.e0;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0.b f25266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0.b f25267b;

    public a0(b0.b featureToggleInteractor, b0.b stateHolder) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        this.f25266a = featureToggleInteractor;
        this.f25267b = stateHolder;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        u uVar = (u) this.f25267b.invoke();
        if (uVar == null) {
            return;
        }
        if (((jte.d) ((gte.a) this.f25266a.invoke())).c(SharedDeeplinkApi$Toggles$DeeplinkUnifiedEnabled.f98457c)) {
            return;
        }
        e0.C(uVar.f25305b, null, d0.UNDISPATCHED, new r(uVar, null, 0), 1);
    }
}
