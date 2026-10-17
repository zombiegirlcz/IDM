package uel;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f279485a;

    public a(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f279485a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f279485a.equals(((a) obj2).f279485a);
    }

    public final int hashCode() {
        return this.f279485a.hashCode();
    }
}
