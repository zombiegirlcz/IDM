package dgf;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f114652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f114653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f114654c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public a(nj0.a aVar, ee0.a aVar2, Context context) {
        this.f114652a = aVar;
        this.f114653b = context;
        int i = 18;
        this.f114654c = e4m.b.b(new cbb.b(this, 2, i));
        this.d = e4m.b.b(new cbb.b(this, 1, i));
        this.e = e4m.b.b(new cbb.b(this, 3, i));
        this.f = e4m.b.b(new cbb.b(this, 0, i));
    }

    public final agf.b a() {
        return (agf.b) this.f.get();
    }
}
