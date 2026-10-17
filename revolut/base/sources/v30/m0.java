package v30;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f285807a;

    public m0(j detailedChat) {
        Intrinsics.checkNotNullParameter(detailedChat, "detailedChat");
        this.f285807a = detailedChat;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m0) && Intrinsics.f(this.f285807a, ((m0) obj2).f285807a);
    }

    public final int hashCode() {
        return this.f285807a.hashCode();
    }
}
