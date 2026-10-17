package vy5;

import com.revolut.shared.feature.move_money.api.navigation.Action;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.i implements Function1 {
    public Action.MoveMoney u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ gim.i f293207w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f293208x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(Function1 function1, w wVar, Continuation continuation) {
        super(1, continuation);
        this.f293207w = (gim.i) function1;
        this.f293208x = wVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r(this.f293207w, this.f293208x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Type inference failed for: r8v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.v
            r2 = 6
            r3 = 1
            vy5.w r4 = r7.f293208x
            r5 = 2
            r6 = 0
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r5) goto L16
            com.revolut.shared.feature.move_money.api.navigation.Action$MoveMoney r0 = r7.u
            yhm.o.b(r8)
            goto L4f
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            yhm.o.b(r8)
            goto L30
        L22:
            yhm.o.b(r8)
            r7.v = r3
            gim.i r8 = r7.f293207w
            java.lang.Object r8 = r8.invoke(r7)
            if (r8 != r0) goto L30
            goto L4d
        L30:
            com.revolut.shared.feature.move_money.api.navigation.StartUpPocket r8 = (com.revolut.shared.feature.move_money.api.navigation.StartUpPocket) r8
            if (r8 != 0) goto L3c
            java.lang.String r8 = "StartUpPocket is null"
            r6.b.r(r8)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L3c:
            com.revolut.shared.feature.move_money.api.navigation.Action$MoveMoney r1 = new com.revolut.shared.feature.move_money.api.navigation.Action$MoveMoney
            r1.<init>(r8, r6, r2)
            c8i.x r3 = r4.f293237t
            r7.u = r1
            r7.v = r5
            java.lang.Object r8 = r3.a(r8, r7)
            if (r8 != r0) goto L4e
        L4d:
            return r0
        L4e:
            r0 = r1
        L4f:
            w5i.h r8 = (w5i.h) r8
            w5i.f r1 = w5i.f.f295276a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r8, r1)
            if (r1 == 0) goto L67
            com.revolut.feature_move_money.api.navigation.MoveMoneyDestination r8 = new com.revolut.feature_move_money.api.navigation.MoveMoneyDestination
            com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData r1 = new com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData
            r1.<init>(r0, r6, r2)
            r8.<init>(r1, r6)
            r4.A2(r8)
            goto L78
        L67:
            w5i.g r0 = w5i.g.f295277a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r0)
            if (r8 == 0) goto L7b
            com.revolut.feature.add.new_product.api.declaration.AddNewProductDestination r8 = new com.revolut.feature.add.new_product.api.declaration.AddNewProductDestination
            r0 = 3
            r8.<init>(r6, r0)
            r4.A2(r8)
        L78:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L7b:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vy5.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
