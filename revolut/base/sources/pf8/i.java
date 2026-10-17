package pf8;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final of8.a f235515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f235516b;

    public i(of8.a state, h exchangeState) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(exchangeState, "exchangeState");
        this.f235515a = state;
        this.f235516b = exchangeState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f235515a == iVar.f235515a && Intrinsics.f(this.f235516b, iVar.f235516b);
    }

    public final int hashCode() {
        return this.f235516b.hashCode() + (this.f235515a.hashCode() * 31);
    }
}
