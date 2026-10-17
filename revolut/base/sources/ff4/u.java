package ff4;

import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.OfferContentScreenContract$InputData;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f134748b;

    public /* synthetic */ u(b0 b0Var, int i) {
        this.f134747a = i;
        this.f134748b = b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        i update = (i) obj2;
        switch (this.f134747a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return i.a(this.f134748b.K2(), null, null, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                h hVar = i.Companion;
                OfferContentScreenContract$InputData offerContentScreenContract$InputData = this.f134748b.o;
                Long l2 = offerContentScreenContract$InputData.f68079a;
                Long l3 = offerContentScreenContract$InputData.f68080b;
                fu3.a aVar = offerContentScreenContract$InputData.f68081c;
                hVar.getClass();
                return h.a(l2, l3, aVar);
        }
    }
}
