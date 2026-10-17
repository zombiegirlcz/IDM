package tj9;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f271610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f271611b;

    public b(Data management, Data instalmentPlans) {
        Intrinsics.checkNotNullParameter(management, "management");
        Intrinsics.checkNotNullParameter(instalmentPlans, "instalmentPlans");
        this.f271610a = management;
        this.f271611b = instalmentPlans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f271610a, bVar.f271610a) && Intrinsics.f(this.f271611b, bVar.f271611b);
    }

    public final int hashCode() {
        return this.f271611b.hashCode() + (this.f271610a.hashCode() * 31);
    }
}
