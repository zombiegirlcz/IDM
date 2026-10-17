package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class w1 {

    @NotNull
    public static final v1 Companion = new v1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f295054c;
    public final String d;

    public /* synthetic */ w1(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            qlm.j1.f(u1.f295030a.getDescriptor(), i, 15);
            throw null;
        }
        this.f295052a = str;
        this.f295053b = str2;
        this.f295054c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.f295052a, w1Var.f295052a) && Intrinsics.f(this.f295053b, w1Var.f295053b) && Intrinsics.f(this.f295054c, w1Var.f295054c) && Intrinsics.f(this.d, w1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f295052a.hashCode() * 31, 31, this.f295053b), 31, this.f295054c);
    }

    public w1(String title, String subtitle, String confirmActionText, String cancelActionText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(confirmActionText, "confirmActionText");
        Intrinsics.checkNotNullParameter(cancelActionText, "cancelActionText");
        this.f295052a = title;
        this.f295053b = subtitle;
        this.f295054c = confirmActionText;
        this.d = cancelActionText;
    }
}
