package oag;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ffi.d f223626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f223627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f223628c;

    public i(ffi.d hotelsRecentSmartSearch, int i, long j2) {
        Intrinsics.checkNotNullParameter(hotelsRecentSmartSearch, "hotelsRecentSmartSearch");
        this.f223626a = hotelsRecentSmartSearch;
        this.f223627b = i;
        this.f223628c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f223626a, iVar.f223626a) && this.f223627b == iVar.f223627b && this.f223628c == iVar.f223628c;
    }

    @Override // oag.h
    public final long getTimestamp() {
        return this.f223628c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f223628c) + j6.a.b(this.f223627b, this.f223626a.hashCode() * 31, 31);
    }
}
