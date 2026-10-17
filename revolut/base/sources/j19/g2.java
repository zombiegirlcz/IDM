package j19;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g2 implements k {

    @NotNull
    public static final f2 Companion = new f2();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f170204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i19.g f170205c;
    public final c d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, yhm.j.c(kVar, new j18.j(20)), null, yhm.j.c(kVar, new j18.j(21))};
    }

    public /* synthetic */ g2(int i, String str, a aVar, i19.g gVar, c cVar) {
        if (1 != (i & 1)) {
            qlm.j1.f(e2.f170195a.getDescriptor(), i, 1);
            throw null;
        }
        this.f170203a = str;
        if ((i & 2) == 0) {
            this.f170204b = null;
        } else {
            this.f170204b = aVar;
        }
        if ((i & 4) == 0) {
            this.f170205c = null;
        } else {
            this.f170205c = gVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = cVar;
        }
    }

    @Override // j19.k
    public final a a() {
        return this.f170204b;
    }

    @Override // j19.k
    public final i19.g b() {
        return this.f170205c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj2;
        return Intrinsics.f(this.f170203a, g2Var.f170203a) && this.f170204b == g2Var.f170204b && Intrinsics.f(this.f170205c, g2Var.f170205c) && Intrinsics.f(this.d, g2Var.d);
    }

    @Override // j19.k
    public final c getContent() {
        return this.d;
    }

    @Override // j19.k
    public final String getId() {
        return this.f170203a;
    }

    public final int hashCode() {
        int iHashCode = this.f170203a.hashCode() * 31;
        a aVar = this.f170204b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        i19.g gVar = this.f170205c;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.f157597a.hashCode())) * 31;
        c cVar = this.d;
        return iHashCode3 + (cVar != null ? cVar.hashCode() : 0);
    }
}
