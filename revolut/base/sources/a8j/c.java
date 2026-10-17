package a8j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2270c;

    public c(String url2, String iconId, String label) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(iconId, "iconId");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f2268a = url2;
        this.f2269b = iconId;
        this.f2270c = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f2268a, cVar.f2268a) && Intrinsics.f(this.f2269b, cVar.f2269b) && Intrinsics.f(this.f2270c, cVar.f2270c);
    }

    public final int hashCode() {
        return this.f2270c.hashCode() + p.a.c(this.f2268a.hashCode() * 31, 31, this.f2269b);
    }
}
