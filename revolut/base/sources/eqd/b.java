package eqd;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f128433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f128434b;

    public b(a config, Data data) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f128433a = config;
        this.f128434b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f128433a, bVar.f128433a) && Intrinsics.f(this.f128434b, bVar.f128434b);
    }

    public final int hashCode() {
        int iHashCode = this.f128433a.hashCode() * 31;
        Data data = this.f128434b;
        return iHashCode + (data == null ? 0 : data.hashCode());
    }
}
