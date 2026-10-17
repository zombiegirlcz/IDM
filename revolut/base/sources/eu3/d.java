package eu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f129489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f129490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fu3.a f129491c;

    public d(Long l2, Long l3, fu3.a aVar) {
        this.f129489a = l2;
        this.f129490b = l3;
        this.f129491c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f129489a, dVar.f129489a) && Intrinsics.f(this.f129490b, dVar.f129490b) && this.f129491c == dVar.f129491c;
    }

    public final int hashCode() {
        Long l2 = this.f129489a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.f129490b;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        fu3.a aVar = this.f129491c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
