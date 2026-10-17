package ey;

import com.google.common.collect.ImmutableSet;
import com.revolut.camerakit.client.api.models.CameraKitClientSettings;
import com.revolut.camerakit.client.api.models.CameraKitUiSettings;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import com.revolut.kompot.navigable.vc.ViewController;
import ea2.p;
import java.util.Set;
import ms1.s;
import ove.w;
import prk.o;
import ql7.v1;
import sy.k;
import yji.n;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements wy.a {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;
    public final e4m.e F;
    public final e4m.e G;
    public final e4m.e H;
    public final e4m.e I;
    public final e4m.e J;
    public final e4m.e K;
    public final my.b L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130489a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oy.b f130490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xy.b f130491c;
    public final vy.a d;
    public final CameraKitClientSettings e;
    public final CameraKitView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CameraKitUiSettings f130492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f130493h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f130494j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f130495l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f130496m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f130497n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f130498p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f130499q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f130500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f130501s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f130502t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f130503w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f130504x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f130505y;
    public final e4m.e z;

    public d(mz.b bVar, oy.b bVar2, xy.b bVar3, ViewController viewController, CameraKitView cameraKitView, CameraKitClientSettings cameraKitClientSettings, CameraKitUiSettings cameraKitUiSettings, vy.a aVar) {
        this.L = bVar;
        this.f130490b = bVar2;
        this.f130491c = bVar3;
        this.d = aVar;
        this.e = cameraKitClientSettings;
        this.f = cameraKitView;
        this.f130492g = cameraKitUiSettings;
        this.f130493h = e4m.b.b(e4m.c.a(viewController));
        this.i = m72.b.l(bVar, this, 1);
        this.f130494j = m72.b.l(bVar, this, 0);
        this.k = m72.b.l(bVar, this, 7);
        this.f130495l = m72.b.l(bVar, this, 6);
        this.f130496m = m72.b.l(bVar, this, 10);
        this.f130497n = m72.b.l(bVar, this, 12);
        this.o = m72.b.l(bVar, this, 11);
        this.f130498p = m72.b.l(bVar, this, 15);
        this.f130499q = m72.b.l(bVar, this, 14);
        this.f130500r = m72.b.l(bVar, this, 13);
        this.f130501s = m72.b.l(bVar, this, 9);
        this.f130502t = m72.b.l(bVar, this, 8);
        this.u = m72.b.l(bVar, this, 5);
        this.v = m72.b.l(bVar, this, 16);
        this.f130503w = m72.b.l(bVar, this, 18);
        this.f130504x = m72.b.l(bVar, this, 19);
        this.f130505y = m72.b.l(bVar, this, 20);
        this.z = m72.b.l(bVar, this, 21);
        this.A = m72.b.l(bVar, this, 17);
        this.B = m72.b.l(bVar, this, 22);
        this.C = m72.b.l(bVar, this, 23);
        int i = 6;
        this.D = e4m.b.b(new s(bVar, this, 4, i));
        this.E = m72.b.l(bVar, this, 3);
        this.F = m72.b.l(bVar, this, 2);
        this.G = m72.b.l(bVar, this, 24);
        this.H = m72.b.l(bVar, this, 26);
        this.I = m72.b.l(bVar, this, 25);
        this.J = e4m.b.b(new s(bVar, this, 28, i));
        this.K = e4m.b.b(new s(bVar, this, 27, i));
    }

    @Override // wy.a
    public final oy.a K() {
        switch (this.f130489a) {
        }
        return (oy.a) this.i.get();
    }

    @Override // wy.a
    public final pki.b a() {
        switch (this.f130489a) {
        }
        return (k) this.K.get();
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f130489a) {
        }
        return ImmutableSet.of((n) this.G.get(), (n) this.I.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f130489a) {
        }
        return ImmutableSet.of((yji.d) this.f130494j.get(), (yji.d) this.F.get());
    }

    public d(b bVar, oy.b bVar2, xy.b bVar3, ViewController viewController, CameraKitView cameraKitView, CameraKitClientSettings cameraKitClientSettings, CameraKitUiSettings cameraKitUiSettings, vy.a aVar) {
        this.L = bVar;
        this.f130490b = bVar2;
        this.f130491c = bVar3;
        this.d = aVar;
        this.e = cameraKitClientSettings;
        this.f = cameraKitView;
        this.f130492g = cameraKitUiSettings;
        this.f130493h = e4m.b.b(e4m.c.a(viewController));
        this.i = ehe.n.i(bVar, this, 1);
        this.f130494j = ehe.n.i(bVar, this, 0);
        this.k = ehe.n.i(bVar, this, 7);
        this.f130495l = ehe.n.i(bVar, this, 6);
        this.f130496m = ehe.n.i(bVar, this, 10);
        this.f130497n = ehe.n.i(bVar, this, 12);
        this.o = ehe.n.i(bVar, this, 11);
        this.f130498p = ehe.n.i(bVar, this, 15);
        this.f130499q = ehe.n.i(bVar, this, 14);
        this.f130500r = ehe.n.i(bVar, this, 13);
        this.f130501s = ehe.n.i(bVar, this, 9);
        this.f130502t = ehe.n.i(bVar, this, 8);
        this.u = ehe.n.i(bVar, this, 5);
        this.v = ehe.n.i(bVar, this, 16);
        this.f130503w = ehe.n.i(bVar, this, 18);
        this.f130504x = ehe.n.i(bVar, this, 19);
        this.f130505y = ehe.n.i(bVar, this, 20);
        this.z = ehe.n.i(bVar, this, 21);
        this.A = ehe.n.i(bVar, this, 17);
        this.B = ehe.n.i(bVar, this, 22);
        this.C = ehe.n.i(bVar, this, 23);
        int i = 21;
        this.D = e4m.b.b(new p(bVar, this, 4, i));
        this.E = ehe.n.i(bVar, this, 3);
        this.F = ehe.n.i(bVar, this, 2);
        this.G = ehe.n.i(bVar, this, 24);
        this.H = ehe.n.i(bVar, this, 26);
        this.I = ehe.n.i(bVar, this, 25);
        this.J = e4m.b.b(new p(bVar, this, 28, i));
        this.K = e4m.b.b(new p(bVar, this, 27, i));
    }

    public d(b bVar, oy.b bVar2, xy.b bVar3, ViewController viewController, CameraKitView cameraKitView, CameraKitClientSettings cameraKitClientSettings, CameraKitUiSettings cameraKitUiSettings, vy.a aVar, byte b4) {
        this.L = bVar;
        this.f130490b = bVar2;
        this.f130491c = bVar3;
        this.d = aVar;
        this.e = cameraKitClientSettings;
        this.f = cameraKitView;
        this.f130492g = cameraKitUiSettings;
        this.f130493h = e4m.b.b(e4m.c.a(viewController));
        this.i = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 1);
        this.f130494j = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 0);
        this.k = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 7);
        this.f130495l = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 6);
        this.f130496m = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 10);
        this.f130497n = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 12);
        this.o = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 11);
        this.f130498p = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 15);
        this.f130499q = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 14);
        this.f130500r = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 13);
        this.f130501s = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 9);
        this.f130502t = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 8);
        this.u = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 5);
        this.v = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 16);
        this.f130503w = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 18);
        this.f130504x = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 19);
        this.f130505y = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 20);
        this.z = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 21);
        this.A = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 17);
        this.B = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 22);
        this.C = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 23);
        int i = 9;
        this.D = e4m.b.b(new w(bVar, this, 4, i));
        this.E = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 3);
        this.F = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 2);
        this.G = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 24);
        this.H = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 26);
        this.I = org.bouncycastle.jcajce.provider.digest.a.e(bVar, this, 25);
        this.J = e4m.b.b(new w(bVar, this, 28, i));
        this.K = e4m.b.b(new w(bVar, this, 27, i));
    }

    public d(b bVar, oy.b bVar2, xy.b bVar3, ViewController viewController, CameraKitView cameraKitView, CameraKitClientSettings cameraKitClientSettings, CameraKitUiSettings cameraKitUiSettings, vy.a aVar, char c2) {
        this.L = bVar;
        this.f130490b = bVar2;
        this.f130491c = bVar3;
        this.d = aVar;
        this.e = cameraKitClientSettings;
        this.f = cameraKitView;
        this.f130492g = cameraKitUiSettings;
        this.f130493h = e4m.b.b(e4m.c.a(viewController));
        this.i = o.e(bVar, this, 1);
        this.f130494j = o.e(bVar, this, 0);
        this.k = o.e(bVar, this, 7);
        this.f130495l = o.e(bVar, this, 6);
        this.f130496m = o.e(bVar, this, 10);
        this.f130497n = o.e(bVar, this, 12);
        this.o = o.e(bVar, this, 11);
        this.f130498p = o.e(bVar, this, 15);
        this.f130499q = o.e(bVar, this, 14);
        this.f130500r = o.e(bVar, this, 13);
        this.f130501s = o.e(bVar, this, 9);
        this.f130502t = o.e(bVar, this, 8);
        this.u = o.e(bVar, this, 5);
        this.v = o.e(bVar, this, 16);
        this.f130503w = o.e(bVar, this, 18);
        this.f130504x = o.e(bVar, this, 19);
        this.f130505y = o.e(bVar, this, 20);
        this.z = o.e(bVar, this, 21);
        this.A = o.e(bVar, this, 17);
        this.B = o.e(bVar, this, 22);
        this.C = o.e(bVar, this, 23);
        int i = 24;
        this.D = e4m.b.b(new v1(bVar, this, 4, i));
        this.E = o.e(bVar, this, 3);
        this.F = o.e(bVar, this, 2);
        this.G = o.e(bVar, this, 24);
        this.H = o.e(bVar, this, 26);
        this.I = o.e(bVar, this, 25);
        this.J = e4m.b.b(new v1(bVar, this, 28, i));
        this.K = e4m.b.b(new v1(bVar, this, 27, i));
    }
}
