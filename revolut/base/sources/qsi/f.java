package qsi;

import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f248862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f248863b;

    public f(List transactions, q extraData) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f248862a = transactions;
        this.f248863b = extraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f248862a, fVar.f248862a) && Intrinsics.f(this.f248863b, fVar.f248863b);
    }

    public final int hashCode() {
        return this.f248863b.hashCode() + (this.f248862a.hashCode() * 31);
    }
}
