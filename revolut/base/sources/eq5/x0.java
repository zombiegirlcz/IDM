package eq5;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.FiatCryptoWithdrawLimits;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f128344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f128345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f128346c;
    public final rea.m d;
    public final bk5.a e;
    public final ap5.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final no5.b f128347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final po5.a f128348h;
    public final go5.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sd5.c f128349j;
    public final com.revolut.domain.interactors.transactions.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ap5.f f128350l;

    public x0(w80.b amountFormatter, ppk.f ratesInteractor, wsg.n walletInteractor, rea.m pocketDetailsInteractor, bk5.a blockchainInteractor, ap5.b cryptoWithdrawInteractor, no5.b cryptoWithdrawRepository, po5.a cryptoWithdrawEnabledStateChecker, go5.e cryptoWithdrawDependenciesConfig, sd5.c cryptoConfigInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, ap5.f cryptoWithdrawStorageInteractor) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(blockchainInteractor, "blockchainInteractor");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(cryptoWithdrawRepository, "cryptoWithdrawRepository");
        Intrinsics.checkNotNullParameter(cryptoWithdrawEnabledStateChecker, "cryptoWithdrawEnabledStateChecker");
        Intrinsics.checkNotNullParameter(cryptoWithdrawDependenciesConfig, "cryptoWithdrawDependenciesConfig");
        Intrinsics.checkNotNullParameter(cryptoConfigInteractor, "cryptoConfigInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(cryptoWithdrawStorageInteractor, "cryptoWithdrawStorageInteractor");
        this.f128344a = amountFormatter;
        this.f128345b = ratesInteractor;
        this.f128346c = walletInteractor;
        this.d = pocketDetailsInteractor;
        this.e = blockchainInteractor;
        this.f = cryptoWithdrawInteractor;
        this.f128347g = cryptoWithdrawRepository;
        this.f128348h = cryptoWithdrawEnabledStateChecker;
        this.i = cryptoWithdrawDependenciesConfig;
        this.f128349j = cryptoConfigInteractor;
        this.k = transactionsInteractor;
        this.f128350l = cryptoWithdrawStorageInteractor;
    }

    public static io3.d j(List list, Function1 function1) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            xi0.a aVar = xi0.b.Companion;
            String str = ((io3.g) obj2).f163163a.f163147c;
            aVar.getClass();
            if (((Boolean) function1.invoke(xi0.a.a(str))).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        if (it8.hasNext()) {
            next = it8.next();
            if (it8.hasNext()) {
                dj0.d dVar = ((io3.g) next).f163164b;
                long j2 = dVar != null ? dVar.f115082a : 0L;
                do {
                    Object next2 = it8.next();
                    dj0.d dVar2 = ((io3.g) next2).f163164b;
                    long j3 = dVar2 != null ? dVar2.f115082a : 0L;
                    if (j2 < j3) {
                        next = next2;
                        j2 = j3;
                    }
                } while (it8.hasNext());
            }
        } else {
            next = null;
        }
        io3.g gVar = (io3.g) next;
        if (gVar != null) {
            dj0.d dVar3 = gVar.f163164b;
            if ((dVar3 != null ? dVar3.f115082a : 0L) <= 0) {
                gVar = null;
            }
            if (gVar != null) {
                return gVar.f163163a;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r21, com.revolut.feature.crypto.withdraw.api.models.CryptoAddress r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq5.x0.a(java.lang.String, com.revolut.feature.crypto.withdraw.api.models.CryptoAddress, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(nqi.c r5, xi0.b r6, xi0.b r7, xi0.b r8, gim.c r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof eq5.l0
            if (r0 == 0) goto L13
            r0 = r9
            eq5.l0 r0 = (eq5.l0) r0
            int r1 = r0.f128287x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128287x = r1
            goto L18
        L13:
            eq5.l0 r0 = new eq5.l0
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128287x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            nqi.c r5 = r0.u
            yhm.o.b(r9)
            goto L64
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r9)
            dj0.d r9 = r5.f218471a
            xi0.b r9 = r9.f115083b
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r9)
            if (r6 == 0) goto L3f
            goto L69
        L3f:
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r7, r8)
            if (r6 == 0) goto L68
            w4l.h r6 = w4l.h.f294642c
            com.revolut.core.model.account.AccountId$Personal r7 = com.revolut.core.model.account.AccountId.Personal.f51414a
            wsg.n r8 = r4.f128346c
            efm.r r6 = r8.J(r7, r6)
            vkm.d r6 = rd0.e.b(r6)
            r7 = 3
            r8 = 0
            jhi.b r6 = mo3.a.g(r6, r8, r8, r7)
            r0.u = r5
            r0.f128287x = r3
            java.lang.Object r9 = vkm.q.x(r6, r0)
            if (r9 != r1) goto L64
            return r1
        L64:
            r7 = r9
            xi0.b r7 = (xi0.b) r7
            goto L69
        L68:
            r7 = r8
        L69:
            dj0.d r6 = new dj0.d
            java.lang.String r8 = r5.f218472b
            dj0.d r9 = r5.f218471a
            xi0.b r9 = r9.f115083b
            java.lang.String r9 = r9.f306286a
            w80.b r0 = r4.f128344a
            long r8 = r0.b(r8, r9)
            r6.<init>(r8, r7)
            nqi.c r7 = new nqi.c
            java.lang.String r5 = r5.f218472b
            r7.<init>(r6, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: eq5.x0.b(nqi.c, xi0.b, xi0.b, xi0.b, gim.c):java.io.Serializable");
    }

    public final FiatCryptoWithdrawLimits c(xi0.b beneficiaryCurrency, CryptoWithdrawLimits cryptoWithdrawLimits, List toBaseCurrencyExchangeRates) {
        Object next;
        Intrinsics.checkNotNullParameter(beneficiaryCurrency, "beneficiaryCurrency");
        Intrinsics.checkNotNullParameter(toBaseCurrencyExchangeRates, "toBaseCurrencyExchangeRates");
        if (cryptoWithdrawLimits == null) {
            return null;
        }
        dj0.d dVar = cryptoWithdrawLimits.f71092a;
        Iterator it8 = toBaseCurrencyExchangeRates.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            n9l.a aVar = (n9l.a) next;
            if (Intrinsics.f(aVar.f213661a, beneficiaryCurrency) && Intrinsics.f(aVar.f213662b, dVar.f115083b)) {
                break;
            }
        }
        n9l.a aVar2 = (n9l.a) next;
        if (aVar2 == null) {
            return null;
        }
        double d = ((double) 1) / aVar2.f213663c;
        FiatCryptoMoney fiatCryptoMoney = new FiatCryptoMoney(dVar, pyd.c.K(dVar, d, beneficiaryCurrency));
        dj0.d dVar2 = cryptoWithdrawLimits.f71093b;
        FiatCryptoMoney fiatCryptoMoney2 = new FiatCryptoMoney(dVar2, pyd.c.K(dVar2, d, beneficiaryCurrency));
        dj0.d dVar3 = cryptoWithdrawLimits.f71094c;
        FiatCryptoMoney fiatCryptoMoney3 = new FiatCryptoMoney(dVar3, pyd.c.K(dVar3, d, beneficiaryCurrency));
        dj0.d dVar4 = cryptoWithdrawLimits.d;
        return new FiatCryptoWithdrawLimits(fiatCryptoMoney, fiatCryptoMoney2, fiatCryptoMoney3, new FiatCryptoMoney(dVar4, pyd.c.K(dVar4, d, beneficiaryCurrency)), cryptoWithdrawLimits.e, cryptoWithdrawLimits.f);
    }

    public final akg.n d(dj0.d inputMoney, List toSourceCurrencyExchangeRates, xi0.b beneficiaryCurrency, xi0.b sourcePocketCurrency) {
        Intrinsics.checkNotNullParameter(inputMoney, "inputMoney");
        Intrinsics.checkNotNullParameter(beneficiaryCurrency, "beneficiaryCurrency");
        Intrinsics.checkNotNullParameter(sourcePocketCurrency, "sourcePocketCurrency");
        Intrinsics.checkNotNullParameter(toSourceCurrencyExchangeRates, "toSourceCurrencyExchangeRates");
        w4l.h hVar = w4l.h.f294642c;
        return nim.a.v(rd0.e.b(this.f128346c.J(AccountId.Personal.f51414a, hVar)), new dqd.a(inputMoney, toSourceCurrencyExchangeRates, beneficiaryCurrency, sourcePocketCurrency));
    }

    public final akg.n e(dj0.d sourcePocketBalance, List toSourceCurrencyExchangeRates, xi0.b beneficiaryCurrency) {
        Intrinsics.checkNotNullParameter(sourcePocketBalance, "sourcePocketBalance");
        Intrinsics.checkNotNullParameter(toSourceCurrencyExchangeRates, "toSourceCurrencyExchangeRates");
        Intrinsics.checkNotNullParameter(beneficiaryCurrency, "beneficiaryCurrency");
        w4l.h hVar = w4l.h.f294642c;
        return nim.a.v(rd0.e.b(this.f128346c.J(AccountId.Personal.f51414a, hVar)), new eed.i(sourcePocketBalance, 5, beneficiaryCurrency, toSourceCurrencyExchangeRates));
    }

    public final wkm.l f(CryptoAddress beneficiary, List toSourceCurrencyExchangeRates) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(toSourceCurrencyExchangeRates, "toSourceCurrencyExchangeRates");
        xi0.b currency = beneficiary.f71060b;
        wk5.k kVarA = wk5.m.a(beneficiary.f71063h);
        boolean zContains = beneficiary.i.contains(ko5.b.REVOLUT_DEFI);
        Intrinsics.checkNotNullParameter(currency, "currency");
        return vkm.q.Q(mo3.a.g(nim.a.v(rd0.e.b(nim.a.w(this.e.f16260a.a(false), new a6j.a(currency, zContains, 8))), new j0(kVarA, 0)), null, null, 3), new a67.c((Continuation) null, this, beneficiary, toSourceCurrencyExchangeRates, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.feature.crypto.withdraw.api.models.CryptoAddress r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof eq5.n0
            if (r0 == 0) goto L13
            r0 = r8
            eq5.n0 r0 = (eq5.n0) r0
            int r1 = r0.f128294w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128294w = r1
            goto L18
        L13:
            eq5.n0 r0 = new eq5.n0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128294w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            goto L48
        L36:
            yhm.o.b(r8)
            wk5.a r7 = r7.f71063h
            wk5.k r7 = wk5.m.a(r7)
            r0.f128294w = r4
            java.io.Serializable r8 = r6.h(r7, r0)
            if (r8 != r1) goto L48
            goto L84
        L48:
            java.util.List r8 = (java.util.List) r8
            no5.a r7 = no5.b.Companion
            no5.b r7 = r6.f128347g
            hp5.o r7 = (hp5.o) r7
            java.lang.String r2 = "loadingStrategy"
            w4l.h r4 = w4l.h.f294642c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            re0.c r7 = r7.f154492q
            kotlin.Unit r2 = kotlin.Unit.f186387a
            vkm.d r7 = r7.a(r2, r4)
            do2.o r2 = new do2.o
            r4 = 14
            r2.<init>(r8, r4)
            akg.n r7 = nim.a.v(r7, r2)
            r2 = 3
            r4 = 0
            jhi.b r7 = mo3.a.g(r7, r4, r4, r2)
            eq5.o0 r2 = new eq5.o0
            r5 = 0
            r2.<init>(r8, r5, r4)
            zhm.h0 r8 = zhm.h0.f322473a
            vkm.y r7 = rd0.e.e(r7, r8, r2)
            r0.f128294w = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L85
        L84:
            return r1
        L85:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: eq5.x0.g(com.revolut.feature.crypto.withdraw.api.models.CryptoAddress, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(wk5.k r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof eq5.p0
            if (r0 == 0) goto L13
            r0 = r6
            eq5.p0 r0 = (eq5.p0) r0
            int r1 = r0.f128300w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128300w = r1
            goto L18
        L13:
            eq5.p0 r0 = new eq5.p0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128300w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            eq5.j0 r6 = new eq5.j0
            r2 = 1
            r6.<init>(r5, r2)
            po5.a r5 = r4.f128348h
            ufm.i r5 = r5.b(r6)
            r0.f128300w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = zhm.w.t(r6, r0)
            r5.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L5d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r6.next()
            xi0.b r0 = (xi0.b) r0
            java.lang.String r0 = r0.f306286a
            r5.add(r0)
            goto L5d
        L6f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: eq5.x0.h(wk5.k, gim.c):java.io.Serializable");
    }

    public final Flow i(xi0.b beneficiaryCurrency, xi0.b sourceCurrency) {
        Intrinsics.checkNotNullParameter(beneficiaryCurrency, "beneficiaryCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        w4l.h hVar = w4l.h.f294642c;
        return boh.f.e(rd0.e.b(this.f128346c.J(AccountId.Personal.f51414a, hVar)), new eed.i(beneficiaryCurrency, 6, sourceCurrency, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(xi0.b r23, wk5.k r24, wk5.a r25, java.util.Set r26, gim.c r27) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq5.x0.k(xi0.b, wk5.k, wk5.a, java.util.Set, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x011f, code lost:
    
        if (r1 == r3) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable l(xi0.b r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq5.x0.l(xi0.b, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        if (r15 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        if (r15 == r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m(xi0.b r13, wk5.k r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq5.x0.m(xi0.b, wk5.k, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0296 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(wk5.k r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq5.x0.n(wk5.k, gim.c):java.lang.Object");
    }

    public final Object o(gim.i iVar) {
        pfm.h hVar = new pfm.h(new ap5.c(this.f128350l, 1), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        Object objA = nim.a.a(te0.w.g0(hVar), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    public final Object p(gim.i iVar) {
        pfm.h hVar = new pfm.h(new ap5.c(this.f128350l, 0), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        Object objA = nim.a.a(te0.w.g0(hVar), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof eq5.u0
            if (r0 == 0) goto L13
            r0 = r6
            eq5.u0 r0 = (eq5.u0) r0
            int r1 = r0.f128337w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128337w = r1
            goto L18
        L13:
            eq5.u0 r0 = new eq5.u0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128337w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L52
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            ap5.f r6 = r5.f128350l
            ap5.d r2 = new ap5.d
            r4 = 0
            r2.<init>(r6, r4)
            ufm.c r6 = new ufm.c
            r4 = 2
            r6.<init>(r2, r4)
            java.lang.String r2 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            ufm.n r6 = te0.w.i0(r6)
            r0.f128337w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: eq5.x0.q(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof eq5.v0
            if (r0 == 0) goto L13
            r0 = r6
            eq5.v0 r0 = (eq5.v0) r0
            int r1 = r0.f128340w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128340w = r1
            goto L18
        L13:
            eq5.v0 r0 = new eq5.v0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128340w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L52
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            ap5.f r6 = r5.f128350l
            ap5.d r2 = new ap5.d
            r4 = 1
            r2.<init>(r6, r4)
            ufm.c r6 = new ufm.c
            r4 = 2
            r6.<init>(r2, r4)
            java.lang.String r2 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            ufm.n r6 = te0.w.i0(r6)
            r0.f128340w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: eq5.x0.r(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable s(xi0.b r6, xi0.b r7, nqi.c r8, com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney r9, gim.c r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof eq5.w0
            if (r0 == 0) goto L13
            r0 = r10
            eq5.w0 r0 = (eq5.w0) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            eq5.w0 r0 = new eq5.w0
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f128342x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            xi0.b r6 = r0.f128341w
            com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney r9 = r0.v
            xi0.b r7 = r0.u
            yhm.o.b(r10)
            goto L67
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            yhm.o.b(r10)
            dj0.d r8 = r8.f218471a
            xi0.b r8 = r8.f115083b
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r10 == 0) goto L6e
            w4l.h r7 = w4l.h.f294642c
            com.revolut.core.model.account.AccountId$Personal r10 = com.revolut.core.model.account.AccountId.Personal.f51414a
            wsg.n r2 = r5.f128346c
            efm.r r7 = r2.J(r10, r7)
            vkm.d r7 = rd0.e.b(r7)
            r10 = 3
            r2 = 0
            jhi.b r7 = mo3.a.g(r7, r2, r2, r10)
            r0.u = r6
            r0.v = r9
            r0.f128341w = r8
            r0.z = r3
            java.lang.Object r10 = vkm.q.x(r7, r0)
            if (r10 != r1) goto L65
            return r1
        L65:
            r7 = r6
            r6 = r8
        L67:
            r8 = r10
            xi0.b r8 = (xi0.b) r8
            r4 = r8
            r8 = r6
            r6 = r7
            r7 = r4
        L6e:
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r6)
            if (r8 == 0) goto L75
            r6 = r7
        L75:
            dj0.d r7 = r9.f71113b
            xi0.b r7 = r7.f115083b
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r6 == 0) goto L82
            dj0.d r6 = r9.f71113b
            goto L84
        L82:
            dj0.d r6 = r9.f71112a
        L84:
            nqi.c r7 = new nqi.c
            w80.b r8 = r5.f128344a
            java.lang.String r8 = r8.e(r6)
            r7.<init>(r6, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: eq5.x0.s(xi0.b, xi0.b, nqi.c, com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney, gim.c):java.io.Serializable");
    }

    public final nqi.c t(nqi.a amountInputData) {
        Intrinsics.checkNotNullParameter(amountInputData, "amountInputData");
        Object obj2 = ((CenteredAmountDelegate.Model) amountInputData.f218467a).f51981p;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.EditAmountDelegateParcel");
        xi0.b bVar = ((wp5.d1) obj2).f299113a;
        String str = amountInputData.f218468b;
        return new nqi.c(new dj0.d(this.f128344a.b(str, bVar.f306286a), bVar), str);
    }
}
