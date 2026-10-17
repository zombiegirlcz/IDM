package hu6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f155565a;

    public c(ArrayList receipts) {
        Intrinsics.checkNotNullParameter(receipts, "receipts");
        this.f155565a = receipts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f155565a.equals(((c) obj2).f155565a);
    }

    public final int hashCode() {
        return this.f155565a.hashCode();
    }
}
