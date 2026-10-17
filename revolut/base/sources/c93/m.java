package c93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f22293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f22294b;

    public m(dj0.d amount, o type) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f22293a = amount;
        this.f22294b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f22293a, mVar.f22293a) && this.f22294b == mVar.f22294b;
    }

    public final int hashCode() {
        return this.f22294b.hashCode() + (this.f22293a.hashCode() * 31);
    }
}
