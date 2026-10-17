package hs3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154944b;

    public s1(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f154943a = title;
        this.f154944b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj2;
        return Intrinsics.f(this.f154943a, s1Var.f154943a) && Intrinsics.f(this.f154944b, s1Var.f154944b);
    }

    public final int hashCode() {
        int iHashCode = this.f154943a.hashCode() * 31;
        String str = this.f154944b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
