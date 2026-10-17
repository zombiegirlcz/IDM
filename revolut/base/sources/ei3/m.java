package ei3;

import ahd.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_design.api.CardDesignApi$Toggles$JointAccountsPlanCards;
import com.revolut.feature.checkout.models.CheckoutOrder;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import v6l.s;
import vkm.q;

/* JADX INFO: loaded from: classes13.dex */
public final class m implements sh3.a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hi3.a f126385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f126386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u13.g f126387c;
    public final l93.b d;
    public final l93.f e;
    public final dha.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mg0.a f126388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wsg.n f126389h;
    public final mt8.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gte.a f126390j;
    public final o k;

    public m(hi3.a checkoutRepository, s cardRepository, u13.g deliveryRepository, l93.b cardsInteractor, l93.f revolutCardsInteractor, dha.c pricingPlansRepository, mg0.a cryptoInteractor, wsg.n walletInteractor, mt8.d kycInteractor, gte.a featureToggleInteractor, o preorderErrorParser) {
        Intrinsics.checkNotNullParameter(checkoutRepository, "checkoutRepository");
        Intrinsics.checkNotNullParameter(cardRepository, "cardRepository");
        Intrinsics.checkNotNullParameter(deliveryRepository, "deliveryRepository");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlansRepository, "pricingPlansRepository");
        Intrinsics.checkNotNullParameter(cryptoInteractor, "cryptoInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(preorderErrorParser, "preorderErrorParser");
        this.f126385a = checkoutRepository;
        this.f126386b = cardRepository;
        this.f126387c = deliveryRepository;
        this.d = cardsInteractor;
        this.e = revolutCardsInteractor;
        this.f = pricingPlansRepository;
        this.f126388g = cryptoInteractor;
        this.f126389h = walletInteractor;
        this.i = kycInteractor;
        this.f126390j = featureToggleInteractor;
        this.k = preorderErrorParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable d(ei3.m r5, com.revolut.feature.checkout.models.CheckoutOrder r6, com.revolut.core.model.account.AccountId r7, gim.c r8) {
        /*
            r5.getClass()
            boolean r0 = r8 instanceof ei3.e
            if (r0 == 0) goto L16
            r0 = r8
            ei3.e r0 = (ei3.e) r0
            int r1 = r0.f126365x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f126365x = r1
            goto L1b
        L16:
            ei3.e r0 = new ei3.e
            r0.<init>(r5, r8)
        L1b:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f126365x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            com.revolut.feature.checkout.models.CheckoutOrder r6 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L5d
            goto L45
        L2d:
            r5 = move-exception
            goto L48
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r8)
            r0.u = r6     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L5d
            r0.f126365x = r4     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L5d
            java.lang.Object r8 = r5.e(r7, r6, r0)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L5d
            if (r8 != r1) goto L45
            return r1
        L45:
            pi3.g r8 = (pi3.g) r8     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L5d
            goto L52
        L48:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r8 = rd0.d.f253311a
            rd0.c r8 = rd0.c.ERROR
            rd0.d.a(r8, r3, r3, r5, r7)
            r8 = r3
        L52:
            if (r8 != 0) goto L56
            pi3.g r8 = pi3.g.WAITING_FOR_PROCESSING
        L56:
            r5 = 59
            com.revolut.feature.checkout.models.CheckoutOrder r5 = com.revolut.feature.checkout.models.CheckoutOrder.a(r6, r8, r3, r5)
            return r5
        L5d:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ei3.m.d(ei3.m, com.revolut.feature.checkout.models.CheckoutOrder, com.revolut.core.model.account.AccountId, gim.c):java.io.Serializable");
    }

    public static pi3.l i(List list, List list2) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (list2.contains(((pi3.l) next).a())) {
                break;
            }
        }
        return (pi3.l) next;
    }

    public static String j(AccountId accountId) {
        if (accountId instanceof AccountId.Joint) {
            return ((AccountId.Joint) accountId).f51413b;
        }
        if (Intrinsics.f(accountId, AccountId.Personal.f51414a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static y l(m mVar, AccountId accountId, Boolean bool, int i) {
        Continuation continuation = null;
        if ((i & 4) != 0) {
            bool = null;
        }
        return new y(q.Q(((hi3.i) mVar.f126385a).d(j(accountId), bool, false), new dz6.n(continuation, mVar, 11)), mVar, accountId, 22);
    }

    public final Object e(AccountId accountId, CheckoutOrder checkoutOrder, e eVar) {
        pi3.d d;
        pi3.d d5;
        pi3.d d6;
        xi0.b bVarB = com.revolut.feature.checkout.models.a.b(checkoutOrder);
        pi3.d d10 = checkoutOrder.getD();
        return e0.o(new i(this, checkoutOrder, accountId, bVarB, (d10 == null || !d10.c()) ? io3.l.CURRENT : io3.l.MERCHANT, (((jte.d) this.f126390j).c(CardDesignApi$Toggles$JointAccountsPlanCards.f64537c) && (accountId instanceof AccountId.Joint) && (d = checkoutOrder.getD()) != null && d.d() && ((d5 = checkoutOrder.getD()) == null || !d5.b()) && ((d6 = checkoutOrder.getD()) == null || !d6.e())) ? AccountId.Personal.f51414a : null, null), eVar);
    }

    public final long f(dj0.d totalAmount, dj0.d balance, dj0.d dVar, dj0.d dVar2, boolean z) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(balance, "balance");
        long j2 = totalAmount.f115082a - pyd.c.M(dVar2).f115082a;
        if (!z) {
            dj0.d.Companion.getClass();
            balance = dj0.d.e;
        }
        return Math.max(0L, j2 - balance.f115082a) + (dVar != null ? dVar.f115082a : 0L);
    }

    public final boolean g(dj0.d totalAmount, dj0.d remainingTopUpLimit, dj0.d balance, dj0.d dVar, boolean z) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(remainingTopUpLimit, "remainingTopUpLimit");
        Intrinsics.checkNotNullParameter(balance, "balance");
        if (!z) {
            return false;
        }
        long j2 = remainingTopUpLimit.f115082a;
        return j2 != 0 && j2 >= f(totalAmount, balance, null, dVar, true);
    }

    public final pfm.h h(CheckoutOrder order, AccountId accountId) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return pd.b.n(kotlin.coroutines.g.f186406a, new j(this, accountId, order, (Continuation) null));
    }

    public final boolean k(Throwable th10) {
        n nVarB;
        Integer numA;
        Integer numM = n14.e.m(th10);
        return (numM == null || numM.intValue() != 422 || (nVarB = this.k.b(th10)) == null || (numA = nVarB.getCode()) == null || numA.intValue() != 9302) ? false : true;
    }

    public final efm.b m(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        efm.b bVarIgnoreElements = mo3.a.n(rd0.e.c(((hi3.i) this.f126385a).d(j(accountId), null, true), kotlin.coroutines.g.f186406a)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }
}
