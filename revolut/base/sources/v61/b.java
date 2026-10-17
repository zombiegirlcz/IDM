package v61;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f286265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f286266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f286267c;

    public b(f payer, String itemId, long j2) {
        Intrinsics.checkNotNullParameter(payer, "payer");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f286265a = payer;
        this.f286266b = itemId;
        this.f286267c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f286265a, bVar.f286265a) && Intrinsics.f(this.f286266b, bVar.f286266b) && this.f286267c == bVar.f286267c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f286267c) + p.a.c(this.f286265a.hashCode() * 31, 31, this.f286266b);
    }
}
