package hg9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152121c;

    public h(String title, String subtitle, String code) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f152119a = title;
        this.f152120b = subtitle;
        this.f152121c = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f152119a, hVar.f152119a) && Intrinsics.f(this.f152120b, hVar.f152120b) && Intrinsics.f(this.f152121c, hVar.f152121c);
    }

    public final int hashCode() {
        return this.f152121c.hashCode() + p.a.c(this.f152119a.hashCode() * 31, 31, this.f152120b);
    }
}
