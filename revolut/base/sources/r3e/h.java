package r3e;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f251282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f251283c;

    public h() {
        this(false, 7);
    }

    public static h a(h hVar, String searchQuery, Data searchMegaOffers, int i) {
        if ((i & 1) != 0) {
            searchQuery = hVar.f251281a;
        }
        if ((i & 2) != 0) {
            searchMegaOffers = hVar.f251282b;
        }
        boolean z = hVar.f251283c;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(searchMegaOffers, "searchMegaOffers");
        return new h(searchMegaOffers, searchQuery, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f251281a, hVar.f251281a) && Intrinsics.f(this.f251282b, hVar.f251282b) && this.f251283c == hVar.f251283c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f251283c) + kii.e.c(this.f251282b, this.f251281a.hashCode() * 31, 31);
    }

    public h(Data searchMegaOffers, String searchQuery, boolean z) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(searchMegaOffers, "searchMegaOffers");
        this.f251281a = searchQuery;
        this.f251282b = searchMegaOffers;
        this.f251283c = z;
    }

    public /* synthetic */ h(boolean z, int i) {
        this(new Data(null, null, true, 3, null), "", (i & 4) != 0 ? false : z);
    }
}
