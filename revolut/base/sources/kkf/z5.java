package kkf;

import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.insurance_car.impl.data.model.DocumentFile;
import com.revolut.feature.insurance_car.impl.data.model.DocumentFilesGroup;
import com.revolut.feature.insurance_car.impl.data.model.MtaAvailabilityContainer;
import com.revolut.feature.insurance_car.impl.data.model.MtaAvailabilityItem;
import com.revolut.feature.insurance_car.impl.data.model.PendingMta;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreen;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class z5 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185053a;

    public /* synthetic */ z5(int i) {
        this.f185053a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f185053a) {
            case 0:
                return zhm.f0.f322471a;
            case 1:
                return zhm.f0.f322471a;
            case 2:
                return zhm.f0.f322471a;
            case 3:
                return zhm.f0.f322471a;
            case 4:
                return zhm.f0.f322471a;
            case 5:
                return zhm.f0.f322471a;
            case 6:
                return zhm.f0.f322471a;
            case 7:
                return zhm.f0.f322471a;
            case 8:
                return zhm.f0.f322471a;
            case 9:
                return zhm.f0.f322471a;
            case 10:
                return zhm.f0.f322471a;
            case 11:
                return zhm.f0.f322471a;
            case 12:
                return zhm.f0.f322471a;
            case 13:
                return zhm.f0.f322471a;
            case 14:
                return zhm.f0.f322471a;
            case 15:
                KProperty[] kPropertyArr = EsimMobilePlanMyNumbersScreen.T;
                return new ActionsDelegate();
            case 16:
                KProperty[] kPropertyArr2 = EsimMobilePlanMyNumbersScreen.T;
                return new RowDelegate(null, null, 7);
            case 17:
                KProperty[] kPropertyArr3 = EsimMobilePlanMyNumbersScreen.T;
                return new FullScreenStateDelegate();
            case 18:
                DocumentFile.b bVar = DocumentFile.Companion;
                return kl7.r0.Companion.serializer();
            case 19:
                DocumentFilesGroup.b bVar2 = DocumentFilesGroup.Companion;
                return new qlm.e(DocumentFile.a.f75208a);
            case 20:
                return qlm.j1.b("com.revolut.feature.insurance_car.impl.data.model.DriverValidationResult.Status", kl7.q.values());
            case 21:
                return qlm.j1.b("com.revolut.feature.insurance_car.impl.data.model.DriverValidationStatusResponse.Status", kl7.u.values());
            case 22:
                return new qlm.e(kl7.o.f185367a);
            case 23:
                return qlm.j1.b("com.revolut.feature.insurance_car.impl.data.model.DriverValidationSummary.DriverType", kl7.y.values());
            case 24:
                return qlm.j1.b("com.revolut.feature.insurance_car.impl.data.model.DriverValidationSummary.ExpectedNumberType", kl7.z.values());
            case 25:
                return new qlm.e(kl7.i.f185336a);
            case 26:
                return new qlm.e(kl7.w.f185401a);
            case 27:
                return qlm.j1.b("com.revolut.feature.insurance_car.impl.data.model.FileType", kl7.r0.values());
            case 28:
                MtaAvailabilityContainer.Companion bVar3 = MtaAvailabilityContainer.INSTANCE;
                return new qlm.e(MtaAvailabilityItem.a.f75243a);
            default:
                MtaAvailabilityContainer.Companion bVar4 = MtaAvailabilityContainer.INSTANCE;
                return new qlm.e(PendingMta.a.f75282a);
        }
    }
}
