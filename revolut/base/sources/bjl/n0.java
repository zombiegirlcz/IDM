package bjl;

import com.revolut.sso.api.login.RevolutSsoApi$SignUpOutputData$Authenticated$Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 implements aii.r {

    @NotNull
    public static final m0 Companion = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rl0.b f16179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevolutSsoApi$SignUpOutputData$Authenticated$Method f16180c;
    public final wi0.b d;

    public n0(String code, rl0.b bVar, RevolutSsoApi$SignUpOutputData$Authenticated$Method revolutSsoApi$SignUpOutputData$Authenticated$Method, wi0.b bVar2) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f16178a = code;
        this.f16179b = bVar;
        this.f16180c = revolutSsoApi$SignUpOutputData$Authenticated$Method;
        this.d = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f16178a, n0Var.f16178a) && Intrinsics.f(this.f16179b, n0Var.f16179b) && Intrinsics.f(this.f16180c, n0Var.f16180c) && Intrinsics.f(this.d, n0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f16178a.hashCode() * 31;
        rl0.b bVar = this.f16179b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        RevolutSsoApi$SignUpOutputData$Authenticated$Method revolutSsoApi$SignUpOutputData$Authenticated$Method = this.f16180c;
        int iHashCode3 = (iHashCode2 + (revolutSsoApi$SignUpOutputData$Authenticated$Method == null ? 0 : revolutSsoApi$SignUpOutputData$Authenticated$Method.hashCode())) * 31;
        wi0.b bVar2 = this.d;
        return iHashCode3 + (bVar2 != null ? bVar2.f297794a.hashCode() : 0);
    }
}
