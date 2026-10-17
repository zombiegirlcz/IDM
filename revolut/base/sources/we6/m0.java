package we6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296655a;

    public m0(String consentId) {
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        this.f296655a = consentId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m0) && Intrinsics.f(this.f296655a, ((m0) obj2).f296655a);
    }

    public final int hashCode() {
        return this.f296655a.hashCode();
    }
}
