package ygc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f313608b;

    public /* synthetic */ g0(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            j1.f(e0.f313602a.getDescriptor(), i, 3);
            throw null;
        }
        this.f313607a = str;
        this.f313608b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f313607a, g0Var.f313607a) && this.f313608b == g0Var.f313608b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f313608b) + (this.f313607a.hashCode() * 31);
    }

    public g0(String text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f313607a = text;
        this.f313608b = z;
    }
}
