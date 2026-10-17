package cqb;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes6.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f108069b = {j.c(k.PUBLICATION, new cpi.b(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f108070a;

    public /* synthetic */ f(int i, List list) {
        if (1 == (i & 1)) {
            this.f108070a = list;
        } else {
            j1.f(d.f108068a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f108070a, ((f) obj2).f108070a);
    }

    public final int hashCode() {
        return this.f108070a.hashCode();
    }

    public f(ArrayList upgradedRates) {
        Intrinsics.checkNotNullParameter(upgradedRates, "upgradedRates");
        this.f108070a = upgradedRates;
    }
}
