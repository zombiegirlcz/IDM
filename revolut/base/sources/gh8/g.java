package gh8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143885a;

    public g(String otp) {
        Intrinsics.checkNotNullParameter(otp, "otp");
        this.f143885a = otp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f143885a, ((g) obj2).f143885a);
    }

    public final int hashCode() {
        return this.f143885a.hashCode();
    }
}
