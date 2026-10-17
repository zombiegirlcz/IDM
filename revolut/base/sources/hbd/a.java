package hbd;

import aim.e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f150646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f150647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f150648c;
    public final boolean d;
    public final List e;

    public a(boolean z, boolean z3, boolean z4, boolean z6, e extraWalletIds) {
        Intrinsics.checkNotNullParameter(extraWalletIds, "extraWalletIds");
        this.f150646a = z;
        this.f150647b = z3;
        this.f150648c = z4;
        this.d = z6;
        this.e = extraWalletIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f150646a == aVar.f150646a && this.f150647b == aVar.f150647b && this.f150648c == aVar.f150648c && this.d == aVar.d && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f150646a) * 31, 31, this.f150647b), 31, this.f150648c), 31, this.d);
    }
}
