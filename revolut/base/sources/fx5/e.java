package fx5;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f138737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f138738b;

    public e(Map currentlySelectedCurrencies, List ratesItems) {
        Intrinsics.checkNotNullParameter(currentlySelectedCurrencies, "currentlySelectedCurrencies");
        Intrinsics.checkNotNullParameter(ratesItems, "ratesItems");
        this.f138737a = currentlySelectedCurrencies;
        this.f138738b = ratesItems;
    }

    public static e a(e eVar, Map currentlySelectedCurrencies, List ratesItems, int i) {
        if ((i & 1) != 0) {
            currentlySelectedCurrencies = eVar.f138737a;
        }
        if ((i & 2) != 0) {
            ratesItems = eVar.f138738b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(currentlySelectedCurrencies, "currentlySelectedCurrencies");
        Intrinsics.checkNotNullParameter(ratesItems, "ratesItems");
        return new e(currentlySelectedCurrencies, ratesItems);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f138737a, eVar.f138737a) && Intrinsics.f(this.f138738b, eVar.f138738b);
    }

    public final int hashCode() {
        return this.f138738b.hashCode() + (this.f138737a.hashCode() * 31);
    }
}
