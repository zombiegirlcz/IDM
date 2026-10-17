package as6;

import as6.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f8803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f8804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m.b f8805c;

    public e(c fee2, wi0.b countryCode, m.b ruleType) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(ruleType, "ruleType");
        this.f8803a = fee2;
        this.f8804b = countryCode;
        this.f8805c = ruleType;
    }

    @Override // as6.l
    public final c a() {
        return this.f8803a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f8803a, eVar.f8803a) && Intrinsics.f(this.f8804b, eVar.f8804b) && Intrinsics.f(this.f8805c, eVar.f8805c);
    }

    public final int hashCode() {
        return this.f8805c.hashCode() + p.a.c(this.f8803a.hashCode() * 31, 31, this.f8804b.f297794a);
    }
}
