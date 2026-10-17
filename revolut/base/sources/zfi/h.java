package zfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f321971b;

    public h(String queryParam, boolean z) {
        Intrinsics.checkNotNullParameter(queryParam, "queryParam");
        this.f321970a = queryParam;
        this.f321971b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f321970a, hVar.f321970a) && this.f321971b == hVar.f321971b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f321971b) + (this.f321970a.hashCode() * 31);
    }
}
