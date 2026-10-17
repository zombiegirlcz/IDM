package ll4;

import dx4.a1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f196515b;

    public e(a1 a1Var, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f196514a = text;
        this.f196515b = a1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f196514a, eVar.f196514a) && this.f196515b == eVar.f196515b;
    }

    public final int hashCode() {
        int iHashCode = this.f196514a.hashCode() * 31;
        a1 a1Var = this.f196515b;
        return iHashCode + (a1Var == null ? 0 : a1Var.hashCode());
    }
}
