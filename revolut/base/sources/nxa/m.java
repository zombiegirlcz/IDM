package nxa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pwa.n f220507b;

    public m(String code, pwa.n campaignType) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
        this.f220506a = code;
        this.f220507b = campaignType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f220506a, mVar.f220506a) && this.f220507b == mVar.f220507b;
    }

    public final int hashCode() {
        return this.f220507b.hashCode() + (this.f220506a.hashCode() * 31);
    }
}
