package tnb;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import com.revolut.feature.tab.accounts.api.exceptions.ProductAccountNotFoundException;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import djb.k;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tof.i1;
import tof.r2;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements pfe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cob.e f272400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xnb.a f272401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final djb.n f272402c;
    public final g d;
    public final t e;
    public final k18.c f;

    public q(cob.e transactionsDataSource, xnb.a discoverDataSource, djb.n savingsAccountsDetailsInteractor, g savingProductAccountInteractor, t savingsRemovalDataSource, k18.c savingsAccountSectionsMapper, gjb.b teenSavingsAccountIdResolver) {
        Intrinsics.checkNotNullParameter(transactionsDataSource, "transactionsDataSource");
        Intrinsics.checkNotNullParameter(discoverDataSource, "discoverDataSource");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(savingProductAccountInteractor, "savingProductAccountInteractor");
        Intrinsics.checkNotNullParameter(savingsRemovalDataSource, "savingsRemovalDataSource");
        Intrinsics.checkNotNullParameter(savingsAccountSectionsMapper, "savingsAccountSectionsMapper");
        Intrinsics.checkNotNullParameter(teenSavingsAccountIdResolver, "teenSavingsAccountIdResolver");
        this.f272400a = transactionsDataSource;
        this.f272401b = discoverDataSource;
        this.f272402c = savingsAccountsDetailsInteractor;
        this.d = savingProductAccountInteractor;
        this.e = savingsRemovalDataSource;
        this.f = savingsAccountSectionsMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0078  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.Flow a(com.revolut.feature.tab.accounts.models.ProductAccountId r9) {
        /*
            r8 = this;
            java.lang.String r0 = "accountId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            xnb.a r1 = r8.f272401b
            xnb.q r1 = (xnb.q) r1
            r1.getClass()
            ijb.a r2 = r1.f307362a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = r9.f89729a
            java.lang.String r3 = "SAVINGS_DISCOVER_ITEM_ID"
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r0, r3)
            if (r3 == 0) goto L3d
            ncd.m r9 = ncd.m.ACTIVE
            java.util.List r5 = zhm.u.c(r9)
            r6 = 0
            r7 = 11
            r3 = 0
            r4 = 0
            akg.n r9 = ijb.a.a(r2, r3, r4, r5, r6, r7)
            akg.n r0 = ijb.a.f(r2)
            kotlinx.coroutines.flow.Flow r2 = r1.f()
            akg.n r9 = zh9.u0.i(r9, r0, r2)
            xnb.j r0 = new xnb.j
            r2 = 1
            r0.<init>(r9, r1, r2)
            goto La9
        L3d:
            java.lang.String r3 = "DISCOVER_JUNIOR_SAVINGS_ACCOUNT_ID"
            r4 = 0
            boolean r3 = kotlin.text.a0.H(r0, r3, r4)
            if (r3 == 0) goto L78
            com.revolut.feature.tab.accounts.models.ProductAccountId$Payload r9 = r9.f89730b
            boolean r3 = r9 instanceof com.revolut.feature.retail.savings.impl.home.accounts.SavingsAccountsContract$JuniorDiscoverAccountPayload
            if (r3 == 0) goto L78
            com.revolut.feature.retail.savings.impl.home.accounts.SavingsAccountsContract$JuniorDiscoverAccountPayload r9 = (com.revolut.feature.retail.savings.impl.home.accounts.SavingsAccountsContract$JuniorDiscoverAccountPayload) r9
            java.lang.String r9 = r9.f83342a
            ou5.b r0 = r1.f307364c
            zhm.f0 r3 = zhm.f0.f322471a
            cyh.f r9 = r0.w(r9, r3)
            ncd.h r3 = ncd.h.YOUTH
            r6 = 0
            r7 = 14
            r4 = 0
            r5 = 0
            akg.n r0 = ijb.a.a(r2, r3, r4, r5, r6, r7)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.q0 r0 = rd0.e.n(r0, r2)
            kotlinx.coroutines.flow.Flow r2 = r1.f()
            akg.n r9 = zh9.u0.i(r9, r0, r2)
            xnb.j r0 = new xnb.j
            r2 = 0
            r0.<init>(r9, r1, r2)
            goto La9
        L78:
            java.lang.String r9 = "DISCOVER_JOINT_SAVINGS_ACCOUNT_ID"
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto La1
            ncd.h r3 = ncd.h.PERSONAL_JOINT
            r6 = 0
            r7 = 14
            r4 = 0
            r5 = 0
            akg.n r9 = ijb.a.a(r2, r3, r4, r5, r6, r7)
            zhm.h0 r0 = zhm.h0.f322473a
            vkm.q0 r9 = rd0.e.n(r9, r0)
            kotlinx.coroutines.flow.Flow r0 = r1.f()
            t38.e r9 = zh9.u0.m(r9, r0)
            wyd.f r0 = new wyd.f
            r2 = 16
            r0.<init>(r9, r1, r2)
            goto La9
        La1:
            zhm.f0 r9 = zhm.f0.f322471a
            go.g r0 = new go.g
            r1 = 2
            r0.<init>(r9, r1)
        La9:
            tnb.k r9 = new tnb.k
            r1 = 0
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tnb.q.a(com.revolut.feature.tab.accounts.models.ProductAccountId):kotlinx.coroutines.flow.Flow");
    }

    @Override // pfe.b
    public final Flow b(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.tab.accounts.models.ProductAccountId r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof tnb.m
            if (r0 == 0) goto L13
            r0 = r7
            tnb.m r0 = (tnb.m) r0
            int r1 = r0.f272393x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f272393x = r1
            goto L1a
        L13:
            tnb.m r0 = new tnb.m
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f272393x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            com.revolut.feature.tab.accounts.models.ProductAccountId r6 = r0.u
            yhm.o.b(r7)
            goto L44
        L3a:
            yhm.o.b(r7)
            r0.u = r6
            r0.f272393x = r4
            if (r1 != 0) goto L44
            goto L51
        L44:
            r7 = 0
            r0.u = r7
            r0.f272393x = r3
            tnb.t r7 = r5.e
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r1) goto L52
        L51:
            return r1
        L52:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tnb.q.c(com.revolut.feature.tab.accounts.models.ProductAccountId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pfe.b
    public final Flow d(ProductAccountId accountId) {
        Flow flowQ;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        String accountId2 = accountId.f89729a;
        Continuation continuation = null;
        if (Intrinsics.f(accountId2, "SAVINGS_DISCOVER_ITEM_ID")) {
            flowQ = new go.g(zhm.f0.f322471a, 2);
        } else {
            e0.Companion.getClass();
            if (Intrinsics.f(accountId2, b0.f272369b)) {
                flowQ = o(null, ncd.h.PERSONAL);
            } else if (Intrinsics.f(accountId2, b0.f272370c)) {
                flowQ = o(null, ncd.h.PERSONAL_JOINT);
            } else if (gjb.b.b(accountId2)) {
                Intrinsics.checkNotNullParameter(accountId2, "accountId");
                flowQ = o(kotlin.text.d0.e0(accountId2, gjb.b.f144248a), ncd.h.PERSONAL_UNDER_18);
            } else {
                flowQ = vkm.q.Q(rd0.e.b(m70.a.g(zi0.c.J(((rnb.i) this.f272402c).b(accountId2, w4l.h.f294642c)), null, new tj9.d(17), 1)), new tik.b(continuation, this, 3));
            }
        }
        return rd0.e.e(flowQ, h0.f322473a, new tc6.d(3, 10, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.feature.tab.accounts.models.ProductAccountId r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof tnb.l
            if (r4 == 0) goto L13
            r4 = r5
            tnb.l r4 = (tnb.l) r4
            int r0 = r4.f272391w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f272391w = r0
            goto L1a
        L13:
            tnb.l r4 = new tnb.l
            gim.c r5 = (gim.c) r5
            r4.<init>(r3, r5)
        L1a:
            java.lang.Object r5 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f272391w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r5)
            goto L3b
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r5)
            r4.f272391w = r2
            xfe.a$a r4 = xfe.a.C1695a.f305241a
            if (r4 != r0) goto L3b
            return r0
        L3b:
            xfe.a$b r4 = xfe.a.b.f305242a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tnb.q.g(com.revolut.feature.tab.accounts.models.ProductAccountId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r6 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.tab.accounts.models.ProductAccountId r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof tnb.o
            if (r0 == 0) goto L13
            r0 = r7
            tnb.o r0 = (tnb.o) r0
            int r1 = r0.f272397x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f272397x = r1
            goto L1a
        L13:
            tnb.o r0 = new tnb.o
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f272397x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r7)
            goto L66
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            com.revolut.feature.tab.accounts.models.ProductAccountId r6 = r0.u
            yhm.o.b(r7)
            goto L46
        L3a:
            yhm.o.b(r7)
            r0.u = r6
            r0.f272397x = r4
            kotlin.Unit r7 = kotlin.Unit.f186387a
            if (r7 != r1) goto L46
            goto L65
        L46:
            r7 = 0
            r0.u = r7
            r0.f272397x = r3
            tnb.t r7 = r5.e
            rnb.w r7 = r7.f272414a
            java.lang.String r6 = r6.f89729a
            lbd.a r7 = r7.f255587a
            eed.h r7 = (eed.h) r7
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r1) goto L5c
            goto L5e
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L5e:
            if (r6 != r1) goto L61
            goto L63
        L61:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L63:
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tnb.q.h(com.revolut.feature.tab.accounts.models.ProductAccountId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.revolut.feature.tab.accounts.models.ProductAccountId r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tnb.q.i(com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }

    @Override // pfe.b
    public final Flow m(ProductAccountId accountId) {
        Flow flowH;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        String accountId2 = accountId.f89729a;
        Intrinsics.checkNotNullParameter(accountId2, "accountId");
        e0.Companion.getClass();
        boolean zF = Intrinsics.f(accountId2, b0.f272369b);
        final g gVar = this.d;
        if (zF) {
            flowH = gVar.b(k.b.f115282a);
        } else if (Intrinsics.f(accountId2, b0.f272370c)) {
            flowH = gVar.b(k.a.f115281a);
        } else if (gjb.b.b(accountId2)) {
            Intrinsics.checkNotNullParameter(accountId2, "accountId");
            flowH = gVar.b(new djb.l(kotlin.text.d0.e0(accountId2, gjb.b.f144248a)));
        } else if (accountId2.equals("SAVINGS_DISCOVER_ITEM_ID")) {
            final int i = 0;
            flowH = nim.a.v(u0.i(gVar.f272379c.a(w4l.j.f294644c), gVar.a(ncd.h.PERSONAL), gVar.c()), new Function1() { // from class: tnb.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            yhm.r rVar = (yhm.r) obj2;
                            Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                            return gVar.f272380g.e((uib.a) rVar.f314201a, (List) rVar.f314202b, (wi0.b) rVar.f314203c);
                        case 1:
                            Pair pair = (Pair) obj2;
                            Intrinsics.checkNotNullParameter(pair, "<destruct>");
                            ProductAccount.ValueItem.Discover discoverC = gVar.f272380g.c((List) pair.f186385a, (wi0.b) pair.f186386b);
                            if (discoverC != null) {
                                return discoverC;
                            }
                            throw new ProductAccountNotFoundException("Can't build joint saving discover product");
                        default:
                            yhm.r rVar2 = (yhm.r) obj2;
                            Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                            od0.i iVar = (od0.i) rVar2.f314201a;
                            ProductAccount.ValueItem.Discover discoverD = gVar.f272380g.d((List) rVar2.f314202b, iVar, (wi0.b) rVar2.f314203c);
                            if (discoverD != null) {
                                return discoverD;
                            }
                            throw new ProductAccountNotFoundException("Can't build junior saving discover product");
                    }
                }
            });
        } else if (kotlin.text.a0.H(accountId2, "DISCOVER_JUNIOR_SAVINGS_ACCOUNT_ID", false)) {
            final int i2 = 2;
            flowH = nim.a.v(u0.i(nim.a.v(gVar.e.w(kotlin.text.d0.e0(accountId2, "DISCOVER_JUNIOR_SAVINGS_ACCOUNT_ID_"), zhm.v.l(null)), new tlf.n(9)), gVar.a(ncd.h.YOUTH), gVar.c()), new Function1() { // from class: tnb.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            yhm.r rVar = (yhm.r) obj2;
                            Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                            return gVar.f272380g.e((uib.a) rVar.f314201a, (List) rVar.f314202b, (wi0.b) rVar.f314203c);
                        case 1:
                            Pair pair = (Pair) obj2;
                            Intrinsics.checkNotNullParameter(pair, "<destruct>");
                            ProductAccount.ValueItem.Discover discoverC = gVar.f272380g.c((List) pair.f186385a, (wi0.b) pair.f186386b);
                            if (discoverC != null) {
                                return discoverC;
                            }
                            throw new ProductAccountNotFoundException("Can't build joint saving discover product");
                        default:
                            yhm.r rVar2 = (yhm.r) obj2;
                            Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                            od0.i iVar = (od0.i) rVar2.f314201a;
                            ProductAccount.ValueItem.Discover discoverD = gVar.f272380g.d((List) rVar2.f314202b, iVar, (wi0.b) rVar2.f314203c);
                            if (discoverD != null) {
                                return discoverD;
                            }
                            throw new ProductAccountNotFoundException("Can't build junior saving discover product");
                    }
                }
            });
        } else if (accountId2.equals("DISCOVER_JOINT_SAVINGS_ACCOUNT_ID")) {
            if (((jte.d) gVar.i).c(SavingsApi$Toggles.JointAccountsSavings.f83075c)) {
                final int i3 = 1;
                flowH = nim.a.v(u0.m(gVar.a(ncd.h.PERSONAL_JOINT), gVar.c()), new Function1() { // from class: tnb.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i3) {
                            case 0:
                                yhm.r rVar = (yhm.r) obj2;
                                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                                return gVar.f272380g.e((uib.a) rVar.f314201a, (List) rVar.f314202b, (wi0.b) rVar.f314203c);
                            case 1:
                                Pair pair = (Pair) obj2;
                                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                ProductAccount.ValueItem.Discover discoverC = gVar.f272380g.c((List) pair.f186385a, (wi0.b) pair.f186386b);
                                if (discoverC != null) {
                                    return discoverC;
                                }
                                throw new ProductAccountNotFoundException("Can't build joint saving discover product");
                            default:
                                yhm.r rVar2 = (yhm.r) obj2;
                                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                                od0.i iVar = (od0.i) rVar2.f314201a;
                                ProductAccount.ValueItem.Discover discoverD = gVar.f272380g.d((List) rVar2.f314202b, iVar, (wi0.b) rVar2.f314203c);
                                if (discoverD != null) {
                                    return discoverD;
                                }
                                throw new ProductAccountNotFoundException("Can't build junior saving discover product");
                        }
                    }
                });
            } else {
                flowH = new go.g(new Data(null, new ProductAccountNotFoundException("Joint savings accounts is not yet supported"), false, 5, null), 2);
            }
        } else {
            efm.r rVarW = nim.a.w(ue0.e.p(((rnb.i) gVar.f272377a).b(accountId2, w4l.i.f294643c), h0.f322473a), new tlf.n(7));
            od0.i.Companion.getClass();
            flowH = xam.a.h(new e(accountId2, gVar, null), rd0.e.b(zi0.c.G(rVarW, od0.i.f224256b)));
        }
        return rd0.e.e(flowH, h0.f322473a, new f(3, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(com.revolut.feature.tab.accounts.models.ProductAccountId r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof tnb.n
            if (r0 == 0) goto L13
            r0 = r8
            tnb.n r0 = (tnb.n) r0
            int r1 = r0.f272395x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f272395x = r1
            goto L18
        L13:
            tnb.n r0 = new tnb.n
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f272395x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            com.revolut.feature.tab.accounts.models.ProductAccountId r7 = r0.u
            yhm.o.b(r8)
            goto L8c
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            nib.b r8 = nib.c.Companion
            r8.getClass()
            java.util.Set r8 = nib.b.d
            java.lang.String r2 = r7.f89729a
            boolean r8 = r8.contains(r2)
            if (r8 != 0) goto La8
            boolean r8 = gjb.b.b(r2)
            if (r8 != 0) goto La8
            java.lang.String r8 = "SAVINGS_DISCOVER_ITEM_ID"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto La8
            java.lang.String r8 = "DISCOVER_JUNIOR_SAVINGS_ACCOUNT_ID"
            r5 = 0
            boolean r8 = kotlin.text.a0.H(r2, r8, r5)
            if (r8 != 0) goto La8
            java.lang.String r8 = "DISCOVER_JOINT_SAVINGS_ACCOUNT_ID"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L64
            goto La8
        L64:
            w4l.h r8 = w4l.h.f294642c
            djb.n r5 = r6.f272402c
            rnb.i r5 = (rnb.i) r5
            efm.r r8 = r5.b(r2, r8)
            efm.r r8 = zi0.c.J(r8)
            tj9.d r2 = new tj9.d
            r5 = 17
            r2.<init>(r5)
            efm.r r8 = m70.a.g(r8, r3, r2, r4)
            vkm.d r8 = rd0.e.b(r8)
            r0.u = r7
            r0.f272395x = r4
            java.lang.Object r8 = vkm.q.z(r8, r0)
            if (r8 != r1) goto L8c
            return r1
        L8c:
            com.revolut.feature.shared.savings.models.SavingsAccountDetails r8 = (com.revolut.feature.shared.savings.models.SavingsAccountDetails) r8
            if (r8 == 0) goto L96
            pcd.s r8 = r8.f86460a
            if (r8 == 0) goto L96
            java.lang.String r3 = r8.f234882b
        L96:
            com.revolut.feature.slot_manager.api.model.SlotContext r8 = new com.revolut.feature.slot_manager.api.model.SlotContext
            akd.s r0 = akd.s.SAVINGS
            java.lang.String r7 = r7.f89729a
            java.lang.String[] r7 = new java.lang.String[]{r7, r3}
            java.util.Set r7 = zhm.z0.i(r7)
            r8.<init>(r0, r7)
            return r8
        La8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tnb.q.n(com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }

    public final wkm.l o(String teenId, ncd.h accountType) {
        Flow flowE;
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        cob.e eVar = this.f272400a;
        djb.q qVar = eVar.f25523a;
        int i = cob.b.f25518a[accountType.ordinal()];
        int i2 = 0;
        int i3 = 2;
        Continuation continuation = null;
        int i5 = 1;
        if (i != 1) {
            AccountId.Personal personal = AccountId.Personal.f51414a;
            if (i == 2) {
                Flow flowC = ((rnb.v) qVar).c();
                go.g gVarI = zi0.c.i(zhm.v.k(r2.f273022a, i1.f272794a));
                go.g gVarI2 = zi0.c.i(personal);
                nib.c.Companion.getClass();
                flowE = nim.a.u(new a2c.c(i3, 21, continuation), u0.m(u0.i(flowC, gVarI, gVarI2), zi0.c.i(new ProductAccountId(nib.b.f215667b, null))));
            } else if (i != 3) {
                if (i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                flowE = new go.g(new Data(null, new IllegalStateException(accountType + " is not supported"), false, 5, null), 2);
            } else if (teenId == null) {
                flowE = new go.g(new Data(null, new IllegalStateException("ownerId is required for PERSONAL_UNDER_18"), false, 5, null), 2);
            } else {
                rnb.v vVar = (rnb.v) qVar;
                Intrinsics.checkNotNullParameter(teenId, "teenId");
                Flow flowE2 = boh.f.e(vVar.f255584a.d(new pcd.e(new pcd.k(teenId))), new rnb.u(1, vVar, rnb.v.class, "observeSavingsTransactionsFilter", "observeSavingsTransactionsFilter(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", 0, 1));
                Intrinsics.checkNotNullParameter(teenId, "teenId");
                flowE = nim.a.u(new a2c.c(i3, 22, continuation), u0.m(u0.i(flowE2, nim.a.v(rd0.e.b(vVar.f255586c.e0(teenId, w4l.h.f294642c)), new rm2.s(27)), zi0.c.i(personal)), zi0.c.i(new ProductAccountId(gjb.b.a(teenId), null))));
            }
        } else {
            flowE = boh.f.e(new amh.w(k38.c.a(eVar.f25525c, null, null, 3), 2), new cob.a(eVar, i5));
        }
        return vkm.q.Q(flowE, new cob.c(continuation, eVar, i2));
    }
}
