package c12;

import com.revolut.feature.apm.core.models.alias.AliasType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasType f20325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20326b;

    public d(AliasType type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f20325a = type;
        this.f20326b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f20325a, dVar.f20325a) && Intrinsics.f(this.f20326b, dVar.f20326b);
    }

    public final int hashCode() {
        return this.f20326b.hashCode() + (this.f20325a.hashCode() * 31);
    }
}
