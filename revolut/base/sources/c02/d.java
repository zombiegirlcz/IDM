package c02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f20101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20103c;

    public /* synthetic */ d(c cVar, String str) {
        this(cVar, str, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f20101a == dVar.f20101a && Intrinsics.f(this.f20102b, dVar.f20102b) && Intrinsics.f(this.f20103c, dVar.f20103c);
    }

    public final int hashCode() {
        int iHashCode = this.f20101a.hashCode() * 31;
        String str = this.f20102b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20103c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public d(c state, String str, String str2) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f20101a = state;
        this.f20102b = str;
        this.f20103c = str2;
    }
}
