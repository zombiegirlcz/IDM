package dgc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114615c;

    public a(String text, String url2, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f114613a = text;
        this.f114614b = url2;
        this.f114615c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f114613a, aVar.f114613a) && Intrinsics.f(this.f114614b, aVar.f114614b) && Intrinsics.f(this.f114615c, aVar.f114615c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f114613a.hashCode() * 31, 31, this.f114614b);
        String str = this.f114615c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
