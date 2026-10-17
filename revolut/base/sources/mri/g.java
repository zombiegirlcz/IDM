package mri;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class g implements s {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f208136a;

    public /* synthetic */ g(int i, String str) {
        if (1 == (i & 1)) {
            this.f208136a = str;
        } else {
            j1.f(e.f208135a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f208136a, ((g) obj2).f208136a);
    }

    public final int hashCode() {
        return this.f208136a.hashCode();
    }

    public g(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f208136a = portfolioId;
    }
}
