package il2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f162050b;

    public d(String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f162049a = str;
        this.f162050b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f162049a, dVar.f162049a) && this.f162050b.equals(dVar.f162050b);
    }

    public final int hashCode() {
        String str = this.f162049a;
        return this.f162050b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
