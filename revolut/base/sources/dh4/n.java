package dh4;

import fy4.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a f114757b;

    public /* synthetic */ n(com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a aVar, int i) {
        this.f114756a = i;
        this.f114757b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f114756a;
        com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a aVar = this.f114757b;
        switch (i) {
            case 0:
                w result = (w) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof fy4.u) {
                    aVar.K2();
                } else {
                    if (!(result instanceof fy4.v)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i2 = jli.h.f175850a;
                }
                return Unit.f186387a;
            default:
                yx4.f result2 = (yx4.f) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (Intrinsics.f(result2, yx4.e.f317551a)) {
                    aVar.K2();
                } else {
                    if (!Intrinsics.f(result2, yx4.d.f317550a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i3 = jli.h.f175850a;
                }
                return Unit.f186387a;
        }
    }
}
