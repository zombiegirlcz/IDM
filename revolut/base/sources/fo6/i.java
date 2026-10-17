package fo6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f136828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136829b;

    public i(Data branchesData, String searchQuery) {
        Intrinsics.checkNotNullParameter(branchesData, "branchesData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f136828a = branchesData;
        this.f136829b = searchQuery;
    }

    public static i a(i iVar, Data branchesData, String searchQuery, int i) {
        if ((i & 1) != 0) {
            branchesData = iVar.f136828a;
        }
        if ((i & 2) != 0) {
            searchQuery = iVar.f136829b;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(branchesData, "branchesData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new i(branchesData, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f136828a, iVar.f136828a) && Intrinsics.f(this.f136829b, iVar.f136829b);
    }

    public final int hashCode() {
        return this.f136829b.hashCode() + (this.f136828a.hashCode() * 31);
    }
}
