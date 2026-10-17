package s1l;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class y0 {

    @NotNull
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f259221c;
    public final g d;

    public /* synthetic */ y0(int i, String str, String str2, Double d, g gVar) {
        if (3 != (i & 3)) {
            j1.f(w0.f259217a.getDescriptor(), i, 3);
            throw null;
        }
        this.f259219a = str;
        this.f259220b = str2;
        if ((i & 4) == 0) {
            this.f259221c = null;
        } else {
            this.f259221c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = gVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f259219a, y0Var.f259219a) && Intrinsics.f(this.f259220b, y0Var.f259220b) && Intrinsics.f(this.f259221c, y0Var.f259221c) && Intrinsics.f(this.d, y0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f259219a.hashCode() * 31;
        String str = this.f259220b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f259221c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        g gVar = this.d;
        return iHashCode3 + (gVar != null ? gVar.hashCode() : 0);
    }

    public y0(String title, String str, Double d, g gVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f259219a = title;
        this.f259220b = str;
        this.f259221c = d;
        this.d = gVar;
    }
}
