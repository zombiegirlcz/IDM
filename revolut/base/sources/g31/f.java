package g31;

import com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryDao;
import com.revolut.data.database.models.transactioncategory.mapper.CustomTransactionCategoryMapperKt;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import f9g.l;
import g1i.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tof.j3;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f140176b;

    public /* synthetic */ f(h hVar, int i) {
        this.f140175a = i;
        this.f140176b = hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f140175a) {
            case 0:
                w4l.f DataObservableDelegate = (w4l.f) obj2;
                String f66106a = ((WalletId) obj3).getF66106a();
                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(f66106a, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                h hVar = this.f140176b;
                ufm.i iVar = new ufm.i(w.n0(hVar.f140179a.getCategories(f66106a), hVar.f140181c), new i0(11, new l(f66106a, 27)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                break;
            case 1:
                String f66106a2 = ((WalletId) obj2).getF66106a();
                List categories = (List) obj3;
                Intrinsics.checkNotNullParameter(f66106a2, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                Intrinsics.checkNotNullParameter(categories, "categories");
                this.f140176b.d.put(WalletId.a(f66106a2), categories);
                break;
            default:
                String f66106a3 = ((WalletId) obj2).getF66106a();
                List categories2 = (List) obj3;
                Intrinsics.checkNotNullParameter(f66106a3, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                Intrinsics.checkNotNullParameter(categories2, "categories");
                TransactionCustomCategoryDao transactionCustomCategoryDao = this.f140176b.f140180b;
                List list = categories2;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(CustomTransactionCategoryMapperKt.m3754toEntity4GPy_8k((j3) it8.next(), f66106a3));
                }
                transactionCustomCategoryDao.insertAll(arrayList);
                break;
        }
        return Unit.f186387a;
    }
}
