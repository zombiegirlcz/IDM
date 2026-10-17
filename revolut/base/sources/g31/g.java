package g31;

import com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryEntity;
import com.revolut.data.database.models.transactioncategory.mapper.CustomTransactionCategoryMapperKt;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f140178b;

    public /* synthetic */ g(h hVar, int i) {
        this.f140177a = i;
        this.f140178b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f140177a) {
            case 0:
                String f66106a = ((WalletId) obj2).getF66106a();
                Intrinsics.checkNotNullParameter(f66106a, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                return (List) this.f140178b.d.get(WalletId.a(f66106a));
            default:
                String f66106a2 = ((WalletId) obj2).getF66106a();
                Intrinsics.checkNotNullParameter(f66106a2, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                List<TransactionCustomCategoryEntity> all2 = this.f140178b.f140180b.getAll(f66106a2);
                ArrayList arrayList = new ArrayList(w.t(all2, 10));
                Iterator<T> it8 = all2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(CustomTransactionCategoryMapperKt.toDomain((TransactionCustomCategoryEntity) it8.next()));
                }
                return arrayList;
        }
    }
}
