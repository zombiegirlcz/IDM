package lpf;

import com.revolut.feature.transfer.core.api.ui.additional_information.AdditionalInformationInputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements dqf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f199061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f199062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f199063c;
    public AdditionalInformationInputData d;

    public m(i iVar, b bVar) {
        this.f199061a = iVar;
        this.f199062b = bVar;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        this.f199063c = baseScreen;
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        vc.s.h(this.f199063c, BaseScreen.class);
        vc.s.h(this.d, AdditionalInformationInputData.class);
        return new n(this.f199061a, this.f199062b, this.f199063c, this.d);
    }

    @Override // dqf.a
    public final dqf.a i(AdditionalInformationInputData additionalInformationInputData) {
        additionalInformationInputData.getClass();
        this.d = additionalInformationInputData;
        return this;
    }
}
