package hr9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import oq9.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f154791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f154792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f154793c;

    public b(o member, a type, List debts) {
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(debts, "debts");
        this.f154791a = member;
        this.f154792b = type;
        this.f154793c = debts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f154791a, bVar.f154791a) && this.f154792b == bVar.f154792b && Intrinsics.f(this.f154793c, bVar.f154793c);
    }

    public final int hashCode() {
        return this.f154793c.hashCode() + ((this.f154792b.hashCode() + (this.f154791a.hashCode() * 31)) * 31);
    }
}
