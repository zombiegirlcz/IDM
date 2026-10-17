package o0k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f221250b;

    public a(String articleId, boolean z) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        this.f221249a = articleId;
        this.f221250b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f221249a, aVar.f221249a) && this.f221250b == aVar.f221250b;
    }

    public final int hashCode() {
        return j6.a.c(this.f221249a.hashCode() * 31, 31, this.f221250b);
    }
}
