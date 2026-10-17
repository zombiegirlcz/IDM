package xxh;

import java.util.concurrent.CopyOnWriteArrayList;
import nii.m0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements nii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f309529b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f309528a = i;
        this.f309529b = obj2;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        int i = this.f309528a;
        Object obj3 = this.f309529b;
        switch (i) {
            case 0:
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, "Failed to cancel order.", (Throwable) obj2, h0Var);
                ((e) obj3).f309531p.getClass();
                break;
            case 1:
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, "Failed to cancel order.", (Throwable) obj2, h0Var2);
                ((yxh.e) obj3).f317699p.getClass();
                break;
            case 2:
                ((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep.a) obj3).f103188q.getClass();
                break;
            case 3:
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, (Throwable) obj2, h0Var3);
                ((com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a) obj3).f69379t.getClass();
                break;
            case 4:
                h0 h0Var4 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, (Throwable) obj2, h0Var4);
                ((com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a) obj3).f69501q.getClass();
                break;
            default:
                h0 h0Var5 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, (Throwable) obj2, h0Var5);
                ((com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a) obj3).f69548q.getClass();
                break;
        }
        return vt4.b.a();
    }
}
