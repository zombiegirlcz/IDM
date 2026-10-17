package xck;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f304147c;

    public c(String str, String label, String deeplink) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f304145a = str;
        this.f304146b = label;
        this.f304147c = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f304145a, cVar.f304145a) && Intrinsics.f(this.f304146b, cVar.f304146b) && Intrinsics.f(this.f304147c, cVar.f304147c);
    }

    public final int hashCode() {
        String str = this.f304145a;
        return this.f304147c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f304146b);
    }
}
