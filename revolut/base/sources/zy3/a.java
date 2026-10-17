package zy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f326360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f326361b;

    public a(String id10, String url2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f326360a = id10;
        this.f326361b = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f326360a, aVar.f326360a) && Intrinsics.f(this.f326361b, aVar.f326361b);
    }

    public final int hashCode() {
        return this.f326361b.hashCode() + (this.f326360a.hashCode() * 31);
    }
}
