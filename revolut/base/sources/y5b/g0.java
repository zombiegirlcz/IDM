package y5b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsTransaction;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsTransactionBadge;
import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsTransactionsService;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsTransactionsService f311039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f311040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f311041c;
    public final x4l.c d;

    public g0(CobrandedCardsTransactionsService service, ue0.c storage, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f311039a = service;
        this.f311040b = storage;
        this.f311041c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new b0(this, continuation, 1), new y1.a(this, 16), new xwd.a(this, 22), new xv4.o(this, continuation, 24), new wvg.i(this, continuation, 29));
    }

    public static final r5b.n a(g0 g0Var, r5b.n nVar) {
        List list = nVar.f251576a;
        ArrayList transactions = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            CobrandedCardsTransaction cobrandedCardsTransaction = (CobrandedCardsTransaction) it8.next();
            String id10 = cobrandedCardsTransaction.f82418a;
            Instant date = cobrandedCardsTransaction.f82419b;
            int i = cobrandedCardsTransaction.f82420c;
            dj0.d amount = cobrandedCardsTransaction.d;
            String description = cobrandedCardsTransaction.e;
            String str = cobrandedCardsTransaction.f;
            String str2 = cobrandedCardsTransaction.f82421g;
            String str3 = cobrandedCardsTransaction.f82422h;
            String str4 = cobrandedCardsTransaction.i;
            String str5 = cobrandedCardsTransaction.f82423j;
            String str6 = cobrandedCardsTransaction.k;
            r5b.m state = cobrandedCardsTransaction.f82424l;
            Iterator it9 = it8;
            String str7 = cobrandedCardsTransaction.f82425m;
            CobrandedCardsTransactionBadge cobrandedCardsTransactionBadge = cobrandedCardsTransaction.f82426n;
            List list2 = cobrandedCardsTransaction.o;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(state, "state");
            transactions.add(new CobrandedCardsTransaction(id10, date, i, amount, description, str, str2, str3, str4, str5, str6, state, str7, cobrandedCardsTransactionBadge, list2, null));
            it8 = it9;
        }
        String str8 = nVar.f251577b;
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        return new r5b.n(transactions, str8);
    }

    public static String b(od0.i iVar) {
        return iVar.d() ? a0.d.m(iVar.c(), "KEY_TRANSACTIONS_") : "KEY_TRANSACTIONS";
    }
}
