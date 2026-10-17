package ddi;

import com.revolut.feature.rev_points.models.RevPoints;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class c implements qf1.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPoints f113226b;

    public /* synthetic */ c(int i, RevPoints revPoints, String str) {
        if (3 != (i & 3)) {
            j1.f(a.f113224a.getDescriptor(), i, 3);
            throw null;
        }
        this.f113225a = str;
        this.f113226b = revPoints;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f113225a, cVar.f113225a) && Intrinsics.f(this.f113226b, cVar.f113226b);
    }

    public final int hashCode() {
        return this.f113226b.f83960a.hashCode() + (this.f113225a.hashCode() * 31);
    }

    public c(String itemId, RevPoints maxThreshold) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(maxThreshold, "maxThreshold");
        this.f113225a = itemId;
        this.f113226b = maxThreshold;
    }
}
