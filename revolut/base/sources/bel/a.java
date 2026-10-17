package bel;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f14871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f14872b;

    public a(b type, xi0.b currency) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f14871a = type;
        this.f14872b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f14871a == aVar.f14871a && Intrinsics.f(this.f14872b, aVar.f14872b);
    }

    public final int hashCode() {
        return this.f14872b.hashCode() + (this.f14871a.hashCode() * 31);
    }
}
