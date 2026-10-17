package emi;

import android.content.Context;
import cmi.a0;
import cmi.n;
import dw3.f6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdj.a f127661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ite.a f127662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f127663c;
    public final ee0.a d;
    public final rg0.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f127664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f127665h;

    public a(ee0.a aVar, rg0.e eVar, xdj.a aVar2, ite.a aVar3, Context context) {
        this.f127661a = aVar2;
        this.f127662b = aVar3;
        this.f127663c = context;
        this.d = aVar;
        this.e = eVar;
        int i = 28;
        this.f = e4m.b.b(new f6(this, 1, i));
        this.f127664g = e4m.b.b(new f6(this, 0, i));
        this.f127665h = e4m.b.b(new f6(this, 2, i));
    }

    public final n a() {
        return (n) this.f127664g.get();
    }

    public final a0 b() {
        f.Companion.getClass();
        Context applicationContext = this.f127663c;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        return new a0(new b0.b(applicationContext, 9), new b0.b(applicationContext, 10));
    }
}
