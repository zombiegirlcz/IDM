package lpf;

import com.revolut.feature.transfer.core.api.ui.additional_information.AdditionalInformationInputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements dqf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f199069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f199070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdditionalInformationInputData f199071c;

    public o(i iVar) {
        this.f199069a = iVar;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        this.f199070b = baseScreen;
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        vc.s.h(this.f199070b, BaseScreen.class);
        vc.s.h(this.f199071c, AdditionalInformationInputData.class);
        return new n(this.f199069a, this.f199070b, this.f199071c);
    }

    @Override // dqf.a
    public final dqf.a i(AdditionalInformationInputData additionalInformationInputData) {
        additionalInformationInputData.getClass();
        this.f199071c = additionalInformationInputData;
        return this;
    }
}
