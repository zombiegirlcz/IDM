package d0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110435b;

    public u(String type, String url2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f110434a = type;
        this.f110435b = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f110434a, uVar.f110434a) && Intrinsics.f(this.f110435b, uVar.f110435b);
    }

    public final int hashCode() {
        return this.f110435b.hashCode() + (this.f110434a.hashCode() * 31);
    }
}
