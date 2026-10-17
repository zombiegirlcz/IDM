package xu3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f308942b;

    public u(a1 a1Var, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f308941a = text;
        this.f308942b = a1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f308941a, uVar.f308941a) && this.f308942b == uVar.f308942b;
    }

    public final int hashCode() {
        int iHashCode = this.f308941a.hashCode() * 31;
        a1 a1Var = this.f308942b;
        return iHashCode + (a1Var == null ? 0 : a1Var.hashCode());
    }
}
