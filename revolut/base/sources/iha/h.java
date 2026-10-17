package iha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f161324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Period f161325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f161326c;
    public final u d;

    public h(v type, Period period, dj0.d dVar, u uVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f161324a = type;
        this.f161325b = period;
        this.f161326c = dVar;
        this.d = uVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f161324a == hVar.f161324a && Intrinsics.f(this.f161325b, hVar.f161325b) && Intrinsics.f(this.f161326c, hVar.f161326c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f161324a.hashCode() * 31;
        Period period = this.f161325b;
        int iHashCode2 = (iHashCode + (period == null ? 0 : period.hashCode())) * 31;
        dj0.d dVar = this.f161326c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        u uVar = this.d;
        return iHashCode3 + (uVar != null ? uVar.hashCode() : 0);
    }
}
