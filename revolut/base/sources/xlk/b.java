package xlk;

import hha.w;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f307030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f307031b;

    public b(w name, ArrayList items) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f307030a = name;
        this.f307031b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f307030a == bVar.f307030a && this.f307031b.equals(bVar.f307031b);
    }

    public final int hashCode() {
        return this.f307031b.hashCode() + (this.f307030a.hashCode() * 31);
    }
}
