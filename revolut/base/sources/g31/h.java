package g31;

import com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryDao;
import com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryEntity;
import com.revolut.data.database.models.transactioncategory.mapper.CustomTransactionCategoryMapperKt;
import com.revolut.data.network.services.TransactionCategoriesService;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import efm.r;
import g1i.i0;
import g1k.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import tof.k3;
import tof.l2;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionCategoriesService f140179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionCustomCategoryDao f140180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b80.c f140181c;
    public volatile LinkedHashMap d;
    public final w4l.f e;

    public h(TransactionCategoriesService transactionCategoriesService, TransactionCustomCategoryDao transactionCustomCategoryDao, b80.c connectivityRepository) {
        Intrinsics.checkNotNullParameter(transactionCategoriesService, "transactionCategoriesService");
        Intrinsics.checkNotNullParameter(transactionCustomCategoryDao, "transactionCustomCategoryDao");
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        this.f140179a = transactionCategoriesService;
        this.f140180b = transactionCustomCategoryDao;
        this.f140181c = connectivityRepository;
        this.d = new LinkedHashMap();
        this.e = new w4l.f(new f(this, 0), new g(this, 0), new f(this, 1), new g(this, 1), new f(this, 2), null, null, null, BERTags.FLAGS);
    }

    public static ArrayList a() {
        l2[] l2VarArrValues = l2.values();
        ArrayList arrayList = new ArrayList();
        for (l2 l2Var : l2VarArrValues) {
            if (l2Var.a()) {
                arrayList.add(l2Var);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(new k3((l2) it8.next()));
        }
        return arrayList2;
    }

    public final r b(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
        r map = m70.a.g(this.e.f(WalletId.a(str), z), null, new g0c.h(26), 1).map(new i0(7, new k(this, 23)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final r c(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
        return nim.a.w(this.e.f(WalletId.a(str), z), new k(this, 24));
    }

    public final void d(String str) {
        WalletId walletIdA = WalletId.a(str);
        List<TransactionCustomCategoryEntity> all2 = this.f140180b.getAll(str);
        ArrayList arrayList = new ArrayList(w.t(all2, 10));
        Iterator<T> it8 = all2.iterator();
        while (it8.hasNext()) {
            arrayList.add(CustomTransactionCategoryMapperKt.toDomain((TransactionCustomCategoryEntity) it8.next()));
        }
        this.e.j(walletIdA, arrayList);
    }
}
