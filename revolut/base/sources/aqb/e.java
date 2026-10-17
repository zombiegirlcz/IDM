package aqb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ejb.b f8280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uib.a f8281b;

    public e(ejb.b savingsAccountsInfo, uib.a config) {
        Intrinsics.checkNotNullParameter(savingsAccountsInfo, "savingsAccountsInfo");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f8280a = savingsAccountsInfo;
        this.f8281b = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f8280a, eVar.f8280a) && Intrinsics.f(this.f8281b, eVar.f8281b);
    }

    public final int hashCode() {
        return this.f8281b.hashCode() + (this.f8280a.hashCode() * 31);
    }
}
