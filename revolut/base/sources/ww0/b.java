package ww0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.revolut.core.ui_kit_core.displayers.haptic.Haptic;
import efm.r;
import h01.c;
import h01.d;
import h01.e;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ts0.t;
import wrj.m;
import wsg.k;
import wvg.d0;
import xw0.f;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements h01.b, DefaultLifecycleObserver {

    @NotNull
    public static final a Companion = new a();
    public static final ee.b i = new ee.b(new whi.b(1));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f300568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f300569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f300570c;
    public final ihm.f d;
    public final Lazy e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h01.a f300571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f300572h;

    public b(Context context, List list) {
        this.f300568a = list;
        c cVar = c.NON_HIDDEN;
        f fVar = new f(list);
        this.f300569b = fVar;
        ihm.b bVarE = ihm.b.e(cVar);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f300570c = bVarE;
        this.d = v0.a.d("create(...)");
        this.e = j.b(new t(context, 4));
        this.f = j.b(new wq1.a(24));
        this.f300571g = h01.a.INACTIVE;
        fVar.e.subscribe(new k(new d0(this, 6), 20));
    }

    @Override // h01.g
    public final c a() {
        Object objF = this.f300570c.f();
        if (objF != null) {
            return (c) objF;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // h01.b
    public final void b() {
        e(new wp0.b(this, 9));
    }

    @Override // h01.g
    public final r c() {
        return this.f300570c;
    }

    @Override // h01.b
    public final void d(h01.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        e(new m(this, state, 6));
    }

    public final void e(Function0 function0) {
        if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
            function0.invoke();
        } else {
            ((Handler) this.f.getValue()).post(new a3l.c(13, function0));
        }
    }

    public final void f(d dVar) {
        xy0.a aVar;
        int iOrdinal = a().ordinal();
        c[] cVarArrValues = c.values();
        c cVar = cVarArrValues[(iOrdinal + 1) % cVarArrValues.length];
        ihm.b bVar = this.f300570c;
        if (bVar.f() == cVar) {
            return;
        }
        bVar.onNext(cVar);
        this.d.onNext(new e(cVar, dVar));
        if (dVar != d.GESTURE || (aVar = (xy0.a) this.e.getValue()) == null) {
            return;
        }
        ((com.revolut.core.ui_kit_core.displayers.haptic.b) aVar).a(new Haptic.Effect(com.revolut.core.ui_kit_core.displayers.haptic.c.SHORT));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        f fVar = this.f300569b;
        if (fVar.f309313b) {
            fVar.f309313b = false;
            xw0.d dVar = fVar.d;
            if (dVar != null) {
                dVar.c();
                dVar.f309309j = null;
                dVar.k = null;
            }
            fVar.d = null;
        }
        this.f300572h = false;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f300572h = true;
        this.f300569b.a();
    }
}
