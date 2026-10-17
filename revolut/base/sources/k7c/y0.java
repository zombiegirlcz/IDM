package k7c;

import com.revolut.feature.revolutpay.impl.data.service.RevolutPayService;
import com.revolut.feature.revolutpay.shipping.api.domain.models.deliverymethod.DeliveryMethods;
import ip0.v7;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a1;

/* JADX INFO: loaded from: classes6.dex */
public final class y0 {

    @NotNull
    public static final s0 Companion = new s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPayService f182022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f182023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f182024c;
    public final x4l.c d;
    public final x4l.c e;
    public final x4l.c f;

    public y0(RevolutPayService revolutPayService, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(revolutPayService, "revolutPayService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f182022a = revolutPayService;
        this.f182023b = memoryCache;
        this.f182024c = storage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new k3c.k(this, continuation, 1), new Function1(this) { // from class: k7c.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0 f181994b;

            {
                this.f181994b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (nec.c) this.f181994b.f182023b.get("WRAPPED_SHIPPING_CONTACTS_LIST_MEMORY_CACHE_ID");
                    default:
                        u0 params = (u0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (DeliveryMethods) this.f181994b.f182023b.get("DELIVERY_METHODS_MEMORY_CACHE_ID_" + params.f182008a + "_" + params.f182009b);
                }
            }
        }, new Function2(this) { // from class: k7c.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0 f181998b;

            {
                this.f181998b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        nec.c value = (nec.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f181998b.f182023b.f("WRAPPED_SHIPPING_CONTACTS_LIST_MEMORY_CACHE_ID", value);
                        break;
                    default:
                        u0 params = (u0) obj2;
                        DeliveryMethods value2 = (DeliveryMethods) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        String str = params.f182008a;
                        String str2 = params.f182009b;
                        boolean z = value2.f84734a;
                        ne0.j jVar = this.f181998b.f182023b;
                        Set set = (Set) v7.r("SHIPPING_INVALID_CACHE_ID_", str, jVar);
                        if (set == null) {
                            set = zhm.h0.f322473a;
                        }
                        jVar.f(j6.a.q("SHIPPING_INVALID_CACHE_ID_", str), z ? a1.j(set, str2) : a1.m(set, str2));
                        jVar.f(a0.d.s("DELIVERY_METHODS_MEMORY_CACHE_ID_", params.f182008a, "_", str2), value2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new k22.c(this, continuation, 10), new hwi.b(this, continuation, 19));
        final int i2 = 1;
        int i3 = 2;
        int i5 = 3;
        this.e = new x4l.c(new x(this, continuation, 5), new Function1(this) { // from class: k7c.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0 f181994b;

            {
                this.f181994b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (nec.c) this.f181994b.f182023b.get("WRAPPED_SHIPPING_CONTACTS_LIST_MEMORY_CACHE_ID");
                    default:
                        u0 params = (u0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (DeliveryMethods) this.f181994b.f182023b.get("DELIVERY_METHODS_MEMORY_CACHE_ID_" + params.f182008a + "_" + params.f182009b);
                }
            }
        }, new Function2(this) { // from class: k7c.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0 f181998b;

            {
                this.f181998b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        nec.c value = (nec.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f181998b.f182023b.f("WRAPPED_SHIPPING_CONTACTS_LIST_MEMORY_CACHE_ID", value);
                        break;
                    default:
                        u0 params = (u0) obj2;
                        DeliveryMethods value2 = (DeliveryMethods) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        String str = params.f182008a;
                        String str2 = params.f182009b;
                        boolean z = value2.f84734a;
                        ne0.j jVar = this.f181998b.f182023b;
                        Set set = (Set) v7.r("SHIPPING_INVALID_CACHE_ID_", str, jVar);
                        if (set == null) {
                            set = zhm.h0.f322473a;
                        }
                        jVar.f(j6.a.q("SHIPPING_INVALID_CACHE_ID_", str), z ? a1.j(set, str2) : a1.m(set, str2));
                        jVar.f(a0.d.s("DELIVERY_METHODS_MEMORY_CACHE_ID_", params.f182008a, "_", str2), value2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new iz1.g(i3, 15, continuation), new k3c.l(i5, 8, continuation));
        this.f = new x4l.c(new x(this, continuation, 6), new d(7), new k1f.n(26), new iz1.g(i3, 16, continuation), new k3c.l(i5, 9, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(k7c.y0 r8, com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof k7c.w0
            if (r0 == 0) goto L13
            r0 = r10
            k7c.w0 r0 = (k7c.w0) r0
            int r1 = r0.f182015x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f182015x = r1
            goto L18
        L13:
            k7c.w0 r0 = new k7c.w0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f182015x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact r9 = r0.u
            yhm.o.b(r10)
            goto L5b
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            yhm.o.b(r10)
            com.revolut.feature.revolutpay.impl.data.service.RevolutPayService r10 = r8.f182022a
            java.lang.String r2 = r9.f84740a
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            e7c.k0 r4 = new e7c.k0
            java.lang.String r5 = r9.f84740a
            com.revolut.feature.address.models.Address r6 = r9.f84741b
            no3.b r6 = oo3.a.d(r6)
            nec.a r7 = r9.f84742c
            java.lang.String r7 = r7.name()
            r4.<init>(r5, r7, r6)
            r0.u = r9
            r0.f182015x = r3
            java.lang.Object r10 = r10.updateShippingContact(r2, r4, r0)
            if (r10 != r1) goto L5b
            return r1
        L5b:
            x4l.c r10 = r8.d
            kotlin.Unit r0 = kotlin.Unit.f186387a
            java.lang.String r1 = "WRAPPED_SHIPPING_CONTACTS_LIST_MEMORY_CACHE_ID"
            ne0.j r8 = r8.f182023b
            java.lang.Object r8 = r8.get(r1)
            if (r8 == 0) goto Lae
            nec.c r8 = (nec.c) r8
            java.lang.String r1 = "$this$updateMemoryCacheIfPresent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.util.List r1 = r8.f214428a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = zhm.w.t(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L83:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto La5
            java.lang.Object r3 = r1.next()
            java.lang.String r4 = r9.f84740a
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r4)
            r5 = r3
            com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact r5 = (com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact) r5
            java.lang.String r5 = r5.f84740a
            java.lang.String r6 = r9.f84740a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r4 != r5) goto La1
            r3 = r9
        La1:
            r2.add(r3)
            goto L83
        La5:
            r9 = 2
            r1 = 0
            nec.c r8 = nec.c.a(r8, r2, r1, r9)
            r10.g(r0, r8)
        Lae:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k7c.y0.a(k7c.y0, com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact, gim.c):java.lang.Object");
    }
}
