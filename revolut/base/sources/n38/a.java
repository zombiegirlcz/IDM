package n38;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f211925c;
    public final ArrayList d;

    public a(String id10, String walletId, q qVar, ArrayList members) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(members, "members");
        this.f211923a = id10;
        this.f211924b = walletId;
        this.f211925c = qVar;
        this.d = members;
    }

    public static a a(a aVar, q qVar) {
        String id10 = aVar.f211923a;
        String walletId = aVar.f211924b;
        ArrayList members = aVar.d;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(members, "members");
        return new a(id10, walletId, qVar, members);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f211923a, aVar.f211923a) && Intrinsics.f(this.f211924b, aVar.f211924b) && this.f211925c == aVar.f211925c && this.d.equals(aVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f211923a.hashCode() * 31, 31, this.f211924b);
        q qVar = this.f211925c;
        return this.d.hashCode() + ((iC + (qVar == null ? 0 : qVar.hashCode())) * 31);
    }
}
