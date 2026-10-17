package upe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f281992a;

    public h(List existingTaxResidencies) {
        Intrinsics.checkNotNullParameter(existingTaxResidencies, "existingTaxResidencies");
        this.f281992a = existingTaxResidencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f281992a, ((h) obj2).f281992a);
    }

    public final int hashCode() {
        return this.f281992a.hashCode();
    }
}
