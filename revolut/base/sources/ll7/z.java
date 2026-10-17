package ll7;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f196666w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f196667x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f196668y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e0 e0Var, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f196666w = e0Var;
        this.f196667x = str;
        this.f196668y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.f196666w, this.f196668y, continuation);
            default:
                return new z(this.f196666w, this.f196667x, this.f196668y, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((z) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            int r0 = r8.u
            java.lang.String r1 = r8.f196668y
            ll7.e0 r2 = r8.f196666w
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            switch(r0) {
                case 0: goto L4e;
                default: goto Lc;
            }
        Lc:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r5 = r8.v
            if (r5 == 0) goto L1e
            if (r5 != r4) goto L18
            yhm.o.b(r9)
            goto L2e
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        L1e:
            yhm.o.b(r9)
            com.revolut.feature.insurance_car.impl.data.network.InsuranceCarService r9 = r2.f196609a
            java.lang.String r2 = r8.f196667x
            r8.v = r4
            java.lang.Object r9 = r9.getDocumentDelivery(r2, r1, r8)
            if (r9 != r0) goto L2e
            goto L4d
        L2e:
            hl7.d2 r9 = (hl7.d2) r9
            java.lang.Object r0 = jl7.i.f175627a
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kl7.h r0 = new kl7.h
            no3.b r1 = r9.f153059a
            com.revolut.feature.address.models.Address r1 = oo3.a.a(r1)
            java.lang.String r9 = r9.f153060b
            java.time.LocalDate r9 = java.time.LocalDate.parse(r9)
            java.lang.String r2 = "parse(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            r0.<init>(r1, r9)
        L4d:
            return r0
        L4e:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r5 = r8.v
            r6 = 3
            r7 = 2
            if (r5 == 0) goto L72
            if (r5 == r4) goto L6e
            if (r5 == r7) goto L68
            if (r5 != r6) goto L62
            java.lang.String r0 = r8.f196667x
            yhm.o.b(r9)
            goto Lc0
        L62:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        L68:
            java.lang.String r1 = r8.f196667x
            yhm.o.b(r9)
            goto L94
        L6e:
            yhm.o.b(r9)
            goto L85
        L72:
            yhm.o.b(r9)
            com.revolut.feature.insurance_car.impl.data.network.InsuranceCarService r9 = r2.f196609a
            hl7.o7 r3 = new hl7.o7
            r3.<init>(r1)
            r8.v = r4
            java.lang.Object r9 = r9.buyPolicy(r3, r8)
            if (r9 != r0) goto L85
            goto Lc0
        L85:
            hl7.r7 r9 = (hl7.r7) r9
            java.lang.String r1 = r9.f153291a
            r8.f196667x = r1
            r8.v = r7
            java.lang.Object r9 = ll7.e0.e(r2, r1, r8)
            if (r9 != r0) goto L94
            goto Lc0
        L94:
            com.revolut.feature.insurance_car.impl.data.model.Policy r9 = (com.revolut.feature.insurance_car.impl.data.model.Policy) r9
            ne0.j r3 = r2.f196610b
            java.lang.String r4 = "POLICIES_KEY"
            java.lang.Object r3 = r3.get(r4)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto La6
            java.util.ArrayList r3 = r2.g()
        La6:
            if (r3 != 0) goto Laa
            zhm.f0 r3 = zhm.f0.f322471a
        Laa:
            if (r9 == 0) goto Lbf
            java.util.ArrayList r9 = ue0.e.J(r9, r3)
            x4l.c r2 = r2.f
            kotlin.Unit r3 = kotlin.Unit.f186387a
            r8.f196667x = r1
            r8.v = r6
            java.lang.Object r9 = r2.f(r3, r9, r8)
            if (r9 != r0) goto Lbf
            goto Lc0
        Lbf:
            r0 = r1
        Lc0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ll7.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e0 e0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f196666w = e0Var;
        this.f196668y = str;
    }
}
