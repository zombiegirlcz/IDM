package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124571c;

    public /* synthetic */ i0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(g0.f124550a.getDescriptor(), i, 7);
            throw null;
        }
        this.f124569a = str;
        this.f124570b = str2;
        this.f124571c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f124569a, i0Var.f124569a) && Intrinsics.f(this.f124570b, i0Var.f124570b) && Intrinsics.f(this.f124571c, i0Var.f124571c);
    }

    public final int hashCode() {
        return this.f124571c.hashCode() + p.a.c(this.f124569a.hashCode() * 31, 31, this.f124570b);
    }

    public i0(String title, String description, String actionLabel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actionLabel, "actionLabel");
        this.f124569a = title;
        this.f124570b = description;
        this.f124571c = actionLabel;
    }
}
