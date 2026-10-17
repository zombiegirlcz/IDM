package k3c;

import com.revolut.feature.address.models.Address;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f180667w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Address f180668x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p pVar, String str, Address address, Continuation continuation) {
        super(2, continuation);
        this.v = pVar;
        this.f180667w = str;
        this.f180668x = address;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, this.f180667w, this.f180668x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        if (r2 == r1) goto L18;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.u
            r3 = 2
            r4 = 1
            k3c.p r5 = r0.v
            if (r2 == 0) goto L24
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L16
            yhm.o.b(r19)
            r2 = r19
            goto L79
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1e:
            yhm.o.b(r19)
            r2 = r19
            goto L32
        L24:
            yhm.o.b(r19)
            r0.u = r4
            k3c.e r2 = k3c.p.Companion
            java.lang.Object r2 = r5.c(r0)
            if (r2 != r1) goto L32
            goto L78
        L32:
            d3c.b0 r2 = (d3c.b0) r2
            com.revolut.feature.revolut_shop.data.service.IppShopService r4 = r5.f180680a
            java.lang.String r2 = r2.f110993a
            j3c.d$d r6 = new j3c.d$d
            java.lang.String r7 = "<this>"
            com.revolut.feature.address.models.Address r8 = r0.f180668x
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
            j3c.b r9 = new j3c.b
            java.lang.String r10 = r8.getCity()
            java.lang.String r11 = r8.getCountry()
            java.lang.String r7 = r8.getPostcode()
            if (r7 != 0) goto L53
            java.lang.String r7 = ""
        L53:
            r12 = r7
            java.lang.String r13 = r8.getStreetLine1()
            java.lang.String r14 = r8.getStreetLine2()
            java.lang.String r15 = r8.getRegion()
            java.lang.String r16 = r8.getFullAddress()
            java.lang.String r17 = r8.getNeighborhood()
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r7 = r0.f180667w
            r6.<init>(r7, r9)
            r0.u = r3
            java.lang.Object r2 = r4.checkoutUserCart(r2, r6, r0)
            if (r2 != r1) goto L79
        L78:
            return r1
        L79:
            j3c.e r2 = (j3c.e) r2
            ne0.j r1 = r5.f180681b
            java.lang.String r3 = "USER_CART_MEMORY_KEY"
            r1.remove(r3)
            java.lang.String r1 = r2.getOrderId()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k3c.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
