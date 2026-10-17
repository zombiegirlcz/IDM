package iu3;

import dx4.z2;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f168483c;
    public final z2 d;

    public k(String questionId, String title, String value, z2 z2Var) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f168481a = questionId;
        this.f168482b = title;
        this.f168483c = value;
        this.d = z2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f168481a, kVar.f168481a) && Intrinsics.f(this.f168482b, kVar.f168482b) && Intrinsics.f(this.f168483c, kVar.f168483c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f168481a.hashCode() * 31, 31, this.f168482b), 31, this.f168483c);
        z2 z2Var = this.d;
        return iC + (z2Var == null ? 0 : z2Var.hashCode());
    }
}
