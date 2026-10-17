package cni;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.oauth.impl.ui.consent.screen.a f25443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f25444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f25445c;

    public n(com.revolut.oauth.impl.ui.consent.screen.a navBarState, List items, aw0.i iVar) {
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f25443a = navBarState;
        this.f25444b = items;
        this.f25445c = iVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f25444b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f25443a, nVar.f25443a) && Intrinsics.f(this.f25444b, nVar.f25444b) && Intrinsics.f(this.f25445c, nVar.f25445c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f25443a.hashCode() * 31, 31, this.f25444b);
        aw0.i iVar = this.f25445c;
        return iD + (iVar == null ? 0 : iVar.hashCode());
    }
}
