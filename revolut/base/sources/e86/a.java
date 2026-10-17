package e86;

import android.content.Context;
import ao.h;
import e4m.e;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f123600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a86.a f123601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee0.a f123602c;
    public final e d;
    public final e e;
    public final e f;

    public a(ee0.a aVar, Context context, a86.a aVar2) {
        this.f123600a = context;
        this.f123601b = aVar2;
        this.f123602c = aVar;
        int i = 29;
        this.d = e4m.b.b(new c63.b(this, 0, i));
        this.e = e4m.b.b(new c63.b(this, 1, i));
        this.f = e4m.b.b(new c63.b(this, 2, i));
    }

    public final h a() {
        return new h((f86.a) this.d.get(), (ue0.c) this.e.get());
    }
}
