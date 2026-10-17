package j1f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170364c;
    public final String d;

    public /* synthetic */ a0(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(y.f170447a.getDescriptor(), i, 15);
            throw null;
        }
        this.f170362a = str;
        this.f170363b = str2;
        this.f170364c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f170362a, a0Var.f170362a) && Intrinsics.f(this.f170363b, a0Var.f170363b) && Intrinsics.f(this.f170364c, a0Var.f170364c) && Intrinsics.f(this.d, a0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f170362a.hashCode() * 31, 31, this.f170363b), 31, this.f170364c);
    }
}
