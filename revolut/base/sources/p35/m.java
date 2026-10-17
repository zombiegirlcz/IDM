package p35;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f232657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f232658b;

    public m(l lVar, Long l2) {
        this.f232657a = lVar;
        this.f232658b = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f232657a == mVar.f232657a && Intrinsics.f(this.f232658b, mVar.f232658b);
    }

    public final int hashCode() {
        l lVar = this.f232657a;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        Long l2 = this.f232658b;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
