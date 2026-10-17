package e5b;

import av8.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.cfd.impl.ui.providers.invest.transactions.InvestCfdAccountTransactionsContract$Transaction;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import dfl.b0;
import dfl.c0;
import dfl.d0;
import dfl.e0;
import dfl.f0;
import dfl.g;
import dfl.g0;
import dfl.h;
import dfl.h0;
import dfl.i;
import dfl.i0;
import dfl.j;
import dfl.k;
import dfl.l;
import dfl.m;
import dfl.s;
import dfl.t;
import dfl.v;
import dfl.w;
import dfl.y;
import dfl.z;
import k1h.n;
import kbh.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5b.e f122799a;

    public a(c5b.e cfdTradeUiMapper) {
        Intrinsics.checkNotNullParameter(cfdTradeUiMapper, "cfdTradeUiMapper");
        this.f122799a = cfdTradeUiMapper;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // q1h.e
    public final RowDelegate.Model a(InvestTransaction transaction, q1h.b options, Object obj2) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(options, "options");
        i0 trade = transaction.getF85125a();
        String currentUserId = transaction.getF85126b().f95317a;
        n dateTimeFormat = xam.a.E(options.f241442a);
        InvestCfdAccountTransactionsContract$Transaction investCfdAccountTransactionsContract$Transaction = transaction instanceof InvestCfdAccountTransactionsContract$Transaction ? (InvestCfdAccountTransactionsContract$Transaction) transaction : null;
        nel.n nVar = investCfdAccountTransactionsContract$Transaction != null ? investCfdAccountTransactionsContract$Transaction.f82287c : null;
        TradingLegalEntityInformation tradingLegalEntityInformation = transaction.getF85126b().f95318b;
        o parcel = new o(obj2, 11);
        c5b.e eVar = this.f122799a;
        f fVar = eVar.f21549a;
        Intrinsics.checkNotNullParameter(trade, "trade");
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        Intrinsics.checkNotNullParameter(dateTimeFormat, "dateTimeFormat");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (trade instanceof dfl.b) {
            dfl.b bVar = (dfl.b) trade;
            return new RowDelegate.Model(bVar.f114179a, new RowDelegate.Model.MainImage.Image40(c5b.e.c(bVar), c5b.e.d(bVar), null, false, 28), eVar.f(bVar, tradingLegalEntityInformation, null), null, 0, eVar.e(bVar, dateTimeFormat, currentUserId, nVar), null, null, 0, new RowDelegate.Model.c.b(fVar.l(bVar), null, null, false, 126), false, null, false, null, null, null, null, null, null, parcel.invoke(bVar), null, 0, 0, 0, 0, 532675544);
        }
        if ((trade instanceof dfl.d) || (trade instanceof z) || (trade instanceof h) || (trade instanceof j) || (trade instanceof s) || (trade instanceof v) || (trade instanceof w) || (trade instanceof b0) || (trade instanceof f0) || (trade instanceof g0) || (trade instanceof dfl.e) || (trade instanceof g) || (trade instanceof y) || (trade instanceof k) || (trade instanceof l) || (trade instanceof dfl.c) || (trade instanceof i) || (trade instanceof t) || (trade instanceof c0) || (trade instanceof e0) || (trade instanceof h0) || (trade instanceof m) || (trade instanceof d0)) {
            return fVar.c(trade, currentUserId, dateTimeFormat, nVar, tradingLegalEntityInformation, parcel);
        }
        throw new NoWhenBranchMatchedException();
    }
}
