package bp0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sp0.h f17525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sp0.j f17526b;

    public w(sp0.h type, sp0.j widthMode) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(widthMode, "widthMode");
        this.f17525a = type;
        this.f17526b = widthMode;
    }

    public final sp0.h a() {
        return this.f17525a;
    }

    public final sp0.j b() {
        return this.f17526b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f17525a == wVar.f17525a && this.f17526b == wVar.f17526b;
    }

    public final int hashCode() {
        return this.f17526b.hashCode() + (this.f17525a.hashCode() * 31);
    }
}
