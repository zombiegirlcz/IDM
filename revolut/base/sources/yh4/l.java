package yh4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x35.e f313759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dz3.a f313760b;

    public l(x35.e selectedAccount, dz3.a popup) {
        Intrinsics.checkNotNullParameter(selectedAccount, "selectedAccount");
        Intrinsics.checkNotNullParameter(popup, "popup");
        this.f313759a = selectedAccount;
        this.f313760b = popup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f313759a, lVar.f313759a) && Intrinsics.f(this.f313760b, lVar.f313760b);
    }

    public final int hashCode() {
        return this.f313760b.hashCode() + (this.f313759a.hashCode() * 31);
    }
}
