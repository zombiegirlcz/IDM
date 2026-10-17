package fs3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f137578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137579b;

    public d(a1 a1Var, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f137578a = a1Var;
        this.f137579b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f137578a == dVar.f137578a && Intrinsics.f(this.f137579b, dVar.f137579b);
    }

    public final int hashCode() {
        a1 a1Var = this.f137578a;
        return this.f137579b.hashCode() + ((a1Var == null ? 0 : a1Var.hashCode()) * 31);
    }
}
