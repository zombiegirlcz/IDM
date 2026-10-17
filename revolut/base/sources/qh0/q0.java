package qh0;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class q0 {

    @NotNull
    public static final p0 Companion = new p0();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f246411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f246412c;
    public final String d;
    public final n0 e;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{null, yhm.j.c(kVar, new d(10)), null, null, yhm.j.c(kVar, new d(11))};
    }

    public /* synthetic */ q0(int i, String str, List list, int i2, String str2, n0 n0Var) {
        if (31 != (i & 31)) {
            j1.f(o0.f246408a.getDescriptor(), i, 31);
            throw null;
        }
        this.f246410a = str;
        this.f246411b = list;
        this.f246412c = i2;
        this.d = str2;
        this.e = n0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f246410a, q0Var.f246410a) && Intrinsics.f(this.f246411b, q0Var.f246411b) && this.f246412c == q0Var.f246412c && Intrinsics.f(this.d, q0Var.d) && this.e == q0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(j6.a.b(this.f246412c, p.a.d(this.f246410a.hashCode() * 31, 31, this.f246411b), 31), 31, this.d);
    }

    public q0(String challenge, List allowCredentials, int i, String rpId, n0 userVerification) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(allowCredentials, "allowCredentials");
        Intrinsics.checkNotNullParameter(rpId, "rpId");
        Intrinsics.checkNotNullParameter(userVerification, "userVerification");
        this.f246410a = challenge;
        this.f246411b = allowCredentials;
        this.f246412c = i;
        this.d = rpId;
        this.e = userVerification;
    }
}
