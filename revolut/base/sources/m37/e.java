package m37;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f202296a;

    public e(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f202296a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f202296a, ((e) obj2).f202296a);
    }

    public final int hashCode() {
        return this.f202296a.hashCode();
    }
}
