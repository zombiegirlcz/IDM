package n2a;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import om4.d0;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0.a f211500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f211501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj0.a f211502c;
    public final Context d;
    public final rk0.c e;
    public final l70.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ite.a f211503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cm2.a f211504h;
    public final usg.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f211505j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f211506l;

    public a(cm2.a aVar, ee0.a aVar2, nj0.a aVar3, an0.c cVar, l70.e eVar, rk0.c cVar2, usg.a aVar4, ite.a aVar5, Context context) {
        this.f211500a = aVar2;
        this.f211501b = cVar;
        this.f211502c = aVar3;
        this.d = context;
        this.e = cVar2;
        this.f = eVar;
        this.f211503g = aVar5;
        this.f211504h = aVar;
        this.i = aVar4;
        int i = 15;
        this.f211505j = e4m.b.b(new mil.a(this, 1, i));
        this.k = e4m.b.b(new mil.a(this, 2, i));
        this.f211506l = e4m.b.b(new mil.a(this, 0, i));
    }

    public final r2a.a a() {
        c90.a colorProvider = this.f.e();
        s.j(colorProvider);
        Intrinsics.checkNotNullParameter(colorProvider, "colorProvider");
        return new r2a.a();
    }

    public final q2a.f b() {
        return new q2a.f(this.f211504h.c(), this.i.b());
    }

    public final d0 c() {
        return new d0((k2a.d) this.f211506l.get());
    }
}
