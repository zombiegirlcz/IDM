package nxa;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class o0 {

    @NotNull
    public static final n0 Companion = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f220511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f220512c;

    public /* synthetic */ o0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(m0.f220508a.getDescriptor(), i, 7);
            throw null;
        }
        this.f220510a = str;
        this.f220511b = str2;
        this.f220512c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f220510a, o0Var.f220510a) && Intrinsics.f(this.f220511b, o0Var.f220511b) && Intrinsics.f(this.f220512c, o0Var.f220512c);
    }

    public final int hashCode() {
        return this.f220512c.hashCode() + p.a.c(this.f220510a.hashCode() * 31, 31, this.f220511b);
    }
}
