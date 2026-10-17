package hx2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e93.f f156363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f156364b;

    public e(e93.f cardDesign, ArrayList availablePlans) {
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        Intrinsics.checkNotNullParameter(availablePlans, "availablePlans");
        this.f156363a = cardDesign;
        this.f156364b = availablePlans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f156363a, eVar.f156363a) && this.f156364b.equals(eVar.f156364b);
    }

    public final int hashCode() {
        return this.f156364b.hashCode() + (this.f156363a.hashCode() * 31);
    }
}
