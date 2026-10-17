package xoh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.f f307841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f307842b;

    public m(zel.f instrumentGroup, List filters) {
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f307841a = instrumentGroup;
        this.f307842b = filters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f307841a == mVar.f307841a && Intrinsics.f(this.f307842b, mVar.f307842b);
    }

    public final int hashCode() {
        return this.f307842b.hashCode() + (this.f307841a.hashCode() * 31);
    }
}
