package rv0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f257635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f257636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f257637c;

    public e(d suggestionsStyle, g gVar, int i) {
        Intrinsics.checkNotNullParameter(suggestionsStyle, "suggestionsStyle");
        this.f257635a = suggestionsStyle;
        this.f257636b = gVar;
        this.f257637c = i;
    }

    public static e b(e eVar, int i, int i2) {
        d suggestionsStyle = eVar.f257635a;
        g gVar = (i2 & 2) != 0 ? eVar.f257636b : null;
        if ((i2 & 4) != 0) {
            i = eVar.f257637c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(suggestionsStyle, "suggestionsStyle");
        return new e(suggestionsStyle, gVar, i);
    }

    @Override // rv0.f
    public final int a() {
        return this.f257637c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f257635a, eVar.f257635a) && Intrinsics.f(this.f257636b, eVar.f257636b) && this.f257637c == eVar.f257637c;
    }

    public final int hashCode() {
        int iHashCode = this.f257635a.hashCode() * 31;
        g gVar = this.f257636b;
        return Integer.hashCode(this.f257637c) + ((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31);
    }
}
