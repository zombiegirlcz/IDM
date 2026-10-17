package k9;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ArrayType;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Map;
import p9.c0;
import p9.h0;
import p9.w;

/* JADX INFO: loaded from: classes16.dex */
public final class t extends m9.i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j9.f f182197l = new j9.f();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f182198m = m9.h.c(u.class);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.fasterxml.jackson.core.p f182199j;
    public final int k;

    public t(m9.a aVar, s9.g gVar, h0 h0Var, x9.o oVar, cnm.c cVar) {
        super(aVar, gVar, h0Var, oVar, cVar);
        this.k = f182198m;
        this.f182199j = f182197l;
    }

    @Override // m9.i
    public final m9.i k(long j2) {
        return new t(this, j2, this.k);
    }

    public final p9.r m(JavaType javaType) {
        ((p9.s) this.f203599b.f203591b).getClass();
        p9.r rVarN = p9.s.n(this, javaType);
        Class cls = javaType.f26182a;
        if (rVarN == null) {
            rVarN = (javaType.H0() && !(javaType instanceof ArrayType) && x9.f.p(cls) && (Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls))) ? p9.r.d(this, javaType, p9.s.o(this, javaType, this)) : null;
            if (rVarN == null) {
                p9.a aVarO = p9.s.o(this, javaType, this);
                Annotation[] annotationArr = x9.f.f303505a;
                Class superclass = cls.getSuperclass();
                return new p9.r(new c0(this, javaType, aVarO, (superclass == null || !"com.android.tools.r8.RecordTag".equals(superclass.getName())) ? new jji.e(this, "set") : new w(this, aVarO)));
            }
        }
        return rVarN;
    }

    public final boolean n(u uVar) {
        return (uVar.getMask() & this.k) != 0;
    }

    public t(t tVar, long j2, int i) {
        super(tVar, j2);
        this.k = i;
        this.f182199j = tVar.f182199j;
    }
}
