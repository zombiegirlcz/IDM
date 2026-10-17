package dx4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f120609b;

    public g5(String text, l lVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f120608a = text;
        this.f120609b = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj2;
        return Intrinsics.f(this.f120608a, g5Var.f120608a) && Intrinsics.f(this.f120609b, g5Var.f120609b);
    }

    public final int hashCode() {
        int iHashCode = this.f120608a.hashCode() * 31;
        l lVar = this.f120609b;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }
}
