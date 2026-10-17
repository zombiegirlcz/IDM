package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216040b;

    public t1(String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f216039a = id10;
        this.f216040b = str;
    }

    public final String a() {
        return this.f216039a;
    }

    public final String b() {
        return this.f216040b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj2;
        return Intrinsics.f(this.f216039a, t1Var.f216039a) && Intrinsics.f(this.f216040b, t1Var.f216040b);
    }

    public final int hashCode() {
        int iHashCode = this.f216039a.hashCode() * 31;
        String str = this.f216040b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
