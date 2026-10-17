package jo6;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f176875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f176876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f176877c;
    public final boolean d;
    public final wi0.b e;
    public final List f;

    public k(Data institutionsData, String searchQuery, String str, boolean z, wi0.b bVar, List availableCountries) {
        Intrinsics.checkNotNullParameter(institutionsData, "institutionsData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(availableCountries, "availableCountries");
        this.f176875a = institutionsData;
        this.f176876b = searchQuery;
        this.f176877c = str;
        this.d = z;
        this.e = bVar;
        this.f = availableCountries;
    }

    public static k a(k kVar, Data data, String str, boolean z, wi0.b bVar, List list, int i) {
        if ((i & 1) != 0) {
            data = kVar.f176875a;
        }
        Data institutionsData = data;
        if ((i & 2) != 0) {
            str = kVar.f176876b;
        }
        String searchQuery = str;
        String str2 = kVar.f176877c;
        if ((i & 8) != 0) {
            z = kVar.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            bVar = kVar.e;
        }
        wi0.b bVar2 = bVar;
        if ((i & 32) != 0) {
            list = kVar.f;
        }
        List availableCountries = list;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(institutionsData, "institutionsData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(availableCountries, "availableCountries");
        return new k(institutionsData, searchQuery, str2, z3, bVar2, availableCountries);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f176875a, kVar.f176875a) && Intrinsics.f(this.f176876b, kVar.f176876b) && Intrinsics.f(this.f176877c, kVar.f176877c) && this.d == kVar.d && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f176875a.hashCode() * 31, 31, this.f176876b);
        String str = this.f176877c;
        int iC2 = j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        wi0.b bVar = this.e;
        return this.f.hashCode() + ((iC2 + (bVar != null ? bVar.f297794a.hashCode() : 0)) * 31);
    }
}
