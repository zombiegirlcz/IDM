package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o5 f272948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f272949c;

    public n5(String id10, o5 type, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f272947a = id10;
        this.f272948b = type;
        this.f272949c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj2;
        return Intrinsics.f(this.f272947a, n5Var.f272947a) && this.f272948b == n5Var.f272948b && Intrinsics.f(this.f272949c, n5Var.f272949c);
    }

    public final int hashCode() {
        int iHashCode = (this.f272948b.hashCode() + (this.f272947a.hashCode() * 31)) * 31;
        String str = this.f272949c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
