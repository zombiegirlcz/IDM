package p9;

import java.io.Serializable;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes16.dex */
public final class o implements x9.a, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f234232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f234233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Annotation f234234c;
    public final Annotation d;

    public o(Class cls, Annotation annotation, Class cls2, Annotation annotation2) {
        this.f234232a = cls;
        this.f234234c = annotation;
        this.f234233b = cls2;
        this.d = annotation2;
    }

    @Override // x9.a
    public final Annotation a(Class cls) {
        if (this.f234232a == cls) {
            return this.f234234c;
        }
        if (this.f234233b == cls) {
            return this.d;
        }
        return null;
    }

    @Override // x9.a
    public final int size() {
        return 2;
    }
}
