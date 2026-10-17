package s8l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f261069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f261070b;

    public c(String str, String confirmedDeeplink) {
        Intrinsics.checkNotNullParameter(confirmedDeeplink, "confirmedDeeplink");
        this.f261069a = str;
        this.f261070b = confirmedDeeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f261069a, cVar.f261069a) && Intrinsics.f(this.f261070b, cVar.f261070b);
    }

    public final int hashCode() {
        String str = this.f261069a;
        return this.f261070b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
