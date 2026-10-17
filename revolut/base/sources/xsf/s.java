package xsf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f308481b;

    public s() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f308480a, sVar.f308480a) && Intrinsics.f(this.f308481b, sVar.f308481b);
    }

    public final int hashCode() {
        String str = this.f308480a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        dj0.d dVar = this.f308481b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public s(dj0.d dVar, String str) {
        this.f308480a = str;
        this.f308481b = dVar;
    }
}
