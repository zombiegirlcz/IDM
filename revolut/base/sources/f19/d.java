package f19;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f131188a;

    public d(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f131188a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f131188a.equals(((d) obj2).f131188a);
    }

    public final int hashCode() {
        return this.f131188a.hashCode();
    }
}
