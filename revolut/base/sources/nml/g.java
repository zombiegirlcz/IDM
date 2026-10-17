package nml;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f217378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f217379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f217380c;
    public final Data d;

    public g(Data disclaimerData, wi0.b countryCode, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(disclaimerData, "disclaimerData");
        this.f217378a = countryCode;
        this.f217379b = z;
        this.f217380c = z3;
        this.d = disclaimerData;
    }

    public static g a(g gVar, wi0.b countryCode, boolean z, boolean z3, Data disclaimerData, int i) {
        if ((i & 1) != 0) {
            countryCode = gVar.f217378a;
        }
        if ((i & 2) != 0) {
            z = gVar.f217379b;
        }
        if ((i & 4) != 0) {
            z3 = gVar.f217380c;
        }
        if ((i & 8) != 0) {
            disclaimerData = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(disclaimerData, "disclaimerData");
        return new g(disclaimerData, countryCode, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f217378a, gVar.f217378a) && this.f217379b == gVar.f217379b && this.f217380c == gVar.f217380c && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(j6.a.c(this.f217378a.f297794a.hashCode() * 31, 31, this.f217379b), 31, this.f217380c);
    }
}
