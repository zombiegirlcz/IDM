package ldk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194180a;

    public w(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f194180a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f194180a, ((w) obj2).f194180a);
    }

    public final int hashCode() {
        return this.f194180a.hashCode();
    }
}
