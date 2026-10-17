package f7;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import d7.f0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u implements o, g7.a, l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f132542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f132543c;
    public final LottieDrawable d;
    public final g7.o e;
    public boolean f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f132541a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f132544g = new c(0);

    public u(LottieDrawable lottieDrawable, n7.b bVar, m7.t tVar) {
        this.f132542b = tVar.f203264a;
        this.f132543c = tVar.d;
        this.d = lottieDrawable;
        g7.o oVar = new g7.o((List) tVar.f203266c.f22248b);
        this.e = oVar;
        bVar.b(oVar);
        oVar.a(this);
    }

    @Override // k7.g
    public final void c(k7.f fVar, int i, ArrayList arrayList, k7.f fVar2) {
        r7.g.g(fVar, i, arrayList, fVar2, this);
    }

    @Override // g7.a
    public final void d() {
        this.f = false;
        this.d.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    @Override // f7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.util.List r6, java.util.List r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            r1 = r6
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            if (r0 >= r2) goto L42
            java.lang.Object r1 = r1.get(r0)
            f7.d r1 = (f7.d) r1
            boolean r2 = r1 instanceof f7.x
            if (r2 == 0) goto L29
            r2 = r1
            f7.x r2 = (f7.x) r2
            m7.y r3 = r2.f132551c
            m7.y r4 = m7.y.SIMULTANEOUSLY
            if (r3 != r4) goto L29
            f7.c r1 = r5.f132544g
            java.util.ArrayList r1 = r1.f132468a
            r1.add(r2)
            r2.b(r5)
            goto L3f
        L29:
            boolean r2 = r1 instanceof f7.v
            if (r2 == 0) goto L3f
            if (r7 != 0) goto L34
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L34:
            f7.v r1 = (f7.v) r1
            r2 = r1
            f7.t r2 = (f7.t) r2
            r2.b(r5)
            r7.add(r1)
        L3f:
            int r0 = r0 + 1
            goto L2
        L42:
            g7.o r6 = r5.e
            r6.f141046m = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.u.e(java.util.List, java.util.List):void");
    }

    @Override // k7.g
    public final void f(Object obj2, s7.c cVar) {
        if (obj2 == f0.N) {
            this.e.k(cVar);
        }
    }

    @Override // f7.d
    public final String getName() {
        return this.f132542b;
    }

    @Override // f7.o
    public final Path getPath() {
        boolean z = this.f;
        g7.o oVar = this.e;
        Path path = this.f132541a;
        if (z && oVar.e == null) {
            return path;
        }
        path.reset();
        if (this.f132543c) {
            this.f = true;
            return path;
        }
        Path path2 = (Path) oVar.f();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f132544g.a(path);
        this.f = true;
        return path;
    }
}
