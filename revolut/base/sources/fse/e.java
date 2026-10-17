package fse;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137669a;

    public e(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f137669a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f137669a, ((e) obj2).f137669a);
    }

    public final int hashCode() {
        return this.f137669a.hashCode();
    }
}
