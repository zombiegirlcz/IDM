package loj;

import e4m.b;
import kotlin.jvm.internal.Intrinsics;
import l70.e;
import lal.j;
import tgi.g;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vgi.a f197455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f197456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ckg.a f197457c;
    public final ite.a d;
    public final xmg.a e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f197458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f197459h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f197460j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f197461l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f197462m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f197463n;

    public a(e eVar, xmg.a aVar, vgi.a aVar2, ckg.a aVar3, ite.a aVar4) {
        this.f197455a = aVar2;
        this.f197456b = eVar;
        this.f197457c = aVar3;
        this.d = aVar4;
        this.e = aVar;
        int i = 12;
        this.f = b.b(new j(this, 0, i));
        this.f197458g = b.b(new j(this, 1, i));
        this.f197459h = b.b(new j(this, 2, i));
        this.i = b.b(new j(this, 3, i));
        this.f197460j = b.b(new j(this, 4, i));
        this.k = b.b(new j(this, 5, i));
        this.f197461l = b.b(new j(this, 6, i));
        this.f197462m = b.b(new j(this, 7, i));
        this.f197463n = b.b(new j(this, 8, i));
    }

    public final toj.b a() {
        g welcomeMessageProvider = (g) this.f197455a.f289184a.get();
        s.j(welcomeMessageProvider);
        Intrinsics.checkNotNullParameter(welcomeMessageProvider, "welcomeMessageProvider");
        return new toj.b();
    }
}
