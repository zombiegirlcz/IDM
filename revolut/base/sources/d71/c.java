package d71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111750c;
    public final boolean d;

    public c(String key, String link, String title, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f111748a = key;
        this.f111749b = link;
        this.f111750c = title;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f111748a, cVar.f111748a) && Intrinsics.f(this.f111749b, cVar.f111749b) && Intrinsics.f(this.f111750c, cVar.f111750c) && this.d == cVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(p.a.c(this.f111748a.hashCode() * 31, 31, this.f111749b), 31, this.f111750c);
    }
}
