package s69;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260186b;

    public u(String str, String str2) {
        this.f260185a = str;
        this.f260186b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f260185a, uVar.f260185a) && Intrinsics.f(this.f260186b, uVar.f260186b);
    }

    public final int hashCode() {
        String str = this.f260185a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f260186b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
