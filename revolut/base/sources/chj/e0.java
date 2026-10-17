package chj;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e0 implements nii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f24245b;

    public /* synthetic */ e0(u0 u0Var, int i) {
        this.f24244a = i;
        this.f24245b = u0Var;
    }

    @Override // nii.p1
    public final nii.m0 a(Object obj2) {
        int i = this.f24244a;
        u0 u0Var = this.f24245b;
        Throwable th10 = (Throwable) obj2;
        switch (i) {
            case 0:
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "EsimSubscriptionPurchaseControllerModelExtensionImpl", null, th10, h0Var);
                break;
            case 1:
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "EsimSubscriptionPurchaseControllerModelExtensionImpl", null, th10, h0Var2);
                break;
            case 2:
                zhm.h0 h0Var3 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "EsimSubscriptionPurchaseControllerModelExtensionImpl", null, th10, h0Var3);
                break;
            default:
                zhm.h0 h0Var4 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "EsimSubscriptionPurchaseControllerModelExtensionImpl", null, th10, h0Var4);
                break;
        }
        return u0.g3(u0Var, th10);
    }
}
