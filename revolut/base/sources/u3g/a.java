package u3g;

import com.revolut.feature.travel.experiences.impl.ui.screen.voucher.TravelExperiencesBookingVoucherScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.voucher.TravelExperiencesBookingVoucherScreenContract$InputData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276930a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TravelExperiencesBookingVoucherScreen f276931b;

    public /* synthetic */ a(TravelExperiencesBookingVoucherScreen travelExperiencesBookingVoucherScreen) {
        this.f276931b = travelExperiencesBookingVoucherScreen;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f276930a;
        TravelExperiencesBookingVoucherScreen travelExperiencesBookingVoucherScreen = this.f276931b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = TravelExperiencesBookingVoucherScreen.R;
                qji.b bVarQ2 = travelExperiencesBookingVoucherScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.voucher.di.TravelExperiencesBookingVoucherScreenInjector");
                z0g.d dVar = new z0g.d();
                int i2 = 6;
                dVar.f318339a = e4m.b.b(new yxj.c(dVar, 1, i2));
                dVar.f318340b = e4m.b.b(new yxj.c(dVar, 0, i2));
                return dVar;
            default:
                KProperty[] kPropertyArr2 = TravelExperiencesBookingVoucherScreen.R;
                return (d) ((z0g.d) travelExperiencesBookingVoucherScreen.P.getValue()).f318340b.get();
        }
    }

    public /* synthetic */ a(TravelExperiencesBookingVoucherScreen travelExperiencesBookingVoucherScreen, TravelExperiencesBookingVoucherScreenContract$InputData travelExperiencesBookingVoucherScreenContract$InputData) {
        this.f276931b = travelExperiencesBookingVoucherScreen;
    }
}
