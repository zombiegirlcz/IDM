package iha;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f161346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f161347b;

    public p(ArrayList buttons, q qVar) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f161346a = buttons;
        this.f161347b = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f161346a.equals(pVar.f161346a) && Intrinsics.f(this.f161347b, pVar.f161347b);
    }

    public final int hashCode() {
        int iHashCode = this.f161346a.hashCode() * 31;
        q qVar = this.f161347b;
        return iHashCode + (qVar == null ? 0 : qVar.hashCode());
    }
}
