package c5a;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class o0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ RowDelegate.Model v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f f21518w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(RowDelegate.Model model, com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar, Continuation continuation) {
        super(1, continuation);
        this.v = model;
        this.f21518w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o0(this.v, this.f21518w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f.I2(r4, (jq9.k) r1, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r7 == r0) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            r2 = 2
            r3 = 1
            com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f r4 = r6.f21518w
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r7)
            goto L48
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            goto L34
        L1e:
            yhm.o.b(r7)
            com.revolut.core.ui_kit.delegates.RowDelegate$Model r7 = r6.v
            java.lang.Object r1 = r7.u
            boolean r5 = r1 instanceof jq9.k
            if (r5 == 0) goto L37
            jq9.k r1 = (jq9.k) r1
            r6.u = r3
            java.lang.Object r7 = com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f.I2(r4, r1, r6)
            if (r7 != r0) goto L34
            goto L47
        L34:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L37:
            boolean r3 = r1 instanceof zm3.i
            if (r3 == 0) goto L54
            h3a.l r7 = r4.f80175s
            zm3.a r1 = (zm3.a) r1
            r6.u = r2
            java.lang.Object r7 = r7.e(r1, r6)
            if (r7 != r0) goto L48
        L47:
            return r0
        L48:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r7)
            aii.n r7 = r4.C1(r0)
            return r7
        L54:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.f53228a
            java.lang.String r1 = "Unknown Row Click action: "
            java.lang.String r7 = j6.a.q(r1, r7)
            r0.<init>(r7)
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r0, r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c5a.o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
