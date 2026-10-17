package jzh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f179866c;

    public w(String groupId, String legId, String walletId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(legId, "legId");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        this.f179864a = groupId;
        this.f179865b = legId;
        this.f179866c = walletId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f179864a, wVar.f179864a) && Intrinsics.f(this.f179865b, wVar.f179865b) && Intrinsics.f(this.f179866c, wVar.f179866c);
    }

    public final int hashCode() {
        return this.f179866c.hashCode() + p.a.c(this.f179864a.hashCode() * 31, 31, this.f179865b);
    }
}
