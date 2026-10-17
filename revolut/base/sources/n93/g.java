package n93;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.NaviCommand;
import h30.l;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e93.e f213555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NaviCommand f213556c;
    public final String d;
    public final String e;
    public final i93.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f213557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AccountId f213558h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e93.b f213559j;
    public final i k;

    public g(String idempotencyKey, e93.e virtualCardDesign, NaviCommand naviCommand, String str, String str2, i93.d dVar, Set set, AccountId accountId, String str3, e93.b bVar, i iVar, int i) {
        str = (i & 8) != 0 ? null : str;
        str2 = (i & 16) != 0 ? null : str2;
        dVar = (i & 32) != 0 ? null : dVar;
        set = (i & 64) != 0 ? null : set;
        str3 = (i & 256) != 0 ? null : str3;
        bVar = (i & 512) != 0 ? null : bVar;
        iVar = (i & 1024) != 0 ? null : iVar;
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(virtualCardDesign, "virtualCardDesign");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f213554a = idempotencyKey;
        this.f213555b = virtualCardDesign;
        this.f213556c = naviCommand;
        this.d = str;
        this.e = str2;
        this.f = dVar;
        this.f213557g = set;
        this.f213558h = accountId;
        this.i = str3;
        this.f213559j = bVar;
        this.k = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f213554a, gVar.f213554a) && Intrinsics.f(this.f213555b, gVar.f213555b) && Intrinsics.f(this.f213556c, gVar.f213556c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f && Intrinsics.f(this.f213557g, gVar.f213557g) && Intrinsics.f(this.f213558h, gVar.f213558h) && Intrinsics.f(this.i, gVar.i) && this.f213559j == gVar.f213559j && Intrinsics.f(this.k, gVar.k);
    }

    public final int hashCode() {
        int iHashCode = (this.f213555b.hashCode() + (this.f213554a.hashCode() * 31)) * 31;
        NaviCommand naviCommand = this.f213556c;
        int iHashCode2 = (iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        i93.d dVar = this.f;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Set set = this.f213557g;
        int iB = l.b(this.f213558h, (iHashCode5 + (set == null ? 0 : set.hashCode())) * 31, 31);
        String str3 = this.i;
        int iHashCode6 = (iB + (str3 == null ? 0 : str3.hashCode())) * 31;
        e93.b bVar = this.f213559j;
        int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        i iVar = this.k;
        return iHashCode7 + (iVar != null ? iVar.hashCode() : 0);
    }
}
