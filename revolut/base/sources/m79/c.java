package m79;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f203353a;

    public c(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f203353a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f203353a.equals(((c) obj2).f203353a);
    }

    public final int hashCode() {
        return this.f203353a.hashCode();
    }
}
