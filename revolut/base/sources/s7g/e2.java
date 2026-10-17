package s7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.PassportService;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class e2 {

    @NotNull
    public static final d2 Companion = new d2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f260706c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f260707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f260708h;

    public /* synthetic */ e2(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, String str7) {
        if (223 != (i & PassportService.DEFAULT_MAX_BLOCKSIZE)) {
            qlm.j1.f(c2.f260694a.getDescriptor(), i, PassportService.DEFAULT_MAX_BLOCKSIZE);
            throw null;
        }
        this.f260704a = str;
        this.f260705b = str2;
        this.f260706c = str3;
        this.d = str4;
        this.e = str5;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        this.f260707g = i2;
        this.f260708h = str7;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj2;
        return Intrinsics.f(this.f260704a, e2Var.f260704a) && Intrinsics.f(this.f260705b, e2Var.f260705b) && Intrinsics.f(this.f260706c, e2Var.f260706c) && Intrinsics.f(this.d, e2Var.d) && Intrinsics.f(this.e, e2Var.e) && Intrinsics.f(this.f, e2Var.f) && this.f260707g == e2Var.f260707g && Intrinsics.f(this.f260708h, e2Var.f260708h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.f260704a.hashCode() * 31, 31, this.f260705b), 31, this.f260706c), 31, this.d), 31, this.e);
        String str = this.f;
        return this.f260708h.hashCode() + j6.a.b(this.f260707g, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
