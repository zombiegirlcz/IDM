package bjl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 implements d0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rl0.b f16161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f16162c;

    public c0(String code, rl0.b bVar, wi0.b bVar2) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f16160a = code;
        this.f16161b = bVar;
        this.f16162c = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f16160a, c0Var.f16160a) && Intrinsics.f(this.f16161b, c0Var.f16161b) && Intrinsics.f(this.f16162c, c0Var.f16162c);
    }

    public final int hashCode() {
        int iHashCode = this.f16160a.hashCode() * 31;
        rl0.b bVar = this.f16161b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        wi0.b bVar2 = this.f16162c;
        return iHashCode2 + (bVar2 != null ? bVar2.f297794a.hashCode() : 0);
    }
}
