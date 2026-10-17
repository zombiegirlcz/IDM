package tof;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v3 f273100c;
    public final List d;
    public final String e;

    public u3(String str, String str2, v3 v3Var, ArrayList arrayList, String str3) {
        this.f273098a = str;
        this.f273099b = str2;
        this.f273100c = v3Var;
        this.d = arrayList;
        this.e = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj2;
        return Intrinsics.f(this.f273098a, u3Var.f273098a) && Intrinsics.f(this.f273099b, u3Var.f273099b) && Intrinsics.f(this.f273100c, u3Var.f273100c) && Intrinsics.f(this.d, u3Var.d) && Intrinsics.f(this.e, u3Var.e);
    }

    public final int hashCode() {
        String str = this.f273098a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f273099b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        v3 v3Var = this.f273100c;
        int iHashCode3 = (iHashCode2 + (v3Var == null ? 0 : v3Var.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
