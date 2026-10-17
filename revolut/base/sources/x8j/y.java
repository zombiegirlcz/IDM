package x8j;

import com.revolut.feature.staking.api.model.StakingAvailability;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class y extends gim.i implements oim.q {
    public final /* synthetic */ g0 A;
    public final /* synthetic */ xi0.b B;
    public /* synthetic */ io3.d u;
    public /* synthetic */ StakingAvailability v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ boolean f303479w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ dj0.d f303480x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ boolean f303481y;
    public /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(g0 g0Var, xi0.b bVar, Continuation continuation) {
        super(7, continuation);
        this.A = g0Var;
        this.B = bVar;
    }

    @Override // oim.q
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj7).booleanValue();
        y yVar = new y(this.A, this.B, (Continuation) obj8);
        yVar.u = (io3.d) obj2;
        yVar.v = (StakingAvailability) obj3;
        yVar.f303479w = zBooleanValue;
        yVar.f303480x = (dj0.d) obj5;
        yVar.f303481y = zBooleanValue2;
        yVar.z = zBooleanValue3;
        return yVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            io3.d r3 = r0.u
            com.revolut.feature.staking.api.model.StakingAvailability r4 = r0.v
            boolean r9 = r0.f303479w
            dj0.d r1 = r0.f303480x
            boolean r10 = r0.f303481y
            boolean r11 = r0.z
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r19)
            r5 = 1
            if (r4 == 0) goto L22
            com.revolut.feature.staking.api.model.StakingProduct r6 = r4.f88058a
            if (r6 == 0) goto L22
            boolean r6 = r6.c()
            if (r6 != r5) goto L22
            r7 = r5
            goto L23
        L22:
            r7 = 0
        L23:
            r12 = 0
            if (r3 == 0) goto L2a
            long r14 = r3.i
            goto L2b
        L2a:
            r14 = r12
        L2b:
            if (r4 == 0) goto L34
            com.revolut.feature.staking.api.model.StakingPocket r8 = r4.f88059b
            if (r8 == 0) goto L34
            dj0.d r8 = r8.f88084g
            goto L35
        L34:
            r8 = 0
        L35:
            dj0.d r8 = pyd.c.M(r8)
            r16 = r3
            long r2 = r8.f115082a
            r8 = r7
            if (r1 == 0) goto L43
            long r6 = r1.f115082a
            goto L44
        L43:
            r6 = r12
        L44:
            long r2 = r2 + r14
            long r2 = r2 + r6
            int r1 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r1 > 0) goto L67
            if (r4 == 0) goto L53
            com.revolut.feature.staking.api.model.StakingPocket r1 = r4.f88059b
            if (r1 == 0) goto L53
            dj0.d r1 = r1.f88084g
            goto L54
        L53:
            r1 = 0
        L54:
            dj0.d r1 = pyd.c.M(r1)
            dj0.d r14 = dj0.d.e
            boolean r1 = r1.f(r14)
            if (r1 != 0) goto L67
            int r1 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r1 <= 0) goto L65
            goto L67
        L65:
            r1 = 0
            goto L68
        L67:
            r1 = r5
        L68:
            int r12 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r12 <= 0) goto L73
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L73
            r12 = r6
            r6 = r5
            goto L75
        L73:
            r12 = r6
            r6 = 0
        L75:
            if (r4 == 0) goto L9b
            com.revolut.feature.staking.api.model.StakingProduct r2 = r4.f88058a
            if (r2 == 0) goto L9b
            boolean r2 = r2.c()
            if (r2 != r5) goto L9b
            com.revolut.feature.staking.api.model.StakingPocket r2 = r4.f88059b
            if (r2 == 0) goto L8a
            dj0.d r2 = r2.f88083c
            r17 = r2
            goto L8c
        L8a:
            r17 = 0
        L8c:
            dj0.d r2 = pyd.c.M(r17)
            dj0.d r3 = dj0.d.e
            boolean r2 = r2.f(r3)
            if (r2 == 0) goto L9b
            r2 = r5
        L99:
            r5 = r1
            goto L9d
        L9b:
            r2 = 0
            goto L99
        L9d:
            x8j.m r1 = new x8j.m
            r7 = r8
            r8 = r2
            xi0.b r2 = r0.B
            r3 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x8j.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
