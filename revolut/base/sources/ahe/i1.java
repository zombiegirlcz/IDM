package ahe;

import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class i1 {

    @NotNull
    public static final h1 Companion = new h1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f5002c = {yhm.j.c(yhm.k.PUBLICATION, new a92.d(22)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalWealthCategoryKey f5003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ohe.e f5004b;

    public /* synthetic */ i1(int i, TotalWealthCategoryKey totalWealthCategoryKey, ohe.e eVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(g1.f4993a.getDescriptor(), i, 3);
            throw null;
        }
        this.f5003a = totalWealthCategoryKey;
        this.f5004b = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj2;
        return Intrinsics.f(this.f5003a, i1Var.f5003a) && Intrinsics.f(this.f5004b, i1Var.f5004b);
    }

    public final int hashCode() {
        return this.f5004b.hashCode() + (this.f5003a.hashCode() * 31);
    }

    public i1(TotalWealthCategoryKey key, ohe.e entry) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f5003a = key;
        this.f5004b = entry;
    }
}
