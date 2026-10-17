package zx0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f326006a;

    public m(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f326006a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f326006a.equals(((m) obj2).f326006a);
    }

    public final int hashCode() {
        return this.f326006a.hashCode();
    }
}
