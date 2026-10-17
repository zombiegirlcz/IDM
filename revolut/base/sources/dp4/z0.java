package dp4;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$State;
import com.revolut.feature.topup_screen.api.model.StoredMethod;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes22.dex */
public final class z0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f116723w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                z0 z0Var = new z0((c1) this.f116723w, (Continuation) obj4, 0);
                z0Var.v = (ll4.u) obj3;
                return z0Var.invokeSuspend(Unit.f186387a);
            case 1:
                z0 z0Var2 = new z0((e1a.f) this.f116723w, (Continuation) obj4, 1);
                z0Var2.v = (List) obj3;
                return z0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                z0 z0Var3 = new z0((e30.e) this.f116723w, (Continuation) obj4, 2);
                z0Var3.v = (v30.e1) obj3;
                return z0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                z0 z0Var4 = new z0((e6d.r) this.f116723w, (Continuation) obj4, 3);
                z0Var4.v = (yvh.i) obj3;
                return z0Var4.invokeSuspend(Unit.f186387a);
            case 4:
                z0 z0Var5 = new z0((e8h.j) this.f116723w, (Continuation) obj4, 4);
                z0Var5.v = (yzg.d) obj3;
                return z0Var5.invokeSuspend(Unit.f186387a);
            case 5:
                z0 z0Var6 = new z0((e8h.p0) this.f116723w, (Continuation) obj4, 5);
                z0Var6.v = (List) obj3;
                return z0Var6.invokeSuspend(Unit.f186387a);
            case 6:
                z0 z0Var7 = new z0((e98.f) this.f116723w, (Continuation) obj4, 6);
                z0Var7.v = (Map) obj3;
                return z0Var7.invokeSuspend(Unit.f186387a);
            case 7:
                z0 z0Var8 = new z0((enb.g) this.f116723w, (Continuation) obj4, 7);
                z0Var8.v = (List) obj3;
                return z0Var8.invokeSuspend(Unit.f186387a);
            case 8:
                z0 z0Var9 = new z0((fa7.e) this.f116723w, (Continuation) obj4, 8);
                z0Var9.v = (Map) obj3;
                return z0Var9.invokeSuspend(Unit.f186387a);
            case 9:
                ((Number) obj3).intValue();
                z0 z0Var10 = new z0((fag.o) this.f116723w, (Continuation) obj4, 9);
                z0Var10.v = (Data) obj2;
                return z0Var10.invokeSuspend(Unit.f186387a);
            case 10:
                z0 z0Var11 = new z0((ff2.c) this.f116723w, (Continuation) obj4, 10);
                z0Var11.v = (df2.o) obj3;
                return z0Var11.invokeSuspend(Unit.f186387a);
            case 11:
                z0 z0Var12 = new z0((ff8.i) this.f116723w, (Continuation) obj4, 11);
                z0Var12.v = (lf8.f) obj3;
                return z0Var12.invokeSuspend(Unit.f186387a);
            case 12:
                z0 z0Var13 = new z0((fla.g) this.f116723w, (Continuation) obj4, 12);
                z0Var13.v = (jla.f) obj3;
                return z0Var13.invokeSuspend(Unit.f186387a);
            case 13:
                z0 z0Var14 = new z0((g11.b) this.f116723w, (Continuation) obj4, 13);
                z0Var14.v = (f11.b) obj3;
                return z0Var14.invokeSuspend(Unit.f186387a);
            case 14:
                z0 z0Var15 = new z0(3, 14, (Continuation) obj4);
                z0Var15.v = (String) obj2;
                z0Var15.f116723w = (cl4.o) obj3;
                return z0Var15.invokeSuspend(Unit.f186387a);
            case 15:
                z0 z0Var16 = new z0(3, 15, (Continuation) obj4);
                z0Var16.v = (List) obj2;
                z0Var16.f116723w = (do3.n) obj3;
                return z0Var16.invokeSuspend(Unit.f186387a);
            case 16:
                z0 z0Var17 = new z0(3, 16, (Continuation) obj4);
                z0Var17.v = obj2;
                z0Var17.f116723w = obj3;
                return z0Var17.invokeSuspend(Unit.f186387a);
            case 17:
                z0 z0Var18 = new z0((com.revolut.feature.onboarding.impl.onboarding.v) this.f116723w, (Continuation) obj4, 17);
                z0Var18.v = (OnboardingFlowContract$State) obj3;
                return z0Var18.invokeSuspend(Unit.f186387a);
            case 18:
                z0 z0Var19 = new z0((gb8.b) this.f116723w, (Continuation) obj4, 18);
                z0Var19.v = (List) obj3;
                return z0Var19.invokeSuspend(Unit.f186387a);
            case 19:
                z0 z0Var20 = new z0((gd3.k) this.f116723w, (Continuation) obj4, 19);
                z0Var20.v = (uc3.f) obj3;
                return z0Var20.invokeSuspend(Unit.f186387a);
            case 20:
                z0 z0Var21 = new z0((gd8.c) this.f116723w, (Continuation) obj4, 20);
                z0Var21.v = (List) obj3;
                return z0Var21.invokeSuspend(Unit.f186387a);
            case 21:
                z0 z0Var22 = new z0((gd8.x) this.f116723w, (Continuation) obj4, 21);
                z0Var22.v = (List) obj3;
                return z0Var22.invokeSuspend(Unit.f186387a);
            case 22:
                z0 z0Var23 = new z0((ghl.e) this.f116723w, (Continuation) obj4, 22);
                z0Var23.v = (List) obj3;
                return z0Var23.invokeSuspend(Unit.f186387a);
            case 23:
                z0 z0Var24 = new z0(3, 23, (Continuation) obj4);
                z0Var24.v = (qua.p) obj2;
                z0Var24.f116723w = (qua.p) obj3;
                return z0Var24.invokeSuspend(Unit.f186387a);
            case 24:
                z0 z0Var25 = new z0(3, 24, (Continuation) obj4);
                z0Var25.v = (do3.n) obj2;
                z0Var25.f116723w = (Data) obj3;
                return z0Var25.invokeSuspend(Unit.f186387a);
            case 25:
                z0 z0Var26 = new z0((h53.c) this.f116723w, (Continuation) obj4, 25);
                z0Var26.v = (List) obj3;
                return z0Var26.invokeSuspend(Unit.f186387a);
            case 26:
                z0 z0Var27 = new z0((h59.c) this.f116723w, (Continuation) obj4, 26);
                z0Var27.v = (b59.d) obj3;
                return z0Var27.invokeSuspend(Unit.f186387a);
            case 27:
                z0 z0Var28 = new z0((hng.b) this.f116723w, (Continuation) obj4, 27);
                z0Var28.v = (od0.i) obj3;
                return z0Var28.invokeSuspend(Unit.f186387a);
            case 28:
                z0 z0Var29 = new z0((hp5.o) this.f116723w, (Continuation) obj4, 28);
                z0Var29.v = (CryptoAddress) obj3;
                return z0Var29.invokeSuspend(Unit.f186387a);
            default:
                z0 z0Var30 = new z0((hve.o) this.f116723w, (Continuation) obj4, 29);
                z0Var30.v = (StoredMethod) obj3;
                return z0Var30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0623  */
    /* JADX WARN: Type inference failed for: r3v74, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r57) {
        /*
            Method dump skipped, instruction units count: 2784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dp4.z0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f116723w = obj2;
    }
}
