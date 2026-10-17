package th0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f271230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg0.c f271231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f271232c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f271233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f271234h;

    public a(Context context, sg0.c cVar) {
        this.f271230a = context;
        this.f271231b = cVar;
        int i = 11;
        this.f271232c = e4m.b.b(new sse.a(this, 0, i));
        this.d = e4m.b.b(new sse.a(this, 1, i));
        this.e = e4m.b.b(new sse.a(this, 2, i));
        this.f = e4m.b.b(new sse.a(this, 3, i));
        this.f271233g = e4m.b.b(new sse.a(this, 4, i));
        this.f271234h = e4m.b.b(new sse.a(this, 5, i));
    }

    public final xg0.a a() {
        return (xg0.a) this.f271234h.get();
    }

    public final ryc.a b() {
        return new ryc.a(h(), i());
    }

    public final yh0.a c() {
        yh0.c integrityCheckTokenProvider = (yh0.c) this.d.get();
        ih0.b remoteConfig = (ih0.b) this.e.get();
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(integrityCheckTokenProvider, "integrityCheckTokenProvider");
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        return new yh0.a(new jzl.a(), remoteConfig, integrityCheckTokenProvider);
    }

    public final ei0.b d() {
        d.Companion.getClass();
        Context context = this.f271230a;
        Intrinsics.checkNotNullParameter(context, "context");
        return new ei0.b(new ei0.g(context));
    }

    public final bi0.f e() {
        return new bi0.f(d(), new bi0.g(), new ci0.a());
    }

    public final ih0.b f() {
        return (ih0.b) this.e.get();
    }

    public final ji0.a g() {
        return (ji0.a) this.f271233g.get();
    }

    public final cpi.g h() {
        d.Companion.getClass();
        Context context = this.f271230a;
        Intrinsics.checkNotNullParameter(context, "context");
        return new cpi.g(new yf.c(new qi0.c()), context);
    }

    public final rh0.b i() {
        return new rh0.b(this.f271230a);
    }
}
