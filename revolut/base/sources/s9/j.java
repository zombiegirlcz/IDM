package s9;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes16.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w9.f f261081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JavaType f261082b;

    public j(JavaType javaType, w9.f fVar) {
        this.f261082b = javaType;
        this.f261081a = fVar;
    }

    public abstract String a(Object obj2);

    public abstract String b(Object obj2, Class cls);
}
