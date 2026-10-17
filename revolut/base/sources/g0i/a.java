package g0i;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f139494a;

    public a(List selectedCurrencies) {
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        this.f139494a = selectedCurrencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f139494a, ((a) obj2).f139494a);
    }

    public final int hashCode() {
        return this.f139494a.hashCode();
    }
}
