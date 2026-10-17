package hcl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class w1 {

    @NotNull
    public static final v1 Companion = new v1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151202b;

    public /* synthetic */ w1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(u1.f151178a.getDescriptor(), i, 3);
            throw null;
        }
        this.f151201a = str;
        this.f151202b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.f151201a, w1Var.f151201a) && Intrinsics.f(this.f151202b, w1Var.f151202b);
    }

    public final int hashCode() {
        return this.f151202b.hashCode() + (this.f151201a.hashCode() * 31);
    }

    public w1(String icon, String text) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f151201a = icon;
        this.f151202b = text;
    }
}
