package t84;

import java.util.List;
import jki.i;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f268835a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f268835a, ((d) obj2).f268835a);
    }

    public final int hashCode() {
        return this.f268835a.hashCode();
    }

    public d(int i) {
        List debts = v.k(pu3.d.LINE_OF_CREDIT, pu3.d.OVERDRAFT, pu3.d.BNPL);
        Intrinsics.checkNotNullParameter(debts, "debts");
        this.f268835a = debts;
    }
}
