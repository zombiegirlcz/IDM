package vge;

import com.google.common.collect.ImmutableMap;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.feature.backgroundpicker.api.model.PersistedBackground;
import com.revolut.feature.tab.accounts.api.model.AccountBackground;
import com.revolut.feature.tab.accounts.api.model.AccountBackgroundParams;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements d {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f289049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xge.a f289050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2 f289051c;
    public final z2 d;
    public final bn2.p e;
    public final o1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fhe.a f289052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f289053h;
    public final ssi.o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ash.i f289054j;
    public final skd.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i49.a f289055l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v1 f289056m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l1 f289057n;
    public final r10.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rfe.b f289058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ConcurrentHashMap f289059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ConcurrentHashMap f289060r;

    public x(CoroutineScope scope, xge.a accountSpacesInteractor, e2 repository, z2 productAccountsInteractor, bn2.p backgroundsInteractor, o1 memoryCacheProductDataFlowDecorator, fhe.a discoverItemsMapper, ImmutableMap accountDataSourcesMap, ssi.o transactionsWidgetUiModel, ash.i widgetsInteractor, skd.i slotManagerInteractor, i49.a pendingActionsItemsProvider, v1 productAccountInteractor, l1 hiddenAccountsTitleDecorator, r10.d legalEntityProviderFactory, rfe.b defaultAccountResolver) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(accountSpacesInteractor, "accountSpacesInteractor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(productAccountsInteractor, "productAccountsInteractor");
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        Intrinsics.checkNotNullParameter(memoryCacheProductDataFlowDecorator, "memoryCacheProductDataFlowDecorator");
        Intrinsics.checkNotNullParameter(discoverItemsMapper, "discoverItemsMapper");
        Intrinsics.checkNotNullParameter(accountDataSourcesMap, "accountDataSourcesMap");
        Intrinsics.checkNotNullParameter(transactionsWidgetUiModel, "transactionsWidgetUiModel");
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(pendingActionsItemsProvider, "pendingActionsItemsProvider");
        Intrinsics.checkNotNullParameter(productAccountInteractor, "productAccountInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsTitleDecorator, "hiddenAccountsTitleDecorator");
        Intrinsics.checkNotNullParameter(legalEntityProviderFactory, "legalEntityProviderFactory");
        Intrinsics.checkNotNullParameter(defaultAccountResolver, "defaultAccountResolver");
        this.f289049a = scope;
        this.f289050b = accountSpacesInteractor;
        this.f289051c = repository;
        this.d = productAccountsInteractor;
        this.e = backgroundsInteractor;
        this.f = memoryCacheProductDataFlowDecorator;
        this.f289052g = discoverItemsMapper;
        this.f289053h = accountDataSourcesMap;
        this.i = transactionsWidgetUiModel;
        this.f289054j = widgetsInteractor;
        this.k = slotManagerInteractor;
        this.f289055l = pendingActionsItemsProvider;
        this.f289056m = productAccountInteractor;
        this.f289057n = hiddenAccountsTitleDecorator;
        this.o = legalEntityProviderFactory;
        this.f289058p = defaultAccountResolver;
        this.f289059q = new ConcurrentHashMap();
        this.f289060r = new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(vge.x r12, com.revolut.feature.tab.accounts.api.model.ProductAccount.ValueItem r13, com.revolut.feature.tab.accounts.models.ProductId r14, gim.c r15) throws java.lang.Throwable {
        /*
            boolean r0 = r15 instanceof vge.p
            if (r0 == 0) goto L13
            r0 = r15
            vge.p r0 = (vge.p) r0
            int r1 = r0.f288968x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288968x = r1
            goto L18
        L13:
            vge.p r0 = new vge.p
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288968x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            md6.a r12 = r0.u
            yhm.o.b(r15)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> Lb3
            goto L94
        L2a:
            r0 = move-exception
            r12 = r0
            goto L9d
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            yhm.o.b(r15)
            nie.c r15 = com.revolut.feature.tab.accounts.api.model.a.b(r13, r14)
            boolean r2 = r15 instanceof com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value
            if (r2 != 0) goto L42
            r15 = r4
        L42:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r15 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value) r15
            if (r15 != 0) goto L47
            return r4
        L47:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r2)
            com.revolut.feature.tab.accounts.models.ProductId r2 = r15.getF89727a()
            com.revolut.feature.tab.accounts.models.ProductAccountId r5 = r15.getF89728b()
            md6.e r7 = age.b.b(r5, r2)
            com.revolut.feature.tab.accounts.models.ProductAccountId r2 = r15.getF89728b()
            md6.f r10 = age.b.f(r2, r14)
            md6.j r14 = md6.o.Companion
            com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata r13 = r13.getF89505g()
            xi0.b r13 = r13.getCurrency()
            r14.getClass()
            if (r13 == 0) goto L76
            md6.n r14 = new md6.n
            r14.<init>(r13)
        L74:
            r8 = r14
            goto L79
        L76:
            md6.m r14 = md6.m.f204493a
            goto L74
        L79:
            md6.d r9 = age.b.d(r15)
            md6.a r6 = new md6.a
            r11 = 32
            r6.<init>(r7, r8, r9, r10, r11)
            yhm.m$a r13 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> Lb3
            r10.d r12 = r12.o     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> Lb3
            r0.u = r6     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> Lb3
            r0.f288968x = r3     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> Lb3
            java.lang.Object r15 = r12.V(r0)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> Lb3
            if (r15 != r1) goto L93
            return r1
        L93:
            r12 = r6
        L94:
            wc6.a r15 = (wc6.a) r15     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> Lb3
            ld6.b r12 = r15.a(r12)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> Lb3
            yhm.m$a r13 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> Lb3
            goto La3
        L9d:
            yhm.m$a r13 = yhm.m.INSTANCE
            yhm.n r12 = yhm.o.a(r12)
        La3:
            java.lang.Throwable r13 = yhm.m.a(r12)
            if (r13 == 0) goto Lac
            hx7.e.n(r13)
        Lac:
            boolean r13 = r12 instanceof yhm.n
            if (r13 == 0) goto Lb1
            goto Lb2
        Lb1:
            r4 = r12
        Lb2:
            return r4
        Lb3:
            r0 = move-exception
            r12 = r0
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.x.a(vge.x, com.revolut.feature.tab.accounts.api.model.ProductAccount$ValueItem, com.revolut.feature.tab.accounts.models.ProductId, gim.c):java.io.Serializable");
    }

    public static final ProductAccountDescriptor$Value b(x xVar, ProductAccountDescriptor$Value productAccountDescriptor$Value, boolean z) {
        if (productAccountDescriptor$Value instanceof ProductAccountDescriptor$Value.Main) {
            ProductAccountDescriptor$Value.Main main = (ProductAccountDescriptor$Value.Main) productAccountDescriptor$Value;
            return z ? ProductAccountDescriptor$Value.Main.c(main, ProductId.FAVORITE, null, 2) : main;
        }
        if (productAccountDescriptor$Value instanceof ProductAccountDescriptor$Value.Discover) {
            return productAccountDescriptor$Value;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static AccountBackground d(ProductAccount.ValueItem valueItem, PersistedBackground persistedBackground) {
        NavBarWithContainerBackground navBarWithContainerBackground = valueItem.getF().f89485b;
        boolean z = persistedBackground.f63744b;
        if (!z) {
            navBarWithContainerBackground = null;
        }
        return navBarWithContainerBackground != null ? new AccountBackground(navBarWithContainerBackground, null) : new AccountBackground(persistedBackground.f63743a.f63742b, new AccountBackgroundParams(z));
    }

    public final Flow c(ProductAccountDescriptor$Value productAccountDescriptor$Value, Function0 function0) {
        ConcurrentHashMap concurrentHashMap = this.f289059q;
        Object obj2 = concurrentHashMap.get(productAccountDescriptor$Value);
        if (obj2 == null) {
            vkm.t1 t1VarM = vkm.q.M((Flow) function0.invoke(), skm.e0.c(this.f289049a.getF74819h().plus(skm.p0.f264003c)), vkm.c2.a(vkm.d2.Companion, 1000L, 2), 1);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(productAccountDescriptor$Value, t1VarM);
            obj2 = objPutIfAbsent == null ? t1VarM : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "getOrPut(...)");
        return (Flow) obj2;
    }

    public final Flow e(ProductAccountDescriptor$Value descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        c8g.a.c(descriptor);
        vkm.v1 originFlow = new vkm.v1(new uvf.b((Object) g(descriptor), (Object) this, false, (Continuation) null, 20));
        Intrinsics.checkNotNullParameter(originFlow, "originFlow");
        l1 l1Var = this.f289057n;
        wa7.m mVar = l1Var.f288944a;
        return mVar.c() ? new j1(yh5.b.d(originFlow, mVar.k()), l1Var, 0) : originFlow;
    }

    public final Flow f(qfe.l filterType) {
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        Continuation continuation = null;
        wkm.l originFlow = vkm.q.Q(vkm.q.q(((xge.g) this.f289050b).b(sfe.a.CACHE_ONLY, filterType)), new vdl.c1(continuation, this, 1));
        zhm.f0 f0Var = zhm.f0.f322471a;
        o1 o1Var = this.f;
        o1Var.getClass();
        Intrinsics.checkNotNullParameter("ACCOUNTS_CONTENT_CACHE_KEY", "cacheKey");
        Intrinsics.checkNotNullParameter(originFlow, "originFlow");
        vkm.y originFlow2 = new vkm.y(new uvf.b((Object) o1Var, (Object) f0Var, false, continuation, 22), new vkm.q0(new t38.e(originFlow, 19, o1Var, f0Var), new vfg.m(o1Var, continuation, 2), 1));
        Intrinsics.checkNotNullParameter(originFlow2, "originFlow");
        l1 l1Var = this.f289057n;
        wa7.m mVar = l1Var.f288944a;
        return mVar.c() ? new j1(yh5.b.d(originFlow2, mVar.k()), l1Var, 1) : originFlow2;
    }

    public final Flow g(ProductAccountDescriptor$Value productAccountDescriptor$Value) {
        ConcurrentHashMap concurrentHashMap = this.f289060r;
        Object obj2 = concurrentHashMap.get(productAccountDescriptor$Value);
        if (obj2 == null) {
            t2 t2Var = (t2) this.f289051c;
            boolean zA = t2Var.a(productAccountDescriptor$Value);
            Continuation continuation = null;
            vkm.t1 t1VarM = vkm.q.M(vkm.q.q(vkm.q.Q(new vkm.y(new m(this, productAccountDescriptor$Value, zA, null), new vkm.y(new t38.e(new vkm.q0(vkm.q.s(new t38.e(this.f289056m.b(productAccountDescriptor$Value), 24, t2Var.n(), new o(productAccountDescriptor$Value.getF89727a(), null)), new vga.g(8), vkm.q.f290100b), new l(this, productAccountDescriptor$Value, zA, null), 1), 16, this, productAccountDescriptor$Value), new an8.a(this, productAccountDescriptor$Value, zA, continuation, 8))), new sdi.a(continuation, this, productAccountDescriptor$Value, 21))), skm.e0.c(this.f289049a.getF74819h().plus(skm.p0.f264003c)), vkm.c2.a(vkm.d2.Companion, 1000L, 2), 1);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(productAccountDescriptor$Value, t1VarM);
            obj2 = objPutIfAbsent == null ? t1VarM : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "getOrPut(...)");
        return (Flow) obj2;
    }

    public final pfe.b h(ProductId productId) {
        Object obj2 = this.f289053h.get(productId);
        if (obj2 != null) {
            return (pfe.b) obj2;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
