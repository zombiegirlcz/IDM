package s9;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes16.dex */
public final class f extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f261075c;

    public f(JavaType javaType, w9.f fVar) {
        super(javaType, fVar);
        String name = javaType.f26182a.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            this.f261075c = ".";
        } else {
            this.f261075c = name.substring(0, iLastIndexOf + 1);
            name.substring(0, iLastIndexOf);
        }
    }

    @Override // s9.e, s9.j
    public final String a(Object obj2) {
        String name = obj2.getClass().getName();
        return name.startsWith(this.f261075c) ? name.substring(r0.length() - 1) : name;
    }
}
