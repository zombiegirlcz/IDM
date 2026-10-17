package hs3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f154904b;

    public k1(String str, i1 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f154903a = str;
        this.f154904b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return Intrinsics.f(this.f154903a, k1Var.f154903a) && Intrinsics.f(this.f154904b, k1Var.f154904b);
    }

    public final int hashCode() {
        String str = this.f154903a;
        return this.f154904b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
