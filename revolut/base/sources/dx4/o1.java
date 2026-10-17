package dx4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f120700b;

    public o1(String buttonText, l lVar) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f120699a = buttonText;
        this.f120700b = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj2;
        return Intrinsics.f(this.f120699a, o1Var.f120699a) && Intrinsics.f(this.f120700b, o1Var.f120700b);
    }

    public final int hashCode() {
        int iHashCode = this.f120699a.hashCode() * 31;
        l lVar = this.f120700b;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }
}
