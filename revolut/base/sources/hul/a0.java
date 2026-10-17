package hul;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.review.o f155707w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar, Continuation continuation) {
        super(2, continuation);
        this.u = 9;
        this.f155707w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(this.f155707w, continuation, 0);
                a0Var.v = obj2;
                return a0Var;
            case 1:
                a0 a0Var2 = new a0(this.f155707w, continuation, 1);
                a0Var2.v = obj2;
                return a0Var2;
            case 2:
                a0 a0Var3 = new a0(this.f155707w, continuation, 2);
                a0Var3.v = obj2;
                return a0Var3;
            case 3:
                a0 a0Var4 = new a0(this.f155707w, continuation, 3);
                a0Var4.v = obj2;
                return a0Var4;
            case 4:
                a0 a0Var5 = new a0(this.f155707w, continuation, 4);
                a0Var5.v = obj2;
                return a0Var5;
            case 5:
                a0 a0Var6 = new a0(this.f155707w, continuation, 5);
                a0Var6.v = obj2;
                return a0Var6;
            case 6:
                a0 a0Var7 = new a0(this.f155707w, continuation, 6);
                a0Var7.v = obj2;
                return a0Var7;
            case 7:
                a0 a0Var8 = new a0(this.f155707w, continuation, 7);
                a0Var8.v = obj2;
                return a0Var8;
            case 8:
                a0 a0Var9 = new a0(this.f155707w, continuation, 8);
                a0Var9.v = obj2;
                return a0Var9;
            case 9:
                a0 a0Var10 = new a0(this.f155707w, continuation);
                a0Var10.v = obj2;
                return a0Var10;
            case 10:
                a0 a0Var11 = new a0(this.f155707w, continuation, 10);
                a0Var11.v = obj2;
                return a0Var11;
            case 11:
                a0 a0Var12 = new a0(this.f155707w, continuation, 11);
                a0Var12.v = obj2;
                return a0Var12;
            case 12:
                a0 a0Var13 = new a0(this.f155707w, continuation, 12);
                a0Var13.v = obj2;
                return a0Var13;
            case 13:
                a0 a0Var14 = new a0(this.f155707w, continuation, 13);
                a0Var14.v = obj2;
                return a0Var14;
            case 14:
                a0 a0Var15 = new a0(this.f155707w, continuation, 14);
                a0Var15.v = obj2;
                return a0Var15;
            case 15:
                a0 a0Var16 = new a0(this.f155707w, continuation, 15);
                a0Var16.v = obj2;
                return a0Var16;
            case 16:
                a0 a0Var17 = new a0(this.f155707w, continuation, 16);
                a0Var17.v = obj2;
                return a0Var17;
            case 17:
                a0 a0Var18 = new a0(this.f155707w, continuation, 17);
                a0Var18.v = obj2;
                return a0Var18;
            default:
                a0 a0Var19 = new a0(this.f155707w, continuation, 18);
                a0Var19.v = obj2;
                return a0Var19;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((a0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0311  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hul.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f155707w = oVar;
    }
}
