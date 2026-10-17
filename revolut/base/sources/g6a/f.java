package g6a;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f140899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f140900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f140901c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public f() {
        this(0);
    }

    public static f a(f fVar, Data data, String str, Data data2, boolean z, String str2, boolean z3, int i) {
        if ((i & 1) != 0) {
            data = fVar.f140899a;
        }
        Data details = data;
        if ((i & 2) != 0) {
            str = fVar.f140900b;
        }
        String selectedTab = str;
        if ((i & 4) != 0) {
            data2 = fVar.f140901c;
        }
        Data searchResult = data2;
        if ((i & 8) != 0) {
            z = fVar.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            str2 = fVar.e;
        }
        String searchQuery = str2;
        if ((i & 32) != 0) {
            z3 = fVar.f;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(searchResult, "searchResult");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new f(details, selectedTab, searchResult, z4, searchQuery, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f140899a, fVar.f140899a) && Intrinsics.f(this.f140900b, fVar.f140900b) && Intrinsics.f(this.f140901c, fVar.f140901c) && this.d == fVar.d && Intrinsics.f(this.e, fVar.e) && this.f == fVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + p.a.c(j6.a.c(kii.e.c(this.f140901c, p.a.c(this.f140899a.hashCode() * 31, 31, this.f140900b), 31), 31, this.d), 31, this.e);
    }

    public f(Data details, String selectedTab, Data searchResult, boolean z, String searchQuery, boolean z3) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(searchResult, "searchResult");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f140899a = details;
        this.f140900b = selectedTab;
        this.f140901c = searchResult;
        this.d = z;
        this.e = searchQuery;
        this.f = z3;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null), "", new Data(null, null, true, 3, null), false, "", false);
    }
}
