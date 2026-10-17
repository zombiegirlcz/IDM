package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f273104c;

    public u5(String id10, String name, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f273102a = id10;
        this.f273103b = name;
        this.f273104c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj2;
        return Intrinsics.f(this.f273102a, u5Var.f273102a) && Intrinsics.f(this.f273103b, u5Var.f273103b) && Intrinsics.f(this.f273104c, u5Var.f273104c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f273102a.hashCode() * 31, 31, this.f273103b);
        String str = this.f273104c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
