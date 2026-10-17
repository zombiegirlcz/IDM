package q35;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f241837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f241838b;

    public q(xi0.b currency, a state) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f241837a = currency;
        this.f241838b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f241837a, qVar.f241837a) && this.f241838b == qVar.f241838b;
    }

    @Override // q35.o
    public final a getState() {
        return this.f241838b;
    }

    public final int hashCode() {
        return this.f241838b.hashCode() + (this.f241837a.hashCode() * 31);
    }
}
