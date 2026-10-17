package nif;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class x2 {

    @NotNull
    public static final w2 Companion = new w2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f216068b = {yhm.j.c(yhm.k.PUBLICATION, new nhl.s(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f216069a;

    public /* synthetic */ x2(int i, List list) {
        if (1 == (i & 1)) {
            this.f216069a = list;
        } else {
            qlm.j1.f(v2.f216051a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final List a() {
        return this.f216069a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x2) && Intrinsics.f(this.f216069a, ((x2) obj2).f216069a);
    }

    public final int hashCode() {
        return this.f216069a.hashCode();
    }

    public x2(ArrayList taxesBreakdown) {
        Intrinsics.checkNotNullParameter(taxesBreakdown, "taxesBreakdown");
        this.f216069a = taxesBreakdown;
    }
}
