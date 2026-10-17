package u2f;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f276631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276632b;

    public e(String str, ArrayList brands) {
        Intrinsics.checkNotNullParameter(brands, "brands");
        this.f276631a = brands;
        this.f276632b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f276631a.equals(eVar.f276631a) && Intrinsics.f(this.f276632b, eVar.f276632b);
    }

    public final int hashCode() {
        int iHashCode = this.f276631a.hashCode() * 31;
        String str = this.f276632b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
