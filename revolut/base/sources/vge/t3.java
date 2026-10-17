package vge;

import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.api.mode.TabAccountsMode;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import tge.d;

/* JADX INFO: loaded from: classes8.dex */
public final class t3 implements z2 {

    @NotNull
    public static final b3 Companion = new b3();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f289015r = zhm.r0.k(new Pair(pie.a.PERSONAL, ProductId.CURRENCY), new Pair(pie.a.JOINT, ProductId.JOINT), new Pair(pie.a.PRO, ProductId.PRO));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f289016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f289017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u3 f289018c;
    public final y2 d;
    public final v1 e;
    public final xge.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xge.a f289019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final rfe.p f289020h;
    public final TabAccountsMode i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f289021j;
    public final hlm.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference f289022l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f289023m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vkm.j2 f289024n;
    public final vkm.j2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f9.d f289025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Lazy f289026q;

    public t3(CoroutineScope scope, e2 repository, u3 productDataSourcesMediator, y2 productAccountsInfoInteractor, v1 productAccountInteractor, xge.j spacesProvider, xge.a accountSpacesInteractor, rfe.p tabNoContentLeftHandler, TabAccountsMode mode) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(productDataSourcesMediator, "productDataSourcesMediator");
        Intrinsics.checkNotNullParameter(productAccountsInfoInteractor, "productAccountsInfoInteractor");
        Intrinsics.checkNotNullParameter(productAccountInteractor, "productAccountInteractor");
        Intrinsics.checkNotNullParameter(spacesProvider, "spacesProvider");
        Intrinsics.checkNotNullParameter(accountSpacesInteractor, "accountSpacesInteractor");
        Intrinsics.checkNotNullParameter(tabNoContentLeftHandler, "tabNoContentLeftHandler");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f289016a = scope;
        this.f289017b = repository;
        this.f289018c = productDataSourcesMediator;
        this.d = productAccountsInfoInteractor;
        this.e = productAccountInteractor;
        this.f = spacesProvider;
        this.f289019g = accountSpacesInteractor;
        this.f289020h = tabNoContentLeftHandler;
        this.i = mode;
        this.k = hlm.d.a();
        this.f289022l = new AtomicReference(null);
        final int i = 0;
        this.f289023m = yhm.j.b(new Function0(this) { // from class: vge.a3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t3 f288867b;

            {
                this.f288867b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ukm.q qVarA = vc.s.a(-1, null, null, 6);
                        t3 t3Var = this.f288867b;
                        skm.e0.C(t3Var.f289016a, null, null, new uvf.b(qVarA, t3Var, null, 24), 3);
                        return qVarA;
                    default:
                        t3 t3Var2 = this.f288867b;
                        Continuation continuation = null;
                        vkm.q0 q0Var = new vkm.q0(new vkm.v1(new r(t3Var2, continuation, 2)), new vfg.m(t3Var2, continuation, 3), 1);
                        CoroutineScope coroutineScope = t3Var2.f289016a;
                        vkm.d2.Companion.getClass();
                        return vkm.q.j(vkm.q.M(q0Var, coroutineScope, vkm.c2.f290009c, 1), -1, 2);
                }
            }
        });
        this.f289024n = vkm.q.c(d.b.f271167a);
        this.o = m72.b.y(null, null, true, 3, null);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(this, "handler");
        f9.d dVar = new f9.d();
        dVar.f132797c = scope;
        dVar.d = this;
        dVar.f132795a = new Object();
        dVar.f132798g = new LinkedHashMap();
        this.f289025p = dVar;
        final int i2 = 1;
        this.f289026q = yhm.j.b(new Function0(this) { // from class: vge.a3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t3 f288867b;

            {
                this.f288867b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ukm.q qVarA = vc.s.a(-1, null, null, 6);
                        t3 t3Var = this.f288867b;
                        skm.e0.C(t3Var.f289016a, null, null, new uvf.b(qVarA, t3Var, null, 24), 3);
                        return qVarA;
                    default:
                        t3 t3Var2 = this.f288867b;
                        Continuation continuation = null;
                        vkm.q0 q0Var = new vkm.q0(new vkm.v1(new r(t3Var2, continuation, 2)), new vfg.m(t3Var2, continuation, 3), 1);
                        CoroutineScope coroutineScope = t3Var2.f289016a;
                        vkm.d2.Companion.getClass();
                        return vkm.q.j(vkm.q.M(q0Var, coroutineScope, vkm.c2.f290009c, 1), -1, 2);
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d6, code lost:
    
        if (((vge.t2) r8).r(r9, (com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata) r10, r1) != r2) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(vge.t3 r8, com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.t3.b(vge.t3, com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value, gim.c):java.lang.Object");
    }

    public static ProductAccount.ValueItem r(List list) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((ProductAccount.ValueItem) next).getK()) {
                break;
            }
        }
        ProductAccount.ValueItem valueItem = (ProductAccount.ValueItem) next;
        return valueItem == null ? (ProductAccount.ValueItem) zhm.d0.d0(list) : valueItem;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof vge.c3
            if (r0 == 0) goto L13
            r0 = r9
            vge.c3 r0 = (vge.c3) r0
            int r1 = r0.f288881w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288881w = r1
            goto L18
        L13:
            vge.c3 r0 = new vge.c3
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288881w
            tge.d$b r3 = tge.d.b.f271167a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            yhm.o.b(r9)
            goto L71
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            yhm.o.b(r9)
            vkm.j2 r9 = r8.f289024n
            java.lang.Object r9 = r9.getValue()
            tge.d r9 = (tge.d) r9
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r9, r3)
            if (r2 != 0) goto L83
            tge.d$a r2 = tge.d.a.f271166a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r9, r2)
            if (r2 == 0) goto L4e
            r8.w(r3)
            goto L83
        L4e:
            tge.d$c r2 = tge.d.c.f271168a
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r9, r2)
            if (r9 == 0) goto L7d
            kotlin.time.b$a r9 = kotlin.time.b.INSTANCE
            r5 = 5000(0x1388, double:2.4703E-320)
            pkm.e r9 = pkm.e.MILLISECONDS
            long r5 = kotlin.time.c.h(r5, r9)
            uxe.l r9 = new uxe.l
            r2 = 0
            r7 = 19
            r9.<init>(r8, r2, r7)
            r0.f288881w = r4
            java.lang.Object r9 = skm.h2.e(r5, r9, r0)
            if (r9 != r1) goto L71
            return r1
        L71:
            tge.d r9 = (tge.d) r9
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r9, r3)
            if (r9 != 0) goto L83
            r8.w(r3)
            goto L83
        L7d:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L83:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.t3.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof vge.d3
            if (r0 == 0) goto L13
            r0 = r7
            vge.d3 r0 = (vge.d3) r0
            int r1 = r0.f288885w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288885w = r1
            goto L18
        L13:
            vge.d3 r0 = new vge.d3
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288885w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5a
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            com.revolut.feature.tab.accounts.api.model.spaces.ProductContext r7 = new com.revolut.feature.tab.accounts.api.model.spaces.ProductContext
            com.revolut.feature.tab.accounts.models.ProductId r2 = com.revolut.feature.tab.accounts.models.ProductId.FAVORITE
            com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier$Favourites r4 = com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier.Favourites.f89744c
            pie.v r5 = pie.v.FLAT_ROOT
            r7.<init>(r2, r4, r5)
            sfe.a r2 = sfe.a.CACHE_ONLY
            vge.u3 r4 = r6.f289018c
            kotlinx.coroutines.flow.Flow r7 = r4.b(r7, r2)
            vea.b r2 = new vea.b
            r4 = 23
            r2.<init>(r4)
            r4 = 0
            jhi.b r7 = mo3.a.g(r7, r4, r2, r3)
            r0.f288885w = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L5a
            return r1
        L5a:
            java.util.List r7 = (java.util.List) r7
            int r7 = r7.size()
            r0 = 20
            if (r7 < r0) goto L65
            goto L66
        L65:
            r3 = 0
        L66:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.t3.d(gim.c):java.lang.Object");
    }

    public final Boolean e(ProductAccountDescriptor$Value productAccountDescriptor$Value) {
        c8g.a.c(productAccountDescriptor$Value);
        return Boolean.valueOf(((t2) this.f289017b).a(productAccountDescriptor$Value));
    }

    public final void f(v3 selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        ProductAccountDescriptor$Value productAccountDescriptor$Value = selection.f289042a;
        Data dataP = zi0.c.P(new Pair(productAccountDescriptor$Value, selection.f289043b), false, null, 3);
        vkm.j2 j2Var = this.o;
        j2Var.getClass();
        j2Var.g(null, dataP);
        ((ukm.u) this.f289023m.getValue()).mo3647trySendJP2dKIU(productAccountDescriptor$Value);
    }

    public final akg.n g() {
        return nim.a.v((Flow) this.f289026q.getValue(), new vga.g(16));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (r12 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
    
        if (r12 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c2 -> B:33:0x00c5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(gim.c r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.t3.h(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof vge.g3
            if (r0 == 0) goto L13
            r0 = r6
            vge.g3 r0 = (vge.g3) r0
            int r1 = r0.f288906x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288906x = r1
            goto L18
        L13:
            vge.g3 r0 = new vge.g3
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288906x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            hlm.c r0 = r0.u
            yhm.o.b(r6)
            goto L43
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            hlm.c r6 = r5.k
            r0.u = r6
            r0.f288906x = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r6
        L43:
            r5.f289021j = r3     // Catch: java.lang.Throwable -> L4d
            kotlin.Unit r6 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L4d
            r0.unlock(r4)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L4d:
            r6 = move-exception
            r0.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.t3.i(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (l(r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Discover r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof vge.h3
            if (r0 == 0) goto L13
            r0 = r8
            vge.h3 r0 = (vge.h3) r0
            int r1 = r0.f288913x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288913x = r1
            goto L18
        L13:
            vge.h3 r0 = new vge.h3
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288913x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r8)
            goto L67
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Discover r7 = r0.u
            yhm.o.b(r8)
            goto L5c
        L39:
            yhm.o.b(r8)
            r0.u = r7
            r0.f288913x = r5
            vge.e2 r8 = r6.f289017b
            vge.t2 r8 = (vge.t2) r8
            r8.getClass()
            vge.q2 r2 = new vge.q2
            r2.<init>(r8, r7, r3)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r2, r0)
            if (r8 != r1) goto L57
            goto L59
        L57:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L59:
            if (r8 != r1) goto L5c
            goto L66
        L5c:
            r0.u = r3
            r0.f288913x = r4
            java.lang.Object r7 = r6.l(r7, r0)
            if (r7 != r1) goto L67
        L66:
            return r1
        L67:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.t3.j(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Discover, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.revolut.feature.tab.accounts.api.model.ProductAccount.ValueItem.Discover r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof vge.i3
            if (r0 == 0) goto L13
            r0 = r7
            vge.i3 r0 = (vge.i3) r0
            int r1 = r0.f288924w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288924w = r1
            goto L18
        L13:
            vge.i3 r0 = new vge.i3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288924w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L51
        L27:
            r6 = move-exception
            goto L58
        L29:
            r6 = move-exception
            goto L68
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            vge.e2 r7 = r5.f289017b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.revolut.feature.tab.accounts.api.mode.TabAccountsMode r2 = r5.i     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.revolut.feature.tab.accounts.api.model.spaces.ProductContext r2 = r2.p8()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.revolut.feature.tab.accounts.models.ProductId r2 = r2.f89553a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.revolut.feature.tab.accounts.models.ProductAccountId r4 = r6.f89501c     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r6 = com.revolut.feature.tab.accounts.api.model.a.c(r6, r2, r4)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f288924w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            vge.t2 r7 = (vge.t2) r7     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Boolean r7 = r7.o(r6)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r7 != r1) goto L51
            return r1
        L51:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            boolean r6 = r7.booleanValue()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L63
        L58:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r6, r7)
            r6 = 0
        L63:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L68:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.t3.k(com.revolut.feature.tab.accounts.api.model.ProductAccount$ValueItem$Discover, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (r6.f289020h.b(r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Discover r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof vge.k3
            if (r0 == 0) goto L13
            r0 = r8
            vge.k3 r0 = (vge.k3) r0
            int r1 = r0.f288938w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288938w = r1
            goto L18
        L13:
            vge.k3 r0 = new vge.k3
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288938w
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L36
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r8)
            goto L8a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            goto L54
        L36:
            yhm.o.b(r8)
            sfe.a r8 = sfe.a.CACHE_ONLY
            qfe.j r2 = qfe.j.f245295a
            xge.a r5 = r6.f289019g
            xge.g r5 = (xge.g) r5
            wkm.l r8 = r5.b(r8, r2)
            vge.l3 r2 = new vge.l3
            r5 = 0
            r2.<init>(r7, r5)
            r0.f288938w = r3
            java.lang.Object r8 = vkm.q.y(r8, r2, r0)
            if (r8 != r1) goto L54
            goto L89
        L54:
            java.util.List r8 = (java.util.List) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r7 = r8 instanceof java.util.Collection
            if (r7 == 0) goto L66
            r7 = r8
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L66
            goto L7f
        L66:
            java.util.Iterator r7 = r8.iterator()
        L6a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L7f
            java.lang.Object r8 = r7.next()
            com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem r8 = (com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem) r8
            com.revolut.feature.tab.accounts.api.model.ProductAccount r8 = r8.f89560b
            boolean r8 = r8 instanceof com.revolut.feature.tab.accounts.api.model.ProductAccount.ValueItem
            if (r8 == 0) goto L6a
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L7f:
            r0.f288938w = r4
            rfe.p r7 = r6.f289020h
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L8a
        L89:
            return r1
        L8a:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.t3.l(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Discover, gim.c):java.lang.Object");
    }

    public final Object m(g0 g0Var, uvf.b bVar) {
        if (g0Var.equals(e0.f288888a)) {
            return p(bVar);
        }
        if (g0Var instanceof d0) {
            Object objO = o((d0) g0Var, bVar);
            return objO == fim.a.COROUTINE_SUSPENDED ? objO : (v3) objO;
        }
        if (g0Var instanceof c0) {
            c0 c0Var = (c0) g0Var;
            return n(c0Var.f288876a, c0Var.f288877b, bVar);
        }
        if (!(g0Var instanceof f0)) {
            throw new NoWhenBranchMatchedException();
        }
        f0 f0Var = (f0) g0Var;
        return n(f0Var.f288894a.getF89727a(), f0Var.f288895b, bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (c(r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(com.revolut.feature.tab.accounts.models.ProductId r8, tge.b r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof vge.n3
            if (r0 == 0) goto L13
            r0 = r10
            vge.n3 r0 = (vge.n3) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            vge.n3 r0 = new vge.n3
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f288960x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L48
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r8 = r0.f288959w
            tge.b r9 = r0.v
            yhm.o.b(r10)
            goto L89
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            tge.b r8 = r0.v
            yhm.o.b(r10)
            goto L72
        L40:
            tge.b r9 = r0.v
            com.revolut.feature.tab.accounts.models.ProductId r8 = r0.u
            yhm.o.b(r10)
            goto L58
        L48:
            yhm.o.b(r10)
            r0.u = r8
            r0.v = r9
            r0.z = r5
            java.lang.Object r10 = r7.i(r0)
            if (r10 != r1) goto L58
            goto L88
        L58:
            java.util.concurrent.atomic.AtomicReference r10 = r7.f289022l
            java.lang.Object r10 = r10.getAndSet(r6)
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r10 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main) r10
            if (r10 == 0) goto L64
        L62:
            r8 = r10
            goto L76
        L64:
            r0.u = r6
            r0.v = r9
            r0.z = r4
            java.lang.Object r10 = r7.s(r8, r0)
            if (r10 != r1) goto L71
            goto L88
        L71:
            r8 = r9
        L72:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r10 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value) r10
            r9 = r8
            goto L62
        L76:
            tge.b r10 = tge.b.REMOVAL
            if (r9 != r10) goto L89
            r0.u = r6
            r0.v = r9
            r0.f288959w = r8
            r0.z = r3
            java.lang.Object r10 = r7.c(r0)
            if (r10 != r1) goto L89
        L88:
            return r1
        L89:
            if (r8 == 0) goto L91
            vge.v3 r10 = new vge.v3
            r10.<init>(r8, r9)
            return r10
        L91:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.t3.n(com.revolut.feature.tab.accounts.models.ProductId, tge.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(vge.d0 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vge.o3
            if (r0 == 0) goto L13
            r0 = r6
            vge.o3 r0 = (vge.o3) r0
            int r1 = r0.f288966x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288966x = r1
            goto L18
        L13:
            vge.o3 r0 = new vge.o3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288966x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vge.d0 r5 = r0.u
            yhm.o.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f288966x = r3
            java.lang.Object r6 = r4.i(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            vge.v3 r6 = new vge.v3
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r0 = r5.f288882a
            tge.b r5 = r5.f288883b
            r6.<init>(r0, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.t3.o(vge.d0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc A[Catch: all -> 0x004b, TryCatch #6 {all -> 0x004b, blocks: (B:22:0x0046, B:59:0x00cc, B:63:0x00d3, B:55:0x00bc, B:53:0x00ad), top: B:82:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3 A[Catch: all -> 0x004b, PHI: r2 r5 r6
      0x00d3: PHI (r2v10 int) = (r2v7 int), (r2v11 int) binds: [B:54:0x00ba, B:62:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r5v11 ??) = (r5v9 ??), (r5v12 ??) binds: [B:54:0x00ba, B:62:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r6v7 int) = (r6v4 int), (r6v8 int) binds: [B:54:0x00ba, B:62:0x00d2] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #6 {all -> 0x004b, blocks: (B:22:0x0046, B:59:0x00cc, B:63:0x00d3, B:55:0x00bc, B:53:0x00ad), top: B:82:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #3 {all -> 0x0035, blocks: (B:15:0x0030, B:67:0x00eb, B:68:0x00ed, B:70:0x00f1, B:75:0x0100), top: B:82:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [gim.c, kotlin.coroutines.Continuation, vge.p3] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [vge.t3] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v5, types: [hlm.a, hlm.c] */
    /* JADX WARN: Type inference failed for: r13v6, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r9v2, types: [vge.t2] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(gim.c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.t3.p(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof vge.q3
            if (r0 == 0) goto L13
            r0 = r8
            vge.q3 r0 = (vge.q3) r0
            int r1 = r0.f288984x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288984x = r1
            goto L18
        L13:
            vge.q3 r0 = new vge.q3
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288984x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2d
            return r3
        L2b:
            r7 = move-exception
            goto L70
        L2d:
            r7 = move-exception
            goto L7a
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r7 = r0.u
            yhm.o.b(r8)
            goto L4d
        L3d:
            yhm.o.b(r8)
            r0.u = r7
            r0.f288984x = r5
            vge.v1 r8 = r6.e
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L4d
            goto L6e
        L4d:
            nie.f r8 = (nie.f) r8
            nie.d r2 = nie.d.f215687a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r8, r2)
            if (r2 == 0) goto L58
            return r7
        L58:
            nie.e r7 = nie.e.f215688a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r8, r7)
            if (r7 == 0) goto L7b
            vge.e2 r7 = r6.f289017b     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2d
            r0.u = r3     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2d
            r0.f288984x = r4     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2d
            vge.t2 r7 = (vge.t2) r7     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2d
            java.lang.Object r7 = r7.c(r0)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2d
            if (r7 != r1) goto L6f
        L6e:
            return r1
        L6f:
            return r3
        L70:
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r3, r3, r7, r8)
            return r3
        L7a:
            throw r7
        L7b:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.t3.q(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:
    
        if (r12 == r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013d, code lost:
    
        if (r12 == r1) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012e A[PHI: r11 r12
      0x012e: PHI (r11v7 com.revolut.feature.tab.accounts.models.ProductId) = 
      (r11v5 com.revolut.feature.tab.accounts.models.ProductId)
      (r11v9 com.revolut.feature.tab.accounts.models.ProductId)
      (r11v9 com.revolut.feature.tab.accounts.models.ProductId)
     binds: [B:53:0x00e3, B:66:0x012c, B:65:0x012a] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r12v20 java.util.List) = (r12v16 java.util.List), (r12v26 java.util.List), (r12v29 java.util.List) binds: [B:53:0x00e3, B:66:0x012c, B:65:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(com.revolut.feature.tab.accounts.models.ProductId r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.t3.s(com.revolut.feature.tab.accounts.models.ProductId, gim.c):java.lang.Object");
    }

    public final void t(ProductAccountDescriptor$Value descriptor, tge.b source) throws Throwable {
        skm.a2 a2Var;
        b bVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(source, "source");
        c8g.a.c(descriptor);
        this.f289022l.set(null);
        if (!this.f289021j) {
            f9.d dVar = this.f289025p;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(source, "source");
            dVar.a(new d0(descriptor, source));
            return;
        }
        f9.d dVar2 = this.f289025p;
        v3 selection = new v3(descriptor, source);
        dVar2.getClass();
        Intrinsics.checkNotNullParameter(selection, "selection");
        synchronized (dVar2.f132795a) {
            try {
                dVar2.f132796b = true;
                u2 u2Var = (u2) dVar2.e;
                a2Var = u2Var != null ? u2Var.f289032c : null;
                dVar2.e = null;
                ((t3) dVar2.d).f(selection);
                bVar = (b) dVar2.f;
                dVar2.f = null;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (a2Var != null) {
            a2Var.f(null);
        }
        if (bVar != null) {
            dVar2.b(bVar);
        }
    }

    public final void u(ProductId productId, tge.b source) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(source, "source");
        f9.d dVar = this.f289025p;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(source, "source");
        dVar.a(new c0(productId, source));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r10 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b8, code lost:
    
        if (r10 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r10, gim.c r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof vge.s3
            if (r0 == 0) goto L13
            r0 = r11
            vge.s3 r0 = (vge.s3) r0
            int r1 = r0.f289003x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289003x = r1
            goto L18
        L13:
            vge.s3 r0 = new vge.s3
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289003x
            vge.e2 r3 = r9.f289017b
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L4c
            if (r2 == r7) goto L46
            if (r2 == r6) goto L42
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            yhm.o.b(r11)
            goto Lbb
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r10 = r0.u
            yhm.o.b(r11)
            goto L91
        L42:
            yhm.o.b(r11)
            goto L83
        L46:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r10 = r0.u
            yhm.o.b(r11)
            goto L5d
        L4c:
            yhm.o.b(r11)
            c8g.a.c(r10)
            r0.u = r10
            r0.f289003x = r7
            java.lang.Boolean r11 = r9.e(r10)
            if (r11 != r1) goto L5d
            goto Lba
        L5d:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L86
            r0.u = r8
            r0.f289003x = r6
            vge.t2 r3 = (vge.t2) r3
            r3.getClass()
            vge.h2 r11 = new vge.h2
            r11.<init>(r3, r10, r8, r7)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r11, r0)
            if (r10 != r1) goto L7e
            goto L80
        L7e:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L80:
            if (r10 != r1) goto L83
            goto Lba
        L83:
            mge.b$c r10 = mge.b.c.f205277a
            return r10
        L86:
            r0.u = r10
            r0.f289003x = r5
            java.lang.Object r11 = r9.d(r0)
            if (r11 != r1) goto L91
            goto Lba
        L91:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L9c
            mge.b$b r10 = mge.b.C1162b.f205276a
            return r10
        L9c:
            r0.u = r8
            r0.f289003x = r4
            vge.t2 r3 = (vge.t2) r3
            r3.getClass()
            vge.h2 r11 = new vge.h2
            r2 = 0
            r11.<init>(r3, r10, r8, r2)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r11, r0)
            if (r10 != r1) goto Lb6
            goto Lb8
        Lb6:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        Lb8:
            if (r10 != r1) goto Lbb
        Lba:
            return r1
        Lbb:
            mge.b$a r10 = mge.b.a.f205275a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.t3.v(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value, gim.c):java.lang.Object");
    }

    public final void w(tge.d lifecycle) {
        vkm.j2 j2Var;
        Object value;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        do {
            j2Var = this.f289024n;
            value = j2Var.getValue();
        } while (!j2Var.h(value, lifecycle));
    }
}
