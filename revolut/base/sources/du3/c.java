package du3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f117559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117560b;

    public c(a1 a1Var, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f117559a = a1Var;
        this.f117560b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f117559a == cVar.f117559a && Intrinsics.f(this.f117560b, cVar.f117560b);
    }

    public final int hashCode() {
        a1 a1Var = this.f117559a;
        return this.f117560b.hashCode() + ((a1Var == null ? 0 : a1Var.hashCode()) * 31);
    }
}
