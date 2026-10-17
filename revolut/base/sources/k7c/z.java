package k7c;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.impl.data.service.RevolutPayService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class z implements y7c.b {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPayService f182025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f182026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b80.c f182027c;
    public final d7c.b d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f182028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f182029h;
    public final jpf.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jpf.a f182030j;

    public z(RevolutPayService revolutPayService, ne0.j memoryCache, b80.c networkStateRepository, d7c.b cardPaymentMethodMapper) {
        Intrinsics.checkNotNullParameter(revolutPayService, "revolutPayService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(cardPaymentMethodMapper, "cardPaymentMethodMapper");
        this.f182025a = revolutPayService;
        this.f182026b = memoryCache;
        this.f182027c = networkStateRepository;
        this.d = cardPaymentMethodMapper;
        Continuation continuation = null;
        x xVar = new x(this, continuation, 1);
        final int i = 5;
        Function1 function1 = new Function1(this) { // from class: k7c.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f181979b;

            {
                this.f181979b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        return (List) this.f181979b.f182026b.get(z.d(((p) obj2).f181986a));
                    case 1:
                        u6c.n newPaymentMethodsParams = (u6c.n) obj2;
                        Intrinsics.checkNotNullParameter(newPaymentMethodsParams, "newPaymentMethodsParams");
                        return (v7c.b) this.f181979b.f182026b.get(z.h(newPaymentMethodsParams.f277570c, newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.e));
                    case 2:
                        u6c.p paymentMethodParams = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
                        ne0.j jVar = this.f181979b.f182026b;
                        String paymentMethodId = paymentMethodParams.f277573a;
                        u6c.t product = paymentMethodParams.d;
                        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                        Intrinsics.checkNotNullParameter(product, "product");
                        return (od0.i) jVar.get("PAYMENT_METHOD_OPTIONAL_CACHE_PREFIX_" + paymentMethodId);
                    case 3:
                        u6c.p paymentMethodParams2 = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams2, "paymentMethodParams");
                        return te0.w.o0(skm.p0.f264003c, new k3k.q0(this.f181979b, paymentMethodParams2, null, 22));
                    case 4:
                        u6c.p paymentMethodParams3 = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams3, "paymentMethodParams");
                        ne0.j jVar2 = this.f181979b.f182026b;
                        String paymentMethodId2 = paymentMethodParams3.f277573a;
                        u6c.t product2 = paymentMethodParams3.d;
                        Intrinsics.checkNotNullParameter(paymentMethodId2, "paymentMethodId");
                        Intrinsics.checkNotNullParameter(product2, "product");
                        return (od0.i) jVar2.get("PAYMENT_METHOD_OPTIONAL_CACHE_PREFIX_" + paymentMethodId2);
                    case 5:
                        u6c.h0 params = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (u6c.f0) this.f181979b.f182026b.get(z.f(params));
                    case 6:
                        u6c.h0 params2 = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return te0.w.o0(skm.p0.f264003c, new k3k.q0(this.f181979b, params2, null, 23));
                    default:
                        u6c.h0 params3 = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (u6c.f0) this.f181979b.f182026b.get(z.f(params3));
                }
            }
        };
        final int i2 = 1;
        int i3 = 2;
        int i5 = 3;
        this.e = new x4l.c(xVar, function1, new Function2(this) { // from class: k7c.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f181976b;

            {
                this.f181976b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        u6c.h0 params = (u6c.h0) obj2;
                        u6c.f0 value = (u6c.f0) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f181976b.f182026b.f(z.f(params), value);
                        break;
                    case 1:
                        u6c.h0 params2 = (u6c.h0) obj2;
                        u6c.f0 value2 = (u6c.f0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f181976b.f182026b.f(z.f(params2), value2);
                        break;
                    case 2:
                        List value3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(value3, "value");
                        this.f181976b.f182026b.f(z.d(((p) obj2).f181986a), value3);
                        break;
                    case 3:
                        u6c.n newPaymentMethodsParams = (u6c.n) obj2;
                        v7c.b value4 = (v7c.b) obj3;
                        Intrinsics.checkNotNullParameter(newPaymentMethodsParams, "newPaymentMethodsParams");
                        Intrinsics.checkNotNullParameter(value4, "value");
                        String strH = z.h(newPaymentMethodsParams.f277570c, newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.e);
                        z zVar = this.f181976b;
                        zVar.f182026b.f(strH, value4);
                        for (PaymentMethod paymentMethod : value4.f286584a) {
                            x4l.c cVar = zVar.f182029h;
                            u6c.p pVar = new u6c.p(paymentMethod.getF84393a(), newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.f277570c, newPaymentMethodsParams.d, newPaymentMethodsParams.e, newPaymentMethodsParams.f, 128);
                            od0.i.Companion.getClass();
                            cVar.g(pVar, od0.h.a(paymentMethod));
                        }
                        break;
                    case 4:
                        u6c.p paymentMethodParams = (u6c.p) obj2;
                        od0.i paymentMethod2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
                        Intrinsics.checkNotNullParameter(paymentMethod2, "paymentMethod");
                        this.f181976b.j(new q(paymentMethodParams.f277573a, paymentMethodParams.d, paymentMethodParams.f277574b, paymentMethodParams.f277575c, paymentMethodParams.f), paymentMethod2, false);
                        break;
                    default:
                        u6c.p paymentMethodParams2 = (u6c.p) obj2;
                        od0.i paymentMethod3 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(paymentMethodParams2, "paymentMethodParams");
                        Intrinsics.checkNotNullParameter(paymentMethod3, "paymentMethod");
                        this.f181976b.j(new q(paymentMethodParams2.f277573a, paymentMethodParams2.d, paymentMethodParams2.f277574b, paymentMethodParams2.f277575c, paymentMethodParams2.f), paymentMethod3, false);
                        break;
                }
                return Unit.f186387a;
            }
        }, new iz1.g(i3, 11, continuation), new k3c.l(i5, 4, continuation));
        final int i6 = 0;
        x xVar2 = new x(this, continuation, i6);
        Function1 function12 = new Function1(this) { // from class: k7c.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f181979b;

            {
                this.f181979b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        return (List) this.f181979b.f182026b.get(z.d(((p) obj2).f181986a));
                    case 1:
                        u6c.n newPaymentMethodsParams = (u6c.n) obj2;
                        Intrinsics.checkNotNullParameter(newPaymentMethodsParams, "newPaymentMethodsParams");
                        return (v7c.b) this.f181979b.f182026b.get(z.h(newPaymentMethodsParams.f277570c, newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.e));
                    case 2:
                        u6c.p paymentMethodParams = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
                        ne0.j jVar = this.f181979b.f182026b;
                        String paymentMethodId = paymentMethodParams.f277573a;
                        u6c.t product = paymentMethodParams.d;
                        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                        Intrinsics.checkNotNullParameter(product, "product");
                        return (od0.i) jVar.get("PAYMENT_METHOD_OPTIONAL_CACHE_PREFIX_" + paymentMethodId);
                    case 3:
                        u6c.p paymentMethodParams2 = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams2, "paymentMethodParams");
                        return te0.w.o0(skm.p0.f264003c, new k3k.q0(this.f181979b, paymentMethodParams2, null, 22));
                    case 4:
                        u6c.p paymentMethodParams3 = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams3, "paymentMethodParams");
                        ne0.j jVar2 = this.f181979b.f182026b;
                        String paymentMethodId2 = paymentMethodParams3.f277573a;
                        u6c.t product2 = paymentMethodParams3.d;
                        Intrinsics.checkNotNullParameter(paymentMethodId2, "paymentMethodId");
                        Intrinsics.checkNotNullParameter(product2, "product");
                        return (od0.i) jVar2.get("PAYMENT_METHOD_OPTIONAL_CACHE_PREFIX_" + paymentMethodId2);
                    case 5:
                        u6c.h0 params = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (u6c.f0) this.f181979b.f182026b.get(z.f(params));
                    case 6:
                        u6c.h0 params2 = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return te0.w.o0(skm.p0.f264003c, new k3k.q0(this.f181979b, params2, null, 23));
                    default:
                        u6c.h0 params3 = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (u6c.f0) this.f181979b.f182026b.get(z.f(params3));
                }
            }
        };
        final int i21 = 2;
        this.f = new x4l.c(xVar2, function12, new Function2(this) { // from class: k7c.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f181976b;

            {
                this.f181976b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        u6c.h0 params = (u6c.h0) obj2;
                        u6c.f0 value = (u6c.f0) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f181976b.f182026b.f(z.f(params), value);
                        break;
                    case 1:
                        u6c.h0 params2 = (u6c.h0) obj2;
                        u6c.f0 value2 = (u6c.f0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f181976b.f182026b.f(z.f(params2), value2);
                        break;
                    case 2:
                        List value3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(value3, "value");
                        this.f181976b.f182026b.f(z.d(((p) obj2).f181986a), value3);
                        break;
                    case 3:
                        u6c.n newPaymentMethodsParams = (u6c.n) obj2;
                        v7c.b value4 = (v7c.b) obj3;
                        Intrinsics.checkNotNullParameter(newPaymentMethodsParams, "newPaymentMethodsParams");
                        Intrinsics.checkNotNullParameter(value4, "value");
                        String strH = z.h(newPaymentMethodsParams.f277570c, newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.e);
                        z zVar = this.f181976b;
                        zVar.f182026b.f(strH, value4);
                        for (PaymentMethod paymentMethod : value4.f286584a) {
                            x4l.c cVar = zVar.f182029h;
                            u6c.p pVar = new u6c.p(paymentMethod.getF84393a(), newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.f277570c, newPaymentMethodsParams.d, newPaymentMethodsParams.e, newPaymentMethodsParams.f, 128);
                            od0.i.Companion.getClass();
                            cVar.g(pVar, od0.h.a(paymentMethod));
                        }
                        break;
                    case 4:
                        u6c.p paymentMethodParams = (u6c.p) obj2;
                        od0.i paymentMethod2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
                        Intrinsics.checkNotNullParameter(paymentMethod2, "paymentMethod");
                        this.f181976b.j(new q(paymentMethodParams.f277573a, paymentMethodParams.d, paymentMethodParams.f277574b, paymentMethodParams.f277575c, paymentMethodParams.f), paymentMethod2, false);
                        break;
                    default:
                        u6c.p paymentMethodParams2 = (u6c.p) obj2;
                        od0.i paymentMethod3 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(paymentMethodParams2, "paymentMethodParams");
                        Intrinsics.checkNotNullParameter(paymentMethod3, "paymentMethod");
                        this.f181976b.j(new q(paymentMethodParams2.f277573a, paymentMethodParams2.d, paymentMethodParams2.f277574b, paymentMethodParams2.f277575c, paymentMethodParams2.f), paymentMethod3, false);
                        break;
                }
                return Unit.f186387a;
            }
        }, new iz1.g(i3, 10, continuation), new k3c.l(i5, 3, continuation));
        x xVar3 = new x(this, continuation, 2);
        final int i22 = 1;
        Function1 function13 = new Function1(this) { // from class: k7c.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f181979b;

            {
                this.f181979b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i22) {
                    case 0:
                        return (List) this.f181979b.f182026b.get(z.d(((p) obj2).f181986a));
                    case 1:
                        u6c.n newPaymentMethodsParams = (u6c.n) obj2;
                        Intrinsics.checkNotNullParameter(newPaymentMethodsParams, "newPaymentMethodsParams");
                        return (v7c.b) this.f181979b.f182026b.get(z.h(newPaymentMethodsParams.f277570c, newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.e));
                    case 2:
                        u6c.p paymentMethodParams = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
                        ne0.j jVar = this.f181979b.f182026b;
                        String paymentMethodId = paymentMethodParams.f277573a;
                        u6c.t product = paymentMethodParams.d;
                        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                        Intrinsics.checkNotNullParameter(product, "product");
                        return (od0.i) jVar.get("PAYMENT_METHOD_OPTIONAL_CACHE_PREFIX_" + paymentMethodId);
                    case 3:
                        u6c.p paymentMethodParams2 = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams2, "paymentMethodParams");
                        return te0.w.o0(skm.p0.f264003c, new k3k.q0(this.f181979b, paymentMethodParams2, null, 22));
                    case 4:
                        u6c.p paymentMethodParams3 = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams3, "paymentMethodParams");
                        ne0.j jVar2 = this.f181979b.f182026b;
                        String paymentMethodId2 = paymentMethodParams3.f277573a;
                        u6c.t product2 = paymentMethodParams3.d;
                        Intrinsics.checkNotNullParameter(paymentMethodId2, "paymentMethodId");
                        Intrinsics.checkNotNullParameter(product2, "product");
                        return (od0.i) jVar2.get("PAYMENT_METHOD_OPTIONAL_CACHE_PREFIX_" + paymentMethodId2);
                    case 5:
                        u6c.h0 params = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (u6c.f0) this.f181979b.f182026b.get(z.f(params));
                    case 6:
                        u6c.h0 params2 = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return te0.w.o0(skm.p0.f264003c, new k3k.q0(this.f181979b, params2, null, 23));
                    default:
                        u6c.h0 params3 = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (u6c.f0) this.f181979b.f182026b.get(z.f(params3));
                }
            }
        };
        final int i32 = 3;
        this.f182028g = new x4l.c(xVar3, function13, new Function2(this) { // from class: k7c.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f181976b;

            {
                this.f181976b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        u6c.h0 params = (u6c.h0) obj2;
                        u6c.f0 value = (u6c.f0) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f181976b.f182026b.f(z.f(params), value);
                        break;
                    case 1:
                        u6c.h0 params2 = (u6c.h0) obj2;
                        u6c.f0 value2 = (u6c.f0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f181976b.f182026b.f(z.f(params2), value2);
                        break;
                    case 2:
                        List value3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(value3, "value");
                        this.f181976b.f182026b.f(z.d(((p) obj2).f181986a), value3);
                        break;
                    case 3:
                        u6c.n newPaymentMethodsParams = (u6c.n) obj2;
                        v7c.b value4 = (v7c.b) obj3;
                        Intrinsics.checkNotNullParameter(newPaymentMethodsParams, "newPaymentMethodsParams");
                        Intrinsics.checkNotNullParameter(value4, "value");
                        String strH = z.h(newPaymentMethodsParams.f277570c, newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.e);
                        z zVar = this.f181976b;
                        zVar.f182026b.f(strH, value4);
                        for (PaymentMethod paymentMethod : value4.f286584a) {
                            x4l.c cVar = zVar.f182029h;
                            u6c.p pVar = new u6c.p(paymentMethod.getF84393a(), newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.f277570c, newPaymentMethodsParams.d, newPaymentMethodsParams.e, newPaymentMethodsParams.f, 128);
                            od0.i.Companion.getClass();
                            cVar.g(pVar, od0.h.a(paymentMethod));
                        }
                        break;
                    case 4:
                        u6c.p paymentMethodParams = (u6c.p) obj2;
                        od0.i paymentMethod2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
                        Intrinsics.checkNotNullParameter(paymentMethod2, "paymentMethod");
                        this.f181976b.j(new q(paymentMethodParams.f277573a, paymentMethodParams.d, paymentMethodParams.f277574b, paymentMethodParams.f277575c, paymentMethodParams.f), paymentMethod2, false);
                        break;
                    default:
                        u6c.p paymentMethodParams2 = (u6c.p) obj2;
                        od0.i paymentMethod3 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(paymentMethodParams2, "paymentMethodParams");
                        Intrinsics.checkNotNullParameter(paymentMethod3, "paymentMethod");
                        this.f181976b.j(new q(paymentMethodParams2.f277573a, paymentMethodParams2.d, paymentMethodParams2.f277574b, paymentMethodParams2.f277575c, paymentMethodParams2.f), paymentMethod3, false);
                        break;
                }
                return Unit.f186387a;
            }
        }, new iz1.g(i3, 12, continuation), new k3c.l(i5, 5, continuation));
        ghl.l lVar = new ghl.l(this, continuation, 29);
        final int i33 = 2;
        Function1 function14 = new Function1(this) { // from class: k7c.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f181979b;

            {
                this.f181979b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i33) {
                    case 0:
                        return (List) this.f181979b.f182026b.get(z.d(((p) obj2).f181986a));
                    case 1:
                        u6c.n newPaymentMethodsParams = (u6c.n) obj2;
                        Intrinsics.checkNotNullParameter(newPaymentMethodsParams, "newPaymentMethodsParams");
                        return (v7c.b) this.f181979b.f182026b.get(z.h(newPaymentMethodsParams.f277570c, newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.e));
                    case 2:
                        u6c.p paymentMethodParams = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
                        ne0.j jVar = this.f181979b.f182026b;
                        String paymentMethodId = paymentMethodParams.f277573a;
                        u6c.t product = paymentMethodParams.d;
                        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                        Intrinsics.checkNotNullParameter(product, "product");
                        return (od0.i) jVar.get("PAYMENT_METHOD_OPTIONAL_CACHE_PREFIX_" + paymentMethodId);
                    case 3:
                        u6c.p paymentMethodParams2 = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams2, "paymentMethodParams");
                        return te0.w.o0(skm.p0.f264003c, new k3k.q0(this.f181979b, paymentMethodParams2, null, 22));
                    case 4:
                        u6c.p paymentMethodParams3 = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams3, "paymentMethodParams");
                        ne0.j jVar2 = this.f181979b.f182026b;
                        String paymentMethodId2 = paymentMethodParams3.f277573a;
                        u6c.t product2 = paymentMethodParams3.d;
                        Intrinsics.checkNotNullParameter(paymentMethodId2, "paymentMethodId");
                        Intrinsics.checkNotNullParameter(product2, "product");
                        return (od0.i) jVar2.get("PAYMENT_METHOD_OPTIONAL_CACHE_PREFIX_" + paymentMethodId2);
                    case 5:
                        u6c.h0 params = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (u6c.f0) this.f181979b.f182026b.get(z.f(params));
                    case 6:
                        u6c.h0 params2 = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return te0.w.o0(skm.p0.f264003c, new k3k.q0(this.f181979b, params2, null, 23));
                    default:
                        u6c.h0 params3 = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (u6c.f0) this.f181979b.f182026b.get(z.f(params3));
                }
            }
        };
        final int i43 = 4;
        this.f182029h = new x4l.c(lVar, function14, new Function2(this) { // from class: k7c.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f181976b;

            {
                this.f181976b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        u6c.h0 params = (u6c.h0) obj2;
                        u6c.f0 value = (u6c.f0) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f181976b.f182026b.f(z.f(params), value);
                        break;
                    case 1:
                        u6c.h0 params2 = (u6c.h0) obj2;
                        u6c.f0 value2 = (u6c.f0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f181976b.f182026b.f(z.f(params2), value2);
                        break;
                    case 2:
                        List value3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(value3, "value");
                        this.f181976b.f182026b.f(z.d(((p) obj2).f181986a), value3);
                        break;
                    case 3:
                        u6c.n newPaymentMethodsParams = (u6c.n) obj2;
                        v7c.b value4 = (v7c.b) obj3;
                        Intrinsics.checkNotNullParameter(newPaymentMethodsParams, "newPaymentMethodsParams");
                        Intrinsics.checkNotNullParameter(value4, "value");
                        String strH = z.h(newPaymentMethodsParams.f277570c, newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.e);
                        z zVar = this.f181976b;
                        zVar.f182026b.f(strH, value4);
                        for (PaymentMethod paymentMethod : value4.f286584a) {
                            x4l.c cVar = zVar.f182029h;
                            u6c.p pVar = new u6c.p(paymentMethod.getF84393a(), newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.f277570c, newPaymentMethodsParams.d, newPaymentMethodsParams.e, newPaymentMethodsParams.f, 128);
                            od0.i.Companion.getClass();
                            cVar.g(pVar, od0.h.a(paymentMethod));
                        }
                        break;
                    case 4:
                        u6c.p paymentMethodParams = (u6c.p) obj2;
                        od0.i paymentMethod2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
                        Intrinsics.checkNotNullParameter(paymentMethod2, "paymentMethod");
                        this.f181976b.j(new q(paymentMethodParams.f277573a, paymentMethodParams.d, paymentMethodParams.f277574b, paymentMethodParams.f277575c, paymentMethodParams.f), paymentMethod2, false);
                        break;
                    default:
                        u6c.p paymentMethodParams2 = (u6c.p) obj2;
                        od0.i paymentMethod3 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(paymentMethodParams2, "paymentMethodParams");
                        Intrinsics.checkNotNullParameter(paymentMethod3, "paymentMethod");
                        this.f181976b.j(new q(paymentMethodParams2.f277573a, paymentMethodParams2.d, paymentMethodParams2.f277574b, paymentMethodParams2.f277575c, paymentMethodParams2.f), paymentMethod3, false);
                        break;
                }
                return Unit.f186387a;
            }
        }, new iz1.g(i3, 9, continuation), new k3c.l(i5, 2, continuation));
        final int i59 = 3;
        Function1 function15 = new Function1(this) { // from class: k7c.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f181979b;

            {
                this.f181979b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i59) {
                    case 0:
                        return (List) this.f181979b.f182026b.get(z.d(((p) obj2).f181986a));
                    case 1:
                        u6c.n newPaymentMethodsParams = (u6c.n) obj2;
                        Intrinsics.checkNotNullParameter(newPaymentMethodsParams, "newPaymentMethodsParams");
                        return (v7c.b) this.f181979b.f182026b.get(z.h(newPaymentMethodsParams.f277570c, newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.e));
                    case 2:
                        u6c.p paymentMethodParams = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
                        ne0.j jVar = this.f181979b.f182026b;
                        String paymentMethodId = paymentMethodParams.f277573a;
                        u6c.t product = paymentMethodParams.d;
                        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                        Intrinsics.checkNotNullParameter(product, "product");
                        return (od0.i) jVar.get("PAYMENT_METHOD_OPTIONAL_CACHE_PREFIX_" + paymentMethodId);
                    case 3:
                        u6c.p paymentMethodParams2 = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams2, "paymentMethodParams");
                        return te0.w.o0(skm.p0.f264003c, new k3k.q0(this.f181979b, paymentMethodParams2, null, 22));
                    case 4:
                        u6c.p paymentMethodParams3 = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams3, "paymentMethodParams");
                        ne0.j jVar2 = this.f181979b.f182026b;
                        String paymentMethodId2 = paymentMethodParams3.f277573a;
                        u6c.t product2 = paymentMethodParams3.d;
                        Intrinsics.checkNotNullParameter(paymentMethodId2, "paymentMethodId");
                        Intrinsics.checkNotNullParameter(product2, "product");
                        return (od0.i) jVar2.get("PAYMENT_METHOD_OPTIONAL_CACHE_PREFIX_" + paymentMethodId2);
                    case 5:
                        u6c.h0 params = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (u6c.f0) this.f181979b.f182026b.get(z.f(params));
                    case 6:
                        u6c.h0 params2 = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return te0.w.o0(skm.p0.f264003c, new k3k.q0(this.f181979b, params2, null, 23));
                    default:
                        u6c.h0 params3 = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (u6c.f0) this.f181979b.f182026b.get(z.f(params3));
                }
            }
        };
        final int i66 = 4;
        Function1 function16 = new Function1(this) { // from class: k7c.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f181979b;

            {
                this.f181979b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i66) {
                    case 0:
                        return (List) this.f181979b.f182026b.get(z.d(((p) obj2).f181986a));
                    case 1:
                        u6c.n newPaymentMethodsParams = (u6c.n) obj2;
                        Intrinsics.checkNotNullParameter(newPaymentMethodsParams, "newPaymentMethodsParams");
                        return (v7c.b) this.f181979b.f182026b.get(z.h(newPaymentMethodsParams.f277570c, newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.e));
                    case 2:
                        u6c.p paymentMethodParams = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
                        ne0.j jVar = this.f181979b.f182026b;
                        String paymentMethodId = paymentMethodParams.f277573a;
                        u6c.t product = paymentMethodParams.d;
                        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                        Intrinsics.checkNotNullParameter(product, "product");
                        return (od0.i) jVar.get("PAYMENT_METHOD_OPTIONAL_CACHE_PREFIX_" + paymentMethodId);
                    case 3:
                        u6c.p paymentMethodParams2 = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams2, "paymentMethodParams");
                        return te0.w.o0(skm.p0.f264003c, new k3k.q0(this.f181979b, paymentMethodParams2, null, 22));
                    case 4:
                        u6c.p paymentMethodParams3 = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams3, "paymentMethodParams");
                        ne0.j jVar2 = this.f181979b.f182026b;
                        String paymentMethodId2 = paymentMethodParams3.f277573a;
                        u6c.t product2 = paymentMethodParams3.d;
                        Intrinsics.checkNotNullParameter(paymentMethodId2, "paymentMethodId");
                        Intrinsics.checkNotNullParameter(product2, "product");
                        return (od0.i) jVar2.get("PAYMENT_METHOD_OPTIONAL_CACHE_PREFIX_" + paymentMethodId2);
                    case 5:
                        u6c.h0 params = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (u6c.f0) this.f181979b.f182026b.get(z.f(params));
                    case 6:
                        u6c.h0 params2 = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return te0.w.o0(skm.p0.f264003c, new k3k.q0(this.f181979b, params2, null, 23));
                    default:
                        u6c.h0 params3 = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (u6c.f0) this.f181979b.f182026b.get(z.f(params3));
                }
            }
        };
        final int i74 = 5;
        this.i = new jpf.a(function15, function16, new Function2(this) { // from class: k7c.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f181976b;

            {
                this.f181976b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i74) {
                    case 0:
                        u6c.h0 params = (u6c.h0) obj2;
                        u6c.f0 value = (u6c.f0) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f181976b.f182026b.f(z.f(params), value);
                        break;
                    case 1:
                        u6c.h0 params2 = (u6c.h0) obj2;
                        u6c.f0 value2 = (u6c.f0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f181976b.f182026b.f(z.f(params2), value2);
                        break;
                    case 2:
                        List value3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(value3, "value");
                        this.f181976b.f182026b.f(z.d(((p) obj2).f181986a), value3);
                        break;
                    case 3:
                        u6c.n newPaymentMethodsParams = (u6c.n) obj2;
                        v7c.b value4 = (v7c.b) obj3;
                        Intrinsics.checkNotNullParameter(newPaymentMethodsParams, "newPaymentMethodsParams");
                        Intrinsics.checkNotNullParameter(value4, "value");
                        String strH = z.h(newPaymentMethodsParams.f277570c, newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.e);
                        z zVar = this.f181976b;
                        zVar.f182026b.f(strH, value4);
                        for (PaymentMethod paymentMethod : value4.f286584a) {
                            x4l.c cVar = zVar.f182029h;
                            u6c.p pVar = new u6c.p(paymentMethod.getF84393a(), newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.f277570c, newPaymentMethodsParams.d, newPaymentMethodsParams.e, newPaymentMethodsParams.f, 128);
                            od0.i.Companion.getClass();
                            cVar.g(pVar, od0.h.a(paymentMethod));
                        }
                        break;
                    case 4:
                        u6c.p paymentMethodParams = (u6c.p) obj2;
                        od0.i paymentMethod2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
                        Intrinsics.checkNotNullParameter(paymentMethod2, "paymentMethod");
                        this.f181976b.j(new q(paymentMethodParams.f277573a, paymentMethodParams.d, paymentMethodParams.f277574b, paymentMethodParams.f277575c, paymentMethodParams.f), paymentMethod2, false);
                        break;
                    default:
                        u6c.p paymentMethodParams2 = (u6c.p) obj2;
                        od0.i paymentMethod3 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(paymentMethodParams2, "paymentMethodParams");
                        Intrinsics.checkNotNullParameter(paymentMethod3, "paymentMethod");
                        this.f181976b.j(new q(paymentMethodParams2.f277573a, paymentMethodParams2.d, paymentMethodParams2.f277574b, paymentMethodParams2.f277575c, paymentMethodParams2.f), paymentMethod3, false);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, 56);
        final int i92 = 6;
        Function1 function17 = new Function1(this) { // from class: k7c.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f181979b;

            {
                this.f181979b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i92) {
                    case 0:
                        return (List) this.f181979b.f182026b.get(z.d(((p) obj2).f181986a));
                    case 1:
                        u6c.n newPaymentMethodsParams = (u6c.n) obj2;
                        Intrinsics.checkNotNullParameter(newPaymentMethodsParams, "newPaymentMethodsParams");
                        return (v7c.b) this.f181979b.f182026b.get(z.h(newPaymentMethodsParams.f277570c, newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.e));
                    case 2:
                        u6c.p paymentMethodParams = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
                        ne0.j jVar = this.f181979b.f182026b;
                        String paymentMethodId = paymentMethodParams.f277573a;
                        u6c.t product = paymentMethodParams.d;
                        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                        Intrinsics.checkNotNullParameter(product, "product");
                        return (od0.i) jVar.get("PAYMENT_METHOD_OPTIONAL_CACHE_PREFIX_" + paymentMethodId);
                    case 3:
                        u6c.p paymentMethodParams2 = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams2, "paymentMethodParams");
                        return te0.w.o0(skm.p0.f264003c, new k3k.q0(this.f181979b, paymentMethodParams2, null, 22));
                    case 4:
                        u6c.p paymentMethodParams3 = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams3, "paymentMethodParams");
                        ne0.j jVar2 = this.f181979b.f182026b;
                        String paymentMethodId2 = paymentMethodParams3.f277573a;
                        u6c.t product2 = paymentMethodParams3.d;
                        Intrinsics.checkNotNullParameter(paymentMethodId2, "paymentMethodId");
                        Intrinsics.checkNotNullParameter(product2, "product");
                        return (od0.i) jVar2.get("PAYMENT_METHOD_OPTIONAL_CACHE_PREFIX_" + paymentMethodId2);
                    case 5:
                        u6c.h0 params = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (u6c.f0) this.f181979b.f182026b.get(z.f(params));
                    case 6:
                        u6c.h0 params2 = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return te0.w.o0(skm.p0.f264003c, new k3k.q0(this.f181979b, params2, null, 23));
                    default:
                        u6c.h0 params3 = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (u6c.f0) this.f181979b.f182026b.get(z.f(params3));
                }
            }
        };
        final int i96 = 7;
        Function1 function18 = new Function1(this) { // from class: k7c.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f181979b;

            {
                this.f181979b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i96) {
                    case 0:
                        return (List) this.f181979b.f182026b.get(z.d(((p) obj2).f181986a));
                    case 1:
                        u6c.n newPaymentMethodsParams = (u6c.n) obj2;
                        Intrinsics.checkNotNullParameter(newPaymentMethodsParams, "newPaymentMethodsParams");
                        return (v7c.b) this.f181979b.f182026b.get(z.h(newPaymentMethodsParams.f277570c, newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.e));
                    case 2:
                        u6c.p paymentMethodParams = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
                        ne0.j jVar = this.f181979b.f182026b;
                        String paymentMethodId = paymentMethodParams.f277573a;
                        u6c.t product = paymentMethodParams.d;
                        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                        Intrinsics.checkNotNullParameter(product, "product");
                        return (od0.i) jVar.get("PAYMENT_METHOD_OPTIONAL_CACHE_PREFIX_" + paymentMethodId);
                    case 3:
                        u6c.p paymentMethodParams2 = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams2, "paymentMethodParams");
                        return te0.w.o0(skm.p0.f264003c, new k3k.q0(this.f181979b, paymentMethodParams2, null, 22));
                    case 4:
                        u6c.p paymentMethodParams3 = (u6c.p) obj2;
                        Intrinsics.checkNotNullParameter(paymentMethodParams3, "paymentMethodParams");
                        ne0.j jVar2 = this.f181979b.f182026b;
                        String paymentMethodId2 = paymentMethodParams3.f277573a;
                        u6c.t product2 = paymentMethodParams3.d;
                        Intrinsics.checkNotNullParameter(paymentMethodId2, "paymentMethodId");
                        Intrinsics.checkNotNullParameter(product2, "product");
                        return (od0.i) jVar2.get("PAYMENT_METHOD_OPTIONAL_CACHE_PREFIX_" + paymentMethodId2);
                    case 5:
                        u6c.h0 params = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (u6c.f0) this.f181979b.f182026b.get(z.f(params));
                    case 6:
                        u6c.h0 params2 = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return te0.w.o0(skm.p0.f264003c, new k3k.q0(this.f181979b, params2, null, 23));
                    default:
                        u6c.h0 params3 = (u6c.h0) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (u6c.f0) this.f181979b.f182026b.get(z.f(params3));
                }
            }
        };
        final int i99 = 0;
        this.f182030j = new jpf.a(function17, function18, new Function2(this) { // from class: k7c.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f181976b;

            {
                this.f181976b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i99) {
                    case 0:
                        u6c.h0 params = (u6c.h0) obj2;
                        u6c.f0 value = (u6c.f0) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f181976b.f182026b.f(z.f(params), value);
                        break;
                    case 1:
                        u6c.h0 params2 = (u6c.h0) obj2;
                        u6c.f0 value2 = (u6c.f0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        this.f181976b.f182026b.f(z.f(params2), value2);
                        break;
                    case 2:
                        List value3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(value3, "value");
                        this.f181976b.f182026b.f(z.d(((p) obj2).f181986a), value3);
                        break;
                    case 3:
                        u6c.n newPaymentMethodsParams = (u6c.n) obj2;
                        v7c.b value4 = (v7c.b) obj3;
                        Intrinsics.checkNotNullParameter(newPaymentMethodsParams, "newPaymentMethodsParams");
                        Intrinsics.checkNotNullParameter(value4, "value");
                        String strH = z.h(newPaymentMethodsParams.f277570c, newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.e);
                        z zVar = this.f181976b;
                        zVar.f182026b.f(strH, value4);
                        for (PaymentMethod paymentMethod : value4.f286584a) {
                            x4l.c cVar = zVar.f182029h;
                            u6c.p pVar = new u6c.p(paymentMethod.getF84393a(), newPaymentMethodsParams.f277568a, newPaymentMethodsParams.f277569b, newPaymentMethodsParams.f277570c, newPaymentMethodsParams.d, newPaymentMethodsParams.e, newPaymentMethodsParams.f, 128);
                            od0.i.Companion.getClass();
                            cVar.g(pVar, od0.h.a(paymentMethod));
                        }
                        break;
                    case 4:
                        u6c.p paymentMethodParams = (u6c.p) obj2;
                        od0.i paymentMethod2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(paymentMethodParams, "paymentMethodParams");
                        Intrinsics.checkNotNullParameter(paymentMethod2, "paymentMethod");
                        this.f181976b.j(new q(paymentMethodParams.f277573a, paymentMethodParams.d, paymentMethodParams.f277574b, paymentMethodParams.f277575c, paymentMethodParams.f), paymentMethod2, false);
                        break;
                    default:
                        u6c.p paymentMethodParams2 = (u6c.p) obj2;
                        od0.i paymentMethod3 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(paymentMethodParams2, "paymentMethodParams");
                        Intrinsics.checkNotNullParameter(paymentMethod3, "paymentMethod");
                        this.f181976b.j(new q(paymentMethodParams2.f277573a, paymentMethodParams2.d, paymentMethodParams2.f277574b, paymentMethodParams2.f277575c, paymentMethodParams2.f), paymentMethod3, false);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, 56);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(k7c.z r10, u6c.c r11, java.lang.String r12, gim.c r13) {
        /*
            r10.getClass()
            boolean r0 = r13 instanceof k7c.r
            if (r0 == 0) goto L16
            r0 = r13
            k7c.r r0 = (k7c.r) r0
            int r1 = r0.f181996x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f181996x = r1
            goto L1b
        L16:
            k7c.r r0 = new k7c.r
            r0.<init>(r10, r13)
        L1b:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f181996x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            u6c.c r11 = r0.u
            yhm.o.b(r13)
            goto L67
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            yhm.o.b(r13)
            com.revolut.feature.revolutpay.impl.data.service.RevolutPayService r10 = r10.f182025a
            java.lang.String r13 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r13)
            e7c.b r4 = new e7c.b
            java.lang.String r5 = r11.f277546a
            int r6 = r11.f277547b
            int r7 = r11.f277548c
            java.lang.String r8 = r11.d
            com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.BillingAddress r13 = r11.e
            if (r13 == 0) goto L57
            e7c.d r2 = new e7c.d
            java.lang.String r9 = r13.f84360b
            java.lang.String r13 = r13.f84361c
            r2.<init>(r9, r13)
        L55:
            r9 = r2
            goto L59
        L57:
            r2 = 0
            goto L55
        L59:
            r4.<init>(r5, r6, r7, r8, r9)
            r0.u = r11
            r0.f181996x = r3
            java.lang.Object r13 = r10.addPaymentMethod(r4, r12, r0)
            if (r13 != r1) goto L67
            return r1
        L67:
            e7c.w r13 = (e7c.w) r13
            java.lang.String r10 = r11.f
            com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod$Card r10 = d7c.g.c(r13, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k7c.z.a(k7c.z, u6c.c, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(k7c.z r13, u6c.p r14, gim.c r15) {
        /*
            boolean r0 = r15 instanceof k7c.u
            if (r0 == 0) goto L14
            r0 = r15
            k7c.u r0 = (k7c.u) r0
            int r1 = r0.f182007x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f182007x = r1
        L12:
            r11 = r0
            goto L1a
        L14:
            k7c.u r0 = new k7c.u
            r0.<init>(r13, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r11.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.f182007x
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            od0.h r13 = r11.u
            yhm.o.b(r15)
            goto L6d
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            yhm.o.b(r15)
            od0.h r15 = od0.i.Companion
            com.revolut.feature.revolutpay.impl.data.service.RevolutPayService r1 = r13.f182025a
            java.lang.String r3 = r14.f277573a
            r13 = r2
            java.lang.String r2 = r14.f277574b
            u6c.u r4 = r14.f277575c
            r5 = 0
            if (r4 == 0) goto L49
            java.lang.String r4 = r4.name()
            goto L4a
        L49:
            r4 = r5
        L4a:
            u6c.t r6 = r14.d
            java.lang.String r6 = r6.name()
            r7 = r5
            r5 = r6
            java.lang.Long r6 = r14.e
            xi0.b r8 = r14.f
            if (r8 == 0) goto L5a
            java.lang.String r7 = r8.f306286a
        L5a:
            boolean r8 = r14.f277576g
            boolean r9 = r14.f277577h
            r11.u = r15
            r11.f182007x = r13
            r10 = 1
            java.lang.Object r13 = r1.getPaymentMethod(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L6a
            return r0
        L6a:
            r12 = r15
            r15 = r13
            r13 = r12
        L6d:
            e7c.z r15 = (e7c.z) r15
            com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod r14 = d7c.g.a(r15)
            r13.getClass()
            od0.i r13 = od0.h.a(r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: k7c.z.b(k7c.z, u6c.p, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(k7c.z r9, u6c.h0 r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k7c.z.c(k7c.z, u6c.h0, gim.c):java.lang.Object");
    }

    public static String d(String str) {
        aim.e eVarB = zhm.u.b();
        eVarB.add("PAYMENT_METHODS_CACHE_PREFIX");
        if (str != null) {
            eVarB.add(str);
        }
        return zhm.d0.k0(zhm.u.a(eVarB), "_", null, null, 0, null, 62);
    }

    public static String e(u6c.h0 h0Var) {
        aim.e eVarB = zhm.u.b();
        eVarB.add("USAGE_CHECK_AMOUNT_PREFIX_");
        eVarB.add(g(h0Var));
        return zhm.d0.k0(zhm.u.a(eVarB), "_", null, null, 0, null, 62);
    }

    public static String f(u6c.h0 h0Var) {
        aim.e eVarB = zhm.u.b();
        eVarB.add("USAGE_CHECK_PREFIX_");
        eVarB.add(g(h0Var));
        return zhm.d0.k0(zhm.u.a(eVarB), "_", null, null, 0, null, 62);
    }

    public static String g(u6c.h0 h0Var) {
        String strName;
        aim.e eVarB = zhm.u.b();
        eVarB.add(h0Var.f277557a);
        String str = h0Var.f277558b;
        if (str != null) {
            eVarB.add(str);
        }
        eVarB.add(h0Var.d.name());
        String str2 = h0Var.e;
        if (str2 != null) {
            eVarB.add(str2);
        }
        u6c.u uVar = h0Var.f;
        if (uVar != null && (strName = uVar.name()) != null) {
            eVarB.add(strName);
        }
        eVarB.add("BNPL");
        eVarB.add(Boolean.valueOf(h0Var.f277561h));
        eVarB.add(h0Var.f277559c.f115083b.f306286a);
        return zhm.d0.k0(zhm.u.a(eVarB), "_", null, null, 0, null, 62);
    }

    public static String h(u6c.t tVar, String str, u6c.u uVar, xi0.b bVar) {
        String str2;
        String strName;
        aim.e eVarB = zhm.u.b();
        eVarB.add("NEW_PAYMENT_METHODS_CACHE_PREFIX");
        eVarB.add(tVar.name());
        if (str != null) {
            eVarB.add(str);
        }
        if (uVar != null && (strName = uVar.name()) != null) {
            eVarB.add(strName);
        }
        if (bVar != null && (str2 = bVar.f306286a) != null) {
            eVarB.add(str2);
        }
        return zhm.d0.k0(zhm.u.a(eVarB), "_", null, null, 0, null, 62);
    }

    public static e7c.o0 k(u6c.h0 h0Var, String str, List list) {
        String str2 = h0Var.f277558b;
        dj0.d dVar = h0Var.f277559c;
        long j2 = dVar.f115082a;
        String str3 = dVar.f115083b.f306286a;
        String strName = h0Var.d.name();
        String str4 = h0Var.e;
        u6c.u uVar = h0Var.f;
        return new e7c.o0(str2, j2, str3, strName, str, list, str4, uVar != null ? uVar.name() : null, h0Var.f277561h);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(u6c.h0 r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof k7c.v
            if (r0 == 0) goto L13
            r0 = r8
            k7c.v r0 = (k7c.v) r0
            int r1 = r0.f182010w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f182010w = r1
            goto L18
        L13:
            k7c.v r0 = new k7c.v
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f182010w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L28
            goto L51
        L28:
            r7 = move-exception
            goto L58
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            java.lang.String r8 = e(r7)
            ne0.j r2 = r6.f182026b
            dj0.d r5 = r7.f277559c
            r2.f(r8, r5)
            e7c.o0 r8 = k(r7, r4, r4)     // Catch: java.lang.Exception -> L28
            com.revolut.feature.revolutpay.impl.data.service.RevolutPayService r2 = r6.f182025a     // Catch: java.lang.Exception -> L28
            java.lang.String r7 = r7.f277557a     // Catch: java.lang.Exception -> L28
            r0.f182010w = r3     // Catch: java.lang.Exception -> L28
            java.lang.Object r8 = r2.getUsageCheck(r7, r8, r0)     // Catch: java.lang.Exception -> L28
            if (r8 != r1) goto L51
            return r1
        L51:
            e7c.n0 r8 = (e7c.n0) r8     // Catch: java.lang.Exception -> L28
            u6c.f0 r7 = d7c.l.a(r8)     // Catch: java.lang.Exception -> L28
            return r7
        L58:
            java.lang.Integer r8 = n14.e.m(r7)
            if (r8 != 0) goto L5f
            goto L6f
        L5f:
            int r0 = r8.intValue()
            r1 = 422(0x1a6, float:5.91E-43)
            if (r0 != r1) goto L6f
            u6c.a0 r7 = new u6c.a0
            zhm.f0 r8 = zhm.f0.f322471a
            r7.<init>(r4, r8)
            goto L84
        L6f:
            if (r8 == 0) goto L85
            int r8 = r8.intValue()
            r0 = 404(0x194, float:5.66E-43)
            if (r8 != r0) goto L85
            u6c.e0 r7 = new u6c.e0
            u6c.d0 r8 = u6c.d0.PAYMENT_METHOD_NOT_AVAILABLE
            java.util.List r8 = zhm.u.c(r8)
            r7.<init>(r4, r8)
        L84:
            return r7
        L85:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k7c.z.i(u6c.h0, gim.c):java.lang.Object");
    }

    public final void j(q qVar, od0.i iVar, boolean z) {
        PaymentMethod paymentMethod = (PaymentMethod) iVar.f224257a;
        ne0.j jVar = this.f182026b;
        if (paymentMethod != null) {
            String strH = h(qVar.f181991b, qVar.f181992c, qVar.d, qVar.e);
            v7c.b bVar = (v7c.b) jVar.get(strH);
            if (bVar != null) {
                ArrayList arrayListF1 = zhm.d0.f1(bVar.f286584a);
                Iterator it8 = arrayListF1.iterator();
                int i = 0;
                while (true) {
                    if (!it8.hasNext()) {
                        i = -1;
                        break;
                    } else if (Intrinsics.f(((PaymentMethod) it8.next()).getF84393a(), paymentMethod.getF84393a())) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    arrayListF1.set(i, paymentMethod);
                } else {
                    arrayListF1.add(0, paymentMethod);
                }
                jVar.f(strH, v7c.b.a(bVar, arrayListF1, null, null, 6));
                x4l.c.a(this.f182028g, new jck.y(z, 12));
            }
        }
        jVar.f("PAYMENT_METHOD_OPTIONAL_CACHE_PREFIX_" + qVar.f181990a, iVar);
    }
}
