package i9i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f159876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f159877c;

    public a(String url2, int i, int i2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f159875a = url2;
        this.f159876b = i;
        this.f159877c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f159875a, aVar.f159875a) && this.f159876b == aVar.f159876b && this.f159877c == aVar.f159877c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f159877c) + j6.a.b(this.f159876b, this.f159875a.hashCode() * 31, 31);
    }
}
