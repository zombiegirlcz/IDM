package p9;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes16.dex */
public final class l extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f234228b = new l();

    @Override // p9.p
    public final p b(Annotation annotation) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        n nVar = new n();
        nVar.f234230b = clsAnnotationType;
        nVar.f234231c = annotation;
        return nVar;
    }

    @Override // p9.p
    public final q c() {
        return new q(0);
    }

    @Override // p9.p
    public final x9.a d() {
        return p.f234235a;
    }

    @Override // p9.p
    public final boolean i(Annotation annotation) {
        return false;
    }
}
