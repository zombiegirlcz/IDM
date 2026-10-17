package i9l;

import android.content.Context;
import i72.j;
import npk.e;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f159887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d9l.a f159888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f159889c;
    public final e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f159890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f159891h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f159892j;

    public a(e eVar, ee0.a aVar, nj0.a aVar2, Context context, d9l.a aVar3) {
        this.f159887a = aVar2;
        this.f159888b = aVar3;
        this.f159889c = context;
        this.d = eVar;
        int i = 9;
        this.e = e4m.b.b(new j(this, 3, i));
        this.f = e4m.b.b(new j(this, 2, i));
        this.f159890g = e4m.b.b(new j(this, 5, i));
        this.f159891h = e4m.b.b(new j(this, 4, i));
        this.i = e4m.b.b(new j(this, 1, i));
        this.f159892j = e4m.b.b(new j(this, 0, i));
    }

    public final k9l.a a() {
        return (k9l.a) this.f159892j.get();
    }

    public final j9l.a b() {
        return new j9l.a();
    }
}
