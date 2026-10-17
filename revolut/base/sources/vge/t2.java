package vge;

import com.revolut.feature.tab.accounts.api.mode.TabAccountsMode;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class t2 implements e2 {

    @NotNull
    public static final f2 Companion = new f2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f289010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mk0.a f289011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TabAccountsMode f289012c;
    public final x1 d;
    public final ReentrantReadWriteLock e;
    public final vkm.z1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f289013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hlm.c f289014h;

    public t2(ne0.j cache, mk0.a personalisationStorage, TabAccountsMode mode, x1 lastSelectedStorage) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lastSelectedStorage, "lastSelectedStorage");
        this.f289010a = cache;
        this.f289011b = personalisationStorage;
        this.f289012c = mode;
        this.d = lastSelectedStorage;
        this.e = new ReentrantReadWriteLock();
        this.f = vkm.q.b(0, 7, null);
        this.f289013g = new ConcurrentHashMap();
        this.f289014h = hlm.d.a();
    }

    public static String s(ProductAccountDescriptor$Value productAccountDescriptor$Value) {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(productAccountDescriptor$Value.getF89727a().getId(), "_:_", productAccountDescriptor$Value.getF89728b().f89729a);
    }

    public final boolean a(ProductAccountDescriptor$Value item) {
        Intrinsics.checkNotNullParameter(item, "item");
        g();
        List list = (List) this.f289011b.a(new tk0.e("ACCOUNT_SWITCHER_FAVOURITES"));
        if (list == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f((String) it8.next(), s(item))) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        Intrinsics.checkNotNullParameter("LAST_SELECTED_ACCOUNT_DESCRIPTOR_KEY_V2", "key");
        ReentrantReadWriteLock reentrantReadWriteLock = this.e;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.f289010a.remove("LAST_SELECTED_ACCOUNT_DESCRIPTOR_KEY_V2");
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof vge.i2
            if (r0 == 0) goto L13
            r0 = r9
            vge.i2 r0 = (vge.i2) r0
            int r1 = r0.f288923y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288923y = r1
            goto L18
        L13:
            vge.i2 r0 = new vge.i2
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f288921w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288923y
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L41
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            hlm.a r0 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L77
        L2e:
            r9 = move-exception
            goto L88
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            int r2 = r0.v
            hlm.a r5 = r0.u
            yhm.o.b(r9)
            r9 = r5
            goto L54
        L41:
            yhm.o.b(r9)
            hlm.c r9 = r8.f289014h
            r0.u = r9
            r0.v = r3
            r0.f288923y = r5
            java.lang.Object r2 = r9.lock(r6, r0)
            if (r2 != r1) goto L53
            goto L75
        L53:
            r2 = r3
        L54:
            vge.x1 r5 = r8.d     // Catch: java.lang.Throwable -> L86
            r0.u = r9     // Catch: java.lang.Throwable -> L86
            r0.v = r2     // Catch: java.lang.Throwable -> L86
            r0.f288923y = r4     // Catch: java.lang.Throwable -> L86
            vge.c2 r5 = (vge.c2) r5     // Catch: java.lang.Throwable -> L86
            r5.getClass()     // Catch: java.lang.Throwable -> L86
            vge.z1 r2 = new vge.z1     // Catch: java.lang.Throwable -> L86
            r2.<init>(r5, r6, r3)     // Catch: java.lang.Throwable -> L86
            skm.p0 r3 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L86
            elm.f r3 = elm.f.f127540b     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = skm.e0.J(r3, r2, r0)     // Catch: java.lang.Throwable -> L86
            if (r0 != r1) goto L71
            goto L73
        L71:
            kotlin.Unit r0 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L86
        L73:
            if (r0 != r1) goto L76
        L75:
            return r1
        L76:
            r0 = r9
        L77:
            r8.b()     // Catch: java.lang.Throwable -> L2e
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2e
            r0.unlock(r6)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L82:
            r7 = r0
            r0 = r9
            r9 = r7
            goto L88
        L86:
            r0 = move-exception
            goto L82
        L88:
            r0.unlock(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.t2.c(gim.c):java.lang.Object");
    }

    public final vkm.y d() {
        g();
        return rd0.e.e(new k2(oc.c.t(this.f289011b, new tk0.e("ACCOUNT_SWITCHER_FAVOURITES"), zhm.f0.f322471a), this, 0), zhm.h0.f322473a, new l2(3, null));
    }

    public final ProductAccountDescriptor$Value.Main e() {
        ProductAccountDescriptor$Value.Main descriptor = (ProductAccountDescriptor$Value.Main) i("LAST_SELECTED_ACCOUNT_DESCRIPTOR_KEY_V2");
        if (descriptor == null) {
            return null;
        }
        c2 c2Var = (c2) this.d;
        c2Var.getClass();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!c2Var.f288880c.a(descriptor.f89727a, descriptor.f89728b.f89730b)) {
            descriptor = null;
        }
        if (descriptor != null) {
            return descriptor;
        }
        b();
        return null;
    }

    public final MutableSharedFlow f(String str) {
        ConcurrentHashMap concurrentHashMap = this.f289013g;
        Object obj2 = concurrentHashMap.get(str);
        Object obj3 = obj2;
        if (obj2 == null) {
            vkm.z1 z1VarB = vkm.q.b(0, 6, null);
            z1VarB.k(Boolean.valueOf(m(str)));
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, z1VarB);
            obj3 = z1VarB;
            if (objPutIfAbsent != null) {
                obj3 = objPutIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(obj3, "getOrPut(...)");
        return (MutableSharedFlow) obj3;
    }

    public final void g() {
        this.f289012c.h2().getClass();
    }

    public final ProductId h(ProductAccountId id10) {
        Object next;
        Intrinsics.checkNotNullParameter(id10, "id");
        g();
        List list = (List) this.f289011b.a(new tk0.e("ACCOUNT_SWITCHER_FAVOURITES"));
        if (list != null) {
            nkm.g gVar = new nkm.g(nkm.y.z(zhm.d0.Q(list), new vga.g(this, 14)));
            while (true) {
                if (!gVar.hasNext()) {
                    next = null;
                    break;
                }
                next = gVar.next();
                if (Intrinsics.f(((ProductAccountDescriptor$Value.Main) next).f89728b.f89729a, id10.f89729a)) {
                    break;
                }
            }
            ProductAccountDescriptor$Value.Main main = (ProductAccountDescriptor$Value.Main) next;
            if (main != null) {
                return main.f89727a;
            }
        }
        return null;
    }

    public final Object i(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ReentrantReadWriteLock.ReadLock lock = this.e.readLock();
        lock.lock();
        try {
            return this.f289010a.get(key);
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0085 A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:13:0x0029, B:31:0x0080, B:33:0x0085, B:35:0x008e, B:34:0x008b), top: B:47:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:13:0x0029, B:31:0x0080, B:33:0x0085, B:35:0x008e, B:34:0x008b), top: B:47:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof vge.m2
            if (r0 == 0) goto L13
            r0 = r8
            vge.m2 r0 = (vge.m2) r0
            int r1 = r0.f288953y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288953y = r1
            goto L18
        L13:
            vge.m2 r0 = new vge.m2
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f288951w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288953y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            hlm.a r0 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2d
            goto L80
        L2d:
            r8 = move-exception
            goto L9d
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            int r2 = r0.v
            hlm.a r4 = r0.u
            yhm.o.b(r8)
            r8 = r4
            goto L5a
        L41:
            yhm.o.b(r8)
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r8 = r7.e()
            if (r8 != 0) goto La1
            hlm.c r8 = r7.f289014h
            r0.u = r8
            r2 = 0
            r0.v = r2
            r0.f288953y = r4
            java.lang.Object r4 = r8.lock(r5, r0)
            if (r4 != r1) goto L5a
            goto L7c
        L5a:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r4 = r7.e()     // Catch: java.lang.Throwable -> L97
            if (r4 != 0) goto L99
            vge.x1 r4 = r7.d     // Catch: java.lang.Throwable -> L97
            r0.u = r8     // Catch: java.lang.Throwable -> L97
            r0.v = r2     // Catch: java.lang.Throwable -> L97
            r0.f288953y = r3     // Catch: java.lang.Throwable -> L97
            vge.c2 r4 = (vge.c2) r4     // Catch: java.lang.Throwable -> L97
            r4.getClass()     // Catch: java.lang.Throwable -> L97
            vge.a2 r2 = new vge.a2     // Catch: java.lang.Throwable -> L97
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L97
            skm.p0 r3 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L97
            elm.f r3 = elm.f.f127540b     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = skm.e0.J(r3, r2, r0)     // Catch: java.lang.Throwable -> L97
            if (r0 != r1) goto L7d
        L7c:
            return r1
        L7d:
            r6 = r0
            r0 = r8
            r8 = r6
        L80:
            r1 = r8
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r1 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main) r1     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L8b
            java.lang.String r2 = "LAST_SELECTED_ACCOUNT_DESCRIPTOR_KEY_V2"
            r7.q(r1, r2)     // Catch: java.lang.Throwable -> L2d
            goto L8e
        L8b:
            r7.b()     // Catch: java.lang.Throwable -> L2d
        L8e:
            r4 = r8
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r4 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main) r4     // Catch: java.lang.Throwable -> L2d
            r8 = r0
            goto L99
        L93:
            r6 = r0
            r0 = r8
            r8 = r6
            goto L9d
        L97:
            r0 = move-exception
            goto L93
        L99:
            r8.unlock(r5)
            return r4
        L9d:
            r0.unlock(r5)
            throw r8
        La1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.t2.j(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(gim.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof vge.n2
            if (r0 == 0) goto L13
            r0 = r7
            vge.n2 r0 = (vge.n2) r0
            int r1 = r0.f288958w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288958w = r1
            goto L18
        L13:
            vge.n2 r0 = new vge.n2
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288958w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L3b
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            r0.f288958w = r3
            java.lang.Object r7 = r6.j(r0)
            if (r7 != r1) goto L3b
            return r1
        L3b:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r7 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main) r7
            r0 = 0
            if (r7 != 0) goto L41
            return r0
        L41:
            vge.x1 r1 = r6.d
            vge.c2 r1 = (vge.c2) r1
            r1.getClass()
            ue0.c r1 = r1.f288878a     // Catch: java.lang.Exception -> L8e
            java.lang.String r2 = "LAST_SELECTED_ACCOUNT_METADATA_KEY"
            java.lang.Class<tge.c> r4 = tge.c.class
            kotlin.reflect.KType r4 = kotlin.jvm.internal.o0.b(r4)     // Catch: java.lang.Exception -> L8e
            java.lang.reflect.Type r4 = wim.z.d(r4)     // Catch: java.lang.Exception -> L8e
            java.lang.Object r1 = r1.T2(r2, r4)     // Catch: java.lang.Exception -> L8e
            tge.c r1 = (tge.c) r1     // Catch: java.lang.Exception -> L8e
            if (r1 == 0) goto L88
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)     // Catch: java.lang.Exception -> L8e
            dj0.d r2 = r1.f271162a     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L6d
            com.revolut.feature.tab.accounts.api.model.ProductAccountBalance$WithAmount r4 = new com.revolut.feature.tab.accounts.api.model.ProductAccountBalance$WithAmount     // Catch: java.lang.Exception -> L8e
            r4.<init>(r2)     // Catch: java.lang.Exception -> L8e
            goto L78
        L6d:
            xi0.b r2 = r1.f271163b     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L77
            com.revolut.feature.tab.accounts.api.model.ProductAccountBalance$CurrencyOnly r4 = new com.revolut.feature.tab.accounts.api.model.ProductAccountBalance$CurrencyOnly     // Catch: java.lang.Exception -> L8e
            r4.<init>(r2)     // Catch: java.lang.Exception -> L8e
            goto L78
        L77:
            r4 = r0
        L78:
            com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata r2 = new com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata     // Catch: java.lang.Exception -> L8e
            java.lang.Boolean r1 = r1.f271164c     // Catch: java.lang.Exception -> L8e
            if (r1 == 0) goto L83
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L8e
            goto L84
        L83:
            r1 = r3
        L84:
            r2.<init>(r4, r1)     // Catch: java.lang.Exception -> L8e
            goto L9f
        L88:
            com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata r2 = new com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata     // Catch: java.lang.Exception -> L8e
            r2.<init>(r0, r3)     // Catch: java.lang.Exception -> L8e
            goto L9f
        L8e:
            r1 = move-exception
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.WARNING
            java.lang.String r5 = "ProductAccountLastSelectedStorage"
            rd0.d.a(r4, r5, r0, r1, r2)
            com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata r2 = new com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata
            r2.<init>(r0, r3)
        L9f:
            sfe.b r0 = new sfe.b
            r0.<init>(r7, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.t2.k(gim.c):java.lang.Object");
    }

    public final ProductAccount l(ProductAccountDescriptor$Value descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        f2 f2Var = Companion;
        ProductId f89727a = descriptor.getF89727a();
        f2Var.getClass();
        List list = (List) i(f2.a(f89727a));
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((ProductAccount) next).getF89504c(), descriptor.getF89728b())) {
                obj2 = next;
                break;
            }
        }
        return (ProductAccount) obj2;
    }

    public final boolean m(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        List list = (List) kii.e.n(this.f289012c.h2().f253770a, this.f289011b);
        if (list == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f((String) it8.next(), identifier)) {
                return true;
            }
        }
        return false;
    }

    public final vkm.y n() {
        return rd0.e.e(new k2(new vkm.y(new klf.w1(2, 29, null), this.f), this, 1), zhm.h0.f322473a, new p2(3, null));
    }

    public final Boolean o(ProductAccountDescriptor$Value productAccountDescriptor$Value) {
        List<String> list = (List) kii.e.n(this.f289012c.h2().f253772c, this.f289011b);
        Object obj2 = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                x1.Companion.getClass();
                Pair pairA = w1.a(str);
                ProductAccountDescriptor$Value.Discover discover = pairA == null ? null : new ProductAccountDescriptor$Value.Discover((ProductAccountId) pairA.f186386b, (ProductId) pairA.f186385a);
                if (discover != null) {
                    arrayList.add(discover);
                }
            }
            obj2 = arrayList;
        }
        if (obj2 == null) {
            obj2 = zhm.f0.f322471a;
        }
        Iterable iterable = (Iterable) obj2;
        boolean z = false;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it8 = iterable.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                ProductAccountDescriptor$Value.Discover discover2 = (ProductAccountDescriptor$Value.Discover) it8.next();
                if (discover2.f89725a == productAccountDescriptor$Value.getF89727a() && Intrinsics.f(discover2.f89726b.f89729a, productAccountDescriptor$Value.getF89728b().f89729a)) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        if (r13.emit(r10, r0) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1 A[LOOP:1: B:52:0x00cf->B:53:0x00d1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(mk0.a r10, java.lang.String r11, vkm.z1 r12, kotlin.jvm.functions.Function1 r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.t2.p(mk0.a, java.lang.String, vkm.z1, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    public final void q(Object obj2, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ReentrantReadWriteLock reentrantReadWriteLock = this.e;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.f289010a.f(key, obj2);
            Unit unit = Unit.f186387a;
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0087 A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:13:0x0029, B:28:0x0083, B:30:0x0087, B:32:0x0090, B:31:0x008b), top: B:42:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:13:0x0029, B:28:0x0083, B:30:0x0087, B:32:0x0090, B:31:0x008b), top: B:42:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main r8, com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata r9, gim.c r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof vge.s2
            if (r0 == 0) goto L13
            r0 = r10
            vge.s2 r0 = (vge.s2) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            vge.s2 r0 = new vge.s2
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f289001y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            hlm.a r8 = r0.f288999w
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L2d
            goto L83
        L2d:
            r9 = move-exception
            goto L9e
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            int r8 = r0.f289000x
            hlm.a r9 = r0.f288999w
            com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata r2 = r0.v
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r4 = r0.u
            yhm.o.b(r10)
            r10 = r2
            r2 = r8
            r8 = r4
            goto L61
        L47:
            yhm.o.b(r10)
            r0.u = r8
            r0.v = r9
            hlm.c r10 = r7.f289014h
            r0.f288999w = r10
            r2 = 0
            r0.f289000x = r2
            r0.A = r4
            java.lang.Object r4 = r10.lock(r5, r0)
            if (r4 != r1) goto L5e
            goto L81
        L5e:
            r6 = r10
            r10 = r9
            r9 = r6
        L61:
            vge.x1 r4 = r7.d     // Catch: java.lang.Throwable -> L9c
            r0.u = r5     // Catch: java.lang.Throwable -> L9c
            r0.v = r5     // Catch: java.lang.Throwable -> L9c
            r0.f288999w = r9     // Catch: java.lang.Throwable -> L9c
            r0.f289000x = r2     // Catch: java.lang.Throwable -> L9c
            r0.A = r3     // Catch: java.lang.Throwable -> L9c
            vge.c2 r4 = (vge.c2) r4     // Catch: java.lang.Throwable -> L9c
            r4.getClass()     // Catch: java.lang.Throwable -> L9c
            vge.b2 r2 = new vge.b2     // Catch: java.lang.Throwable -> L9c
            r2.<init>(r4, r8, r10, r5)     // Catch: java.lang.Throwable -> L9c
            skm.p0 r8 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L9c
            elm.f r8 = elm.f.f127540b     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r10 = skm.e0.J(r8, r2, r0)     // Catch: java.lang.Throwable -> L9c
            if (r10 != r1) goto L82
        L81:
            return r1
        L82:
            r8 = r9
        L83:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r10 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main) r10     // Catch: java.lang.Throwable -> L2d
            if (r10 != 0) goto L8b
            r7.b()     // Catch: java.lang.Throwable -> L2d
            goto L90
        L8b:
            java.lang.String r9 = "LAST_SELECTED_ACCOUNT_DESCRIPTOR_KEY_V2"
            r7.q(r10, r9)     // Catch: java.lang.Throwable -> L2d
        L90:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2d
            r8.unlock(r5)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L98:
            r6 = r9
            r9 = r8
            r8 = r6
            goto L9e
        L9c:
            r8 = move-exception
            goto L98
        L9e:
            r8.unlock(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.t2.r(com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main, com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata, gim.c):java.lang.Object");
    }
}
