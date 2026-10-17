package qte;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends g implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f249102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f249103c;
    public final e71.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dj0.d feeMoney, String str, e71.a aVar) {
        super(feeMoney);
        Intrinsics.checkNotNullParameter(feeMoney, "feeMoney");
        this.f249102b = feeMoney;
        this.f249103c = str;
        this.d = aVar;
    }

    @Override // qte.g
    public final String a() {
        return this.f249103c;
    }

    @Override // qte.g
    public final dj0.d b() {
        return this.f249102b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f249102b, dVar.f249102b) && Intrinsics.f(this.f249103c, dVar.f249103c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f249102b.hashCode() * 31;
        String str = this.f249103c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        e71.a aVar = this.d;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
