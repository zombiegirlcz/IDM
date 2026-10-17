package wsc;

import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import vkm.z1;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f299699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f299700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f299701c;
    public final c d;
    public final z1 e;

    public d(Context appContext, CoroutineScope coroutineScope, g clearables) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(clearables, "clearables");
        this.f299699a = appContext;
        this.f299700b = coroutineScope;
        this.f299701c = clearables;
        this.d = new c(this);
        this.e = ta6.a.a(0);
    }

    @Override // wsc.a
    public final Flow a() {
        return this.e;
    }

    @Override // wsc.a
    public final void b() {
        this.d.f299697a = true;
    }

    @Override // wsc.a
    public final void c() {
        this.d.f299697a = false;
    }

    @Override // wsc.a, e0m.d
    public final void init() {
        ((Application) this.f299699a).registerActivityLifecycleCallbacks(this.d);
        od0.e clearable = new od0.e() { // from class: wsc.b
            @Override // od0.e
            public final void clear() {
                d dVar = this.f299696a;
                ((Application) dVar.f299699a).unregisterActivityLifecycleCallbacks(dVar.d);
            }
        };
        g gVar = this.f299701c;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(clearable, "clearable");
        gVar.f299705a.add(clearable);
    }
}
