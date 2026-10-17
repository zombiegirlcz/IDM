package adk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3396c;
    public final String d;
    public final String e;
    public final v f;

    public /* synthetic */ i0(int i, String str, String str2, String str3, String str4, String str5, v vVar) {
        if (63 != (i & 63)) {
            qlm.j1.f(g0.f3387a.getDescriptor(), i, 63);
            throw null;
        }
        this.f3394a = str;
        this.f3395b = str2;
        this.f3396c = str3;
        this.d = str4;
        this.e = str5;
        this.f = vVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f3394a, i0Var.f3394a) && Intrinsics.f(this.f3395b, i0Var.f3395b) && Intrinsics.f(this.f3396c, i0Var.f3396c) && Intrinsics.f(this.d, i0Var.d) && Intrinsics.f(this.e, i0Var.e) && Intrinsics.f(this.f, i0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f3394a.hashCode() * 31;
        String str = this.f3395b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f3396c;
        return this.f.hashCode() + p.a.c(p.a.c((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public i0(String title, String str, String str2, String buttonText, String deeplink, v bottomSheet) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f3394a = title;
        this.f3395b = str;
        this.f3396c = str2;
        this.d = buttonText;
        this.e = deeplink;
        this.f = bottomSheet;
    }
}
