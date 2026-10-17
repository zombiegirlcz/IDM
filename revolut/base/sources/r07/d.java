package r07;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f250708a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f250708a, ((d) obj2).f250708a);
    }

    public final int hashCode() {
        return this.f250708a.hashCode();
    }

    public d(Data taxProfilesSummary) {
        Intrinsics.checkNotNullParameter(taxProfilesSummary, "taxProfilesSummary");
        this.f250708a = taxProfilesSummary;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
