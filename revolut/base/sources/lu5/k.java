package lu5;

import com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mu5.f f200033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f200034b;

    public k(mu5.f cryptoInvestmentsInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(cryptoInvestmentsInteractor, "cryptoInvestmentsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f200033a = cryptoInvestmentsInteractor;
        this.f200034b = walletInteractor;
    }

    public static final aim.e a(k kVar, boolean z) {
        kVar.getClass();
        aim.e eVarB = u.b();
        if (z) {
            List listK = v.k(it5.a.MAIN, it5.a.PERPETUAL);
            ArrayList arrayList = new ArrayList(w.t(listK, 10));
            Iterator it8 = listK.iterator();
            while (it8.hasNext()) {
                arrayList.add(new CryptoTransactionFilter.AccountTypeFilter((it5.a) it8.next(), false));
            }
            eVarB.addAll(arrayList);
        }
        EnumEntries enumEntriesA = kt5.a.a();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : enumEntriesA) {
            kt5.a aVar = (kt5.a) obj2;
            if ((aVar != kt5.a.CLOSE_POSITION && aVar != kt5.a.FEE) || z) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            arrayList3.add(new CryptoTransactionFilter.TransactionTypeFilter((kt5.a) it9.next(), false));
        }
        eVarB.addAll(arrayList3);
        return u.a(eVarB);
    }
}
