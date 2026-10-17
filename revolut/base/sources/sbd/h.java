package sbd;

import com.revolut.feature.shared.savings.impl.core.account.data.network.SavingsAccountService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lcd.i;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import p24.q;
import s78.n;
import sa6.y;
import w4l.k;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsAccountService f261580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f261581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f261582c;
    public final com.revolut.feature.shared.savings.impl.core.error.c d;
    public final x4l.c e;
    public final x4l.c f;

    public h(SavingsAccountService service, j savingsAccountMemoryCache, ue0.c savingsAccountStorage, com.revolut.feature.shared.savings.impl.core.error.c savingsErrorInterceptor) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(savingsAccountMemoryCache, "savingsAccountMemoryCache");
        Intrinsics.checkNotNullParameter(savingsAccountStorage, "savingsAccountStorage");
        Intrinsics.checkNotNullParameter(savingsErrorInterceptor, "savingsErrorInterceptor");
        this.f261580a = service;
        this.f261581b = savingsAccountMemoryCache;
        this.f261582c = savingsAccountStorage;
        this.d = savingsErrorInterceptor;
        Continuation continuation = null;
        final int i = 0;
        this.e = new x4l.c(new pti.d(this, continuation, 19), new Function1(this) { // from class: sbd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f261570b;

            {
                this.f261570b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        return (List) this.f261570b.f261581b.get("ALL_SAVINGS_ACCOUNTS_CACHE_KEY");
                    default:
                        d params = (d) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        h hVar = this.f261570b;
                        i iVar = (i) hVar.f261581b.get(params.f261573a);
                        if (iVar != null) {
                            return iVar;
                        }
                        Iterator it8 = hVar.f261581b.getAll().iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (!(next instanceof i) || !Intrinsics.f(((i) next).f193850c, params.f261573a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        return (i) next;
                }
            }
        }, new Function2(this) { // from class: sbd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f261572b;

            {
                this.f261572b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        List<i> savingsAccounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(savingsAccounts, "savingsAccounts");
                        h hVar = this.f261572b;
                        j jVar = hVar.f261581b;
                        jVar.clear();
                        jVar.f("ALL_SAVINGS_ACCOUNTS_CACHE_KEY", savingsAccounts);
                        for (i iVar : savingsAccounts) {
                            jVar.f(iVar.f193848a, iVar);
                        }
                        x4l.c.a(hVar.f, new n(savingsAccounts, 2));
                        break;
                    default:
                        i savingsAccount = (i) obj3;
                        Intrinsics.checkNotNullParameter((d) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(savingsAccount, "savingsAccount");
                        h hVar2 = this.f261572b;
                        j jVar2 = hVar2.f261581b;
                        jVar2.f(savingsAccount.f193848a, savingsAccount);
                        List list = (List) jVar2.get("ALL_SAVINGS_ACCOUNTS_CACHE_KEY");
                        if (list != null) {
                            int size = list.size();
                            ArrayList arrayListF1 = d0.f1(list);
                            Iterator it8 = arrayListF1.iterator();
                            int i2 = 0;
                            while (true) {
                                if (!it8.hasNext()) {
                                    i2 = -1;
                                } else if (!Intrinsics.f(((i) it8.next()).f193848a, savingsAccount.f193848a)) {
                                    i2++;
                                }
                            }
                            if (i2 >= 0) {
                                arrayListF1.set(i2, savingsAccount);
                            } else {
                                arrayListF1.add(size, savingsAccount);
                            }
                            jVar2.f("ALL_SAVINGS_ACCOUNTS_CACHE_KEY", arrayListF1);
                            x4l.c.a(hVar2.e, new y(9));
                        }
                        break;
                }
                return Unit.f186387a;
            }
        }, new f(this, continuation, 1), new q(this, continuation, 28));
        final int i2 = 1;
        this.f = new x4l.c(new pti.d(this, continuation, 18), new Function1(this) { // from class: sbd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f261570b;

            {
                this.f261570b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        return (List) this.f261570b.f261581b.get("ALL_SAVINGS_ACCOUNTS_CACHE_KEY");
                    default:
                        d params = (d) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        h hVar = this.f261570b;
                        i iVar = (i) hVar.f261581b.get(params.f261573a);
                        if (iVar != null) {
                            return iVar;
                        }
                        Iterator it8 = hVar.f261581b.getAll().iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (!(next instanceof i) || !Intrinsics.f(((i) next).f193850c, params.f261573a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        return (i) next;
                }
            }
        }, new Function2(this) { // from class: sbd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f261572b;

            {
                this.f261572b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        List<i> savingsAccounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(savingsAccounts, "savingsAccounts");
                        h hVar = this.f261572b;
                        j jVar = hVar.f261581b;
                        jVar.clear();
                        jVar.f("ALL_SAVINGS_ACCOUNTS_CACHE_KEY", savingsAccounts);
                        for (i iVar : savingsAccounts) {
                            jVar.f(iVar.f193848a, iVar);
                        }
                        x4l.c.a(hVar.f, new n(savingsAccounts, 2));
                        break;
                    default:
                        i savingsAccount = (i) obj3;
                        Intrinsics.checkNotNullParameter((d) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(savingsAccount, "savingsAccount");
                        h hVar2 = this.f261572b;
                        j jVar2 = hVar2.f261581b;
                        jVar2.f(savingsAccount.f193848a, savingsAccount);
                        List list = (List) jVar2.get("ALL_SAVINGS_ACCOUNTS_CACHE_KEY");
                        if (list != null) {
                            int size = list.size();
                            ArrayList arrayListF1 = d0.f1(list);
                            Iterator it8 = arrayListF1.iterator();
                            int i22 = 0;
                            while (true) {
                                if (!it8.hasNext()) {
                                    i22 = -1;
                                } else if (!Intrinsics.f(((i) it8.next()).f193848a, savingsAccount.f193848a)) {
                                    i22++;
                                }
                            }
                            if (i22 >= 0) {
                                arrayListF1.set(i22, savingsAccount);
                            } else {
                                arrayListF1.add(size, savingsAccount);
                            }
                            jVar2.f("ALL_SAVINGS_ACCOUNTS_CACHE_KEY", arrayListF1);
                            x4l.c.a(hVar2.e, new y(9));
                        }
                        break;
                }
                return Unit.f186387a;
            }
        }, new f(this, continuation, 0), new q(this, continuation, 27));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.shared.savings.models.account.SavingsAccountCreate r5, java.lang.String r6, gim.c r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof sbd.e
            if (r0 == 0) goto L13
            r0 = r7
            sbd.e r0 = (sbd.e) r0
            int r1 = r0.f261575w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261575w = r1
            goto L18
        L13:
            sbd.e r0 = new sbd.e
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261575w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L27
            goto L47
        L27:
            r5 = move-exception
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            qg7.p r7 = new qg7.p     // Catch: java.lang.Throwable -> L27
            r2 = 0
            r7.<init>(r4, r5, r6, r2)     // Catch: java.lang.Throwable -> L27
            skm.p0 r5 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L27
            elm.f r5 = elm.f.f127540b     // Catch: java.lang.Throwable -> L27
            r0.f261575w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = skm.e0.J(r5, r7, r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L47
            return r1
        L47:
            lcd.i r7 = (lcd.i) r7     // Catch: java.lang.Throwable -> L27
            return r7
        L4a:
            com.revolut.feature.shared.savings.impl.core.error.c r6 = r4.d
            java.lang.Throwable r5 = r6.b(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sbd.h.a(com.revolut.feature.shared.savings.models.account.SavingsAccountCreate, java.lang.String, gim.c):java.lang.Object");
    }

    public final akg.n b(lcd.q accountTypeFilter, String currentUserId, Set allowedStates, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(accountTypeFilter, "accountTypeFilter");
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        Intrinsics.checkNotNullParameter(allowedStates, "allowedStates");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(this.e.b(currentUserId, loadingStrategy), new s06.e(this, 8, accountTypeFilter, allowedStates));
    }

    public final Object c(gim.c cVar, String str, boolean z) {
        Object objD = this.e.d(str, z, cVar);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : Unit.f186387a;
    }
}
