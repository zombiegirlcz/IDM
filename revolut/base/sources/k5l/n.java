package k5l;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k50.a4;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import o97.r;
import o97.y;
import org.jetbrains.annotations.NotNull;
import tjf.l0;
import tof.a3;
import tof.ba;
import tof.i7;
import tof.oa;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements z87.d {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jla.h f181586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f181587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final thf.g f181588c;
    public final l0 d;
    public final r e;

    public n(jla.h productCatalogueInteractor, wsg.n walletInteractor, thf.g transactionsItemMapper, l0 transactionSearchSourceDelegate) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        Intrinsics.checkNotNullParameter(transactionSearchSourceDelegate, "transactionSearchSourceDelegate");
        this.f181586a = productCatalogueInteractor;
        this.f181587b = walletInteractor;
        this.f181588c = transactionsItemMapper;
        this.d = transactionSearchSourceDelegate;
        this.e = r.JUNIOR_RECENT_TRANSACTIONS;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        efm.r map = rd0.e.c(bla.b.b(this.f181586a, "YOUTH"), kotlin.coroutines.g.f186406a).map(new k3k.l(new a4(12), 13));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarSwitchMap = ue0.e.H(map, h0.f322473a, new a4(13)).switchMap(new k3k.l(new k(this, 0), 12));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return ue0.e.E(rVarSwitchMap, this.d.b(R$string.search_block_recent_transactions_title, "JUNIOR_RECENT_PARENT_TRANSACTION_SECTION_LIST_ID"));
    }

    @Override // z87.f
    public final r h() {
        return this.e;
    }

    @Override // z87.f
    public final Object l(String str, y yVar, Continuation continuation) {
        Object obj2 = yVar != null ? yVar.f223136b : null;
        boolean zF = Intrinsics.f(str, "JUNIOR_RECENT_PARENT_TRANSACTION_SECTION_LIST_ID");
        l0 l0Var = this.d;
        if (!zF || !(obj2 instanceof m)) {
            return obj2 instanceof a3 ? new o97.l(l0Var.d((a3) obj2)) : o97.e.f223096a;
        }
        i7.c cVar = i7.Companion;
        List list = ((m) obj2).f181584a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new ba(((a3) it8.next()).f272579a));
        }
        ba[] baVarArr = (ba[]) arrayList.toArray(new ba[0]);
        i7[] i7VarArr = (i7[]) Arrays.copyOf(baVarArr, baVarArr.length);
        cVar.getClass();
        oa oaVarB = i7.c.b(i7VarArr);
        m70.a.c(t0.f186434a);
        return new o97.l(l0Var.e(oaVarB, "", AccountId.Personal.f51414a));
    }
}
