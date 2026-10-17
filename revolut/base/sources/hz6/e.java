package hz6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f157040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f157041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f157042c;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data businessCategoriesData, String searchQuery, boolean z, int i) {
        if ((i & 1) != 0) {
            businessCategoriesData = eVar.f157040a;
        }
        if ((i & 2) != 0) {
            searchQuery = eVar.f157041b;
        }
        if ((i & 4) != 0) {
            z = eVar.f157042c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(businessCategoriesData, "businessCategoriesData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new e(businessCategoriesData, searchQuery, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f157040a, eVar.f157040a) && Intrinsics.f(this.f157041b, eVar.f157041b) && this.f157042c == eVar.f157042c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f157042c) + p.a.c(this.f157040a.hashCode() * 31, 31, this.f157041b);
    }

    public e(Data businessCategoriesData, String searchQuery, boolean z) {
        Intrinsics.checkNotNullParameter(businessCategoriesData, "businessCategoriesData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f157040a = businessCategoriesData;
        this.f157041b = searchQuery;
        this.f157042c = z;
    }

    public /* synthetic */ e(int i) {
        Data data = new Data(null, null, true, 3, null);
        m70.a.c(t0.f186434a);
        this(data, "", false);
    }
}
