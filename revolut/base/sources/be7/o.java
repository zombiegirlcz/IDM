package be7;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f14707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14709c;
    public final String d;

    public o(String str, String accessToken, UUID ticketId, String str2) {
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        this.f14707a = ticketId;
        this.f14708b = str;
        this.f14709c = accessToken;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f14707a, oVar.f14707a) && Intrinsics.f(this.f14708b, oVar.f14708b) && Intrinsics.f(this.f14709c, oVar.f14709c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f14707a.hashCode() * 31;
        String str = this.f14708b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f14709c);
        String str2 = this.d;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }
}
