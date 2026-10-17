package xo1;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f307574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f307575b;

    public i(g paymentMethod, ArrayList inputs) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        this.f307574a = paymentMethod;
        this.f307575b = inputs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f307574a == iVar.f307574a && this.f307575b.equals(iVar.f307575b);
    }

    public final int hashCode() {
        return this.f307575b.hashCode() + (this.f307574a.hashCode() * 31);
    }
}
