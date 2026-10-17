package bcj;

import bq5.a0;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.defi.accounts.api.model.DeFiWallet;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress;
import eq5.r;
import hcj.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s56.o;
import wk5.m;
import zbj.q;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wk5.a f14458b;

    public /* synthetic */ i(wk5.a aVar, int i) {
        this.f14457a = i;
        this.f14458b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        wk5.a aVar;
        Object next2;
        switch (this.f14457a) {
            case 0:
                d update = (d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return d.a(update, null, this.f14458b, null, 5);
            case 1:
                pd5.d config = (pd5.d) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                od0.h hVar = od0.i.Companion;
                Iterator it8 = config.f235097c.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (((pd5.g) next).d.contains(this.f14458b)) {
                        }
                    } else {
                        next = null;
                    }
                }
                pd5.g gVar = (pd5.g) next;
                xi0.b bVar = gVar != null ? gVar.f235102a : null;
                hVar.getClass();
                return od0.h.a(bVar);
            case 2:
                return a0.a((a0) obj2, null, null, null, null, null, this.f14458b, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, null, null, null, 1073741791);
            case 3:
                return a0.a((a0) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, this.f14458b, null, null, null, 1006632959);
            case 4:
                r update2 = (r) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return r.a(update2, null, this.f14458b, null, null, null, null, null, null, null, false, null, null, null, null, null, 1048571);
            case 5:
                return r.a((r) obj2, null, this.f14458b, null, null, null, null, null, null, null, false, null, null, null, null, null, 1048571);
            case 6:
                return r.a((r) obj2, null, this.f14458b, null, null, null, null, null, null, null, false, null, null, null, null, null, 1048571);
            case 7:
                return r.a((r) obj2, null, this.f14458b, null, null, null, null, null, null, null, false, null, null, null, null, null, 1048571);
            case 8:
                e16.b account = (e16.b) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                Iterator it9 = account.d.iterator();
                while (true) {
                    boolean zHasNext = it9.hasNext();
                    aVar = this.f14458b;
                    if (zHasNext) {
                        next2 = it9.next();
                        if (((DeFiWallet) next2).f71643b == m.a(aVar)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                DeFiWallet deFiWallet = (DeFiWallet) next2;
                if (deFiWallet != null) {
                    return new CryptoDepositAddress(deFiWallet.f71642a, deFiWallet.f71644c, null, aVar, false);
                }
                return null;
            case 9:
                List addresses = (List) obj2;
                Intrinsics.checkNotNullParameter(addresses, "addresses");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : addresses) {
                    CryptoAddress cryptoAddress = (CryptoAddress) obj3;
                    wk5.k kVarA = m.a(cryptoAddress.f71063h);
                    wk5.a aVar2 = this.f14458b;
                    if (kVarA == (aVar2 != null ? m.a(aVar2) : null) && !cryptoAddress.f71066m) {
                        arrayList.add(obj3);
                    }
                }
                return new n(addresses.size(), arrayList);
            case 10:
                o update3 = (o) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return o.a(update3, null, null, null, this.f14458b, null, null, null, null, null, null, 2031);
            case 11:
                List detailsList = (List) obj2;
                Intrinsics.checkNotNullParameter(detailsList, "detailsList");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : detailsList) {
                    if (((DeFiAssetDetails) obj4).f71667c.contains(this.f14458b)) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                Iterator it10 = arrayList2.iterator();
                while (it10.hasNext()) {
                    arrayList3.add(new xi0.b(6, ((DeFiAssetDetails) it10.next()).f71665a.f71671a, null));
                }
                return arrayList3;
            default:
                q update4 = (q) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                od0.i.Companion.getClass();
                return q.a(update4, null, null, null, null, null, null, od0.h.a(this.f14458b), null, null, null, null, null, 16319);
        }
    }
}
