package pze;

import e0f.b1;
import e0f.f0;
import kotlin.jvm.internal.Intrinsics;
import nii.m0;
import nii.t1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b f240992b;

    public /* synthetic */ e(com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b bVar, int i) {
        this.f240991a = i;
        this.f240992b = bVar;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        switch (this.f240991a) {
            case 0:
                b1 transactionResult = (b1) obj2;
                Intrinsics.checkNotNullParameter(transactionResult, "transactionResult");
                return this.f240992b.f91012r.c(transactionResult);
            default:
                f0 transactionResult2 = (f0) obj2;
                Intrinsics.checkNotNullParameter(transactionResult2, "transactionResult");
                return this.f240992b.f91013s.b(transactionResult2);
        }
    }
}
