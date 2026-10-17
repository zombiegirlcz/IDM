package hze;

import e0f.b1;
import e0f.f0;
import kotlin.jvm.internal.Intrinsics;
import nii.m0;
import nii.t1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c f157151b;

    public /* synthetic */ d(com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar, int i) {
        this.f157150a = i;
        this.f157151b = cVar;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        switch (this.f157150a) {
            case 0:
                b1 transactionResult = (b1) obj2;
                Intrinsics.checkNotNullParameter(transactionResult, "transactionResult");
                return this.f157151b.u.c(transactionResult);
            case 1:
                f0 transactionResult2 = (f0) obj2;
                Intrinsics.checkNotNullParameter(transactionResult2, "transactionResult");
                return this.f157151b.v.b(transactionResult2);
            case 2:
                f0 transactionResult3 = (f0) obj2;
                Intrinsics.checkNotNullParameter(transactionResult3, "transactionResult");
                return this.f157151b.v.b(transactionResult3);
            default:
                f0 transactionResult4 = (f0) obj2;
                Intrinsics.checkNotNullParameter(transactionResult4, "transactionResult");
                return this.f157151b.v.b(transactionResult4);
        }
    }
}
