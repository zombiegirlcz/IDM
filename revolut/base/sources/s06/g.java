package s06;

import com.revolut.kompot.common.ParcelableDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelableDestination f258853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f258854b;

    public g(ParcelableDestination destination, String template) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(template, "template");
        this.f258853a = destination;
        this.f258854b = template;
    }

    public final String a() {
        return this.f258854b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f258853a, gVar.f258853a) && Intrinsics.f(this.f258854b, gVar.f258854b);
    }

    public final int hashCode() {
        return this.f258854b.hashCode() + (this.f258853a.hashCode() * 31);
    }
}
