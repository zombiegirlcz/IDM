package k5l;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.mainscreen.impl.R$string;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k50.a4;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import o97.f0;
import o97.r;
import o97.y;
import org.jetbrains.annotations.NotNull;
import te8.a0;
import tjf.l0;
import tof.a3;
import tof.ba;
import tof.i7;
import tof.oa;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements z87.d {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f181577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f181578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f181579c;
    public final thf.g d;
    public final l0 e;
    public final jla.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0m.b f181580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f181581h;

    public j(wsg.n walletsInteractor, hj8.a juniorProfileInteractor, a0 juniorTransactionsInteractor, thf.g transactionsItemMapper, l0 transactionSearchSourceDelegate, jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorTransactionsInteractor, "juniorTransactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        Intrinsics.checkNotNullParameter(transactionSearchSourceDelegate, "transactionSearchSourceDelegate");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f181577a = walletsInteractor;
        this.f181578b = juniorProfileInteractor;
        this.f181579c = juniorTransactionsInteractor;
        this.d = transactionsItemMapper;
        this.e = transactionSearchSourceDelegate;
        this.f = productCatalogueInteractor;
        this.f181580g = new e0m.b(new jj2.a(this, 25));
        this.f181581h = r.JUNIOR_KIDS_RECENT_TRANSACTIONS;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        efm.r map = rd0.e.c(bla.b.b(this.f, "YOUTH"), kotlin.coroutines.g.f186406a).map(new k3k.l(new a4(8), 11));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarSwitchMap = ue0.e.H(map, h0.f322473a, new a4(9)).switchMap(new k3k.l(new c(this, searchQuery, 0), 10));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return ue0.e.E(rVarSwitchMap, zi0.c.P(v.k(new f0(new TextLocalisedClause(R$string.junior_search_block_transactions_error_title, null, null, 14), "JUNIOR_KID_TRANSACTION_SECTION_LIST_ID_"), o97.h0.f223107a), false, null, 3));
    }

    @Override // z87.f
    public final r h() {
        return this.f181581h;
    }

    @Override // z87.f
    public final Object l(String str, y yVar, Continuation continuation) {
        Object obj2 = yVar.f223136b;
        boolean zH = kotlin.text.a0.H(str, "JUNIOR_KID_TRANSACTION_SECTION_LIST_ID_", false);
        l0 l0Var = this.e;
        if (!zH || !(obj2 instanceof e)) {
            return obj2 instanceof a3 ? new o97.l(l0Var.d((a3) obj2)) : o97.e.f223096a;
        }
        i7.c cVar = i7.Companion;
        List list = ((e) obj2).f181571c;
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
