package nfj;

import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionsEmptyDisplay;
import com.revolut.retail.feature.esim.impl.network.EsimSubscriptionsService;
import ip0.v7;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kfj.q3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes11.dex */
public final class s2 implements a2 {

    @NotNull
    public static final d2 Companion = new d2();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Type f215037h;
    public static final Type i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimSubscriptionsService f215038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f215039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f215040c;
    public final sf0.h d;
    public final hlm.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f215041g;

    static {
        Type type = new TypeToken<List<? extends q3>>() { // from class: com.revolut.retail.feature.esim.impl.repositories.EsimSubscriptionsRepositoryImpl$Companion$subscriptionsDtoType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f215037h = type;
        Type type2 = new TypeToken<q3>() { // from class: com.revolut.retail.feature.esim.impl.repositories.EsimSubscriptionsRepositoryImpl$Companion$subscriptionDtoType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        i = type2;
    }

    public s2(EsimSubscriptionsService service, ne0.j memoryCache, ue0.c storage, ffj.a subscriptionRequestTermsEntryMapper, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(subscriptionRequestTermsEntryMapper, "subscriptionRequestTermsEntryMapper");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f215038a = service;
        this.f215039b = memoryCache;
        this.f215040c = storage;
        this.d = serverErrorParser;
        this.e = hlm.d.a();
        Continuation continuation = null;
        final int i2 = 0;
        this.f = new x4l.c(new k3c.k(this, continuation, 20), new Function1(this) { // from class: nfj.b2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s2 f214924b;

            {
                this.f214924b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (pfj.k) this.f214924b.f215039b.get("SUBSCRIPTIONS_KEY");
                    default:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (dej.t1) v7.r("SUBSCRIPTION_KEY", id10, this.f214924b.f215039b);
                }
            }
        }, new Function2(this) { // from class: nfj.c2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s2 f214930b;

            {
                this.f214930b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        pfj.k data = (pfj.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f214930b.f215039b.f("SUBSCRIPTIONS_KEY", data);
                        break;
                    default:
                        String id10 = (String) obj2;
                        dej.t1 data2 = (dej.t1) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f214930b.f215039b.f("SUBSCRIPTION_KEY" + id10, data2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j2(this, continuation, i2), new l05.b(this, continuation, 22));
        final int i3 = 1;
        this.f215041g = new x4l.c(new mtj.k(this, continuation, 19), new Function1(this) { // from class: nfj.b2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s2 f214924b;

            {
                this.f214924b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (pfj.k) this.f214924b.f215039b.get("SUBSCRIPTIONS_KEY");
                    default:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (dej.t1) v7.r("SUBSCRIPTION_KEY", id10, this.f214924b.f215039b);
                }
            }
        }, new Function2(this) { // from class: nfj.c2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s2 f214930b;

            {
                this.f214930b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        pfj.k data = (pfj.k) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f214930b.f215039b.f("SUBSCRIPTIONS_KEY", data);
                        break;
                    default:
                        String id10 = (String) obj2;
                        dej.t1 data2 = (dej.t1) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f214930b.f215039b.f("SUBSCRIPTION_KEY" + id10, data2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new naf.j(this, continuation, 14), new l1(this, continuation, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(nfj.s2 r4, gim.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof nfj.h2
            if (r0 == 0) goto L16
            r0 = r5
            nfj.h2 r0 = (nfj.h2) r0
            int r1 = r0.f214956w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f214956w = r1
            goto L1b
        L16:
            nfj.h2 r0 = new nfj.h2
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214956w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r5)
            goto L40
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r5)
            com.revolut.retail.feature.esim.impl.network.EsimSubscriptionsService r4 = r4.f215038a
            r0.f214956w = r3
            java.lang.Object r5 = r4.getSubscriptions(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            mfj.l r5 = (mfj.l) r5
            pfj.k r4 = new pfj.k
            java.util.List r0 = r5.getList()
            java.util.ArrayList r0 = ofj.p.i(r0)
            mfj.j r5 = r5.getEmptySubscriptionsDisplay()
            if (r5 == 0) goto L57
            com.revolut.retail.feature.esim.api.model.EsimSubscriptionsEmptyDisplay r5 = mra.d.X(r5)
            goto L58
        L57:
            r5 = 0
        L58:
            r4.<init>(r0, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nfj.s2.a(nfj.s2, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
    
        if (r9 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(nfj.s2 r9, java.lang.String r10, dej.x1 r11, gim.c r12) {
        /*
            r9.getClass()
            boolean r0 = r12 instanceof nfj.l2
            if (r0 == 0) goto L16
            r0 = r12
            nfj.l2 r0 = (nfj.l2) r0
            int r1 = r0.f214984y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f214984y = r1
            goto L1b
        L16:
            nfj.l2 r0 = new nfj.l2
            r0.<init>(r9, r12)
        L1b:
            java.lang.Object r12 = r0.f214982w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214984y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r12)
            goto Lac
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            dej.x1 r11 = r0.v
            java.lang.String r10 = r0.u
            yhm.o.b(r12)
            goto L4e
        L3e:
            yhm.o.b(r12)
            r0.u = r10
            r0.v = r11
            r0.f214984y = r4
            java.lang.Object r12 = r9.j(r10, r11, r0)
            if (r12 != r1) goto L4e
            goto Lab
        L4e:
            r12 = 0
            r0.u = r12
            r0.v = r12
            r0.f214984y = r3
            pfj.k r2 = r9.g()
            if (r2 != 0) goto L5e
            kotlin.Unit r9 = kotlin.Unit.f186387a
            goto La9
        L5e:
            java.util.List r3 = r2.f235617a
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L66:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r3.next()
            r5 = r4
            dej.t1 r5 = (dej.t1) r5
            java.lang.String r5 = r5.f113650a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r10)
            if (r5 == 0) goto L66
            r12 = r4
        L7c:
            r3 = r12
            dej.t1 r3 = (dej.t1) r3
            if (r3 != 0) goto L84
            kotlin.Unit r9 = kotlin.Unit.f186387a
            goto La9
        L84:
            dej.x1 r10 = r3.f113659p
            if (r10 != 0) goto L8b
            kotlin.Unit r9 = kotlin.Unit.f186387a
            goto La9
        L8b:
            boolean r12 = r11.f113689a
            boolean r11 = r11.f113690b
            dej.x1 r5 = dej.x1.a(r10, r12, r11)
            r7 = -32769(0xffffffffffff7fff, float:NaN)
            r8 = 2047(0x7ff, float:2.868E-42)
            r4 = 0
            r6 = 0
            dej.t1 r10 = dej.t1.a(r3, r4, r5, r6, r7, r8)
            java.lang.Object r9 = r9.o(r2, r10, r0)
            fim.a r10 = fim.a.COROUTINE_SUSPENDED
            if (r9 != r10) goto La7
            goto La9
        La7:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        La9:
            if (r9 != r1) goto Lac
        Lab:
            return r1
        Lac:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nfj.s2.b(nfj.s2, java.lang.String, dej.x1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v4, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, nfj.s2] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r8v9, types: [hlm.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(nfj.s2 r8, java.lang.String r9, java.lang.String r10, gim.c r11) throws java.lang.Throwable {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof nfj.m2
            if (r0 == 0) goto L16
            r0 = r11
            nfj.m2 r0 = (nfj.m2) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.B = r1
            goto L1b
        L16:
            nfj.m2 r0 = new nfj.m2
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L5f
            if (r2 == r6) goto L51
            if (r2 == r5) goto L40
            if (r2 != r4) goto L38
            hlm.a r8 = r0.f214992w
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L35
            goto La1
        L35:
            r9 = move-exception
            goto La9
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            int r3 = r0.f214994y
            int r9 = r0.f214993x
            hlm.a r10 = r0.f214992w
            java.lang.String r2 = r0.v
            java.lang.String r5 = r0.u
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L4e
            goto L8d
        L4e:
            r9 = move-exception
            r8 = r10
            goto La9
        L51:
            int r9 = r0.f214993x
            hlm.a r10 = r0.f214992w
            java.lang.String r2 = r0.v
            java.lang.String r6 = r0.u
            yhm.o.b(r11)
            r11 = r9
            r9 = r6
            goto L78
        L5f:
            yhm.o.b(r11)
            hlm.c r11 = r8.e
            r0.u = r9
            r0.v = r10
            r0.f214992w = r11
            r0.f214993x = r3
            r0.B = r6
            java.lang.Object r2 = r11.lock(r7, r0)
            if (r2 != r1) goto L75
            goto L9f
        L75:
            r2 = r10
            r10 = r11
            r11 = r3
        L78:
            r0.u = r9     // Catch: java.lang.Throwable -> L4e
            r0.v = r2     // Catch: java.lang.Throwable -> L4e
            r0.f214992w = r10     // Catch: java.lang.Throwable -> L4e
            r0.f214993x = r11     // Catch: java.lang.Throwable -> L4e
            r0.f214994y = r3     // Catch: java.lang.Throwable -> L4e
            r0.B = r5     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r5 = r8.k(r9, r2, r0)     // Catch: java.lang.Throwable -> L4e
            if (r5 != r1) goto L8b
            goto L9f
        L8b:
            r5 = r9
            r9 = r11
        L8d:
            r0.u = r7     // Catch: java.lang.Throwable -> L4e
            r0.v = r7     // Catch: java.lang.Throwable -> L4e
            r0.f214992w = r10     // Catch: java.lang.Throwable -> L4e
            r0.f214993x = r9     // Catch: java.lang.Throwable -> L4e
            r0.f214994y = r3     // Catch: java.lang.Throwable -> L4e
            r0.B = r4     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r8 = r8.l(r5, r2, r0)     // Catch: java.lang.Throwable -> L4e
            if (r8 != r1) goto La0
        L9f:
            return r1
        La0:
            r8 = r10
        La1:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L35
            r8.unlock(r7)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        La9:
            r8.unlock(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nfj.s2.c(nfj.s2, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(nfj.s2 r8, java.lang.String r9, boolean r10, gim.c r11) throws java.lang.Throwable {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof nfj.n2
            if (r0 == 0) goto L16
            r0 = r11
            nfj.n2 r0 = (nfj.n2) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.B = r1
            goto L1b
        L16:
            nfj.n2 r0 = new nfj.n2
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L62
            if (r2 == r6) goto L52
            if (r2 == r5) goto L40
            if (r2 != r4) goto L38
            hlm.a r8 = r0.v
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L35
            goto La4
        L35:
            r9 = move-exception
            goto Lae
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            int r3 = r0.f215002y
            int r9 = r0.f215001x
            boolean r10 = r0.f215000w
            hlm.a r2 = r0.v
            java.lang.String r5 = r0.u
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L4f
            r11 = r2
            goto L90
        L4f:
            r9 = move-exception
            r8 = r2
            goto Lae
        L52:
            int r9 = r0.f215001x
            boolean r10 = r0.f215000w
            hlm.a r2 = r0.v
            java.lang.String r6 = r0.u
            yhm.o.b(r11)
            r11 = r2
            r2 = r10
            r10 = r9
            r9 = r6
            goto L7a
        L62:
            yhm.o.b(r11)
            hlm.c r11 = r8.e
            r0.u = r9
            r0.v = r11
            r0.f215000w = r10
            r0.f215001x = r3
            r0.B = r6
            java.lang.Object r2 = r11.lock(r7, r0)
            if (r2 != r1) goto L78
            goto La2
        L78:
            r2 = r10
            r10 = r3
        L7a:
            r0.u = r9     // Catch: java.lang.Throwable -> Lac
            r0.v = r11     // Catch: java.lang.Throwable -> Lac
            r0.f215000w = r2     // Catch: java.lang.Throwable -> Lac
            r0.f215001x = r10     // Catch: java.lang.Throwable -> Lac
            r0.f215002y = r3     // Catch: java.lang.Throwable -> Lac
            r0.B = r5     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r5 = r8.q(r0, r9, r2)     // Catch: java.lang.Throwable -> Lac
            if (r5 != r1) goto L8d
            goto La2
        L8d:
            r5 = r9
            r9 = r10
            r10 = r2
        L90:
            r0.u = r7     // Catch: java.lang.Throwable -> Lac
            r0.v = r11     // Catch: java.lang.Throwable -> Lac
            r0.f215000w = r10     // Catch: java.lang.Throwable -> Lac
            r0.f215001x = r9     // Catch: java.lang.Throwable -> Lac
            r0.f215002y = r3     // Catch: java.lang.Throwable -> Lac
            r0.B = r4     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r8 = r8.r(r5, r10, r0)     // Catch: java.lang.Throwable -> Lac
            if (r8 != r1) goto La3
        La2:
            return r1
        La3:
            r8 = r11
        La4:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L35
            r8.unlock(r7)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        Lac:
            r9 = move-exception
            r8 = r11
        Lae:
            r8.unlock(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nfj.s2.d(nfj.s2, java.lang.String, boolean, gim.c):java.lang.Object");
    }

    public static e2 e(Response response, Function1 function1) {
        kotlin.time.b bVar;
        Long lN;
        Long lN2;
        int iCode = response.code();
        if (200 > iCode || iCode >= 210) {
            throw ((Throwable) function1.invoke(new HttpException(response)));
        }
        String strA = response.headers().a("Retry-After");
        kotlin.time.b bVar2 = null;
        if (strA == null || (lN2 = kotlin.text.z.n(strA)) == null) {
            bVar = null;
        } else {
            long jAbs = Math.abs(lN2.longValue());
            b.Companion companion = kotlin.time.b.INSTANCE;
            bVar = new kotlin.time.b(kotlin.time.c.h(jAbs, pkm.e.SECONDS));
        }
        String strA2 = response.headers().a("X-Retry-Timeout");
        if (strA2 != null && (lN = kotlin.text.z.n(strA2)) != null) {
            long jAbs2 = Math.abs(lN.longValue());
            b.Companion companion2 = kotlin.time.b.INSTANCE;
            bVar2 = new kotlin.time.b(kotlin.time.c.h(jAbs2, pkm.e.SECONDS));
        }
        return new e2(bVar, bVar2);
    }

    public final dej.t1 f(String str) {
        dej.t1 t1Var = (dej.t1) v7.r("SUBSCRIPTION_KEY", str, this.f215039b);
        if (t1Var != null) {
            return t1Var;
        }
        q3 q3Var = (q3) this.f215040c.T2(j6.a.q("SUBSCRIPTION_KEY", str), i);
        if (q3Var != null) {
            return ofj.p.d(q3Var);
        }
        return null;
    }

    public final pfj.k g() {
        pfj.k kVar = (pfj.k) this.f215039b.get("SUBSCRIPTIONS_KEY");
        return kVar == null ? h() : kVar;
    }

    public final pfj.k h() {
        Type type = f215037h;
        ue0.c cVar = this.f215040c;
        List list = (List) cVar.T2("SUBSCRIPTIONS_KEY", type);
        if (list == null) {
            return null;
        }
        ArrayList arrayListI = ofj.p.i(list);
        mfj.j jVar = (mfj.j) j6.a.k(mfj.j.class, cVar, "EMPTY_SUBSCRIPTIONS_DISPLAY_KEY");
        return new pfj.k(arrayListI, jVar != null ? mra.d.X(jVar) : null);
    }

    public final vkm.d i(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.f.b(Unit.f186387a, loadingStrategy);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r11, dej.x1 r12, gim.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof nfj.k2
            if (r0 == 0) goto L13
            r0 = r13
            nfj.k2 r0 = (nfj.k2) r0
            int r1 = r0.f214975w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214975w = r1
            goto L18
        L13:
            nfj.k2 r0 = new nfj.k2
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214975w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L60
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r13)
            dej.t1 r4 = r10.f(r11)
            if (r4 != 0) goto L3b
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L3b:
            dej.x1 r13 = r4.f113659p
            if (r13 != 0) goto L42
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L42:
            boolean r2 = r12.f113689a
            boolean r12 = r12.f113690b
            dej.x1 r6 = dej.x1.a(r13, r2, r12)
            r8 = -32769(0xffffffffffff7fff, float:NaN)
            r9 = 2047(0x7ff, float:2.868E-42)
            r5 = 0
            r7 = 0
            dej.t1 r12 = dej.t1.a(r4, r5, r6, r7, r8, r9)
            r0.f214975w = r3
            x4l.c r13 = r10.f215041g
            java.lang.Object r11 = r13.f(r11, r12, r0)
            if (r11 != r1) goto L60
            return r1
        L60:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nfj.s2.j(java.lang.String, dej.x1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r11, java.lang.String r12, gim.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof nfj.o2
            if (r0 == 0) goto L13
            r0 = r13
            nfj.o2 r0 = (nfj.o2) r0
            int r1 = r0.f215010w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f215010w = r1
            goto L18
        L13:
            nfj.o2 r0 = new nfj.o2
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f215010w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L5e
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r13)
            dej.t1 r4 = r10.f(r11)
            if (r4 != 0) goto L3b
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L3b:
            dej.w2 r13 = r4.k
            if (r13 != 0) goto L42
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L42:
            r2 = 0
            r5 = 14
            dej.w2 r5 = dej.w2.a(r13, r12, r2, r5)
            r8 = -1025(0xfffffffffffffbff, float:NaN)
            r9 = 2047(0x7ff, float:2.868E-42)
            r6 = 0
            r7 = 0
            dej.t1 r12 = dej.t1.a(r4, r5, r6, r7, r8, r9)
            r0.f215010w = r3
            x4l.c r13 = r10.f215041g
            java.lang.Object r11 = r13.f(r11, r12, r0)
            if (r11 != r1) goto L5e
            return r1
        L5e:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nfj.s2.k(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final Object l(String str, String str2, m2 m2Var) {
        Object next;
        dej.w2 w2Var;
        Object objO;
        pfj.k kVarG = g();
        if (kVarG == null) {
            return Unit.f186387a;
        }
        Iterator it8 = kVarG.f235617a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((dej.t1) next).f113650a, str)) {
                break;
            }
        }
        dej.t1 t1Var = (dej.t1) next;
        return (t1Var == null || (w2Var = t1Var.k) == null || (objO = o(kVarG, dej.t1.a(t1Var, dej.w2.a(w2Var, str2, null, 14), null, null, -1025, 2047), m2Var)) != fim.a.COROUTINE_SUSPENDED) ? Unit.f186387a : objO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.String r11, com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber r12, gim.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof nfj.p2
            if (r0 == 0) goto L13
            r0 = r13
            nfj.p2 r0 = (nfj.p2) r0
            int r1 = r0.f215018w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f215018w = r1
            goto L18
        L13:
            nfj.p2 r0 = new nfj.p2
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f215018w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L83
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r13)
            dej.t1 r4 = r10.f(r11)
            if (r4 != 0) goto L3b
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L3b:
            java.util.List r13 = r4.K
            if (r13 == 0) goto L6d
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = zhm.w.t(r13, r5)
            r2.<init>(r5)
            java.util.Iterator r13 = r13.iterator()
        L50:
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto L6b
            java.lang.Object r5 = r13.next()
            com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber r5 = (com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber) r5
            java.lang.String r6 = r12.f100470a
            java.lang.String r7 = r5.f100470a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r6 == 0) goto L67
            r5 = r12
        L67:
            r2.add(r5)
            goto L50
        L6b:
            r7 = r2
            goto L6f
        L6d:
            r2 = 0
            goto L6b
        L6f:
            r8 = -1
            r9 = 2031(0x7ef, float:2.846E-42)
            r5 = 0
            r6 = 0
            dej.t1 r12 = dej.t1.a(r4, r5, r6, r7, r8, r9)
            r0.f215018w = r3
            x4l.c r13 = r10.f215041g
            java.lang.Object r11 = r13.f(r11, r12, r0)
            if (r11 != r1) goto L83
            return r1
        L83:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nfj.s2.m(java.lang.String, com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber, gim.c):java.lang.Object");
    }

    public final Object n(String str, EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber, q2 q2Var) {
        ArrayList arrayList;
        Object next;
        pfj.k kVarG = g();
        if (kVarG == null) {
            return Unit.f186387a;
        }
        Iterator it8 = kVarG.f235617a.iterator();
        while (true) {
            arrayList = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((dej.t1) next).f113650a, str)) {
                break;
            }
        }
        dej.t1 t1Var = (dej.t1) next;
        if (t1Var == null) {
            return Unit.f186387a;
        }
        List list = t1Var.K;
        if (list != null) {
            List<EsimSubscriptionPhoneNumber> list2 = list;
            arrayList = new ArrayList(zhm.w.t(list2, 10));
            for (EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber2 : list2) {
                if (Intrinsics.f(esimSubscriptionPhoneNumber.f100470a, esimSubscriptionPhoneNumber2.f100470a)) {
                    esimSubscriptionPhoneNumber2 = esimSubscriptionPhoneNumber;
                }
                arrayList.add(esimSubscriptionPhoneNumber2);
            }
        }
        Object objO = o(kVarG, dej.t1.a(t1Var, null, null, arrayList, -1, 2031), q2Var);
        return objO == fim.a.COROUTINE_SUSPENDED ? objO : Unit.f186387a;
    }

    public final Object o(pfj.k kVar, dej.t1 t1Var, gim.c cVar) {
        Unit unit = Unit.f186387a;
        List list = kVar.f235617a;
        ArrayList list2 = new ArrayList(zhm.w.t(list, 10));
        for (Object obj2 : list) {
            if (Intrinsics.f(t1Var.f113650a, ((dej.t1) obj2).f113650a)) {
                obj2 = t1Var;
            }
            list2.add(obj2);
        }
        EsimSubscriptionsEmptyDisplay esimSubscriptionsEmptyDisplay = kVar.f235618b;
        Intrinsics.checkNotNullParameter(list2, "list");
        Object objF = this.f.f(unit, new pfj.k(list2, esimSubscriptionsEmptyDisplay), cVar);
        return objF == fim.a.COROUTINE_SUSPENDED ? objF : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        if (n(r5, r2, r0) != r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v6, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r10v7, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r9v0, types: [nfj.s2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r10, com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber r11, gim.c r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof nfj.q2
            if (r0 == 0) goto L13
            r0 = r12
            nfj.q2 r0 = (nfj.q2) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            nfj.q2 r0 = new nfj.q2
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L60
            if (r2 == r6) goto L52
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            hlm.a r10 = r0.f215019w
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L32
            goto La1
        L32:
            r11 = move-exception
            goto La9
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            int r3 = r0.f215021y
            int r10 = r0.f215020x
            hlm.a r11 = r0.f215019w
            com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber r2 = r0.v
            java.lang.String r5 = r0.u
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L4d
            r12 = r10
        L4b:
            r10 = r11
            goto L8e
        L4d:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto La9
        L52:
            int r10 = r0.f215020x
            hlm.a r11 = r0.f215019w
            com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber r2 = r0.v
            java.lang.String r6 = r0.u
            yhm.o.b(r12)
            r12 = r10
            r10 = r6
            goto L79
        L60:
            yhm.o.b(r12)
            r0.u = r10
            r0.v = r11
            hlm.c r12 = r9.e
            r0.f215019w = r12
            r0.f215020x = r3
            r0.B = r6
            java.lang.Object r2 = r12.lock(r7, r0)
            if (r2 != r1) goto L76
            goto La0
        L76:
            r2 = r11
            r11 = r12
            r12 = r3
        L79:
            r0.u = r10     // Catch: java.lang.Throwable -> L4d
            r0.v = r2     // Catch: java.lang.Throwable -> L4d
            r0.f215019w = r11     // Catch: java.lang.Throwable -> L4d
            r0.f215020x = r12     // Catch: java.lang.Throwable -> L4d
            r0.f215021y = r3     // Catch: java.lang.Throwable -> L4d
            r0.B = r5     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r5 = r9.m(r10, r2, r0)     // Catch: java.lang.Throwable -> L4d
            if (r5 != r1) goto L8c
            goto La0
        L8c:
            r5 = r10
            goto L4b
        L8e:
            r0.u = r7     // Catch: java.lang.Throwable -> L32
            r0.v = r7     // Catch: java.lang.Throwable -> L32
            r0.f215019w = r10     // Catch: java.lang.Throwable -> L32
            r0.f215020x = r12     // Catch: java.lang.Throwable -> L32
            r0.f215021y = r3     // Catch: java.lang.Throwable -> L32
            r0.B = r4     // Catch: java.lang.Throwable -> L32
            java.lang.Object r11 = r9.n(r5, r2, r0)     // Catch: java.lang.Throwable -> L32
            if (r11 != r1) goto La1
        La0:
            return r1
        La1:
            kotlin.Unit r11 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L32
            r10.unlock(r7)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        La9:
            r10.unlock(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nfj.s2.p(java.lang.String, com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(gim.c r11, java.lang.String r12, boolean r13) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof nfj.r2
            if (r0 == 0) goto L13
            r0 = r11
            nfj.r2 r0 = (nfj.r2) r0
            int r1 = r0.f215028w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f215028w = r1
            goto L18
        L13:
            nfj.r2 r0 = new nfj.r2
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f215028w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r11)
            goto L61
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r11)
            dej.t1 r4 = r10.f(r12)
            if (r4 != 0) goto L3b
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L3b:
            dej.w2 r11 = r4.k
            if (r11 != 0) goto L42
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L42:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r2 = 7
            r5 = 0
            dej.w2 r5 = dej.w2.a(r11, r5, r13, r2)
            r8 = -1025(0xfffffffffffffbff, float:NaN)
            r9 = 2047(0x7ff, float:2.868E-42)
            r6 = 0
            r7 = 0
            dej.t1 r11 = dej.t1.a(r4, r5, r6, r7, r8, r9)
            r0.f215028w = r3
            x4l.c r13 = r10.f215041g
            java.lang.Object r11 = r13.f(r12, r11, r0)
            if (r11 != r1) goto L61
            return r1
        L61:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nfj.s2.q(gim.c, java.lang.String, boolean):java.lang.Object");
    }

    public final Object r(String str, boolean z, n2 n2Var) {
        Object next;
        dej.w2 w2Var;
        Object objO;
        pfj.k kVarG = g();
        if (kVarG == null) {
            return Unit.f186387a;
        }
        Iterator it8 = kVarG.f235617a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((dej.t1) next).f113650a, str)) {
                break;
            }
        }
        dej.t1 t1Var = (dej.t1) next;
        return (t1Var == null || (w2Var = t1Var.k) == null || (objO = o(kVarG, dej.t1.a(t1Var, dej.w2.a(w2Var, null, Boolean.valueOf(z), 7), null, null, -1025, 2047), n2Var)) != fim.a.COROUTINE_SUSPENDED) ? Unit.f186387a : objO;
    }
}
