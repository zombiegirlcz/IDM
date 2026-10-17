package ph6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f236227b;

    public e(String title, ArrayList permissions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.f236226a = title;
        this.f236227b = permissions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f236226a, eVar.f236226a) && this.f236227b.equals(eVar.f236227b);
    }

    public final int hashCode() {
        return this.f236227b.hashCode() + (this.f236226a.hashCode() * 31);
    }
}
