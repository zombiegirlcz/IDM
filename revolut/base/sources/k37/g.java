package k37;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ds6.j f180628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f180629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f180630c;

    public g(ds6.j taxType, Data taxInfo, List list) {
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        Intrinsics.checkNotNullParameter(taxInfo, "taxInfo");
        this.f180628a = taxType;
        this.f180629b = taxInfo;
        this.f180630c = list;
    }

    public static g a(g gVar, Data taxInfo, List list, int i) {
        ds6.j taxType = gVar.f180628a;
        if ((i & 2) != 0) {
            taxInfo = gVar.f180629b;
        }
        if ((i & 4) != 0) {
            list = gVar.f180630c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        Intrinsics.checkNotNullParameter(taxInfo, "taxInfo");
        return new g(taxType, taxInfo, list);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f180628a == gVar.f180628a && Intrinsics.f(this.f180629b, gVar.f180629b) && Intrinsics.f(this.f180630c, gVar.f180630c);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f180629b, this.f180628a.hashCode() * 31, 31);
        List list = this.f180630c;
        return iC + (list == null ? 0 : list.hashCode());
    }
}
