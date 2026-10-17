package qh0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class g0 implements h0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f246396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f246397c;
    public final String d;

    public /* synthetic */ g0(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(e0.f246394a.getDescriptor(), i, 15);
            throw null;
        }
        this.f246395a = str;
        this.f246396b = str2;
        this.f246397c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f246395a, g0Var.f246395a) && Intrinsics.f(this.f246396b, g0Var.f246396b) && Intrinsics.f(this.f246397c, g0Var.f246397c) && Intrinsics.f(this.d, g0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f246395a.hashCode() * 31, 31, this.f246396b), 31, this.f246397c);
    }
}
