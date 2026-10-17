package p9;

import java.lang.annotation.Annotation;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public final class n extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class f234230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Annotation f234231c;

    @Override // p9.p
    public final p b(Annotation annotation) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        Class<? extends Annotation> cls = this.f234230b;
        if (cls != clsAnnotationType) {
            return new m(cls, this.f234231c, clsAnnotationType, annotation);
        }
        this.f234231c = annotation;
        return this;
    }

    @Override // p9.p
    public final q c() {
        Class cls = this.f234230b;
        Annotation annotation = this.f234231c;
        HashMap map = new HashMap(4);
        map.put(cls, annotation);
        return new q(map);
    }

    @Override // p9.p
    public final x9.a d() {
        return new k9.c(this.f234230b, this.f234231c);
    }

    @Override // p9.p
    public final boolean i(Annotation annotation) {
        return annotation.annotationType() == this.f234230b;
    }
}
