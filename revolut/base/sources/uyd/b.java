package uyd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f284166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f284167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f284168c;

    public b(int i, boolean z, String str) {
        this.f284166a = i;
        this.f284167b = z;
        this.f284168c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f284166a == bVar.f284166a && this.f284167b == bVar.f284167b && Intrinsics.f(this.f284168c, bVar.f284168c);
    }

    public final int hashCode() {
        int iC = j6.a.c(Integer.hashCode(this.f284166a) * 31, 31, this.f284167b);
        String str = this.f284168c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
