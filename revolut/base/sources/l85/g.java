package l85;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import q35.g0;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f192789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f192790b;

    public g(Data screenContent, g0 g0Var) {
        Intrinsics.checkNotNullParameter(screenContent, "screenContent");
        this.f192789a = screenContent;
        this.f192790b = g0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f192789a, gVar.f192789a) && this.f192790b == gVar.f192790b;
    }

    public final int hashCode() {
        int iHashCode = this.f192789a.hashCode() * 31;
        g0 g0Var = this.f192790b;
        return iHashCode + (g0Var == null ? 0 : g0Var.hashCode());
    }
}
