package qte;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends g implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f249104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f249105c;
    public final aim.f d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(dj0.d feeMoney, String str, aim.f breakdown) {
        super(feeMoney);
        Intrinsics.checkNotNullParameter(feeMoney, "feeMoney");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        this.f249104b = feeMoney;
        this.f249105c = str;
        this.d = breakdown;
    }

    @Override // qte.g
    public final String a() {
        return this.f249105c;
    }

    @Override // qte.g
    public final dj0.d b() {
        return this.f249104b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f249104b.equals(eVar.f249104b) && Intrinsics.f(this.f249105c, eVar.f249105c) && this.d.equals(eVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f249104b.hashCode() * 31;
        String str = this.f249105c;
        return this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
