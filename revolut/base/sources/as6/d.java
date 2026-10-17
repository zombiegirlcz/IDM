package as6;

import as6.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f8801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m.a f8802b;

    public d(c fee2, m.a ruleType) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(ruleType, "ruleType");
        this.f8801a = fee2;
        this.f8802b = ruleType;
    }

    @Override // as6.l
    public final c a() {
        return this.f8801a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f8801a, dVar.f8801a) && Intrinsics.f(this.f8802b, dVar.f8802b);
    }

    public final int hashCode() {
        return this.f8802b.hashCode() + (this.f8801a.hashCode() * 31);
    }
}
