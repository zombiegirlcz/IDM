package yfe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yfe.h;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class n extends h.a {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f313283c;
    public final int d;
    public final l1 e;
    public final i1 f;

    public /* synthetic */ n(int i, dj0.d dVar, int i2, l1 l1Var, i1 i1Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(l.f313279a.getDescriptor(), i, 15);
            throw null;
        }
        this.f313283c = dVar;
        this.d = i2;
        this.e = l1Var;
        this.f = i1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f313283c, nVar.f313283c) && this.d == nVar.d && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(j6.a.b(this.d, this.f313283c.hashCode() * 31, 31), 31, this.e.f313281a);
    }

    public n(dj0.d money, int i, l1 userAvatar, i1 partnerAvatar) {
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(userAvatar, "userAvatar");
        Intrinsics.checkNotNullParameter(partnerAvatar, "partnerAvatar");
        this.f313283c = money;
        this.d = i;
        this.e = userAvatar;
        this.f = partnerAvatar;
    }
}
