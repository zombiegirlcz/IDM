package bn2;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class g0 extends gim.i implements oim.n {
    public /* synthetic */ Map u;
    public /* synthetic */ Map v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ wi0.b f17011w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17012x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j0 f17013y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ArrayList arrayList, j0 j0Var, Continuation continuation) {
        super(4, continuation);
        this.f17012x = arrayList;
        this.f17013y = j0Var;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        g0 g0Var = new g0(this.f17012x, this.f17013y, (Continuation) obj5);
        g0Var.u = (Map) obj2;
        g0Var.v = (Map) obj3;
        g0Var.f17011w = (wi0.b) obj4;
        return g0Var.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.util.Map r0 = r9.u
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r1 = r9.v
            java.util.Map r1 = (java.util.Map) r1
            wi0.b r2 = r9.f17011w
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r3 = r9.f17012x
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L84
            java.lang.Object r4 = r3.next()
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r4 = (com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration) r4
            vjg.d r5 = r4.P7()
            r6 = 0
            if (r5 == 0) goto L3f
            if (r2 == 0) goto L7e
            vjg.c r5 = (vjg.c) r5
            java.lang.String r7 = "countryCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            java.util.List r5 = r5.f289740a
            boolean r5 = r5.contains(r2)
            if (r5 != 0) goto L3f
            goto L7e
        L3f:
            vjg.e r5 = r4.getD()
            r7 = -1
            if (r5 != 0) goto L48
            r5 = r7
            goto L50
        L48:
            int[] r8 = bn2.f0.f17009a
            int r5 = r5.ordinal()
            r5 = r8[r5]
        L50:
            if (r5 == r7) goto L74
            r7 = 1
            if (r5 == r7) goto L69
            r7 = 2
            if (r5 != r7) goto L63
            java.lang.String r5 = r4.getF94454a()
            java.lang.Object r5 = r1.get(r5)
            com.revolut.feature.backgroundpicker.impl.model.UiAssetLockState r5 = (com.revolut.feature.backgroundpicker.impl.model.UiAssetLockState) r5
            goto L76
        L63:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L69:
            java.lang.String r5 = r4.getF94454a()
            java.lang.Object r5 = r0.get(r5)
            com.revolut.feature.backgroundpicker.impl.model.UiAssetLockState r5 = (com.revolut.feature.backgroundpicker.impl.model.UiAssetLockState) r5
            goto L76
        L74:
            com.revolut.feature.backgroundpicker.impl.model.UiAssetLockState$Available r5 = com.revolut.feature.backgroundpicker.impl.model.UiAssetLockState.Available.f63805a
        L76:
            if (r5 != 0) goto L79
            goto L7e
        L79:
            com.revolut.feature.backgroundpicker.impl.interactor.ThemesInteractor$Theme r6 = new com.revolut.feature.backgroundpicker.impl.interactor.ThemesInteractor$Theme
            r6.<init>(r4, r5)
        L7e:
            if (r6 == 0) goto L1a
            r10.add(r6)
            goto L1a
        L84:
            bn2.i0 r0 = new bn2.i0
            r0.<init>()
            a9j.f r1 = new a9j.f
            r2 = 7
            r1.<init>(r0, r2)
            a9j.f r0 = new a9j.f
            r2 = 8
            r0.<init>(r1, r2)
            java.util.List r10 = zhm.d0.P0(r10, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bn2.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
