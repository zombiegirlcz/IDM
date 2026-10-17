package pne;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f237738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f237739c;

    public /* synthetic */ u(int i, String str, h0 h0Var, dj0.d dVar) {
        if (7 != (i & 7)) {
            j1.f(s.f237736a.getDescriptor(), i, 7);
            throw null;
        }
        this.f237737a = str;
        this.f237738b = h0Var;
        this.f237739c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f237737a, uVar.f237737a) && Intrinsics.f(this.f237738b, uVar.f237738b) && Intrinsics.f(this.f237739c, uVar.f237739c);
    }

    public final int hashCode() {
        return this.f237739c.hashCode() + ((this.f237738b.hashCode() + (this.f237737a.hashCode() * 31)) * 31);
    }

    public u(String code, h0 validityPeriod, dj0.d allowanceLimit) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(validityPeriod, "validityPeriod");
        Intrinsics.checkNotNullParameter(allowanceLimit, "allowanceLimit");
        this.f237737a = code;
        this.f237738b = validityPeriod;
        this.f237739c = allowanceLimit;
    }
}
