package bu3;

import ht3.l0;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f18668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cv3.a f18669b;

    public a(l0 l0Var, cv3.a calculator) {
        Intrinsics.checkNotNullParameter(calculator, "calculator");
        this.f18668a = l0Var;
        this.f18669b = calculator;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f18668a, aVar.f18668a) && Intrinsics.f(this.f18669b, aVar.f18669b);
    }

    public final int hashCode() {
        l0 l0Var = this.f18668a;
        return this.f18669b.hashCode() + ((l0Var == null ? 0 : l0Var.hashCode()) * 31);
    }
}
