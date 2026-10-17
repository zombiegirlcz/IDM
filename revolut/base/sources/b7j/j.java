package b7j;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wsg.n;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    @NotNull
    public static final g Companion = new g();
    public static final xi0.b d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f13062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f13063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l6j.b f13064c;

    static {
        xi0.b.Companion.getClass();
        d = xi0.b.i;
    }

    public j(n walletInteractor, fk3.a configurationInteractor, l6j.b flowSettingsInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(flowSettingsInteractor, "flowSettingsInteractor");
        this.f13062a = walletInteractor;
        this.f13063b = configurationInteractor;
        this.f13064c = flowSettingsInteractor;
    }

    public static xi0.b b(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return null;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (((io3.d) ((Pair) it8.next()).f186386b).i > 0) {
                Iterator it9 = list2.iterator();
                if (!it9.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object next = it9.next();
                if (it9.hasNext()) {
                    long j2 = ((io3.d) ((Pair) next).f186386b).i;
                    do {
                        Object next2 = it9.next();
                        long j3 = ((io3.d) ((Pair) next2).f186386b).i;
                        if (j2 < j3) {
                            next = next2;
                            j2 = j3;
                        }
                    } while (it9.hasNext());
                }
                return (xi0.b) ((Pair) next).f186385a;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowConfig r12, java.util.Set r13, gim.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof b7j.i
            if (r0 == 0) goto L13
            r0 = r14
            b7j.i r0 = (b7j.i) r0
            int r1 = r0.f13061w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13061w = r1
            goto L18
        L13:
            b7j.i r0 = new b7j.i
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f13061w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r14)
            goto L93
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            yhm.o.b(r14)
            com.revolut.retail.feature.commodity.order_flow.api.domain.PocketDescriptor$FullPocketDescriptor r14 = r12.f99807c
            xi0.b r6 = r14.f99802a
            com.revolut.retail.feature.commodity.order_flow.api.domain.PocketDescriptor r12 = r12.d
            if (r12 == 0) goto L40
            xi0.b r12 = r12.getF99802a()
        L3e:
            r7 = r12
            goto L42
        L40:
            r12 = 0
            goto L3e
        L42:
            f8l.c r12 = f8l.c.COMMODITY
            boolean r8 = r13.contains(r12)
            f8l.c r12 = f8l.c.CRYPTO
            boolean r9 = r13.contains(r12)
            java.lang.String r12 = "exchangeBaseCurrency"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r12)
            java.lang.String r12 = "accountId"
            com.revolut.core.model.account.AccountId$Personal r13 = com.revolut.core.model.account.AccountId.Personal.f51414a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r12)
            wsg.n r12 = r11.f13062a
            ufm.i r12 = r12.x(r13)
            b7j.e r4 = new b7j.e
            r10 = 0
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            b79.g r13 = new b79.g
            r14 = 3
            r13.<init>(r4, r14)
            ufm.i r14 = new ufm.i
            r2 = 0
            r14.<init>(r12, r13, r2)
            a82.n r12 = new a82.n
            r13 = 1
            r12.<init>(r9, r8, r13)
            b79.g r13 = new b79.g
            r2 = 4
            r13.<init>(r12, r2)
            ufm.i r12 = new ufm.i
            r2 = 1
            r12.<init>(r14, r13, r2)
            java.lang.String r13 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r13)
            r0.f13061w = r3
            java.lang.Object r14 = nim.a.b(r12, r0)
            if (r14 != r1) goto L93
            return r1
        L93:
            java.lang.String r12 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: b7j.j.a(com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowConfig, java.util.Set, gim.c):java.lang.Object");
    }
}
