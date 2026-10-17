package f7;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d7.f0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements g7.a, l, f {
    public final LottieDrawable e;
    public final n7.b f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f132462h;
    public final e7.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g7.i f132463j;
    public final g7.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f132464l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g7.i f132465m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g7.u f132466n;
    public g7.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f132467p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f132458a = new PathMeasure();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f132459b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f132460c = new Path();
    public final RectF d = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f132461g = new ArrayList();

    public b(LottieDrawable lottieDrawable, n7.b bVar, Paint.Cap cap, Paint.Join join, float f, l7.a aVar, l7.b bVar2, ArrayList arrayList, l7.b bVar3) {
        e7.a aVar2 = new e7.a(1);
        this.i = aVar2;
        this.f132467p = BitmapDescriptorFactory.HUE_RED;
        this.e = lottieDrawable;
        this.f = bVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f);
        this.k = (g7.f) aVar.a();
        this.f132463j = bVar2.a();
        if (bVar3 == null) {
            this.f132465m = null;
        } else {
            this.f132465m = bVar3.a();
        }
        this.f132464l = new ArrayList(arrayList.size());
        this.f132462h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.f132464l.add(((l7.b) arrayList.get(i)).a());
        }
        bVar.b(this.k);
        bVar.b(this.f132463j);
        for (int i2 = 0; i2 < this.f132464l.size(); i2++) {
            bVar.b((g7.e) this.f132464l.get(i2));
        }
        g7.i iVar = this.f132465m;
        if (iVar != null) {
            bVar.b(iVar);
        }
        this.k.a(this);
        this.f132463j.a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((g7.e) this.f132464l.get(i3)).a(this);
        }
        g7.i iVar2 = this.f132465m;
        if (iVar2 != null) {
            iVar2.a(this);
        }
        if (bVar.j() != null) {
            g7.i iVarA = ((l7.b) bVar.j().b).a();
            this.o = iVarA;
            iVarA.a(this);
            bVar.b(this.o);
        }
    }

    @Override // f7.f
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        d7.a aVar = d7.d.f111646a;
        Path path = this.f132459b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f132461g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float fM = this.f132463j.m() / 2.0f;
                rectF2.set(rectF2.left - fM, rectF2.top - fM, rectF2.right + fM, rectF2.bottom + fM);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                d7.a aVar2 = d7.d.f111646a;
                return;
            }
            a aVar3 = (a) arrayList.get(i);
            for (int i2 = 0; i2 < aVar3.f132456a.size(); i2++) {
                path.addPath(((o) aVar3.f132456a.get(i2)).getPath(), matrix);
            }
            i++;
        }
    }

    @Override // k7.g
    public final void c(k7.f fVar, int i, ArrayList arrayList, k7.f fVar2) {
        r7.g.g(fVar, i, arrayList, fVar2, this);
    }

    @Override // g7.a
    public final void d() {
        this.e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    @Override // f7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.util.List r8, java.util.List r9) {
        /*
            r7 = this;
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        La:
            if (r0 < 0) goto L22
            java.lang.Object r3 = r8.get(r0)
            f7.d r3 = (f7.d) r3
            boolean r4 = r3 instanceof f7.x
            if (r4 == 0) goto L1f
            f7.x r3 = (f7.x) r3
            m7.y r4 = r3.f132551c
            m7.y r5 = m7.y.INDIVIDUALLY
            if (r4 != r5) goto L1f
            r2 = r3
        L1f:
            int r0 = r0 + (-1)
            goto La
        L22:
            if (r2 == 0) goto L27
            r2.b(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
        L2d:
            java.util.ArrayList r0 = r7.f132461g
            if (r8 < 0) goto L68
            java.lang.Object r3 = r9.get(r8)
            f7.d r3 = (f7.d) r3
            boolean r4 = r3 instanceof f7.x
            if (r4 == 0) goto L53
            r4 = r3
            f7.x r4 = (f7.x) r4
            m7.y r5 = r4.f132551c
            m7.y r6 = m7.y.INDIVIDUALLY
            if (r5 != r6) goto L53
            if (r1 == 0) goto L49
            r0.add(r1)
        L49:
            f7.a r0 = new f7.a
            r0.<init>(r4)
            r4.b(r7)
            r1 = r0
            goto L65
        L53:
            boolean r0 = r3 instanceof f7.o
            if (r0 == 0) goto L65
            if (r1 != 0) goto L5e
            f7.a r1 = new f7.a
            r1.<init>(r2)
        L5e:
            java.util.ArrayList r0 = r1.f132456a
            f7.o r3 = (f7.o) r3
            r0.add(r3)
        L65:
            int r8 = r8 + (-1)
            goto L2d
        L68:
            if (r1 == 0) goto L6d
            r0.add(r1)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.b.e(java.util.List, java.util.List):void");
    }

    @Override // k7.g
    public void f(Object obj2, s7.c cVar) {
        PointF pointF = f0.f111651a;
        if (obj2 == 4) {
            this.k.k(cVar);
            return;
        }
        if (obj2 == f0.f111661q) {
            this.f132463j.k(cVar);
            return;
        }
        ColorFilter colorFilter = f0.I;
        n7.b bVar = this.f;
        if (obj2 == colorFilter) {
            g7.u uVar = this.f132466n;
            if (uVar != null) {
                bVar.m(uVar);
            }
            if (cVar == null) {
                this.f132466n = null;
                return;
            }
            g7.u uVar2 = new g7.u(null, cVar);
            this.f132466n = uVar2;
            uVar2.a(this);
            bVar.b(this.f132466n);
            return;
        }
        if (obj2 == f0.e) {
            g7.e eVar = this.o;
            if (eVar != null) {
                eVar.k(cVar);
                return;
            }
            g7.u uVar3 = new g7.u(null, cVar);
            this.o = uVar3;
            uVar3.a(this);
            bVar.b(this.o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01f8  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // f7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23, r7.a r24) {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.b.g(android.graphics.Canvas, android.graphics.Matrix, int, r7.a):void");
    }
}
