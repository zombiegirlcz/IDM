package mgb;

import java.time.Instant;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f205247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f205248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f205249c;
    public final f d;
    public final h e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f205250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Instant f205251h;

    public k(boolean z, e header, ArrayList availableRewards, f fVar, h hVar, d dVar, j jVar, Instant instant) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(availableRewards, "availableRewards");
        this.f205247a = z;
        this.f205248b = header;
        this.f205249c = availableRewards;
        this.d = fVar;
        this.e = hVar;
        this.f = dVar;
        this.f205250g = jVar;
        this.f205251h = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f205247a == kVar.f205247a && this.f205248b.equals(kVar.f205248b) && this.f205249c.equals(kVar.f205249c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f205250g, kVar.f205250g) && Intrinsics.f(this.f205251h, kVar.f205251h);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f205249c, (this.f205248b.hashCode() + (Boolean.hashCode(this.f205247a) * 31)) * 31, 31);
        f fVar = this.d;
        int iHashCode = (iB + (fVar == null ? 0 : fVar.hashCode())) * 31;
        h hVar = this.e;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        d dVar = this.f;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        j jVar = this.f205250g;
        int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Instant instant = this.f205251h;
        return iHashCode4 + (instant != null ? instant.hashCode() : 0);
    }
}
