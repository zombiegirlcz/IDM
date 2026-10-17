package mq5;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f207886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9l.a f207887b;

    public c() {
        this((n9l.a) null, 3);
    }

    public static c a(c cVar, Data fees) {
        n9l.a aVar = cVar.f207887b;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(fees, "fees");
        return new c(fees, aVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f207886a, cVar.f207886a) && Intrinsics.f(this.f207887b, cVar.f207887b);
    }

    public final int hashCode() {
        int iHashCode = this.f207886a.hashCode() * 31;
        n9l.a aVar = this.f207887b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public c(Data fees, n9l.a aVar) {
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f207886a = fees;
        this.f207887b = aVar;
    }

    public /* synthetic */ c(n9l.a aVar, int i) {
        this(new Data(null, null, true, 3, null), (i & 2) != 0 ? null : aVar);
    }
}
