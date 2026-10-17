package y30;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f310679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f310680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f310681c;
    public final c0 d;

    public a(UUID uuid, UUID ticketId, UUID uuid2, c0 c0Var) {
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        this.f310679a = uuid;
        this.f310680b = ticketId;
        this.f310681c = uuid2;
        this.d = c0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f310679a, aVar.f310679a) && Intrinsics.f(this.f310680b, aVar.f310680b) && Intrinsics.f(this.f310681c, aVar.f310681c) && this.d == aVar.d;
    }

    public final int hashCode() {
        UUID uuid = this.f310679a;
        int iF = t61.a.f(this.f310680b, (uuid == null ? 0 : uuid.hashCode()) * 31, 31);
        UUID uuid2 = this.f310681c;
        int iHashCode = (iF + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        c0 c0Var = this.d;
        return iHashCode + (c0Var != null ? c0Var.hashCode() : 0);
    }
}
