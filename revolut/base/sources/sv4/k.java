package sv4;

import aw0.k7;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$Instalment;
import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$RevolverTransaction;
import com.revolut.feature.credit.core.R$string;
import java.time.ZonedDateTime;
import java.util.concurrent.CancellationException;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.l f265844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.d f265845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final thf.m f265846c;

    public k(thf.l transactionItemsMapper, thf.d transactionIconResourcesMapper, thf.m transactionTextResourcesMapper) {
        Intrinsics.checkNotNullParameter(transactionItemsMapper, "transactionItemsMapper");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        this.f265844a = transactionItemsMapper;
        this.f265845b = transactionIconResourcesMapper;
        this.f265846c = transactionTextResourcesMapper;
    }

    public static RowDelegate.Model c(h hVar, RowDelegate.Model.MainImage.Image40 image40, Clause clause, f fVar, boolean z) throws Throwable {
        Object objA;
        CreditCardInAppStatement$RevolverTransaction creditCardInAppStatement$RevolverTransaction = hVar.f265840a;
        String str = "id_credit_card_transaction_" + creditCardInAppStatement$RevolverTransaction.f68882a;
        dj0.d dVar = creditCardInAppStatement$RevolverTransaction.f68883b;
        ZonedDateTime zonedDateTime = creditCardInAppStatement$RevolverTransaction.f68882a;
        TimeClause timeClause = new TimeClause(zonedDateTime.toInstant().toEpochMilli(), new TimeClause.Format.Pretty(0), null, null, 12);
        if (z) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                objA = creditCardInAppStatement$RevolverTransaction.f68884c;
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                objA = o.a(th10);
            }
            if (objA == null) {
                throw new IllegalArgumentException(("Missing interestAmount for transaction type=" + creditCardInAppStatement$RevolverTransaction.f + " completedDate=" + zonedDateTime).toString());
            }
            Throwable thA = yhm.m.a(objA);
            if (thA != null) {
                hx7.e.n(thA);
            }
            if (objA instanceof n) {
                objA = null;
            }
            dj0.d dVar2 = (dj0.d) objA;
            if (dVar2 != null) {
                dVar = dVar2;
            }
        }
        MoneyClause moneyClauseB = sx4.f.b(2, null, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), dVar);
        CreditCardInAppStatement$Instalment creditCardInAppStatement$Instalment = creditCardInAppStatement$RevolverTransaction.f68885g;
        return new RowDelegate.Model(str, image40, clause, null, 0, timeClause, null, null, 0, new RowDelegate.Model.c.b(moneyClauseB, creditCardInAppStatement$Instalment != null ? new TextLocalisedClause(R$string.credit_card_instalment_of, v.k(Integer.valueOf(creditCardInAppStatement$Instalment.f68875a), Integer.valueOf(creditCardInAppStatement$Instalment.f68876b)), null, 12) : null, null, false, 124), false, null, false, null, null, null, null, null, null, fVar, null, 0, 0, 0, 0, 532675544);
    }

    public final wh a(a3 a3Var, q qVar) {
        return ((anf.o) this.f265844a).p(a3Var, qVar, new thf.k(1022, false, false, false, false, false), null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(11:35|(1:37)(1:38)|(17:149|40|41|(5:151|43|(1:45)(1:50)|(1:52)|53)(1:54)|59|(1:61)|62|(1:64)|65|(0)|68|72|(1:74)(1:75)|76|155|77|(13:79|(6:81|(1:83)(1:88)|(1:90)|91|(1:93)(1:94)|95)(1:96)|97|98|102|(1:104)|105|(1:107)|108|(1:110)|(1:112)|113|14)(3:99|100|161))(1:70)|71|68|72|(0)(0)|76|155|77|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0234, code lost:
    
        r7 = yhm.m.INSTANCE;
        r19 = yhm.o.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x026d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019f A[Catch: all -> 0x01b1, CancellationException -> 0x01b4, TryCatch #6 {CancellationException -> 0x01b4, all -> 0x01b1, blocks: (B:77:0x019b, B:79:0x019f, B:81:0x01a8, B:83:0x01ae, B:90:0x01ba, B:91:0x01c3, B:93:0x01d9, B:95:0x01e0, B:97:0x0229, B:96:0x0208, B:99:0x022e, B:100:0x0233), top: B:155:0x019b }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022e A[Catch: all -> 0x01b1, CancellationException -> 0x01b4, TryCatch #6 {CancellationException -> 0x01b4, all -> 0x01b1, blocks: (B:77:0x019b, B:79:0x019f, B:81:0x01a8, B:83:0x01ae, B:90:0x01ba, B:91:0x01c3, B:93:0x01d9, B:95:0x01e0, B:97:0x0229, B:96:0x0208, B:99:0x022e, B:100:0x0233), top: B:155:0x019b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(java.util.List r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sv4.k.b(java.util.List, boolean):java.util.ArrayList");
    }
}
