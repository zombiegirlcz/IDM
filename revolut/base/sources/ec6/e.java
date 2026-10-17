package ec6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f124447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f124448b;

    public e(Data spotlightItems, Data allCharities) {
        Intrinsics.checkNotNullParameter(spotlightItems, "spotlightItems");
        Intrinsics.checkNotNullParameter(allCharities, "allCharities");
        this.f124447a = spotlightItems;
        this.f124448b = allCharities;
    }

    public static e a(e eVar, Data spotlightItems, Data allCharities, int i) {
        if ((i & 1) != 0) {
            spotlightItems = eVar.f124447a;
        }
        if ((i & 2) != 0) {
            allCharities = eVar.f124448b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(spotlightItems, "spotlightItems");
        Intrinsics.checkNotNullParameter(allCharities, "allCharities");
        return new e(spotlightItems, allCharities);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f124447a, eVar.f124447a) && Intrinsics.f(this.f124448b, eVar.f124448b);
    }

    public final int hashCode() {
        return this.f124448b.hashCode() + (this.f124447a.hashCode() * 31);
    }
}
