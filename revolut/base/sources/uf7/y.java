package uf7;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f279626b;

    public /* synthetic */ y(f0 f0Var, int i) {
        this.f279625a = i;
        this.f279626b = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f279625a;
        f0 f0Var = this.f279626b;
        switch (i) {
            case 0:
                hf7.c details = (hf7.c) obj2;
                Intrinsics.checkNotNullParameter(details, "details");
                return new tse.c(f0Var.f279600p.a(details.f151767b), details, 15);
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, j6.a.q("IncentiveRewardDetails opt-out error id=", f0Var.v.f74866a.f74850a), it8, h0Var);
                f0Var.f279602r.getClass();
                yji.l.b1(f0Var, f0Var.X1(new y0("ERROR_DIALOG_ID", sf7.a.a(), false, 4)), null, new e0(f0Var, null, 0), 3);
                return Boolean.TRUE;
        }
    }
}
