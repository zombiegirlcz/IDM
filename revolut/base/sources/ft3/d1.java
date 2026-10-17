package ft3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class d1 implements Serializable {

    @NotNull
    public static final c1 Companion = new c1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f137810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gt3.f f137811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final it3.k f137812c;

    public /* synthetic */ d1(j1 j1Var, gt3.f fVar) {
        this(j1Var, fVar, null);
    }

    public static d1 c(d1 d1Var, gt3.f fVar, it3.k kVar, int i) {
        j1 productType = d1Var.f137810a;
        if ((i & 2) != 0) {
            fVar = d1Var.f137811b;
        }
        if ((i & 4) != 0) {
            kVar = d1Var.f137812c;
        }
        d1Var.getClass();
        Intrinsics.checkNotNullParameter(productType, "productType");
        return new d1(productType, fVar, kVar);
    }

    public final gt3.f A4() {
        return this.f137811b;
    }

    public final j1 E2() {
        return this.f137810a;
    }

    public final j1 a() {
        return this.f137810a;
    }

    public final gt3.f b() {
        return this.f137811b;
    }

    public final it3.k d() {
        return this.f137812c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return this.f137810a == d1Var.f137810a && Intrinsics.f(this.f137811b, d1Var.f137811b) && this.f137812c == d1Var.f137812c;
    }

    public final int hashCode() {
        int iHashCode = this.f137810a.hashCode() * 31;
        gt3.f fVar = this.f137811b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        it3.k kVar = this.f137812c;
        return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
    }

    public d1(j1 productType, gt3.f fVar, it3.k kVar) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.f137810a = productType;
        this.f137811b = fVar;
        this.f137812c = kVar;
    }
}
