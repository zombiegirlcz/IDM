package wz6;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f301372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cgc.g f301373b;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f301372a, dVar.f301372a) && Intrinsics.f(this.f301373b, dVar.f301373b);
    }

    public final int hashCode() {
        int iHashCode = this.f301372a.hashCode() * 31;
        cgc.g gVar = this.f301373b;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public d(Data perksData, cgc.g gVar) {
        Intrinsics.checkNotNullParameter(perksData, "perksData");
        this.f301372a = perksData;
        this.f301373b = gVar;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null), null);
    }
}
