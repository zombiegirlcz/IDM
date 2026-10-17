package jq7;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f177493a;

    public c(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f177493a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f177493a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f177493a.equals(((c) obj2).f177493a);
    }

    public final int hashCode() {
        return this.f177493a.hashCode();
    }
}
