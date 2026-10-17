package r5b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f251574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f251575c;
    public final String d;

    public j(String title, String subtitle, String cardUrl, String logoUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(cardUrl, "cardUrl");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        this.f251573a = title;
        this.f251574b = subtitle;
        this.f251575c = cardUrl;
        this.d = logoUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f251573a, jVar.f251573a) && Intrinsics.f(this.f251574b, jVar.f251574b) && Intrinsics.f(this.f251575c, jVar.f251575c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f251573a.hashCode() * 31, 31, this.f251574b), 31, this.f251575c);
    }
}
