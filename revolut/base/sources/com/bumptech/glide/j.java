package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import e8.p;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import r8.q;

/* JADX INFO: loaded from: classes.dex */
public class j extends u8.a {
    public o A;
    public Object B;
    public ArrayList C;
    public j D;
    public j E;
    public boolean F = true;
    public boolean G;
    public boolean H;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f26097w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n f26098x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Class f26099y;
    public final f z;

    static {
    }

    public j(b bVar, n nVar, Class cls, Context context) {
        u8.h hVar;
        this.f26098x = nVar;
        this.f26099y = cls;
        this.f26097w = context;
        Map map = nVar.f26135a.d.f;
        o oVar = (o) map.get(cls);
        if (oVar == null) {
            for (Map.Entry entry : map.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    oVar = (o) entry.getValue();
                }
            }
        }
        this.A = oVar == null ? f.k : oVar;
        this.z = bVar.d;
        Iterator it8 = nVar.i.iterator();
        while (it8.hasNext()) {
            N((u8.g) it8.next());
        }
        synchronized (nVar) {
            hVar = nVar.f26140j;
        }
        a(hVar);
    }

    public j N(u8.g gVar) {
        if (this.f277995s) {
            return clone().N(gVar);
        }
        if (gVar != null) {
            if (this.C == null) {
                this.C = new ArrayList();
            }
            this.C.add(gVar);
        }
        C();
        return this;
    }

    @Override // u8.a
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public j a(u8.a aVar) {
        y8.f.b(aVar);
        return (j) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final u8.c P(Object obj2, v8.l lVar, u8.g gVar, u8.e eVar, o oVar, h hVar, int i, int i2, u8.a aVar, Executor executor) {
        u8.e eVar2;
        u8.e bVar;
        u8.a aVar2;
        u8.c jVar;
        h hVar2;
        if (this.E != null) {
            bVar = new u8.b(obj2, eVar);
            eVar2 = bVar;
        } else {
            eVar2 = null;
            bVar = eVar;
        }
        j jVar2 = this.D;
        f fVar = this.z;
        if (jVar2 == null) {
            aVar2 = aVar;
            jVar = new u8.j(this.f26097w, fVar, obj2, this.B, this.f26099y, aVar2, i, i2, hVar, lVar, gVar, this.C, bVar, fVar.f26091g, oVar.f26141a, executor);
        } else {
            if (this.H) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            o oVar2 = jVar2.F ? oVar : jVar2.A;
            if (u8.a.o(jVar2.f277983a, 8)) {
                hVar2 = this.D.f277985c;
            } else {
                int i3 = i.f26096b[hVar.ordinal()];
                if (i3 == 1) {
                    hVar2 = h.NORMAL;
                } else if (i3 == 2) {
                    hVar2 = h.HIGH;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        throw new IllegalArgumentException("unknown priority: " + this.f277985c);
                    }
                    hVar2 = h.IMMEDIATE;
                }
            }
            h hVar3 = hVar2;
            j jVar3 = this.D;
            int i5 = jVar3.f277988j;
            int i6 = jVar3.i;
            if (y8.l.i(i, i2)) {
                j jVar4 = this.D;
                if (!y8.l.i(jVar4.f277988j, jVar4.i)) {
                    i5 = aVar.f277988j;
                    i6 = aVar.i;
                }
            }
            int i21 = i6;
            u8.k kVar = new u8.k(obj2, bVar);
            u8.j jVar5 = new u8.j(this.f26097w, fVar, obj2, this.B, this.f26099y, aVar, i, i2, hVar, lVar, gVar, this.C, kVar, fVar.f26091g, oVar.f26141a, executor);
            this.H = true;
            j jVar6 = this.D;
            u8.c cVarP = jVar6.P(obj2, lVar, gVar, kVar, oVar2, hVar3, i5, i21, jVar6, executor);
            this.H = false;
            kVar.j(jVar5, cVarP);
            aVar2 = aVar;
            jVar = kVar;
        }
        if (eVar2 == null) {
            return jVar;
        }
        j jVar7 = this.E;
        int i22 = jVar7.f277988j;
        int i32 = jVar7.i;
        if (y8.l.i(i, i2)) {
            j jVar8 = this.E;
            if (!y8.l.i(jVar8.f277988j, jVar8.i)) {
                i22 = aVar2.f277988j;
                i32 = aVar2.i;
            }
        }
        int i33 = i32;
        j jVar9 = this.E;
        u8.b bVar2 = eVar2;
        bVar2.j(jVar, jVar9.P(obj2, lVar, gVar, bVar2, jVar9.A, jVar9.f277985c, i22, i33, jVar9, executor));
        return bVar2;
    }

    @Override // u8.a
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public j clone() {
        j jVar = (j) super.clone();
        jVar.A = jVar.A.clone();
        if (jVar.C != null) {
            jVar.C = new ArrayList(jVar.C);
        }
        j jVar2 = jVar.D;
        if (jVar2 != null) {
            jVar.D = jVar2.clone();
        }
        j jVar3 = jVar.E;
        if (jVar3 != null) {
            jVar.E = jVar3.clone();
        }
        return jVar;
    }

    public final void R(ImageView imageView) {
        u8.a aVarR;
        v8.l fVar;
        y8.l.a();
        y8.f.b(imageView);
        if (!u8.a.o(this.f277983a, 2048) && imageView.getScaleType() != null) {
            switch (i.f26095a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVarR = clone().r();
                    break;
                case 2:
                    aVarR = clone().s();
                    break;
                case 3:
                case 4:
                case 5:
                    aVarR = clone().t();
                    break;
                case 6:
                    aVarR = clone().s();
                    break;
                default:
                    aVarR = this;
                    break;
            }
        } else {
            aVarR = this;
        }
        this.z.f26090c.getClass();
        Class cls = this.f26099y;
        if (Bitmap.class.equals(cls)) {
            fVar = new v8.b(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(a0.d.q("Unhandled class: ", cls, ", try .as*(Class).transcode(ResourceTranscoder)"));
            }
            fVar = new v8.f(imageView);
        }
        S(fVar, null, aVarR, y8.f.f311599a);
    }

    public final void S(v8.l lVar, u8.f fVar, u8.a aVar, Executor executor) {
        y8.f.b(lVar);
        if (!this.G) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        u8.c cVarP = P(new Object(), lVar, fVar, null, this.A, aVar.f277985c, aVar.f277988j, aVar.i, aVar, executor);
        u8.c request = lVar.getRequest();
        if (cVarP.f(request) && (aVar.f277987h || !request.isComplete())) {
            y8.f.c(request, "Argument must not be null");
            if (request.isRunning()) {
                return;
            }
            request.i();
            return;
        }
        this.f26098x.m(lVar);
        lVar.c(cVarP);
        n nVar = this.f26098x;
        synchronized (nVar) {
            nVar.f.f252299a.add(lVar);
            q qVar = nVar.d;
            ((Set) qVar.f252298c).add(cVarP);
            if (qVar.f252297b) {
                cVarP.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                }
                ((HashSet) qVar.d).add(cVarP);
            } else {
                cVarP.i();
            }
        }
    }

    public j T(u8.g gVar) {
        if (this.f277995s) {
            return clone().T(gVar);
        }
        this.C = null;
        return N(gVar);
    }

    public j U(Bitmap bitmap) {
        return b0(bitmap).a((u8.h) new u8.h().g(p.f123506b));
    }

    public j V(Drawable drawable) {
        return b0(drawable).a((u8.h) new u8.h().g(p.f123506b));
    }

    public j W(Uri uri2) {
        j jVarB0 = b0(uri2);
        if (uri2 == null || !"android.resource".equals(uri2.getScheme())) {
            return jVarB0;
        }
        Context context = this.f26097w;
        return (j) ((j) jVarB0.G(context.getTheme())).E(x8.a.a(context));
    }

    public j X(File file) {
        return b0(file);
    }

    public j Y(Integer num) {
        j jVarB0 = b0(num);
        Context context = this.f26097w;
        return (j) ((j) jVarB0.G(context.getTheme())).E(x8.a.a(context));
    }

    public j Z(Object obj2) {
        return b0(obj2);
    }

    public j a0(String str) {
        return b0(str);
    }

    public final j b0(Object obj2) {
        if (this.f277995s) {
            return clone().b0(obj2);
        }
        this.B = obj2;
        this.G = true;
        C();
        return this;
    }

    public final u8.f c0() {
        u8.f fVar = new u8.f();
        S(fVar, fVar, this, y8.f.f311600b);
        return fVar;
    }

    public j d0(j jVar) {
        if (this.f277995s) {
            return clone().d0(jVar);
        }
        this.D = jVar;
        C();
        return this;
    }

    public j e0(n8.b bVar) {
        if (this.f277995s) {
            return clone().e0(bVar);
        }
        this.A = bVar;
        this.F = false;
        C();
        return this;
    }

    @Override // u8.a
    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return super.equals(jVar) && Objects.equals(this.f26099y, jVar.f26099y) && this.A.equals(jVar.A) && Objects.equals(this.B, jVar.B) && Objects.equals(this.C, jVar.C) && Objects.equals(this.D, jVar.D) && Objects.equals(this.E, jVar.E) && this.F == jVar.F && this.G == jVar.G;
    }

    @Override // u8.a
    public final int hashCode() {
        return y8.l.g(this.G ? 1 : 0, y8.l.g(this.F ? 1 : 0, y8.l.h(y8.l.h(y8.l.h(y8.l.h(y8.l.h(y8.l.h(y8.l.h(super.hashCode(), this.f26099y), this.A), this.B), this.C), this.D), this.E), null)));
    }
}
