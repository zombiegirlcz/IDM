package x6k;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.money_request.impl.ui_kompot.action_dialog.a f303115b;

    public /* synthetic */ d(com.revolut.retail.feature.payments.money_request.impl.ui_kompot.action_dialog.a aVar, int i) {
        this.f303114a = i;
        this.f303115b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f303114a) {
            case 0:
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof dii.f;
                com.revolut.retail.feature.payments.money_request.impl.ui_kompot.action_dialog.a aVar = this.f303115b;
                if (z) {
                    int i = e.f303116a[aVar.o.f79600b.ordinal()];
                    if (i == 1) {
                        f fVar = new f(aVar, null, 0);
                        aVar.l2(new wih.c(aVar, "handleCancelConfirmed", fVar, (Continuation) null), new d(aVar, 1));
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f fVar2 = new f(aVar, null, 1);
                        aVar.l2(new wih.c(aVar, "handleDeclineConfirmed", fVar2, (Continuation) null), new d(aVar, 1));
                    }
                } else {
                    h.D2(aVar.f102144r);
                }
                return Unit.f186387a;
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f303115b.C2(yv9.c.f317152a);
                return Boolean.FALSE;
        }
    }
}
