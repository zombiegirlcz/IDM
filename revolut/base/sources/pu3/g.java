package pu3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f239813a;

    public g(ArrayList outstandingDebts) {
        Intrinsics.checkNotNullParameter(outstandingDebts, "outstandingDebts");
        this.f239813a = outstandingDebts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f239813a.equals(((g) obj2).f239813a);
    }

    public final int hashCode() {
        return this.f239813a.hashCode();
    }
}
