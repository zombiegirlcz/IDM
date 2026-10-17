package wy3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f301065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f301066c;

    public a(a1 a1Var, String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f301064a = title;
        this.f301065b = description;
        this.f301066c = a1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f301064a, aVar.f301064a) && Intrinsics.f(this.f301065b, aVar.f301065b) && this.f301066c == aVar.f301066c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f301064a.hashCode() * 31, 31, this.f301065b);
        a1 a1Var = this.f301066c;
        return iC + (a1Var == null ? 0 : a1Var.hashCode());
    }
}
