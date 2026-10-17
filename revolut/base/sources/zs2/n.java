package zs2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.business.referrals.ui.screens.invite_contacts.a f324799b;

    public /* synthetic */ n(com.revolut.feature.business.referrals.ui.screens.invite_contacts.a aVar, int i) {
        this.f324798a = i;
        this.f324799b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f324798a;
        com.revolut.feature.business.referrals.ui.screens.invite_contacts.a aVar = this.f324799b;
        switch (i) {
            case 0:
                k update = (k) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return k.a(update, aVar.L2(), null, null, null, 14);
            case 1:
                r7a.i result = (r7a.i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof r7a.h) {
                    aVar.H2(aVar.z, new n(aVar, 2));
                    aVar.M2();
                } else {
                    int i2 = jli.h.f175850a;
                }
                return Unit.f186387a;
            default:
                k update2 = (k) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return k.a(update2, aVar.L2(), null, null, null, 14);
        }
    }
}
