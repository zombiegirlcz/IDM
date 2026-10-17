package lab;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f193358b;

    public a(String savingId, boolean z) {
        Intrinsics.checkNotNullParameter(savingId, "savingId");
        this.f193357a = savingId;
        this.f193358b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f193357a, aVar.f193357a) && this.f193358b == aVar.f193358b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f193358b) + (this.f193357a.hashCode() * 31);
    }
}
