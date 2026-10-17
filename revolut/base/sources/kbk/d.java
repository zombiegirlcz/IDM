package kbk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f182621b;

    public d(String url2, c type) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f182620a = url2;
        this.f182621b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f182620a, dVar.f182620a) && this.f182621b == dVar.f182621b;
    }

    public final int hashCode() {
        return this.f182621b.hashCode() + (this.f182620a.hashCode() * 31);
    }
}
