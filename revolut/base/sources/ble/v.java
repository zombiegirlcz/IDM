package ble;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f16600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16602c;

    public v(w oldUIState, boolean z, String str) {
        Intrinsics.checkNotNullParameter(oldUIState, "oldUIState");
        this.f16600a = oldUIState;
        this.f16601b = z;
        this.f16602c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f16600a, vVar.f16600a) && this.f16601b == vVar.f16601b && Intrinsics.f(this.f16602c, vVar.f16602c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f16600a.hashCode() * 31, 31, this.f16601b);
        String str = this.f16602c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
