package oid;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225611a;

    public a(String str) {
        this.f225611a = str;
    }

    public final String a() {
        return p.a.p("SearchLayoutParams(query=", this.f225611a, ")");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f225611a, ((a) obj2).f225611a);
    }

    public final int hashCode() {
        String str = this.f225611a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
