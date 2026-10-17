package nif;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class u0 {

    @NotNull
    public static final t0 Companion = new t0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f216042b = {yhm.j.c(yhm.k.PUBLICATION, new nhl.s(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f216043a;

    public /* synthetic */ u0(int i, List list) {
        if (1 == (i & 1)) {
            this.f216043a = list;
        } else {
            qlm.j1.f(s0.f216030a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final List a() {
        return this.f216043a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u0) && Intrinsics.f(this.f216043a, ((u0) obj2).f216043a);
    }

    public final int hashCode() {
        return this.f216043a.hashCode();
    }

    public u0(ArrayList feesBreakdown) {
        Intrinsics.checkNotNullParameter(feesBreakdown, "feesBreakdown");
        this.f216043a = feesBreakdown;
    }
}
