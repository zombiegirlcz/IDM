package i85;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import q35.g0;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f159460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f159461b;

    public n(Data screenContent, g0 g0Var) {
        Intrinsics.checkNotNullParameter(screenContent, "screenContent");
        this.f159460a = screenContent;
        this.f159461b = g0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f159460a, nVar.f159460a) && this.f159461b == nVar.f159461b;
    }

    public final int hashCode() {
        int iHashCode = this.f159460a.hashCode() * 31;
        g0 g0Var = this.f159461b;
        return iHashCode + (g0Var == null ? 0 : g0Var.hashCode());
    }
}
