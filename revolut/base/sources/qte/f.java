package qte;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends g implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f249106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f249107c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, xi0.b currency) {
        super(new dj0.d(0L, currency));
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f249106b = str;
        this.f249107c = currency;
    }

    @Override // qte.g
    public final String a() {
        return this.f249106b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f249106b, fVar.f249106b) && Intrinsics.f(this.f249107c, fVar.f249107c);
    }

    public final int hashCode() {
        String str = this.f249106b;
        return this.f249107c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
