package wh4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x35.e f297403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dz3.a f297404b;

    public k(x35.e selectedAccount, dz3.a popup) {
        Intrinsics.checkNotNullParameter(selectedAccount, "selectedAccount");
        Intrinsics.checkNotNullParameter(popup, "popup");
        this.f297403a = selectedAccount;
        this.f297404b = popup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f297403a, kVar.f297403a) && Intrinsics.f(this.f297404b, kVar.f297404b);
    }

    public final int hashCode() {
        return this.f297404b.hashCode() + (this.f297403a.hashCode() * 31);
    }
}
