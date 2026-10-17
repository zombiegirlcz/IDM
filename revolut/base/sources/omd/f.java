package omd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f226814c = new f(yld.g.ASSET, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yld.g f226815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final amd.b f226816b;

    public f(yld.g netWorthType, amd.b bVar) {
        Intrinsics.checkNotNullParameter(netWorthType, "netWorthType");
        this.f226815a = netWorthType;
        this.f226816b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f226815a == fVar.f226815a && this.f226816b == fVar.f226816b;
    }

    public final int hashCode() {
        int iHashCode = this.f226815a.hashCode() * 31;
        amd.b bVar = this.f226816b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
