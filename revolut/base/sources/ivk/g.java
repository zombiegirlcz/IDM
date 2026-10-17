package ivk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f168872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f168873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f168874c;
    public final Data d;

    public g() {
        this(0);
    }

    public static g a(g gVar, Data data, Data data2, Data disclaimers, Data data3, int i) {
        if ((i & 1) != 0) {
            data = gVar.f168872a;
        }
        if ((i & 2) != 0) {
            data2 = gVar.f168873b;
        }
        if ((i & 4) != 0) {
            disclaimers = gVar.f168874c;
        }
        if ((i & 8) != 0) {
            data3 = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        return new g(data, data2, disclaimers, data3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f168872a, gVar.f168872a) && Intrinsics.f(this.f168873b, gVar.f168873b) && Intrinsics.f(this.f168874c, gVar.f168874c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        Data data = this.f168872a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f168873b;
        int iC = kii.e.c(this.f168874c, (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31, 31);
        Data data3 = this.d;
        return iC + (data3 != null ? data3.hashCode() : 0);
    }

    public g(Data data, Data data2, Data disclaimers, Data data3) {
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        this.f168872a = data;
        this.f168873b = data2;
        this.f168874c = disclaimers;
        this.d = data3;
    }

    public /* synthetic */ g(int i) {
        this(null, null, new Data(null, null, false, 7, null), null);
    }
}
