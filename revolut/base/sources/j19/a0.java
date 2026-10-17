package j19;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k19.c f170165b;

    public /* synthetic */ a0(int i, String str, k19.c cVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(y.f170282a.getDescriptor(), i, 3);
            throw null;
        }
        this.f170164a = str;
        this.f170165b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f170164a, a0Var.f170164a) && Intrinsics.f(this.f170165b, a0Var.f170165b);
    }

    public final int hashCode() {
        return this.f170165b.hashCode() + (this.f170164a.hashCode() * 31);
    }
}
