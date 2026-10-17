package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f273018c;
    public final String d;
    public final dj0.d e;

    public r0(dj0.d value, String type, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f273016a = type;
        this.f273017b = str;
        this.f273018c = str2;
        this.d = str3;
        this.e = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f273016a, r0Var.f273016a) && Intrinsics.f(this.f273017b, r0Var.f273017b) && Intrinsics.f(this.f273018c, r0Var.f273018c) && Intrinsics.f(this.d, r0Var.d) && Intrinsics.f(this.e, r0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f273016a.hashCode() * 31;
        String str = this.f273017b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f273018c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
