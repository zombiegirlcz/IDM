package s36;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f259434w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k18.c f259435x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f259436y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k18.c cVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f259435x = cVar;
        this.f259436y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f259435x, this.f259436y, continuation, 0);
                iVar.f259434w = obj2;
                return iVar;
            default:
                i iVar2 = new i(this.f259435x, this.f259436y, continuation, 1);
                iVar2.f259434w = obj2;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.u
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r2 = 0
            k18.c r3 = r9.f259435x
            r4 = 1
            java.lang.String r5 = r9.f259436y
            switch(r0) {
                case 0: goto L76;
                default: goto Ld;
            }
        Ld:
            java.lang.Object r0 = r9.f259434w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r6 = fim.a.COROUTINE_SUSPENDED
            int r7 = r9.v
            r8 = 2
            if (r7 == 0) goto L2a
            if (r7 == r4) goto L26
            if (r7 != r8) goto L20
            yhm.o.b(r10)
            goto L73
        L20:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r1)
            throw r10
        L26:
            yhm.o.b(r10)
            goto L49
        L2a:
            yhm.o.b(r10)
            java.lang.Object r10 = r3.f180140b
            o36.d r10 = (o36.d) r10
            wd6.e r1 = wd6.e.SELL
            r9.f259434w = r0
            r9.v = r4
            nwc.f r4 = new nwc.f
            r7 = 19
            r4.<init>(r10, r1, r2, r7)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r4, r9)
            if (r10 != r6) goto L49
            goto L75
        L49:
            xi0.b r10 = (xi0.b) r10
            if (r10 == 0) goto L60
            java.lang.String r10 = r10.f306286a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r10, r5)
            if (r1 != 0) goto L60
            java.lang.Object r1 = r3.d
            g26.b r1 = (g26.b) r1
            w4l.h r3 = w4l.h.f294642c
            wkm.l r10 = r1.a(r10, r3)
            goto L68
        L60:
            java.lang.Object r10 = r3.d
            g26.b r10 = (g26.b) r10
            wkm.l r10 = g26.b.c(r10, r5)
        L68:
            r9.f259434w = r2
            r9.v = r8
            java.lang.Object r10 = vkm.q.u(r0, r10, r9)
            if (r10 != r6) goto L73
            goto L75
        L73:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L75:
            return r6
        L76:
            java.lang.Object r0 = r9.f259434w
            java.util.List r0 = (java.util.List) r0
            fim.a r6 = fim.a.COROUTINE_SUSPENDED
            int r7 = r9.v
            if (r7 == 0) goto L8c
            if (r7 != r4) goto L86
            yhm.o.b(r10)
            goto L9a
        L86:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r1)
            throw r10
        L8c:
            yhm.o.b(r10)
            r9.f259434w = r2
            r9.v = r4
            java.lang.Object r10 = k18.c.c(r3, r0, r5, r9)
            if (r10 != r6) goto L9a
            goto Lb6
        L9a:
            com.revolut.feature.defi.accounts.api.model.DeFiBalance r10 = (com.revolut.feature.defi.accounts.api.model.DeFiBalance) r10
            if (r10 == 0) goto La3
            go.g r6 = zi0.c.i(r10)
            goto Lb6
        La3:
            java.lang.Object r10 = r3.d
            g26.b r10 = (g26.b) r10
            wkm.l r10 = g26.b.c(r10, r5)
            ryd.i r0 = new ryd.i
            r1 = 20
            r0.<init>(r3, r1)
            akg.n r6 = nim.a.v(r10, r0)
        Lb6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s36.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
