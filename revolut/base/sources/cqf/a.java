package cqf;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.transfer.core.api.ui.additional_information.AdditionalInformationInputData;
import com.revolut.feature.transfer.core.impl.ui.additional_information.AdditionalInformationScreen;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import lpf.n;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108087a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdditionalInformationScreen f108088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdditionalInformationInputData f108089c;

    public /* synthetic */ a(AdditionalInformationInputData additionalInformationInputData, AdditionalInformationScreen additionalInformationScreen) {
        this.f108089c = additionalInformationInputData;
        this.f108088b = additionalInformationScreen;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f108087a;
        AdditionalInformationInputData additionalInformationInputData = this.f108089c;
        AdditionalInformationScreen additionalInformationScreen = this.f108088b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = AdditionalInformationScreen.f92183b0;
                return new InputTextDelegate(new a8a.a(additionalInformationInputData, additionalInformationScreen, 15));
            default:
                KProperty[] kPropertyArr2 = AdditionalInformationScreen.f92183b0;
                phm.a aVar = (phm.a) ue0.e.j(additionalInformationScreen.m2()).a().get(wof.a.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 != null) {
                    return (n) ((dqf.a) ((dqf.b) aVar2.b()).A().S(additionalInformationScreen)).i(additionalInformationInputData).mo3800build();
                }
                throw new IllegalStateException(a0.d.q("Api ", wof.a.class, " is not found"));
        }
    }

    public /* synthetic */ a(AdditionalInformationScreen additionalInformationScreen, AdditionalInformationInputData additionalInformationInputData) {
        this.f108088b = additionalInformationScreen;
        this.f108089c = additionalInformationInputData;
    }
}
