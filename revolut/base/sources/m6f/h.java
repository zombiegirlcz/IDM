package m6f;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f203060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f203061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f203062c;

    public h(xi0.b currency, BigDecimal allocation, List list) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        this.f203060a = currency;
        this.f203061b = allocation;
        this.f203062c = list;
    }

    @Override // m6f.j
    public final List U0() {
        return this.f203062c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f203060a, hVar.f203060a) && Intrinsics.f(this.f203061b, hVar.f203061b) && Intrinsics.f(this.f203062c, hVar.f203062c);
    }

    @Override // m6f.j
    public final BigDecimal getAllocation() {
        return this.f203061b;
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f203061b, this.f203060a.hashCode() * 31, 31);
        List list = this.f203062c;
        return iD + (list == null ? 0 : list.hashCode());
    }

    @Override // m6f.j
    public final String i() {
        return this.f203060a.f306286a;
    }
}
