package ygc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class b0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f313596b;

    public /* synthetic */ b0(int i, String str, c cVar) {
        if (3 != (i & 3)) {
            j1.f(z.f313638a.getDescriptor(), i, 3);
            throw null;
        }
        this.f313595a = str;
        this.f313596b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f313595a, b0Var.f313595a) && Intrinsics.f(this.f313596b, b0Var.f313596b);
    }

    public final int hashCode() {
        int iHashCode = this.f313595a.hashCode() * 31;
        c cVar = this.f313596b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public b0(String text, c cVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f313595a = text;
        this.f313596b = cVar;
    }
}
