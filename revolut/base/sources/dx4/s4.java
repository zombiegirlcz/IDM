package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s4 implements v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f120767a;

    public s4(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f120767a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s4) && Intrinsics.f(this.f120767a, ((s4) obj2).f120767a);
    }

    public final int hashCode() {
        return this.f120767a.hashCode();
    }
}
