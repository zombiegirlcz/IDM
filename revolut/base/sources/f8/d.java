package f8;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f132669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f132670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class f132671c;

    public d(e eVar) {
        this.f132669a = eVar;
    }

    @Override // f8.h
    public final void a() {
        this.f132669a.h(this);
    }

    public final void b(int i, Class cls) {
        this.f132670b = i;
        this.f132671c = cls;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof d) {
            d dVar = (d) obj2;
            if (this.f132670b == dVar.f132670b && this.f132671c == dVar.f132671c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f132670b * 31;
        Class cls = this.f132671c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f132670b + "array=" + this.f132671c + CoreConstants.CURLY_RIGHT;
    }
}
