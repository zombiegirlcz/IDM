package ft7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f137960c;

    public b(Object obj2, String text, String uri2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(uri2, "uri");
        this.f137958a = text;
        this.f137959b = uri2;
        this.f137960c = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f137958a, bVar.f137958a) && Intrinsics.f(this.f137959b, bVar.f137959b) && Intrinsics.f(this.f137960c, bVar.f137960c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f137958a.hashCode() * 31, 31, this.f137959b);
        Object obj2 = this.f137960c;
        return iC + (obj2 == null ? 0 : obj2.hashCode());
    }
}
