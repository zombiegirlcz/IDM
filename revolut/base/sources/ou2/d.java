package ou2;

import android.content.Context;
import da3.j;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f229773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f229774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f229775c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public d(j jVar, Context context) {
        this.f229773a = context;
        this.f229774b = jVar;
        int i = 13;
        this.d = e4m.b.b(new of3.e(this, 0, i));
        this.e = e4m.b.b(new of3.e(this, 2, i));
        this.f = e4m.b.b(new of3.e(this, 1, i));
    }

    @Override // ou2.a
    public final kge.d a() {
        return new kge.d(this.f229775c);
    }
}
