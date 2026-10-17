package ybd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f312241b;

    public /* synthetic */ i0(int i, String str, c cVar) {
        if (3 != (i & 3)) {
            j1.f(g0.f312238a.getDescriptor(), i, 3);
            throw null;
        }
        this.f312240a = str;
        this.f312241b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f312240a, i0Var.f312240a) && Intrinsics.f(this.f312241b, i0Var.f312241b);
    }

    public final int hashCode() {
        int iHashCode = this.f312240a.hashCode() * 31;
        c cVar = this.f312241b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public i0(String text, c cVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f312240a = text;
        this.f312241b = cVar;
    }
}
