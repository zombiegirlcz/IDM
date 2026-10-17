package c84;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class r extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ a3i.q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f22103w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f22104x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ NaviCommand f22105y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a3i.q qVar, t tVar, String str, NaviCommand naviCommand, Continuation continuation) {
        super(1, continuation);
        this.v = qVar;
        this.f22103w = tVar;
        this.f22104x = str;
        this.f22105y = naviCommand;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r(this.v, this.f22103w, this.f22104x, this.f22105y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r6.a(r5.f22104x, r5) == r0) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.u
            r2 = 2
            r3 = 1
            c84.t r4 = r5.f22103w
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r6)
            goto L3d
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            yhm.o.b(r6)
            goto L2c
        L1e:
            yhm.o.b(r6)
            r5.u = r3
            a3i.q r6 = r5.v
            java.lang.Object r6 = r6.invoke(r5)
            if (r6 != r0) goto L2c
            goto L3c
        L2c:
            e84.e r6 = r4.o
            java.lang.Object r6 = r6.f
            xq3.j r6 = (xq3.j) r6
            r5.u = r2
            java.lang.String r1 = r5.f22104x
            java.lang.Object r6 = r6.a(r1, r5)
            if (r6 != r0) goto L3d
        L3c:
            return r0
        L3d:
            e84.e r6 = r4.o
            java.lang.Object r6 = r6.f123572g
            mri.w r6 = (mri.w) r6
            pw5.a.x(r6)
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FinishCommand r0 = new com.revolut.retail.core.navigation.FinishCommand
            r1 = 7
            r2 = 0
            r0.<init>(r2, r2, r2, r1)
            com.revolut.retail.core.navigation.NaviCommand r1 = r5.f22105y
            com.revolut.retail.core.navigation.CompositeCommand r0 = com.revolut.retail.core.navigation.a.c(r0, r1)
            r6.<init>(r0)
            aii.n r6 = r4.C1(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c84.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
