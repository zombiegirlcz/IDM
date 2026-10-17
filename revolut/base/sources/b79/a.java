package b79;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f12937b;

    public a(LinkedHashMap params, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f12936a = id10;
        this.f12937b = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f12936a, aVar.f12936a) && this.f12937b.equals(aVar.f12937b);
    }

    public final int hashCode() {
        return this.f12937b.hashCode() + (this.f12936a.hashCode() * 31);
    }
}
