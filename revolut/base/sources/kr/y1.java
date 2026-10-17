package kr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class y1 {

    @NotNull
    public static final x1 Companion = new x1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f188610c;
    public final Integer d;

    public /* synthetic */ y1(int i, Integer num, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            qlm.j1.f(w1.f188598a.getDescriptor(), i, 3);
            throw null;
        }
        this.f188608a = str;
        this.f188609b = str2;
        if ((i & 4) == 0) {
            this.f188610c = null;
        } else {
            this.f188610c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj2;
        return Intrinsics.f(this.f188608a, y1Var.f188608a) && Intrinsics.f(this.f188609b, y1Var.f188609b) && Intrinsics.f(this.f188610c, y1Var.f188610c) && Intrinsics.f(this.d, y1Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f188608a.hashCode() * 31, 31, this.f188609b);
        String str = this.f188610c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public y1(Integer num, String validityCheckId, String validityCheckOriginalScanType, String str) {
        Intrinsics.checkNotNullParameter(validityCheckId, "validityCheckId");
        Intrinsics.checkNotNullParameter(validityCheckOriginalScanType, "validityCheckOriginalScanType");
        this.f188608a = validityCheckId;
        this.f188609b = validityCheckOriginalScanType;
        this.f188610c = str;
        this.d = num;
    }
}
