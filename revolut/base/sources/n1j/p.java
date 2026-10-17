package n1j;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f211396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f211397b;

    public p(Set currencies, q type) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f211396a = currencies;
        this.f211397b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f211396a, pVar.f211396a) && this.f211397b == pVar.f211397b;
    }

    public final int hashCode() {
        return this.f211397b.hashCode() + (this.f211396a.hashCode() * 31);
    }
}
