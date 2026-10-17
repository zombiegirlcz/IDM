package pcd;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f234900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f234901c;
    public final x d;
    public final ArrayList e;

    public v(String vaultId, String vaultName, xi0.b currency, x invitee, ArrayList members) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        Intrinsics.checkNotNullParameter(vaultName, "vaultName");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(invitee, "invitee");
        Intrinsics.checkNotNullParameter(members, "members");
        this.f234899a = vaultId;
        this.f234900b = vaultName;
        this.f234901c = currency;
        this.d = invitee;
        this.e = members;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f234899a, vVar.f234899a) && Intrinsics.f(this.f234900b, vVar.f234900b) && this.f234901c.equals(vVar.f234901c) && this.d.equals(vVar.d) && this.e.equals(vVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + h30.l.j(this.f234901c, p.a.c(this.f234899a.hashCode() * 31, 31, this.f234900b), 31)) * 31);
    }
}
