package au3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9480a;

    public j(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f9480a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f9480a.equals(((j) obj2).f9480a);
    }

    public final int hashCode() {
        return this.f9480a.hashCode();
    }
}
