package svi;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f266012a;

    public w(ArrayList refunds) {
        Intrinsics.checkNotNullParameter(refunds, "refunds");
        this.f266012a = refunds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && this.f266012a.equals(((w) obj2).f266012a);
    }

    public final int hashCode() {
        return this.f266012a.hashCode();
    }
}
