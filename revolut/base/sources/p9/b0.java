package p9;

import d9.e1;

/* JADX INFO: loaded from: classes16.dex */
public final class b0 {
    public static final b0 f = new b0(k9.r.e, Object.class, null, false, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9.r f234191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f234192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f234193c;
    public final Class d;
    public final boolean e;

    public b0(k9.r rVar, Class cls, Class cls2, boolean z, Class cls3) {
        this.f234191a = rVar;
        this.d = cls;
        this.f234192b = cls2;
        this.e = z;
        this.f234193c = cls3 == null ? e1.class : cls3;
    }

    public final String toString() {
        return "ObjectIdInfo: propName=" + this.f234191a + ", scope=" + x9.f.s(this.d) + ", generatorType=" + x9.f.s(this.f234192b) + ", alwaysAsId=" + this.e;
    }
}
