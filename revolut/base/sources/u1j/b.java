package u1j;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f276413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276414b;

    public b(String str, ArrayList tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f276413a = tabs;
        this.f276414b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f276413a.equals(bVar.f276413a) && Intrinsics.f(this.f276414b, bVar.f276414b);
    }

    public final int hashCode() {
        int iHashCode = this.f276413a.hashCode() * 31;
        String str = this.f276414b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
