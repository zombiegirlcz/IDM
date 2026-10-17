package fla;

import com.revolut.feature.product_catalogue.dependencies.RetailProductCatalogueDependenciesToggles$ProductCatalogueMultipleIdentitiesEnabled;
import com.revolut.feature.product_catalogue.impl.data.ProductCatalogueService;
import dp4.z0;
import ff4.z;
import fjd.w;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductCatalogueService f135925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a61.a f135926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f135927c;
    public final ue0.c d;
    public final x4l.c e;

    public g(ProductCatalogueService service, a mapper, a61.a identitiesProvider, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(identitiesProvider, "identitiesProvider");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f135925a = service;
        this.f135926b = identitiesProvider;
        this.f135927c = memoryCache;
        this.d = storage;
        Continuation continuation = null;
        this.e = new x4l.c(new e6d.f(this, continuation, 8), new w(this, 6), new fgj.g(this, 14), new z(this, continuation, 17), new z0(this, continuation, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof fla.c
            if (r0 == 0) goto L13
            r0 = r8
            fla.c r0 = (fla.c) r0
            int r1 = r0.f135918w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135918w = r1
            goto L18
        L13:
            fla.c r0 = new fla.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f135918w
            java.lang.String r3 = "DEFAULT_IDENTITY_ID_CACHE_KEY"
            ne0.j r4 = r7.f135927c
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 != r5) goto L2f
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            goto L5b
        L2b:
            r8 = move-exception
            goto L65
        L2d:
            r8 = move-exception
            goto L70
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            yhm.o.b(r8)
            a61.a r8 = r7.f135926b
            java.lang.Object r2 = r8.f1531b
            gte.a r2 = (gte.a) r2
            com.revolut.feature.product_catalogue.dependencies.RetailProductCatalogueDependenciesToggles$ProductCatalogueMultipleIdentitiesEnabled r6 = com.revolut.feature.product_catalogue.dependencies.RetailProductCatalogueDependenciesToggles$ProductCatalogueMultipleIdentitiesEnabled.f81292c
            jte.d r2 = (jte.d) r2
            boolean r2 = r2.c(r6)
            if (r2 == 0) goto L71
            java.lang.Object r2 = r4.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L71
            r0.f135918w = r5     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            java.lang.Object r8 = r8.q(r0)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            if (r8 != r1) goto L5b
            return r1
        L5b:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            if (r8 == 0) goto L71
            r4.f(r3, r8)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            goto L71
        L65:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r8, r0)
            goto L71
        L70:
            throw r8
        L71:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fla.g.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(w4l.k r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof fla.d
            if (r0 == 0) goto L13
            r0 = r7
            fla.d r0 = (fla.d) r0
            int r1 = r0.f135920x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135920x = r1
            goto L18
        L13:
            fla.d r0 = new fla.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f135920x
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r7)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            w4l.k r6 = r0.u
            yhm.o.b(r7)
            goto L46
        L38:
            yhm.o.b(r7)
            r0.u = r6
            r0.f135920x = r3
            java.lang.Object r7 = r5.a(r0)
            if (r7 != r1) goto L46
            goto L60
        L46:
            x4l.c r7 = r5.e
            kotlin.Unit r2 = kotlin.Unit.f186387a
            vkm.d r6 = r7.b(r2, r6)
            d4f.m r7 = new d4f.m
            r2 = 16
            r3 = 0
            r7.<init>(r4, r2, r3)
            r0.u = r3
            r0.f135920x = r4
            java.lang.Object r7 = vkm.q.y(r6, r7, r0)
            if (r7 != r1) goto L61
        L60:
            return r1
        L61:
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            java.lang.Throwable r6 = r7.getError()
            if (r6 != 0) goto L6c
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L6c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fla.g.b(w4l.k, gim.c):java.lang.Object");
    }

    public final jla.c c(jla.f fVar, String str, String str2) {
        Map map = fVar.f175661a;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        List list = (List) map.get(lowerCase);
        if (list == null) {
            list = f0.f322471a;
        }
        if (!((jte.d) ((gte.a) this.f135926b.f1531b)).c(RetailProductCatalogueDependenciesToggles$ProductCatalogueMultipleIdentitiesEnabled.f81292c)) {
            return (jla.c) d0.d0(list);
        }
        ne0.j jVar = this.f135927c;
        Object obj2 = null;
        if (((String) jVar.get("DEFAULT_IDENTITY_ID_CACHE_KEY")) == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "ProductCatalogueRepository", j6.a.s("defaultIdentityId is missing, can't reliably find product in catalogue for code '", str, "' and RI ID '", str2, "'"), null, h0Var);
        }
        if (str2 == null) {
            str2 = (String) jVar.get("DEFAULT_IDENTITY_ID_CACHE_KEY");
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            String str3 = ((jla.c) next).f175658c;
            if (str3 == null) {
                str3 = (String) jVar.get("DEFAULT_IDENTITY_ID_CACHE_KEY");
            }
            if (Intrinsics.f(str3, str2)) {
                obj2 = next;
                break;
            }
        }
        return (jla.c) obj2;
    }
}
