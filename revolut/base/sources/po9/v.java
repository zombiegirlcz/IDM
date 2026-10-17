package po9;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes5.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f237937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k71.q f237938b;

    public v(a3 transaction, k71.q extraData) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f237937a = transaction;
        this.f237938b = extraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f237937a, vVar.f237937a) && Intrinsics.f(this.f237938b, vVar.f237938b);
    }

    public final int hashCode() {
        return this.f237938b.hashCode() + (this.f237937a.hashCode() * 31);
    }
}
