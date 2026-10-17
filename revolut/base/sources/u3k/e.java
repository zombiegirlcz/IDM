package u3k;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f276944b;

    public e() {
        this(0);
    }

    public static e a(e eVar, String searchQuery, Data countryData, int i) {
        if ((i & 1) != 0) {
            searchQuery = eVar.f276943a;
        }
        if ((i & 2) != 0) {
            countryData = eVar.f276944b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(countryData, "countryData");
        return new e(countryData, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f276943a, eVar.f276943a) && Intrinsics.f(this.f276944b, eVar.f276944b);
    }

    public final int hashCode() {
        return this.f276944b.hashCode() + (this.f276943a.hashCode() * 31);
    }

    public e(Data countryData, String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(countryData, "countryData");
        this.f276943a = searchQuery;
        this.f276944b = countryData;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i) {
        this(new Data(null, null, false, 7, null), "");
        m70.a.c(t0.f186434a);
    }
}
