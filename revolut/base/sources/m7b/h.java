package m7b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203375b;

    public h(String text, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f203374a = text;
        this.f203375b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f203374a, hVar.f203374a) && Intrinsics.f(this.f203375b, hVar.f203375b);
    }

    public final int hashCode() {
        int iHashCode = this.f203374a.hashCode() * 31;
        String str = this.f203375b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
