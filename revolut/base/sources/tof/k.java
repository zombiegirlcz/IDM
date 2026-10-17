package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f272868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f272870c;
    public final String d;
    public final String e;
    public final String f;

    public k(l type, String id10, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f272868a = type;
        this.f272869b = id10;
        this.f272870c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f272868a == kVar.f272868a && Intrinsics.f(this.f272869b, kVar.f272869b) && Intrinsics.f(this.f272870c, kVar.f272870c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f);
    }

    public final String getId() {
        return this.f272869b;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f272868a.hashCode() * 31, 31, this.f272869b);
        String str = this.f272870c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
