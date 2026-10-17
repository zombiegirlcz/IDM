package cq;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.view.ComponentActivity;
import com.google.android.play.core.install.zza;
import ihm.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zp.e;

/* JADX INFO: loaded from: classes17.dex */
public final class g implements e0m.d, LifecycleObserver {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentActivity f107979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oc.b f107980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f107981c;
    public final j d;
    public final d e;
    public final e0m.b f;

    /* JADX WARN: Type inference failed for: r2v3, types: [cq.d] */
    public g(ComponentActivity activity, oc.b appUpdateManager, ue0.c storage) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f107979a = activity;
        this.f107980b = appUpdateManager;
        this.f107981c = storage;
        j jVarD = new ihm.b().d();
        Intrinsics.checkNotNullExpressionValue(jVarD, "toSerialized(...)");
        this.d = jVarD;
        this.e = new tc.a() { // from class: cq.d
            @Override // tc.a
            public final void a(Object obj2) {
                Object gVar;
                zza state = (zza) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                int i = state.d;
                if (i != 0) {
                    gVar = new zp.f(a0.d.n("Install failed with code: ", i));
                } else {
                    int i2 = state.f49170a;
                    gVar = i2 == 2 ? new zp.g(state.f49171b, state.f49172c) : i2 == 11 ? e.b.f324092a : null;
                }
                if (gVar != null) {
                    this.f107977a.d.onNext(gVar);
                }
            }
        };
        this.f = new e0m.b(new co7.a(this, 5));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void checkUpdate() {
        ((oc.e) this.f107980b).a().addOnSuccessListener(new com.onfido.android.sdk.capture.ui.userconsent.c(new c(this, 1), 18));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void continueUpdate() {
        ((oc.e) this.f107980b).a().addOnSuccessListener(new com.onfido.android.sdk.capture.ui.userconsent.c(new c(this, 0), 17));
    }

    @Override // e0m.d
    public final void init() {
        this.f.init();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void stopListening() {
        oc.b bVar = this.f107980b;
        d dVar = this.e;
        oc.e eVar = (oc.e) bVar;
        synchronized (eVar) {
            oc.d dVar2 = eVar.f224006b;
            synchronized (dVar2) {
                dVar2.f224002a.e("unregisterListener", new Object[0]);
                if (dVar == null) {
                    throw new NullPointerException("Unregistered Play Core listener should not be null.");
                }
                dVar2.d.remove(dVar);
                dVar2.a();
            }
        }
    }
}
