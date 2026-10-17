package wmh;

import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmallStockCardDelegate f298666a;

    public a(SmallStockCardDelegate smallStockCardDelegate) {
        Intrinsics.checkNotNullParameter(smallStockCardDelegate, "smallStockCardDelegate");
        this.f298666a = smallStockCardDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f298666a, ((a) obj2).f298666a);
    }

    public final int hashCode() {
        return this.f298666a.hashCode();
    }
}
