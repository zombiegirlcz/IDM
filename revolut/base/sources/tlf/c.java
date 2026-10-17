package tlf;

import java.util.Map;
import klf.j1;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f272060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f272061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f2a.a f272062c;
    public final do3.n d;
    public final j1 e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f272063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f272064h;
    public final Map i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final na7.a f272065j;
    public final Map k;

    public c(a3 transaction, Map pockets, f2a.a aVar, do3.n currentUser, j1 youthWalletOwner, Map customisedVaults, Map billAccounts, Map juniorTransactionData, Map proBackgroundIcons, na7.a hiddenAccountData, Map contactMap) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(currentUser, "currentUser");
        Intrinsics.checkNotNullParameter(youthWalletOwner, "youthWalletOwner");
        Intrinsics.checkNotNullParameter(customisedVaults, "customisedVaults");
        Intrinsics.checkNotNullParameter(billAccounts, "billAccounts");
        Intrinsics.checkNotNullParameter(juniorTransactionData, "juniorTransactionData");
        Intrinsics.checkNotNullParameter(proBackgroundIcons, "proBackgroundIcons");
        Intrinsics.checkNotNullParameter(hiddenAccountData, "hiddenAccountData");
        Intrinsics.checkNotNullParameter(contactMap, "contactMap");
        this.f272060a = transaction;
        this.f272061b = pockets;
        this.f272062c = aVar;
        this.d = currentUser;
        this.e = youthWalletOwner;
        this.f = customisedVaults;
        this.f272063g = billAccounts;
        this.f272064h = juniorTransactionData;
        this.i = proBackgroundIcons;
        this.f272065j = hiddenAccountData;
        this.k = contactMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f272060a, cVar.f272060a) && Intrinsics.f(this.f272061b, cVar.f272061b) && Intrinsics.f(this.f272062c, cVar.f272062c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f272063g, cVar.f272063g) && Intrinsics.f(this.f272064h, cVar.f272064h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f272065j, cVar.f272065j) && Intrinsics.f(this.k, cVar.k);
    }

    public final int hashCode() {
        int iE = p.a.e(this.f272060a.hashCode() * 31, 31, this.f272061b);
        f2a.a aVar = this.f272062c;
        return this.k.hashCode() + ((this.f272065j.hashCode() + p.a.e(p.a.e(p.a.e(p.a.e((this.e.hashCode() + ((this.d.hashCode() + ((iE + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31)) * 31, 31, this.f), 31, this.f272063g), 31, this.f272064h), 31, this.i)) * 31);
    }
}
