package iv9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168800b;

    public n(String localId, String messageId) {
        Intrinsics.checkNotNullParameter(localId, "localId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.f168799a = localId;
        this.f168800b = messageId;
    }

    public final String a() {
        return this.f168799a;
    }

    public final String b() {
        return this.f168800b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f168799a, nVar.f168799a) && Intrinsics.f(this.f168800b, nVar.f168800b);
    }

    public final int hashCode() {
        return this.f168800b.hashCode() + (this.f168799a.hashCode() * 31);
    }
}
