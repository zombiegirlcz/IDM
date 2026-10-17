package ybd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f312253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f312254c;

    public /* synthetic */ m(int i, String str, String str2, t0 t0Var) {
        if (3 != (i & 3)) {
            j1.f(k.f312247a.getDescriptor(), i, 3);
            throw null;
        }
        this.f312252a = str;
        this.f312253b = str2;
        if ((i & 4) == 0) {
            this.f312254c = null;
        } else {
            this.f312254c = t0Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f312252a, mVar.f312252a) && Intrinsics.f(this.f312253b, mVar.f312253b) && Intrinsics.f(this.f312254c, mVar.f312254c);
    }

    public final int hashCode() {
        int iHashCode = this.f312252a.hashCode() * 31;
        String str = this.f312253b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        t0 t0Var = this.f312254c;
        return iHashCode2 + (t0Var != null ? t0Var.hashCode() : 0);
    }

    public m(String text, String str, t0 t0Var) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f312252a = text;
        this.f312253b = str;
        this.f312254c = t0Var;
    }
}
