package hi3;

import ald.n;
import ald.p;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.checkout.impl.services.CheckoutService;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qe0.q;

/* JADX INFO: loaded from: classes13.dex */
public final class i implements a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f152486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f152487h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutService f152488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f152489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f152490c;
    public final x4l.c d;
    public final hlm.c e;
    public final q f;

    static {
        Type type = new TypeToken<List<? extends mi3.c>>() { // from class: com.revolut.feature.checkout.impl.repositories.CheckoutRepositoryImpl$Companion$LIST_OF_PREORDER_ENTITIES_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f152486g = type;
        f152487h = TimeUnit.SECONDS.toMillis(5L);
    }

    public i(CheckoutService checkoutService, ne0.d memoryCache, ue0.c storage, l80.e dateTimeProvider) {
        Intrinsics.checkNotNullParameter(checkoutService, "checkoutService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(dateTimeProvider, "dateTimeProvider");
        this.f152488a = checkoutService;
        this.f152489b = memoryCache;
        this.f152490c = storage;
        Continuation continuation = null;
        n nVar = new n(this, continuation, 5);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: hi3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f152473b;

            {
                this.f152473b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        e scope = (e) obj2;
                        Intrinsics.checkNotNullParameter(scope, "scope");
                        return (List) this.f152473b.f152489b.get(scope.c("pre_orders"));
                    default:
                        String key = (String) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (Long) this.f152473b.f152489b.get(key);
                }
            }
        };
        Function2 function2 = new Function2(this) { // from class: hi3.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f152475b;

            {
                this.f152475b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        e scope = (e) obj2;
                        List orders = (List) obj3;
                        Intrinsics.checkNotNullParameter(scope, "scope");
                        Intrinsics.checkNotNullParameter(orders, "orders");
                        this.f152475b.f152489b.f(scope.c("pre_orders"), orders);
                        break;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        this.f152475b.f152489b.f(key, l2);
                        break;
                }
                return Unit.f186387a;
            }
        };
        int i2 = 3;
        this.d = new x4l.c(nVar, function1, function2, new p(this, continuation, i2), new ald.q(this, continuation, i2));
        this.e = hlm.d.a();
        final int i3 = 1;
        this.f = new q(new Function2(this) { // from class: hi3.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f152475b;

            {
                this.f152475b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        e scope = (e) obj2;
                        List orders = (List) obj3;
                        Intrinsics.checkNotNullParameter(scope, "scope");
                        Intrinsics.checkNotNullParameter(orders, "orders");
                        this.f152475b.f152489b.f(scope.c("pre_orders"), orders);
                        break;
                    default:
                        String key = (String) obj2;
                        Long l2 = (Long) obj3;
                        l2.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        this.f152475b.f152489b.f(key, l2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: hi3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f152473b;

            {
                this.f152473b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        e scope = (e) obj2;
                        Intrinsics.checkNotNullParameter(scope, "scope");
                        return (List) this.f152473b.f152489b.get(scope.c("pre_orders"));
                    default:
                        String key = (String) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (Long) this.f152473b.f152489b.get(key);
                }
            }
        }, f152487h, dateTimeProvider);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r17, java.lang.String r18, java.util.List r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hi3.i.a(gim.c, java.lang.String, java.util.List):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (c(r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r6, java.lang.String r7, java.util.List r8) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof hi3.g
            if (r0 == 0) goto L13
            r0 = r6
            hi3.g r0 = (hi3.g) r0
            int r1 = r0.f152482x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f152482x = r1
            goto L18
        L13:
            hi3.g r0 = new hi3.g
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f152482x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L54
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r7 = r0.u
            yhm.o.b(r6)
            goto L48
        L38:
            yhm.o.b(r6)
            r0.u = r7
            r0.f152482x = r4
            com.revolut.feature.checkout.impl.services.CheckoutService r6 = r5.f152488a
            java.lang.Object r6 = r6.cancelPreorders(r8, r0)
            if (r6 != r1) goto L48
            goto L53
        L48:
            r6 = 0
            r0.u = r6
            r0.f152482x = r3
            java.lang.Object r6 = r5.c(r7, r0)
            if (r6 != r1) goto L54
        L53:
            return r1
        L54:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hi3.i.b(gim.c, java.lang.String, java.util.List):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r9, gim.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof hi3.h
            if (r0 == 0) goto L13
            r0 = r10
            hi3.h r0 = (hi3.h) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            hi3.h r0 = new hi3.h
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f152484x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r3) goto L37
            if (r2 != r4) goto L2f
            hlm.a r9 = r0.v
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L2d
            goto L72
        L2d:
            r10 = move-exception
            goto L7e
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            int r9 = r0.f152483w
            hlm.a r2 = r0.v
            java.lang.String r3 = r0.u
            yhm.o.b(r10)
            r10 = r2
            r2 = r9
            r9 = r3
            goto L59
        L44:
            yhm.o.b(r10)
            r0.u = r9
            hlm.c r10 = r8.e
            r0.v = r10
            r2 = 0
            r0.f152483w = r2
            r0.z = r3
            java.lang.Object r3 = r10.lock(r5, r0)
            if (r3 != r1) goto L59
            goto L70
        L59:
            x4l.c r3 = r8.d     // Catch: java.lang.Throwable -> L7a
            hi3.e r6 = new hi3.e     // Catch: java.lang.Throwable -> L7a
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L7a
            zhm.f0 r9 = zhm.f0.f322471a     // Catch: java.lang.Throwable -> L7a
            r0.u = r5     // Catch: java.lang.Throwable -> L7a
            r0.v = r10     // Catch: java.lang.Throwable -> L7a
            r0.f152483w = r2     // Catch: java.lang.Throwable -> L7a
            r0.z = r4     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r9 = r3.f(r6, r9, r0)     // Catch: java.lang.Throwable -> L7a
            if (r9 != r1) goto L71
        L70:
            return r1
        L71:
            r9 = r10
        L72:
            kotlin.Unit r10 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2d
            r9.unlock(r5)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L7a:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L7e:
            r9.unlock(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: hi3.i.c(java.lang.String, gim.c):java.lang.Object");
    }

    public final vkm.d d(String str, Boolean bool, boolean z) {
        e eVar = new e(str, bool);
        List list = (List) this.f152489b.get(eVar.c("pre_orders"));
        if (list != null && !list.isEmpty()) {
            z = this.f.a(eVar.c("LAST_UPDATE_TIME_KEY"), z);
        }
        return this.d.b(eVar, z ? w4l.i.f294643c : w4l.h.f294642c);
    }
}
