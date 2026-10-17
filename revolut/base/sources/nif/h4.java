package nif;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class h4 {

    @NotNull
    public static final g4 Companion = new g4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f215854b = {yhm.j.c(yhm.k.PUBLICATION, new nhl.s(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f215855a;

    public /* synthetic */ h4(int i, List list) {
        if (1 == (i & 1)) {
            this.f215855a = list;
        } else {
            qlm.j1.f(f4.f215829a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final List a() {
        return this.f215855a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h4) && Intrinsics.f(this.f215855a, ((h4) obj2).f215855a);
    }

    public final int hashCode() {
        return this.f215855a.hashCode();
    }

    public h4(ArrayList deductions) {
        Intrinsics.checkNotNullParameter(deductions, "deductions");
        this.f215855a = deductions;
    }
}
