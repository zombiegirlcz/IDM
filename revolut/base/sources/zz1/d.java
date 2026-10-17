package zz1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f326481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f326482b;

    public d(c type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f326481a = type;
        this.f326482b = value;
    }

    public final String a() {
        return this.f326482b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f326481a == dVar.f326481a && Intrinsics.f(this.f326482b, dVar.f326482b);
    }

    public final int hashCode() {
        return this.f326482b.hashCode() + (this.f326481a.hashCode() * 31);
    }
}
