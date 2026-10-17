package gef;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f143281a;

    public a(ArrayList transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f143281a = transactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f143281a.equals(((a) obj2).f143281a);
    }

    public final int hashCode() {
        return this.f143281a.hashCode();
    }
}
