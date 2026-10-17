package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v2 implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f120802b;

    public v2(a1 a1Var, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f120801a = text;
        this.f120802b = a1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj2;
        return Intrinsics.f(this.f120801a, v2Var.f120801a) && this.f120802b == v2Var.f120802b;
    }

    public final int hashCode() {
        int iHashCode = this.f120801a.hashCode() * 31;
        a1 a1Var = this.f120802b;
        return iHashCode + (a1Var == null ? 0 : a1Var.hashCode());
    }
}
