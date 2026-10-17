package zbj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f320944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f320945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f320946c;

    public v(u0 selectedTabId, u revolutFriendsState, y walletState) {
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(revolutFriendsState, "revolutFriendsState");
        Intrinsics.checkNotNullParameter(walletState, "walletState");
        this.f320944a = selectedTabId;
        this.f320945b = revolutFriendsState;
        this.f320946c = walletState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f320944a == vVar.f320944a && Intrinsics.f(this.f320945b, vVar.f320945b) && Intrinsics.f(this.f320946c, vVar.f320946c);
    }

    public final int hashCode() {
        return this.f320946c.hashCode() + ((this.f320945b.hashCode() + (this.f320944a.hashCode() * 31)) * 31);
    }
}
