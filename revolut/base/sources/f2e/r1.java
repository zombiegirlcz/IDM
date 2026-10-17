package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class r1 {

    @NotNull
    public static final q1 Companion = new q1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131704c;

    public /* synthetic */ r1(int i, String str, String str2, String str3) {
        if (1 != (i & 1)) {
            qlm.j1.f(p1.f131689a.getDescriptor(), i, 1);
            throw null;
        }
        this.f131702a = str;
        if ((i & 2) == 0) {
            this.f131703b = null;
        } else {
            this.f131703b = str2;
        }
        if ((i & 4) == 0) {
            this.f131704c = null;
        } else {
            this.f131704c = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj2;
        return Intrinsics.f(this.f131702a, r1Var.f131702a) && Intrinsics.f(this.f131703b, r1Var.f131703b) && Intrinsics.f(this.f131704c, r1Var.f131704c);
    }

    public final int hashCode() {
        int iHashCode = this.f131702a.hashCode() * 31;
        String str = this.f131703b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f131704c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public r1(String theme, String str, String str2) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.f131702a = theme;
        this.f131703b = str;
        this.f131704c = str2;
    }
}
