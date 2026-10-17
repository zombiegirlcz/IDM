package yy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f317788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f317789c;

    public p(String title, String logoUrl, String webpage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(webpage, "webpage");
        this.f317787a = title;
        this.f317788b = logoUrl;
        this.f317789c = webpage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f317787a, pVar.f317787a) && Intrinsics.f(this.f317788b, pVar.f317788b) && Intrinsics.f(this.f317789c, pVar.f317789c);
    }

    public final int hashCode() {
        return this.f317789c.hashCode() + p.a.c(this.f317787a.hashCode() * 31, 31, this.f317788b);
    }
}
