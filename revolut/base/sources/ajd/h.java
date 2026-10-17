package ajd;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f5543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5544c;
    public final boolean d;
    public final Data e;

    public h() {
        this(0);
    }

    public static h a(h hVar, List list, Data data, String str, boolean z, Data data2, int i) {
        if ((i & 1) != 0) {
            list = hVar.f5542a;
        }
        List recentSearches = list;
        if ((i & 2) != 0) {
            data = hVar.f5543b;
        }
        Data data3 = data;
        if ((i & 4) != 0) {
            str = hVar.f5544c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z = hVar.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            data2 = hVar.e;
        }
        Data revPointsState = data2;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(recentSearches, "recentSearches");
        Intrinsics.checkNotNullParameter(revPointsState, "revPointsState");
        return new h(recentSearches, data3, str2, z3, revPointsState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f5542a, hVar.f5542a) && Intrinsics.f(this.f5543b, hVar.f5543b) && Intrinsics.f(this.f5544c, hVar.f5544c) && this.d == hVar.d && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f5542a.hashCode() * 31;
        Data data = this.f5543b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        String str = this.f5544c;
        return this.e.hashCode() + j6.a.c((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.d);
    }

    public h(List recentSearches, Data data, String str, boolean z, Data revPointsState) {
        Intrinsics.checkNotNullParameter(recentSearches, "recentSearches");
        Intrinsics.checkNotNullParameter(revPointsState, "revPointsState");
        this.f5542a = recentSearches;
        this.f5543b = data;
        this.f5544c = str;
        this.d = z;
        this.e = revPointsState;
    }

    public h(int i) {
        this(f0.f322471a, null, null, false, new Data(null, null, true, 3, null));
    }
}
