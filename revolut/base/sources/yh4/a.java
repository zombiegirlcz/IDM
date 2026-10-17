package yh4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dz3.c f313749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x35.e f313750b;

    public a(dz3.c configuration, x35.e selectedAccount) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(selectedAccount, "selectedAccount");
        this.f313749a = configuration;
        this.f313750b = selectedAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f313749a, aVar.f313749a) && Intrinsics.f(this.f313750b, aVar.f313750b);
    }

    public final int hashCode() {
        return this.f313750b.hashCode() + (this.f313749a.hashCode() * 31);
    }
}
