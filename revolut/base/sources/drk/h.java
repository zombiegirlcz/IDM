package drk;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f117171a;

    public h(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f117171a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f117171a.equals(((h) obj2).f117171a);
    }

    public final int hashCode() {
        return this.f117171a.hashCode();
    }
}
