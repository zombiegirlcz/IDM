package eha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125813b;

    public a(String text, String url2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f125812a = text;
        this.f125813b = url2;
    }

    public final String a() {
        return this.f125812a;
    }

    public final String b() {
        return this.f125813b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f125812a, aVar.f125812a) && Intrinsics.f(this.f125813b, aVar.f125813b);
    }

    public final int hashCode() {
        return this.f125813b.hashCode() + (this.f125812a.hashCode() * 31);
    }
}
