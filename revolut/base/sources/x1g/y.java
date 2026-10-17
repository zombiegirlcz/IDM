package x1g;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f302444w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, Continuation continuation, c0 c0Var) {
        super(2, continuation);
        this.u = i;
        this.f302444w = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                y yVar = new y(0, continuation, this.f302444w);
                yVar.v = obj2;
                return yVar;
            case 1:
                y yVar2 = new y(1, continuation, this.f302444w);
                yVar2.v = obj2;
                return yVar2;
            case 2:
                y yVar3 = new y(2, continuation, this.f302444w);
                yVar3.v = obj2;
                return yVar3;
            default:
                y yVar4 = new y(3, continuation, this.f302444w);
                yVar4.v = obj2;
                return yVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((y) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.u
            x1g.c0 r1 = r7.f302444w
            switch(r0) {
                case 0: goto L91;
                case 1: goto L35;
                case 2: goto L1e;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r7.v
            com.revolut.data.model.Data r0 = (com.revolut.data.model.Data) r0
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r8)
            cli.y r8 = r1.I
            x16.h r2 = new x16.h
            r3 = 7
            r2.<init>(r0, r3)
            r1.H2(r8, r2)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L1e:
            java.lang.Object r0 = r7.v
            com.revolut.data.model.Data r0 = (com.revolut.data.model.Data) r0
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r8)
            cli.y r8 = r1.I
            x16.h r2 = new x16.h
            r3 = 6
            r2.<init>(r0, r3)
            r1.H2(r8, r2)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L35:
            java.lang.Object r0 = r7.v
            kotlin.Pair r0 = (kotlin.Pair) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r8)
            java.lang.Object r8 = r0.f186385a
            dj0.d r8 = (dj0.d) r8
            java.lang.Object r0 = r0.f186386b
            com.revolut.data.model.Data r0 = (com.revolut.data.model.Data) r0
            x1g.c0 r1 = r7.f302444w
            skm.a2 r2 = r1.G
            r3 = 0
            if (r2 == 0) goto L50
            r2.f(r3)
        L50:
            r1.G = r3
            java.lang.Object r0 = r0.getContent()
            dj0.d r0 = (dj0.d) r0
            if (r0 == 0) goto L82
            xi0.b r0 = r0.f115083b
            xi0.b r2 = r8.f115083b
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
            if (r2 != 0) goto L82
            q7c.m r2 = r1.A
            long r4 = r8.f115082a
            xi0.b r8 = r8.f115083b
            vkm.d r8 = r2.a(r4, r0, r8)
            zfd.e r2 = zi0.c.w(r8)
            x1g.y r5 = new x1g.y
            r8 = 3
            r5.<init>(r8, r3, r1)
            r6 = 3
            r3 = 0
            r4 = 0
            skm.a2 r8 = yji.l.a1(r1, r2, r3, r4, r5, r6)
            r1.G = r8
            goto L8e
        L82:
            cli.y r8 = r1.I
            x1.n r0 = new x1.n
            r2 = 18
            r0.<init>(r2)
            r1.H2(r8, r0)
        L8e:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L91:
            java.lang.Object r0 = r7.v
            com.revolut.data.model.Data r0 = (com.revolut.data.model.Data) r0
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r8)
            cli.y r8 = r1.I
            x16.h r2 = new x16.h
            r3 = 5
            r2.<init>(r0, r3)
            r1.H2(r8, r2)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x1g.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
