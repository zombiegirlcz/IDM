package my3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f210305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f210306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f210307c;

    public d(a1 a1Var, String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f210305a = a1Var;
        this.f210306b = title;
        this.f210307c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f210305a == dVar.f210305a && Intrinsics.f(this.f210306b, dVar.f210306b) && Intrinsics.f(this.f210307c, dVar.f210307c);
    }

    public final int hashCode() {
        a1 a1Var = this.f210305a;
        return this.f210307c.hashCode() + p.a.c((a1Var == null ? 0 : a1Var.hashCode()) * 31, 31, this.f210306b);
    }
}
