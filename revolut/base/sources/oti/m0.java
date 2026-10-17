package oti;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f229664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f229665c;

    public /* synthetic */ m0(int i, String str, jo3.a aVar, j0 j0Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(k0.f229652a.getDescriptor(), i, 7);
            throw null;
        }
        this.f229663a = str;
        this.f229664b = aVar;
        this.f229665c = j0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f229663a, m0Var.f229663a) && Intrinsics.f(this.f229664b, m0Var.f229664b) && Intrinsics.f(this.f229665c, m0Var.f229665c);
    }

    public final int hashCode() {
        return this.f229665c.hashCode() + v7.j(this.f229664b, this.f229663a.hashCode() * 31, 31);
    }

    public m0(String token, jo3.a originalPrice, j0 pointsOption) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        Intrinsics.checkNotNullParameter(pointsOption, "pointsOption");
        this.f229663a = token;
        this.f229664b = originalPrice;
        this.f229665c = pointsOption;
    }
}
