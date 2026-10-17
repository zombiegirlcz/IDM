package hcl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class v0 {

    @NotNull
    public static final u0 Companion = new u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.b f151188b;

    public /* synthetic */ v0(int i, String str, jo3.b bVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(t0.f151159a.getDescriptor(), i, 3);
            throw null;
        }
        this.f151187a = str;
        this.f151188b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f151187a, v0Var.f151187a) && Intrinsics.f(this.f151188b, v0Var.f151188b);
    }

    public final int hashCode() {
        return this.f151188b.hashCode() + (this.f151187a.hashCode() * 31);
    }

    public v0(String title, jo3.b amount) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f151187a = title;
        this.f151188b = amount;
    }
}
