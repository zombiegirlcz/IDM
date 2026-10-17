package ka2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f182393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f182394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f182395c;
    public final Data d;

    public h() {
        this(0);
    }

    public static h a(h hVar, boolean z, boolean z3, Data recentsData, Data transactionsContentData, int i) {
        if ((i & 1) != 0) {
            z = hVar.f182393a;
        }
        if ((i & 2) != 0) {
            z3 = hVar.f182394b;
        }
        if ((i & 4) != 0) {
            recentsData = hVar.f182395c;
        }
        if ((i & 8) != 0) {
            transactionsContentData = hVar.d;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(recentsData, "recentsData");
        Intrinsics.checkNotNullParameter(transactionsContentData, "transactionsContentData");
        return new h(recentsData, transactionsContentData, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f182393a == hVar.f182393a && this.f182394b == hVar.f182394b && Intrinsics.f(this.f182395c, hVar.f182395c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f182395c, j6.a.c(Boolean.hashCode(this.f182393a) * 31, 31, this.f182394b), 31);
    }

    public h(Data recentsData, Data transactionsContentData, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(recentsData, "recentsData");
        Intrinsics.checkNotNullParameter(transactionsContentData, "transactionsContentData");
        this.f182393a = z;
        this.f182394b = z3;
        this.f182395c = recentsData;
        this.d = transactionsContentData;
    }

    public /* synthetic */ h(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false, false);
    }
}
