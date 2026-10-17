package upe;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f281991a;

    public g(Data taxResidencies) {
        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
        this.f281991a = taxResidencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f281991a, ((g) obj2).f281991a);
    }

    public final int hashCode() {
        return this.f281991a.hashCode();
    }
}
