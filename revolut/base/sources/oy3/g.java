package oy3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f230887a;

    public g(ArrayList selectedSources) {
        Intrinsics.checkNotNullParameter(selectedSources, "selectedSources");
        this.f230887a = selectedSources;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f230887a.equals(((g) obj2).f230887a);
    }

    public final int hashCode() {
        return this.f230887a.hashCode();
    }
}
