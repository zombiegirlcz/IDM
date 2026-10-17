package t0c;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f266994a;

    public b() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f266994a, ((b) obj2).f266994a);
    }

    public final int hashCode() {
        return this.f266994a.hashCode();
    }

    public b(Data savingsBottomSheet) {
        Intrinsics.checkNotNullParameter(savingsBottomSheet, "savingsBottomSheet");
        this.f266994a = savingsBottomSheet;
    }

    public /* synthetic */ b(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
