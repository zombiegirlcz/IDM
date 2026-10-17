package cn;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mm.a f25323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f25324b;

    public a(mm.a action, Object obj2) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f25323a = action;
        this.f25324b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f25323a, aVar.f25323a) && Intrinsics.f(this.f25324b, aVar.f25324b);
    }

    public final int hashCode() {
        int iHashCode = this.f25323a.hashCode() * 31;
        Object obj2 = this.f25324b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
