package m2l;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f202212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f202213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f202214c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final BigDecimal f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BigDecimal f202215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f202216h;

    public /* synthetic */ l(int i, u uVar, u uVar2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, o oVar) {
        if (131 != (i & ISO781611.CREATION_DATE_AND_TIME_TAG)) {
            j1.f(j.f202211a.getDescriptor(), i, ISO781611.CREATION_DATE_AND_TIME_TAG);
            throw null;
        }
        this.f202212a = uVar;
        this.f202213b = uVar2;
        if ((i & 4) == 0) {
            this.f202214c = null;
        } else {
            this.f202214c = bigDecimal;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bigDecimal2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bigDecimal3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bigDecimal4;
        }
        if ((i & 64) == 0) {
            this.f202215g = null;
        } else {
            this.f202215g = bigDecimal5;
        }
        this.f202216h = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f202212a, lVar.f202212a) && Intrinsics.f(this.f202213b, lVar.f202213b) && Intrinsics.f(this.f202214c, lVar.f202214c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f202215g, lVar.f202215g) && Intrinsics.f(this.f202216h, lVar.f202216h);
    }

    public final int hashCode() {
        int iHashCode = (this.f202213b.hashCode() + (this.f202212a.hashCode() * 31)) * 31;
        BigDecimal bigDecimal = this.f202214c;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.d;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.e;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.f;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.f202215g;
        return this.f202216h.hashCode() + ((iHashCode5 + (bigDecimal5 != null ? bigDecimal5.hashCode() : 0)) * 31);
    }

    public l(u actual, u reference, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, o description) {
        Intrinsics.checkNotNullParameter(actual, "actual");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f202212a = actual;
        this.f202213b = reference;
        this.f202214c = bigDecimal;
        this.d = bigDecimal2;
        this.e = bigDecimal3;
        this.f = bigDecimal4;
        this.f202215g = bigDecimal5;
        this.f202216h = description;
    }
}
