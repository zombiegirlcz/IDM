package khj;

import cli.n;
import cli.y;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.impl.ui.screens.device_picker.EsimDevicePickerControllerScreenContract$GiftRecipientData;
import com.revolut.retail.feature.esim.impl.ui.screens.device_picker.EsimDevicePickerControllerScreenContract$InputData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends oki.h implements e {
    public final EsimDevicePickerControllerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f184156p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f184157q;

    public j(EsimDevicePickerControllerScreenContract$InputData inputData, gte.a featureToggleInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f184156p = featureToggleInteractor;
        aim.e eVarB = u.b();
        eVarB.add(new f(inputData.f100963b.size()));
        ArrayList<UserDevice> arrayList = inputData.f100963b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (UserDevice userDevice : arrayList) {
            arrayList2.add(new g(userDevice, userDevice.f71921m));
        }
        eVarB.addAll(arrayList2);
        if (((jte.d) this.f184156p).c(EsimApi$Toggles.EsimGifting.f100175c)) {
            Iterable<EsimDevicePickerControllerScreenContract$GiftRecipientData> iterable = (Iterable) inputData.f100964c;
            ArrayList arrayList3 = new ArrayList(w.t(iterable, 10));
            for (EsimDevicePickerControllerScreenContract$GiftRecipientData esimDevicePickerControllerScreenContract$GiftRecipientData : iterable) {
                arrayList3.add(new h(esimDevicePickerControllerScreenContract$GiftRecipientData.f100960a, esimDevicePickerControllerScreenContract$GiftRecipientData.f100961b));
            }
            eVarB.addAll(arrayList3);
        }
        this.f184157q = mra.d.b(this, new c(u.a(eVarB), this.o.f100962a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f184157q;
    }
}
