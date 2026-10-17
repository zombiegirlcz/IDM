package zel;

import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f321802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f321803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenerSortingOptions f321804c;

    public h(int i, ArrayList instruments, ScreenerSortingOptions sortingOptions) {
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        Intrinsics.checkNotNullParameter(sortingOptions, "sortingOptions");
        this.f321802a = i;
        this.f321803b = instruments;
        this.f321804c = sortingOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f321802a == hVar.f321802a && this.f321803b.equals(hVar.f321803b) && this.f321804c.equals(hVar.f321804c);
    }

    public final int hashCode() {
        return this.f321804c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f321803b, Integer.hashCode(this.f321802a) * 31, 31);
    }
}
