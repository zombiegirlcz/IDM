package qfg;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f245346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f245347b;

    public n(m topUp, ArrayList transactions) {
        Intrinsics.checkNotNullParameter(topUp, "topUp");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f245346a = topUp;
        this.f245347b = transactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f245346a, nVar.f245346a) && Intrinsics.f(this.f245347b, nVar.f245347b);
    }

    public final int hashCode() {
        return this.f245347b.hashCode() + (this.f245346a.hashCode() * 31);
    }
}
