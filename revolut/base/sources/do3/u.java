package do3;

import java.io.Serializable;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f116432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f116433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f116434c;
    public final j d;
    public final k e;

    public u(t state, m mVar, Instant instant, j jVar, k kVar) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f116432a = state;
        this.f116433b = mVar;
        this.f116434c = instant;
        this.d = jVar;
        this.e = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f116432a == uVar.f116432a && Intrinsics.f(this.f116433b, uVar.f116433b) && Intrinsics.f(this.f116434c, uVar.f116434c) && Intrinsics.f(this.d, uVar.d) && Intrinsics.f(this.e, uVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f116432a.hashCode() * 31;
        m mVar = this.f116433b;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        Instant instant = this.f116434c;
        int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        j jVar = this.d;
        int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.f116404a.hashCode())) * 31;
        k kVar = this.e;
        return iHashCode4 + (kVar != null ? kVar.f116405a.hashCode() : 0);
    }
}
