package p9;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes16.dex */
public abstract class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q[] f234247b = new q[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Annotation[] f234248c = new Annotation[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9.p f234249a;

    public v(k9.p pVar) {
        this.f234249a = pVar;
    }

    public final p a(p pVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            pVar = pVar.b(annotation);
            if (this.f234249a.m0(annotation)) {
                pVar = d(pVar, annotation);
            }
        }
        return pVar;
    }

    public final p b(Annotation[] annotationArr) {
        p pVarB = l.f234228b;
        for (Annotation annotation : annotationArr) {
            pVarB = pVarB.b(annotation);
            if (this.f234249a.m0(annotation)) {
                pVarB = d(pVarB, annotation);
            }
        }
        return pVarB;
    }

    public final p c(p pVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!pVar.i(annotation)) {
                pVar = pVar.b(annotation);
                k9.p pVar2 = this.f234249a;
                if (pVar2.m0(annotation)) {
                    for (Annotation annotation2 : x9.f.h(annotation.annotationType())) {
                        if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !pVar.i(annotation2)) {
                            pVar = pVar.b(annotation2);
                            if (pVar2.m0(annotation2)) {
                                pVar = d(pVar, annotation2);
                            }
                        }
                    }
                }
            }
        }
        return pVar;
    }

    public final p d(p pVar, Annotation annotation) {
        for (Annotation annotation2 : x9.f.h(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention)) {
                if (!this.f234249a.m0(annotation2)) {
                    pVar = pVar.b(annotation2);
                } else if (!pVar.i(annotation2)) {
                    pVar = d(pVar.b(annotation2), annotation2);
                }
            }
        }
        return pVar;
    }
}
