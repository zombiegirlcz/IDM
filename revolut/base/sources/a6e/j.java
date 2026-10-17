package a6e;

import com.revolut.data.model.Data;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.tab.accounts.api.exceptions.ProductAccountNotFoundException;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements pfe.b {

    @NotNull
    private static final e Companion = new e();
    public static final Set k = y0.b("EMPTY_SUB_ACCOUNT_ID");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z5e.c f1629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z5e.c f1630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z5e.c f1631c;
    public final z5e.c d;
    public final z5e.c e;
    public final z5e.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z5e.c f1632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z5e.c f1633h;
    public final z5e.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z5e.c f1634j;

    public j(z5e.c personalDataSource, z5e.c groupDataSource, z5e.c jointDataSource, z5e.c planCashbackDataSource, z5e.c revPointsDataSource, z5e.c proDataSource, z5e.c proTaxDataSource, z5e.c juniorDataSource, z5e.c teenDataSource, z5e.c collateralDataSource) {
        Intrinsics.checkNotNullParameter(personalDataSource, "personalDataSource");
        Intrinsics.checkNotNullParameter(groupDataSource, "groupDataSource");
        Intrinsics.checkNotNullParameter(jointDataSource, "jointDataSource");
        Intrinsics.checkNotNullParameter(planCashbackDataSource, "planCashbackDataSource");
        Intrinsics.checkNotNullParameter(revPointsDataSource, "revPointsDataSource");
        Intrinsics.checkNotNullParameter(proDataSource, "proDataSource");
        Intrinsics.checkNotNullParameter(proTaxDataSource, "proTaxDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(teenDataSource, "teenDataSource");
        Intrinsics.checkNotNullParameter(collateralDataSource, "collateralDataSource");
        this.f1629a = personalDataSource;
        this.f1630b = groupDataSource;
        this.f1631c = jointDataSource;
        this.d = planCashbackDataSource;
        this.e = revPointsDataSource;
        this.f = proDataSource;
        this.f1632g = proTaxDataSource;
        this.f1633h = juniorDataSource;
        this.i = teenDataSource;
        this.f1634j = collateralDataSource;
    }

    @Override // pfe.b
    public final Flow a(ProductAccountId accountId) {
        Flow flowA;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        z5e.c cVarO = o(accountId);
        return (cVarO == null || (flowA = cVarO.a(accountId)) == null) ? vkm.i.f290039a : flowA;
    }

    @Override // pfe.b
    public final Flow b(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        z5e.c cVarO = o(accountId);
        if (cVarO != null) {
            return cVarO.b(accountId);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Can not handle ProductAccountId id=", accountId.f89729a));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return new go.g(new Data(null, null, false, 7, null), 2);
    }

    @Override // pfe.b
    public final Object c(ProductAccountId productAccountId, Continuation continuation) {
        z5e.c cVarO = o(productAccountId);
        if (cVarO != null) {
            return cVarO.c(productAccountId, (yhe.k) continuation);
        }
        return null;
    }

    @Override // pfe.b
    public final Flow d(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        z5e.c cVarO = o(accountId);
        if (cVarO != null) {
            return cVarO.h(accountId);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Can not handle ProductAccountId id=", accountId.f89729a));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return new go.g(f0.f322471a, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.feature.tab.accounts.models.ProductAccountId r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof a6e.f
            if (r0 == 0) goto L13
            r0 = r6
            a6e.f r0 = (a6e.f) r0
            int r1 = r0.f1623w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1623w = r1
            goto L1a
        L13:
            a6e.f r0 = new a6e.f
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f1623w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            z5e.c r6 = r4.o(r5)
            if (r6 == 0) goto L49
            r0.f1623w = r3
            java.lang.Object r6 = r6.g(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            xfe.a r6 = (xfe.a) r6
            if (r6 != 0) goto L48
            goto L49
        L48:
            return r6
        L49:
            xfe.a$a r5 = xfe.a.C1695a.f305241a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a6e.j.g(com.revolut.feature.tab.accounts.models.ProductAccountId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pfe.b
    public final Object h(ProductAccountId productAccountId, Continuation continuation) {
        Object objI;
        z5e.c cVarO = o(productAccountId);
        return (cVarO == null || (objI = cVarO.i(productAccountId, continuation)) != fim.a.COROUTINE_SUSPENDED) ? Unit.f186387a : objI;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.revolut.feature.tab.accounts.models.ProductAccountId r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof a6e.i
            if (r0 == 0) goto L13
            r0 = r6
            a6e.i r0 = (a6e.i) r0
            int r1 = r0.f1628w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1628w = r1
            goto L18
        L13:
            a6e.i r0 = new a6e.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f1628w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            z5e.c r6 = r4.o(r5)
            if (r6 == 0) goto L47
            r0.f1628w = r3
            java.lang.Object r6 = r6.e(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            sfe.b0 r6 = (sfe.b0) r6
            if (r6 != 0) goto L46
            goto L47
        L46:
            return r6
        L47:
            sfe.a0 r5 = sfe.a0.f262402a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a6e.j.i(com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }

    @Override // pfe.b
    public final Flow m(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        z5e.c cVarO = o(accountId);
        return cVarO == null ? new go.g(new Data(null, new ProductAccountNotFoundException(j6.a.q("Can not handle ProductAccountId id=", accountId.f89729a)), false, 5, null), 2) : vkm.q.m(new h(cVarO.j(accountId), cVarO, accountId, null));
    }

    @Override // pfe.b
    public final Object n(ProductAccountId productAccountId, gim.c cVar) {
        if (k.contains(productAccountId.f89729a)) {
            return null;
        }
        return new SlotContext(akd.s.POCKETS, y0.b(productAccountId.f89729a));
    }

    public final z5e.c o(ProductAccountId productAccountId) {
        if (k.contains(productAccountId.f89729a)) {
            return null;
        }
        ProductAccountId.Payload payload = productAccountId.f89730b;
        if (payload instanceof ExtendedSubaccountType.Personal) {
            return this.f1629a;
        }
        if (payload instanceof ExtendedSubaccountType.Group) {
            return this.f1630b;
        }
        if (payload instanceof ExtendedSubaccountType.PlanCashback) {
            return this.d;
        }
        if (payload instanceof ExtendedSubaccountType.RevPoints) {
            return this.e;
        }
        if (payload instanceof ExtendedSubaccountType.Pro) {
            return this.f;
        }
        if (payload instanceof ExtendedSubaccountType.ProTax) {
            return this.f1632g;
        }
        if (payload instanceof ExtendedSubaccountType.Junior) {
            return this.f1633h;
        }
        if (payload instanceof ExtendedSubaccountType.Teen) {
            return this.i;
        }
        if (payload instanceof ExtendedSubaccountType.Joint) {
            return this.f1631c;
        }
        if (payload instanceof ExtendedSubaccountType.Collateral) {
            return this.f1634j;
        }
        return null;
    }
}
