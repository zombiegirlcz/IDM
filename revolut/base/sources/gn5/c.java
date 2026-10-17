package gn5;

import android.content.Context;
import e4m.e;
import ei5.d;
import ku5.g;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f144908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final usg.a f144909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f144910c;
    public final npk.a d;
    public final Context e;
    public final ite.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f144911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f144912h;
    public final e i;

    public c(d dVar, g gVar, ite.a aVar, usg.a aVar2, npk.a aVar3, Context context) {
        this.f144908a = dVar;
        this.f144909b = aVar2;
        this.f144910c = gVar;
        this.d = aVar3;
        this.e = context;
        this.f = aVar;
        int i = 1;
        this.f144911g = e4m.b.b(new gff.a(this, 1, i));
        this.f144912h = e4m.b.b(new gff.a(this, 0, i));
        this.i = e4m.b.b(new gff.a(this, 2, i));
    }

    public final yfe.d a() {
        return (yfe.d) this.i.get();
    }
}
