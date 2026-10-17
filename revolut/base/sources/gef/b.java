package gef;

import java.time.LocalDateTime;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f143282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f143283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f143284c;

    public b(LocalDateTime createdSince, boolean z, ArrayList transactions) {
        Intrinsics.checkNotNullParameter(createdSince, "createdSince");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f143282a = createdSince;
        this.f143283b = z;
        this.f143284c = transactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f143282a, bVar.f143282a) && this.f143283b == bVar.f143283b && this.f143284c.equals(bVar.f143284c);
    }

    public final int hashCode() {
        return this.f143284c.hashCode() + j6.a.c(this.f143282a.hashCode() * 31, 31, this.f143283b);
    }
}
