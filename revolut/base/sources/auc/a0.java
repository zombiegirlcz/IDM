package auc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9694c;
    public final String d;
    public final x e;
    public final boolean f;

    public /* synthetic */ a0(int i, String str, String str2, String str3, String str4, x xVar, boolean z) {
        if (63 != (i & 63)) {
            j1.f(y.f9799a.getDescriptor(), i, 63);
            throw null;
        }
        this.f9692a = str;
        this.f9693b = str2;
        this.f9694c = str3;
        this.d = str4;
        this.e = xVar;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f9692a, a0Var.f9692a) && Intrinsics.f(this.f9693b, a0Var.f9693b) && Intrinsics.f(this.f9694c, a0Var.f9694c) && Intrinsics.f(this.d, a0Var.d) && Intrinsics.f(this.e, a0Var.e) && this.f == a0Var.f;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f9692a.hashCode() * 31, 31, this.f9693b), 31, this.f9694c), 31, this.d);
        x xVar = this.e;
        return Boolean.hashCode(this.f) + ((iC + (xVar == null ? 0 : xVar.hashCode())) * 31);
    }

    public a0(String durationCode, String title, String subtitle, String description, x xVar, boolean z) {
        Intrinsics.checkNotNullParameter(durationCode, "durationCode");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f9692a = durationCode;
        this.f9693b = title;
        this.f9694c = subtitle;
        this.d = description;
        this.e = xVar;
        this.f = z;
    }
}
