package mul;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f209055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f209056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f209057c;

    public h(n instrument, Data breakdownData, boolean z) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(breakdownData, "breakdownData");
        this.f209055a = instrument;
        this.f209056b = breakdownData;
        this.f209057c = z;
    }

    public static h a(h hVar, Data breakdownData, boolean z, int i) {
        n instrument = hVar.f209055a;
        if ((i & 2) != 0) {
            breakdownData = hVar.f209056b;
        }
        if ((i & 4) != 0) {
            z = hVar.f209057c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(breakdownData, "breakdownData");
        return new h(instrument, breakdownData, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f209055a, hVar.f209055a) && Intrinsics.f(this.f209056b, hVar.f209056b) && this.f209057c == hVar.f209057c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f209057c) + kii.e.c(this.f209056b, this.f209055a.hashCode() * 31, 31);
    }
}
