package jbj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f172647b;

    public a(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f172646a = name;
        this.f172647b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f172646a, aVar.f172646a) && Intrinsics.f(this.f172647b, aVar.f172647b);
    }

    public final int hashCode() {
        int iHashCode = this.f172646a.hashCode() * 31;
        String str = this.f172647b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
