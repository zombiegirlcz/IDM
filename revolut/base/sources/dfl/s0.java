package dfl;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114471b;

    public s0(String str, String str2) {
        this.f114470a = str;
        this.f114471b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f114470a, s0Var.f114470a) && Intrinsics.f(this.f114471b, s0Var.f114471b);
    }

    public final int hashCode() {
        String str = this.f114470a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f114471b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
