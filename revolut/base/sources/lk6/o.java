package lk6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f196258b;

    public o(String consentId, String thirdPartyTitle) {
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        Intrinsics.checkNotNullParameter(thirdPartyTitle, "thirdPartyTitle");
        this.f196257a = consentId;
        this.f196258b = thirdPartyTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f196257a, oVar.f196257a) && Intrinsics.f(this.f196258b, oVar.f196258b);
    }

    public final int hashCode() {
        return this.f196258b.hashCode() + (this.f196257a.hashCode() * 31);
    }
}
