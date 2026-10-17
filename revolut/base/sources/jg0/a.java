package jg0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f173893b;

    public a(String searchRequestId, int i) {
        Intrinsics.checkNotNullParameter(searchRequestId, "searchRequestId");
        this.f173892a = searchRequestId;
        this.f173893b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f173892a, aVar.f173892a) && this.f173893b == aVar.f173893b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f173893b) + (this.f173892a.hashCode() * 31);
    }
}
