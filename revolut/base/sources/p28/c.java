package p28;

import com.revolut.feature.separate_favourites.api.widget.FavouritesWidgetContext;
import kotlin.jvm.internal.Intrinsics;
import nsh.p;
import p12.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public final f0 A;
    public final f0 B;
    public final f0 C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k39.b f232135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d28.a f232136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f232137c;
    public final p d;
    public final b e;
    public final f0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f0 f232138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f0 f232139h;
    public final f0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f0 f232140j;
    public final f0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f0 f232141l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f0 f232142m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f0 f232143n;
    public final f0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f0 f232144p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f0 f232145q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f0 f232146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f0 f232147s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f0 f232148t;
    public final f0 u;
    public final f0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f0 f232149w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f0 f232150x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f0 f232151y;
    public final f0 z;

    public c(b bVar, h hVar, k39.b bVar2, p pVar, p pVar2, d28.a aVar) {
        this.e = bVar;
        this.f232135a = bVar2;
        this.f232136b = aVar;
        this.f232137c = pVar;
        this.d = pVar2;
        this.f = new f0(bVar, this, 0, 7);
        this.f232138g = new f0(bVar, this, 1, 7);
        this.f232139h = new f0(bVar, this, 2, 7);
        this.i = new f0(bVar, this, 3, 7);
        this.f232140j = new f0(bVar, this, 4, 7);
        this.k = new f0(bVar, this, 5, 7);
        this.f232141l = new f0(bVar, this, 6, 7);
        this.f232142m = new f0(bVar, this, 7, 7);
        this.f232143n = new f0(bVar, this, 8, 7);
        this.o = new f0(bVar, this, 9, 7);
        this.f232144p = new f0(bVar, this, 10, 7);
        this.f232145q = new f0(bVar, this, 11, 7);
        this.f232146r = new f0(bVar, this, 12, 7);
        this.f232147s = new f0(bVar, this, 13, 7);
        this.f232148t = new f0(bVar, this, 14, 7);
        this.u = new f0(bVar, this, 15, 7);
        this.v = new f0(bVar, this, 16, 7);
        this.f232149w = new f0(bVar, this, 17, 7);
        this.f232150x = new f0(bVar, this, 18, 7);
        this.f232151y = new f0(bVar, this, 19, 7);
        this.z = new f0(bVar, this, 20, 7);
        this.A = new f0(bVar, this, 21, 7);
        this.B = new f0(bVar, this, 22, 7);
        this.C = new f0(bVar, this, 23, 7);
    }

    public final a38.a a() {
        d28.a swipeActionRowClickEventHandler = this.f232136b;
        Intrinsics.checkNotNullParameter(swipeActionRowClickEventHandler, "swipeActionRowClickEventHandler");
        return new a38.a(FavouritesWidgetContext.class, swipeActionRowClickEventHandler);
    }
}
