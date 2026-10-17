package ht3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155275a;

    public g0(String assetId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        this.f155275a = assetId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && Intrinsics.f(this.f155275a, ((g0) obj2).f155275a);
    }

    public final int hashCode() {
        return this.f155275a.hashCode();
    }
}
