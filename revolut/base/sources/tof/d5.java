package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f272690c;

    public d5(String str, String str2, String str3) {
        this.f272688a = str;
        this.f272689b = str2;
        this.f272690c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj2;
        return Intrinsics.f(this.f272688a, d5Var.f272688a) && Intrinsics.f(this.f272689b, d5Var.f272689b) && Intrinsics.f(this.f272690c, d5Var.f272690c);
    }

    public final String getLegalName() {
        return this.f272688a;
    }

    public final int hashCode() {
        String str = this.f272688a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f272689b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f272690c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
