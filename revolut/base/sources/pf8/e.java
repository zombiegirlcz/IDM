package pf8;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final of8.a f235511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f235512b;

    public e(of8.a state, d dVar) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f235511a = state;
        this.f235512b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f235511a == eVar.f235511a && Intrinsics.f(this.f235512b, eVar.f235512b);
    }

    public final int hashCode() {
        int iHashCode = this.f235511a.hashCode() * 31;
        d dVar = this.f235512b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
