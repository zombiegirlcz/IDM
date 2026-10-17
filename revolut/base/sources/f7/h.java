package f7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d7.f0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class h implements f, g7.a, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f132481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e7.a f132482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n7.b f132483c;
    public final String d;
    public final boolean e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g7.f f132484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g7.f f132485h;
    public g7.u i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LottieDrawable f132486j;
    public g7.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f132487l;

    public h(LottieDrawable lottieDrawable, n7.b bVar, m7.r rVar) {
        Path path = new Path();
        this.f132481a = path;
        this.f132482b = new e7.a(1);
        this.f = new ArrayList();
        this.f132483c = bVar;
        String str = rVar.f203260c;
        l7.a aVar = rVar.e;
        l7.a aVar2 = rVar.d;
        this.d = str;
        this.e = rVar.f;
        this.f132486j = lottieDrawable;
        if (bVar.j() != null) {
            g7.i iVarA = ((l7.b) bVar.j().b).a();
            this.k = iVarA;
            iVarA.a(this);
            bVar.b(this.k);
        }
        if (aVar2 == null) {
            this.f132484g = null;
            this.f132485h = null;
            return;
        }
        path.setFillType(rVar.f203259b);
        g7.e eVarA = aVar2.a();
        this.f132484g = (g7.f) eVarA;
        eVarA.a(this);
        bVar.b(eVarA);
        g7.e eVarA2 = aVar.a();
        this.f132485h = (g7.f) eVarA2;
        eVarA2.a(this);
        bVar.b(eVarA2);
    }

    @Override // f7.f
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f132481a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((o) arrayList.get(i)).getPath(), matrix);
                i++;
            }
        }
    }

    @Override // k7.g
    public final void c(k7.f fVar, int i, ArrayList arrayList, k7.f fVar2) {
        r7.g.g(fVar, i, arrayList, fVar2, this);
    }

    @Override // g7.a
    public final void d() {
        this.f132486j.invalidateSelf();
    }

    @Override // f7.d
    public final void e(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            d dVar = (d) list2.get(i);
            if (dVar instanceof o) {
                this.f.add((o) dVar);
            }
        }
    }

    @Override // k7.g
    public final void f(Object obj2, s7.c cVar) {
        PointF pointF = f0.f111651a;
        if (obj2 == 1) {
            this.f132484g.k(cVar);
            return;
        }
        if (obj2 == 4) {
            this.f132485h.k(cVar);
            return;
        }
        ColorFilter colorFilter = f0.I;
        n7.b bVar = this.f132483c;
        if (obj2 == colorFilter) {
            g7.u uVar = this.i;
            if (uVar != null) {
                bVar.m(uVar);
            }
            if (cVar == null) {
                this.i = null;
                return;
            }
            g7.u uVar2 = new g7.u(null, cVar);
            this.i = uVar2;
            uVar2.a(this);
            bVar.b(this.i);
            return;
        }
        if (obj2 == f0.e) {
            g7.e eVar = this.k;
            if (eVar != null) {
                eVar.k(cVar);
                return;
            }
            g7.u uVar3 = new g7.u(null, cVar);
            this.k = uVar3;
            uVar3.a(this);
            bVar.b(this.k);
        }
    }

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
    public final void g(Canvas canvas, Matrix matrix, int i, r7.a aVar) {
        MaskFilter maskFilter;
        if (this.e) {
            return;
        }
        d7.a aVar2 = d7.d.f111646a;
        g7.f fVar = this.f132484g;
        float fIntValue = ((Integer) this.f132485h.f()).intValue() / 100.0f;
        int iC = (r7.g.c((int) (i * fIntValue)) << 24) | (fVar.m(fVar.b(), fVar.d()) & 16777215);
        e7.a aVar3 = this.f132482b;
        aVar3.setColor(iC);
        g7.u uVar = this.i;
        if (uVar != null) {
            aVar3.setColorFilter((ColorFilter) uVar.f());
        }
        g7.e eVar = this.k;
        if (eVar != null) {
            float fFloatValue = ((Float) eVar.f()).floatValue();
            if (fFloatValue == BitmapDescriptorFactory.HUE_RED) {
                aVar3.setMaskFilter(null);
            } else if (fFloatValue != this.f132487l) {
                n7.b bVar = this.f132483c;
                if (bVar.A == fFloatValue) {
                    maskFilter = bVar.B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar.B = blurMaskFilter;
                    bVar.A = fFloatValue;
                    maskFilter = blurMaskFilter;
                }
                aVar3.setMaskFilter(maskFilter);
            }
            this.f132487l = fFloatValue;
        }
        if (aVar != null) {
            aVar.b((int) (fIntValue * 255.0f), aVar3);
        } else {
            aVar3.clearShadowLayer();
        }
        Path path = this.f132481a;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, aVar3);
                d7.a aVar4 = d7.d.f111646a;
                return;
            } else {
                path.addPath(((o) arrayList.get(i2)).getPath(), matrix);
                i2++;
            }
        }
    }

    @Override // f7.d
    public final String getName() {
        return this.d;
    }
}
