package as6;

import as6.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f8808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m.c f8809b;

    public h(c fee2, m.c ruleType) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(ruleType, "ruleType");
        this.f8808a = fee2;
        this.f8809b = ruleType;
    }

    @Override // as6.l
    public final c a() {
        return this.f8808a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f8808a, hVar.f8808a) && Intrinsics.f(this.f8809b, hVar.f8809b);
    }

    public final int hashCode() {
        return this.f8809b.hashCode() + (this.f8808a.hashCode() * 31);
    }
}
