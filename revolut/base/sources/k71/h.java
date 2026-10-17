package k71;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.q6;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f181783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q6 f181784c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a3 transaction, q6 scope) {
        super(transaction.f272581b);
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f181783b = transaction;
        this.f181784c = scope;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f181783b, hVar.f181783b) && Intrinsics.f(this.f181784c, hVar.f181784c);
    }

    public final int hashCode() {
        return this.f181784c.hashCode() + (this.f181783b.hashCode() * 31);
    }
}
