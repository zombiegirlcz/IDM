package vzk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f293547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f293548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f293549c;
    public final Data d;

    public g(Data nationalitiesInputData, Data disclaimerData, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(nationalitiesInputData, "nationalitiesInputData");
        Intrinsics.checkNotNullParameter(disclaimerData, "disclaimerData");
        this.f293547a = z;
        this.f293548b = nationalitiesInputData;
        this.f293549c = z3;
        this.d = disclaimerData;
    }

    public static g a(g gVar, Data nationalitiesInputData, boolean z, Data disclaimerData, int i) {
        boolean z3 = gVar.f293547a;
        if ((i & 2) != 0) {
            nationalitiesInputData = gVar.f293548b;
        }
        if ((i & 4) != 0) {
            z = gVar.f293549c;
        }
        if ((i & 8) != 0) {
            disclaimerData = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(nationalitiesInputData, "nationalitiesInputData");
        Intrinsics.checkNotNullParameter(disclaimerData, "disclaimerData");
        return new g(nationalitiesInputData, disclaimerData, z3, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f293547a == gVar.f293547a && Intrinsics.f(this.f293548b, gVar.f293548b) && this.f293549c == gVar.f293549c && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(kii.e.c(this.f293548b, Boolean.hashCode(this.f293547a) * 31, 31), 31, this.f293549c);
    }
}
