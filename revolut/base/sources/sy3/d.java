package sy3;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f266609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f266610b;

    public d(LinkedHashMap values, LinkedHashMap customValues) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(customValues, "customValues");
        this.f266609a = values;
        this.f266610b = customValues;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f266609a.equals(dVar.f266609a) && this.f266610b.equals(dVar.f266610b);
    }

    public final int hashCode() {
        return this.f266610b.hashCode() + (this.f266609a.hashCode() * 31);
    }
}
