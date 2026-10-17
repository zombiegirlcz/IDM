package e18;

import java.math.BigDecimal;
import java.time.Instant;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();
    public static final Lazy[] f = {yhm.j.c(yhm.k.PUBLICATION, new i(0)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f121919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f121920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f121921c;
    public final Integer d;
    public final Instant e;

    public /* synthetic */ l(int i, h hVar, ej0.b bVar, BigDecimal bigDecimal, Integer num, Instant instant) {
        if (31 != (i & 31)) {
            j1.f(j.f121918a.getDescriptor(), i, 31);
            throw null;
        }
        this.f121919a = hVar;
        this.f121920b = bVar;
        this.f121921c = bigDecimal;
        this.d = num;
        this.e = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f121919a == lVar.f121919a && Intrinsics.f(this.f121920b, lVar.f121920b) && Intrinsics.f(this.f121921c, lVar.f121921c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        int iD = org.bouncycastle.jcajce.provider.digest.a.d(this.f121920b, this.f121919a.hashCode() * 31, 31);
        BigDecimal bigDecimal = this.f121921c;
        int iHashCode = (iD + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Instant instant = this.e;
        return iHashCode2 + (instant != null ? instant.hashCode() : 0);
    }

    public l(h attributionStatus, ej0.b priceAtPublication, BigDecimal bigDecimal, Integer num, Instant instant) {
        Intrinsics.checkNotNullParameter(attributionStatus, "attributionStatus");
        Intrinsics.checkNotNullParameter(priceAtPublication, "priceAtPublication");
        this.f121919a = attributionStatus;
        this.f121920b = priceAtPublication;
        this.f121921c = bigDecimal;
        this.d = num;
        this.e = instant;
    }
}
