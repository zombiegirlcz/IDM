package mgb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205244b;

    public i(String text, String deeplink) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f205243a = text;
        this.f205244b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f205243a, iVar.f205243a) && Intrinsics.f(this.f205244b, iVar.f205244b);
    }

    public final int hashCode() {
        return this.f205244b.hashCode() + (this.f205243a.hashCode() * 31);
    }
}
