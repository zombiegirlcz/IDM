package o5l;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f222480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f222481b;

    public s(dj0.d amount, u type) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f222480a = amount;
        this.f222481b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f222480a, sVar.f222480a) && this.f222481b == sVar.f222481b;
    }

    public final int hashCode() {
        return this.f222481b.hashCode() + (this.f222480a.hashCode() * 31);
    }
}
