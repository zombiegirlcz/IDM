package ygc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class i0 {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f313614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f313615c;
    public final b0 d;

    public /* synthetic */ i0(int i, String str, String str2, h0 h0Var, b0 b0Var) {
        if (15 != (i & 15)) {
            j1.f(x.f313637a.getDescriptor(), i, 15);
            throw null;
        }
        this.f313613a = str;
        this.f313614b = str2;
        this.f313615c = h0Var;
        this.d = b0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f313613a, i0Var.f313613a) && Intrinsics.f(this.f313614b, i0Var.f313614b) && Intrinsics.f(this.f313615c, i0Var.f313615c) && Intrinsics.f(this.d, i0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f313615c.hashCode() + p.a.c(this.f313613a.hashCode() * 31, 31, this.f313614b)) * 31;
        b0 b0Var = this.d;
        return iHashCode + (b0Var == null ? 0 : b0Var.hashCode());
    }

    public i0(String logo, String title, h0 subtitle, b0 b0Var) {
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f313613a = logo;
        this.f313614b = title;
        this.f313615c = subtitle;
        this.d = b0Var;
    }
}
