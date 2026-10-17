package wf0;

import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;
import xnd.a1;

/* JADX INFO: loaded from: classes19.dex */
public final class f0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f296883w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f296884x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f296885y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i, Object obj2, String str, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f296885y = obj2;
        this.v = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                f0 f0Var = new f0((g0) this.f296885y, (Continuation) obj4, 0);
                f0Var.z = (d0) obj3;
                return f0Var.invokeSuspend(Unit.f186387a);
            case 1:
                f0 f0Var2 = new f0((g0) this.f296885y, (Continuation) obj4, 1);
                f0Var2.z = (e0) obj3;
                return f0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                f0 f0Var3 = new f0((Continuation) obj4, (wuk.y) this.z);
                f0Var3.v = (FlowCollector) obj2;
                f0Var3.f296883w = obj3;
                return f0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                int i = 3;
                f0 f0Var4 = new f0(i, (com.revolut.feature.statements.impl.ui.account.a) this.f296885y, (String) this.v, (Continuation) obj4);
                f0Var4.f296883w = (FlowCollector) obj2;
                f0Var4.z = obj3;
                return f0Var4.invokeSuspend(Unit.f186387a);
            case 4:
                f0 f0Var5 = new f0((Continuation) obj4, (com.revolut.feature.defi.accounts.impl.ui.extension.a) this.z, (xi0.b) this.f296885y, 4);
                f0Var5.v = (FlowCollector) obj2;
                f0Var5.f296883w = obj3;
                return f0Var5.invokeSuspend(Unit.f186387a);
            case 5:
                int i2 = 5;
                f0 f0Var6 = new f0(i2, (x5f.k) this.f296885y, (String) this.v, (Continuation) obj4);
                f0Var6.f296883w = (FlowCollector) obj2;
                f0Var6.z = obj3;
                return f0Var6.invokeSuspend(Unit.f186387a);
            case 6:
                f0 f0Var7 = new f0((Continuation) obj4, (dj0.d) this.z, (smd.s) this.f296885y, 6);
                f0Var7.v = (FlowCollector) obj2;
                f0Var7.f296883w = obj3;
                return f0Var7.invokeSuspend(Unit.f186387a);
            case 7:
                f0 f0Var8 = new f0((Continuation) obj4, (x8h.y) this.z, (Ref$ObjectRef) this.f296885y, 7);
                f0Var8.v = (FlowCollector) obj2;
                f0Var8.f296883w = obj3;
                return f0Var8.invokeSuspend(Unit.f186387a);
            case 8:
                f0 f0Var9 = new f0((Continuation) obj4, (x8h.n0) this.z, (TradingAccountType) this.f296885y, 8);
                f0Var9.v = (FlowCollector) obj2;
                f0Var9.f296883w = obj3;
                return f0Var9.invokeSuspend(Unit.f186387a);
            case 9:
                f0 f0Var10 = new f0((Continuation) obj4, (a1) this.z, (xnd.u0) this.f296885y, 9);
                f0Var10.v = (FlowCollector) obj2;
                f0Var10.f296883w = obj3;
                return f0Var10.invokeSuspend(Unit.f186387a);
            case 10:
                f0 f0Var11 = new f0((Continuation) obj4, (y3f.v) this.z, (vy5.d0) this.f296885y, 10);
                f0Var11.v = (FlowCollector) obj2;
                f0Var11.f296883w = obj3;
                return f0Var11.invokeSuspend(Unit.f186387a);
            case 11:
                f0 f0Var12 = new f0((Continuation) obj4, (ybb.d) this.z, (xi0.b) this.f296885y, 11);
                f0Var12.v = (FlowCollector) obj2;
                f0Var12.f296883w = obj3;
                return f0Var12.invokeSuspend(Unit.f186387a);
            case 12:
                f0 f0Var13 = new f0((Continuation) obj4, (com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b) this.z, (FavouritesAssetTypeKey) this.f296885y, 12);
                f0Var13.v = (FlowCollector) obj2;
                f0Var13.f296883w = obj3;
                return f0Var13.invokeSuspend(Unit.f186387a);
            case 13:
                f0 f0Var14 = new f0((Continuation) obj4, (yic.x) this.z, (w4l.k) this.f296885y, 13);
                f0Var14.v = (FlowCollector) obj2;
                f0Var14.f296883w = obj3;
                return f0Var14.invokeSuspend(Unit.f186387a);
            case 14:
                f0 f0Var15 = new f0((Continuation) obj4, (yud.g) this.z, (xi0.b) this.f296885y, 14);
                f0Var15.v = (FlowCollector) obj2;
                f0Var15.f296883w = obj3;
                return f0Var15.invokeSuspend(Unit.f186387a);
            case 15:
                f0 f0Var16 = new f0((Continuation) obj4, (z6e.f) this.z, (ProductAccountId) this.f296885y, 15);
                f0Var16.v = (FlowCollector) obj2;
                f0Var16.f296883w = obj3;
                return f0Var16.invokeSuspend(Unit.f186387a);
            case 16:
                f0 f0Var17 = new f0((Continuation) obj4, (z6e.n) this.z, (ProductAccountId) this.f296885y, 16);
                f0Var17.v = (FlowCollector) obj2;
                f0Var17.f296883w = obj3;
                return f0Var17.invokeSuspend(Unit.f186387a);
            case 17:
                f0 f0Var18 = new f0((Continuation) obj4, (zge.i) this.z, (oge.a) this.f296885y, 17);
                f0Var18.v = (FlowCollector) obj2;
                f0Var18.f296883w = obj3;
                return f0Var18.invokeSuspend(Unit.f186387a);
            case 18:
                f0 f0Var19 = new f0((Continuation) obj4, (zkb.b) this.z, (SavingsProduct) this.f296885y, 18);
                f0Var19.v = (FlowCollector) obj2;
                f0Var19.f296883w = obj3;
                return f0Var19.invokeSuspend(Unit.f186387a);
            default:
                int i3 = 19;
                f0 f0Var20 = new f0(i3, (com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) this.f296885y, (String) this.v, (Continuation) obj4);
                f0Var20.f296883w = (FlowCollector) obj2;
                f0Var20.z = obj3;
                return f0Var20.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0846 A[LOOP:1: B:328:0x0840->B:330:0x0846, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x08e7 A[LOOP:2: B:350:0x08e1->B:352:0x08e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:382:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wf0.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Continuation continuation, Object obj2, Object obj3, int i) {
        super(3, continuation);
        this.u = i;
        this.z = obj2;
        this.f296885y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Continuation continuation, wuk.y yVar) {
        super(3, continuation);
        this.u = 2;
        this.z = yVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(g0 g0Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f296885y = g0Var;
    }
}
