package wx2;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c93.e f300739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hx2.h f300740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f300741c;
    public final boolean d;
    public final String e;

    public f(c93.e cardType, hx2.h infoVariant, boolean z, boolean z3, String str) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(infoVariant, "infoVariant");
        this.f300739a = cardType;
        this.f300740b = infoVariant;
        this.f300741c = z;
        this.d = z3;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f300739a == fVar.f300739a && this.f300740b == fVar.f300740b && this.f300741c == fVar.f300741c && this.d == fVar.d && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c((this.f300740b.hashCode() + (this.f300739a.hashCode() * 31)) * 31, 31, this.f300741c), 31, this.d);
        String str = this.e;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
