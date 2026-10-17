package bl6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f16479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16480b;

    public g(Data bankData, String searchQuery) {
        Intrinsics.checkNotNullParameter(bankData, "bankData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f16479a = bankData;
        this.f16480b = searchQuery;
    }

    public static g a(g gVar, Data bankData, String searchQuery, int i) {
        if ((i & 1) != 0) {
            bankData = gVar.f16479a;
        }
        if ((i & 2) != 0) {
            searchQuery = gVar.f16480b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(bankData, "bankData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new g(bankData, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f16479a, gVar.f16479a) && Intrinsics.f(this.f16480b, gVar.f16480b);
    }

    public final int hashCode() {
        return this.f16480b.hashCode() + (this.f16479a.hashCode() * 31);
    }
}
