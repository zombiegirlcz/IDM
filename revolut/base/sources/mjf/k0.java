package mjf;

import akl.o1;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import skm.a2;
import skm.p0;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 implements mhf.j {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final TransactionContext f206009m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DateTime f206010n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l93.f f206011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f206012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xif.u f206013c;
    public final r10.q d;
    public final qd0.b e;
    public final gpk.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final skm.r f206014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hlm.c f206015h;
    public a2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public nhf.a f206016j;
    public thf.m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public thf.c f206017l;

    static {
        TransactionContext.TransactionData[] elements = {TransactionContext.TransactionData.MERCHANTS, TransactionContext.TransactionData.EXTRA_ATTRIBUTES};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f206009m = new TransactionContext(Priority.LOW.f60262b, new TransactionContext.DataSet.Included(kotlin.collections.d.y0(elements)));
        f206010n = new DateTime(Long.MAX_VALUE);
    }

    public k0(l93.f cardsInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, xif.u transactionsSearchIndexRepository, r10.q transactionsSearchIndexMapper, qd0.b languageProvider, gpk.c appVersionNameProvider) {
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsSearchIndexRepository, "transactionsSearchIndexRepository");
        Intrinsics.checkNotNullParameter(transactionsSearchIndexMapper, "transactionsSearchIndexMapper");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(appVersionNameProvider, "appVersionNameProvider");
        this.f206011a = cardsInteractor;
        this.f206012b = transactionsInteractor;
        this.f206013c = transactionsSearchIndexRepository;
        this.d = transactionsSearchIndexMapper;
        this.e = languageProvider;
        this.f = appVersionNameProvider;
        this.f206014g = skm.e0.b();
        this.f206015h = hlm.d.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
    
        if (kotlin.Unit.f186387a != r10) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(mjf.k0 r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mjf.k0.a(mjf.k0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable b(mjf.k0 r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof mjf.g0
            if (r0 == 0) goto L13
            r0 = r5
            mjf.g0 r0 = (mjf.g0) r0
            int r1 = r0.f205999w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f205999w = r1
            goto L18
        L13:
            mjf.g0 r0 = new mjf.g0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f205999w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            l93.f r4 = r4.f206011a
            b93.d r5 = b93.d.ALL
            r2 = 2
            ufm.b r4 = l93.f.j(r4, r5, r2)
            r0.f205999w = r3
            java.lang.Object r5 = nim.a.b(r4, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r4 = 10
            int r4 = zhm.w.t(r5, r4)
            int r4 = zhm.q0.b(r4)
            r0 = 16
            if (r4 >= r0) goto L5a
            r4 = r0
        L5a:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L63:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L76
            java.lang.Object r5 = r4.next()
            r1 = r5
            h93.f0 r1 = (h93.f0) r1
            java.lang.String r1 = r1.f150110a
            r0.put(r1, r5)
            goto L63
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mjf.k0.b(mjf.k0, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(mjf.k0 r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof mjf.h0
            if (r0 == 0) goto L13
            r0 = r5
            mjf.h0 r0 = (mjf.h0) r0
            int r1 = r0.f206001w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f206001w = r1
            goto L18
        L13:
            mjf.h0 r0 = new mjf.h0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f206001w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            nhf.a r4 = r4.f206016j
            if (r4 == 0) goto L4b
            njf.j r4 = (njf.j) r4
            efm.r r4 = r4.f()
            r0.f206001w = r3
            java.lang.Object r5 = nim.a.c(r4, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.String r4 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            return r5
        L4b:
            java.lang.String r4 = "unitedWalletInteractor"
            kotlin.jvm.internal.Intrinsics.r(r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mjf.k0.c(mjf.k0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(mjf.k0 r5, boolean r6, boolean r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof mjf.j0
            if (r0 == 0) goto L13
            r0 = r8
            mjf.j0 r0 = (mjf.j0) r0
            int r1 = r0.f206005w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f206005w = r1
            goto L18
        L13:
            mjf.j0 r0 = new mjf.j0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f206005w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r8)
            goto L40
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            yhm.o.b(r8)
            if (r6 == 0) goto L49
            if (r7 != 0) goto L48
            r0.f206005w = r4
            java.lang.Object r8 = r5.e(r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r5 = r8.booleanValue()
            if (r5 != 0) goto L49
        L48:
            r3 = r4
        L49:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mjf.k0.d(mjf.k0, boolean, boolean, gim.c):java.lang.Object");
    }

    public final Object e(gim.c cVar) {
        i0 i0Var = new i0(this, null, 2);
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, i0Var, cVar);
    }

    public final Object f(boolean z, gim.c cVar) {
        Object objO = skm.e0.o(new o1(this, z, null), cVar);
        return objO == fim.a.COROUTINE_SUSPENDED ? objO : Unit.f186387a;
    }

    public final Object g(Set set, gim.c cVar) throws Throwable {
        fc0.e eVar = new fc0.e(set, this, (Continuation) null);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, eVar, cVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
