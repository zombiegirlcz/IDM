package gn9;

import com.revolut.feature.payinstore.impl.data.service.PayInStoreService;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import te0.w;
import w4l.f;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements nn9.a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayInStoreService f144936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b6c.a f144937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f144938c;
    public final f d;

    public d(PayInStoreService payInStoreService, b6c.a paymentsInteractor, j memoryCache) {
        Intrinsics.checkNotNullParameter(payInStoreService, "payInStoreService");
        Intrinsics.checkNotNullParameter(paymentsInteractor, "paymentsInteractor");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f144936a = payInStoreService;
        this.f144937b = paymentsInteractor;
        this.f144938c = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: gn9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f144934b;

            {
                this.f144934b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String orderId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(orderId, "orderId");
                        return w.o0(p0.f264003c, new gm6.j(this.f144934b, orderId, null, 1));
                    default:
                        mn9.a value = (mn9.a) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f144934b.f144938c.f("ORDER_INITIATION_DETAILS", value);
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 1;
        this.d = new f(function2, new gmk.j(this, i2), new Function2(this) { // from class: gn9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f144934b;

            {
                this.f144934b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String orderId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(orderId, "orderId");
                        return w.o0(p0.f264003c, new gm6.j(this.f144934b, orderId, null, 1));
                    default:
                        mn9.a value = (mn9.a) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f144934b.f144938c.f("ORDER_INITIATION_DETAILS", value);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof gn9.c
            if (r0 == 0) goto L13
            r0 = r7
            gn9.c r0 = (gn9.c) r0
            int r1 = r0.f144935w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f144935w = r1
            goto L18
        L13:
            gn9.c r0 = new gn9.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f144935w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r7)
            goto L50
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            r0.f144935w = r4
            b6c.a r7 = r5.f144937b
            q7c.j r7 = (q7c.j) r7
            y7c.b r7 = r7.f242818a
            k7c.z r7 = (k7c.z) r7
            r7.getClass()
            k7c.t r2 = new k7c.t
            r2.<init>(r7, r6, r3, r4)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r6, r2, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r6 = r7.iterator()
        L56:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L69
            java.lang.Object r7 = r6.next()
            if (r7 == 0) goto L65
            boolean r0 = r7 instanceof com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod.RevolutAccount
            goto L66
        L65:
            r0 = r4
        L66:
            if (r0 == 0) goto L56
            r3 = r7
        L69:
            com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod$RevolutAccount r3 = (com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod.RevolutAccount) r3
            if (r3 == 0) goto L6e
            return r3
        L6e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Revolut account not found"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gn9.d.a(java.lang.String, gim.c):java.lang.Object");
    }
}
