package q4g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f242152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f242153c;
    public final String d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f242154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f242155h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f242156j;
    public final int k;

    public o(String subheaderItemId, String travellerItemIdPrefix, String baggageSubheaderItemIdPrefix, String baggageItemIdPrefix, int i, int i2, int i3, int i5, int i6, int i21, int i22) {
        Intrinsics.checkNotNullParameter(subheaderItemId, "subheaderItemId");
        Intrinsics.checkNotNullParameter(travellerItemIdPrefix, "travellerItemIdPrefix");
        Intrinsics.checkNotNullParameter(baggageSubheaderItemIdPrefix, "baggageSubheaderItemIdPrefix");
        Intrinsics.checkNotNullParameter(baggageItemIdPrefix, "baggageItemIdPrefix");
        this.f242151a = subheaderItemId;
        this.f242152b = travellerItemIdPrefix;
        this.f242153c = baggageSubheaderItemIdPrefix;
        this.d = baggageItemIdPrefix;
        this.e = i;
        this.f = i2;
        this.f242154g = i3;
        this.f242155h = i5;
        this.i = i6;
        this.f242156j = i21;
        this.k = i22;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f242151a, oVar.f242151a) && Intrinsics.f(this.f242152b, oVar.f242152b) && Intrinsics.f(this.f242153c, oVar.f242153c) && Intrinsics.f(this.d, oVar.d) && this.e == oVar.e && this.f == oVar.f && this.f242154g == oVar.f242154g && this.f242155h == oVar.f242155h && this.i == oVar.i && this.f242156j == oVar.f242156j && this.k == oVar.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + j6.a.b(this.f242156j, j6.a.b(this.i, j6.a.b(this.f242155h, j6.a.b(this.f242154g, j6.a.b(this.f, j6.a.b(this.e, p.a.c(p.a.c(p.a.c(this.f242151a.hashCode() * 31, 31, this.f242152b), 31, this.f242153c), 31, this.d), 31), 31), 31), 31), 31), 31);
    }
}
