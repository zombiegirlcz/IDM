package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f273035c;
    public final String d;
    public final String e;

    public s(String orderId, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.f273033a = orderId;
        this.f273034b = str;
        this.f273035c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f273033a, sVar.f273033a) && Intrinsics.f(this.f273034b, sVar.f273034b) && Intrinsics.f(this.f273035c, sVar.f273035c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f273033a.hashCode() * 31;
        String str = this.f273034b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f273035c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
