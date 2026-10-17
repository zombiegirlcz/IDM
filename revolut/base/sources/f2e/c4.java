package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class c4 {

    @NotNull
    public static final b4 Companion = new b4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f131554c;
    public final boolean d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f131555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f131556h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f131557j;

    public /* synthetic */ c4(int i, String str, String str2, boolean z, boolean z3, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (3 != (i & 3)) {
            qlm.j1.f(a4.f131539a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131552a = str;
        this.f131553b = str2;
        if ((i & 4) == 0) {
            this.f131554c = false;
        } else {
            this.f131554c = z;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.f131555g = null;
        } else {
            this.f131555g = str5;
        }
        if ((i & 128) == 0) {
            this.f131556h = null;
        } else {
            this.f131556h = str6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str7;
        }
        if ((i & 512) == 0) {
            this.f131557j = null;
        } else {
            this.f131557j = str8;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj2;
        return Intrinsics.f(this.f131552a, c4Var.f131552a) && Intrinsics.f(this.f131553b, c4Var.f131553b) && this.f131554c == c4Var.f131554c && this.d == c4Var.d && Intrinsics.f(this.e, c4Var.e) && Intrinsics.f(this.f, c4Var.f) && Intrinsics.f(this.f131555g, c4Var.f131555g) && Intrinsics.f(this.f131556h, c4Var.f131556h) && Intrinsics.f(this.i, c4Var.i) && Intrinsics.f(this.f131557j, c4Var.f131557j);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(p.a.c(this.f131552a.hashCode() * 31, 31, this.f131553b), 31, this.f131554c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f131555g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f131556h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f131557j;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
