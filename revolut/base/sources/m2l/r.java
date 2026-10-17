package m2l;

import java.time.Instant;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();
    public static final Lazy[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f202222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f202223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f202224c;
    public final l d;
    public final c0 e;
    public final jo3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.a f202225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Instant f202226h;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        i = new Lazy[]{yhm.j.c(kVar, new m05.d(24)), yhm.j.c(kVar, new m05.d(25)), null, null, null, null, null, null};
    }

    public /* synthetic */ r(int i2, k0 k0Var, k0 k0Var2, String str, l lVar, c0 c0Var, jo3.a aVar, jo3.a aVar2, Instant instant) {
        if (5 != (i2 & 5)) {
            j1.f(p.f202221a.getDescriptor(), i2, 5);
            throw null;
        }
        this.f202222a = k0Var;
        if ((i2 & 2) == 0) {
            this.f202223b = null;
        } else {
            this.f202223b = k0Var2;
        }
        this.f202224c = str;
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = lVar;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = c0Var;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = aVar;
        }
        if ((i2 & 64) == 0) {
            this.f202225g = null;
        } else {
            this.f202225g = aVar2;
        }
        if ((i2 & 128) == 0) {
            this.f202226h = null;
        } else {
            this.f202226h = instant;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f202222a == rVar.f202222a && this.f202223b == rVar.f202223b && Intrinsics.f(this.f202224c, rVar.f202224c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f202225g, rVar.f202225g) && Intrinsics.f(this.f202226h, rVar.f202226h);
    }

    public final int hashCode() {
        int iHashCode = this.f202222a.hashCode() * 31;
        k0 k0Var = this.f202223b;
        int iC = p.a.c((iHashCode + (k0Var == null ? 0 : k0Var.hashCode())) * 31, 31, this.f202224c);
        l lVar = this.d;
        int iHashCode2 = (iC + (lVar == null ? 0 : lVar.hashCode())) * 31;
        c0 c0Var = this.e;
        int iHashCode3 = (iHashCode2 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        jo3.a aVar = this.f;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.f202225g;
        int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Instant instant = this.f202226h;
        return iHashCode5 + (instant != null ? instant.hashCode() : 0);
    }

    public r(k0 tradeRecommendationDto, k0 k0Var, String referenceIndex, l lVar, c0 c0Var, jo3.a aVar, jo3.a aVar2, Instant instant) {
        Intrinsics.checkNotNullParameter(tradeRecommendationDto, "tradeRecommendationDto");
        Intrinsics.checkNotNullParameter(referenceIndex, "referenceIndex");
        this.f202222a = tradeRecommendationDto;
        this.f202223b = k0Var;
        this.f202224c = referenceIndex;
        this.d = lVar;
        this.e = c0Var;
        this.f = aVar;
        this.f202225g = aVar2;
        this.f202226h = instant;
    }
}
