package oa2;

import com.revolut.feature.apm.core.models.alias.AliasType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasType f223507a;

    public g(AliasType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f223507a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f223507a, ((g) obj2).f223507a);
    }

    public final int hashCode() {
        return this.f223507a.hashCode();
    }
}
