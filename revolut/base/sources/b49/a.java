package b49;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12204a;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f12204a, ((a) obj2).f12204a);
    }

    public final int hashCode() {
        return this.f12204a.hashCode();
    }

    public a(int i) {
        List blacklistedModelNames = u.c("NX732J");
        Intrinsics.checkNotNullParameter(blacklistedModelNames, "blacklistedModelNames");
        this.f12204a = blacklistedModelNames;
    }
}
