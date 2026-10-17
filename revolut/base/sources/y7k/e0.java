package y7k;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e0 implements nii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a f311543b;

    public /* synthetic */ e0(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar, int i) {
        this.f311542a = i;
        this.f311543b = aVar;
    }

    @Override // nii.p1
    public final nii.m0 a(Object obj2) {
        int i = this.f311542a;
        com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar = this.f311543b;
        Throwable throwable = (Throwable) obj2;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
                break;
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var2);
                break;
        }
        return ((n8k.g) aVar.f102213w).Z2(throwable);
    }
}
