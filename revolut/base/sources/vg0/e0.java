package vg0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f288688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f288689c;
    public final String d;
    public final c0 e;

    public e0(String challenge, zhm.f0 allowCredentials, int i, String rpId, c0 userVerification) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(allowCredentials, "allowCredentials");
        Intrinsics.checkNotNullParameter(rpId, "rpId");
        Intrinsics.checkNotNullParameter(userVerification, "userVerification");
        this.f288687a = challenge;
        this.f288688b = allowCredentials;
        this.f288689c = i;
        this.d = rpId;
        this.e = userVerification;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f288687a, e0Var.f288687a) && Intrinsics.f(this.f288688b, e0Var.f288688b) && this.f288689c == e0Var.f288689c && Intrinsics.f(this.d, e0Var.d) && this.e == e0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(j6.a.b(this.f288689c, p.a.d(this.f288687a.hashCode() * 31, 31, this.f288688b), 31), 31, this.d);
    }
}
