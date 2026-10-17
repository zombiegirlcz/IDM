package fsi;

import kotlin.Lazy;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
public abstract class c implements a, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f137704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f137705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ifm.b f137706c;
    public final ifm.b d;
    public final ifm.b e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f137707g;

    public c(b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f137704a = rd0.e.a(p0.f264002b);
        this.f137705b = id10;
        this.f137706c = new ifm.b();
        this.d = new ifm.b();
        this.e = new ifm.b();
        this.f = j.b(new af0.a(12));
        this.f137707g = j.b(new af0.a(13));
    }

    public final Function0 L() {
        return (Function0) this.f137707g.getValue();
    }

    public final Function1 M() {
        return (Function1) this.f.getValue();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof c) {
            return Intrinsics.f(this.f137705b, ((c) obj2).f137705b);
        }
        return false;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f137704a.getCoroutineContext();
    }

    public final int hashCode() {
        return this.f137705b.f137703a.hashCode();
    }

    @Override // fsi.a
    public void onDestroy() {
        this.d.d();
        e0.n(this.f137704a.getCoroutineContext());
    }

    @Override // fsi.a
    public void onPause() {
        this.e.d();
    }

    @Override // fsi.a
    public void onStop() {
        this.f137706c.d();
    }
}
