package a2l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f895c;
    public final String d;
    public final String e;
    public final c f;

    public b(String backgroundImageUrl, String partnerName, String tier, String partnerIconUrl, String str, c cVar) {
        Intrinsics.checkNotNullParameter(backgroundImageUrl, "backgroundImageUrl");
        Intrinsics.checkNotNullParameter(partnerName, "partnerName");
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(partnerIconUrl, "partnerIconUrl");
        this.f893a = backgroundImageUrl;
        this.f894b = partnerName;
        this.f895c = tier;
        this.d = partnerIconUrl;
        this.e = str;
        this.f = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f893a, bVar.f893a) && Intrinsics.f(this.f894b, bVar.f894b) && Intrinsics.f(this.f895c, bVar.f895c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f893a.hashCode() * 31, 31, this.f894b), 31, this.f895c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.f;
        return iHashCode + (cVar != null ? cVar.f896a.hashCode() : 0);
    }
}
