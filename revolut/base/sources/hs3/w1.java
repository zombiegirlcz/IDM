package hs3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154964c;

    public w1(String title, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f154962a = title;
        this.f154963b = str;
        this.f154964c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.f154962a, w1Var.f154962a) && Intrinsics.f(this.f154963b, w1Var.f154963b) && Intrinsics.f(this.f154964c, w1Var.f154964c);
    }

    public final int hashCode() {
        int iHashCode = this.f154962a.hashCode() * 31;
        String str = this.f154963b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f154964c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
