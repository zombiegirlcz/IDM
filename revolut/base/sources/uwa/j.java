package uwa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f283580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pwa.n f283581c;

    public j(String str, int i, pwa.n campaignType) {
        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
        this.f283579a = str;
        this.f283580b = i;
        this.f283581c = campaignType;
    }

    public final pwa.n a() {
        return this.f283581c;
    }

    public final String b() {
        return this.f283579a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f283579a, jVar.f283579a) && this.f283580b == jVar.f283580b && this.f283581c == jVar.f283581c;
    }

    public final int hashCode() {
        String str = this.f283579a;
        return this.f283581c.hashCode() + j6.a.b(this.f283580b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }
}
