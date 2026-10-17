package bd2;

import com.revolut.feature.apm.services.ideal.api.navigation.IDealFeatureConfig;
import com.revolut.feature.apm.services.ideal.api.navigation.IDealFlowDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
import te0.w;
import ufm.i;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f14515b;

    public /* synthetic */ a(e eVar, int i) {
        this.f14514a = i;
        this.f14515b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f14514a) {
            case 0:
                Response response = (Response) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                int iCode = response.code();
                e eVar = this.f14515b;
                IDealFlowDestination.StartType.PaymentConfirmedDesktop paymentConfirmedDesktop = IDealFlowDestination.StartType.PaymentConfirmedDesktop.f62832a;
                if (iCode != 302) {
                    eVar.getClass();
                    return e.a(paymentConfirmedDesktop);
                }
                String strA = response.headers().a("location");
                if (strA != null && ((s06.c) eVar.f14521b).c(strA)) {
                    i iVar = new i(w.i0(eVar.f14520a.getUserRegistered()), new bce.e(new b(strA, 0), 6), 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    return iVar;
                }
                if (strA == null) {
                    eVar.getClass();
                    return e.a(paymentConfirmedDesktop);
                }
                IDealFlowDestination.StartType.PaymentConfirmedMobile paymentConfirmedMobile = new IDealFlowDestination.StartType.PaymentConfirmedMobile(strA);
                eVar.getClass();
                return e.a(paymentConfirmedMobile);
            case 1:
                cd2.d dto = (cd2.d) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                if (!dto.getIsRegistered()) {
                    ufm.b bVarM = d0.m(new FeatureCommand(new IDealFeatureConfig(new IDealFlowDestination(IDealFlowDestination.StartType.StartRegistrationFromSettings.f62835a))));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                e eVar2 = this.f14515b;
                i iVar2 = new i(w.i0(eVar2.f14520a.getProfileUrl()), new bce.e(new a(eVar2, 2), 8), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return iVar2;
            default:
                cd2.b it8 = (cd2.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, null, null, ((f80.b) this.f14515b.f14522c).f(it8.getReturnUrl()), 14), null, null, null, 0, null, null, null, null, false, 1022);
        }
    }
}
