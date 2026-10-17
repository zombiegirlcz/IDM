package ye;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f312727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f312728b;

    public a(int i, d dVar) {
        this.f312727a = i;
        this.f312728b = dVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        a aVar = (a) ((e) obj2);
        return this.f312727a == aVar.f312727a && this.f312728b.equals(aVar.f312728b);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f312727a) + (this.f312728b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f312727a + "intEncoding=" + this.f312728b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
