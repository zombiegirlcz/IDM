package g9f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f141552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f141553c;

    public /* synthetic */ e0(int i, String str, int i2, m mVar) {
        if (7 != (i & 7)) {
            j1.f(c0.f141549a.getDescriptor(), i, 7);
            throw null;
        }
        this.f141551a = str;
        this.f141552b = i2;
        this.f141553c = mVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f141551a, e0Var.f141551a) && this.f141552b == e0Var.f141552b && Intrinsics.f(this.f141553c, e0Var.f141553c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f141552b, this.f141551a.hashCode() * 31, 31);
        m mVar = this.f141553c;
        return iB + (mVar == null ? 0 : mVar.hashCode());
    }

    public e0(String securityRef, int i, m mVar) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        this.f141551a = securityRef;
        this.f141552b = i;
        this.f141553c = mVar;
    }
}
