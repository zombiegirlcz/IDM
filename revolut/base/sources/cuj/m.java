package cuj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f109050c;
    public final boolean d;

    public m(String collectionId, String campaignId, String str, boolean z) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.f109048a = collectionId;
        this.f109049b = campaignId;
        this.f109050c = str;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f109048a, mVar.f109048a) && Intrinsics.f(this.f109049b, mVar.f109049b) && Intrinsics.f(this.f109050c, mVar.f109050c) && this.d == mVar.d;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f109048a.hashCode() * 31, 31, this.f109049b);
        String str = this.f109050c;
        return Boolean.hashCode(this.d) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
