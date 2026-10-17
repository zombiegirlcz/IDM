package lpf;

import com.revolut.feature.transfer.core.api.ui.reference.ReferenceInputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements tqf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f199085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f199086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ReferenceInputData f199087c;

    public t(i iVar) {
        this.f199085a = iVar;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        this.f199086b = baseScreen;
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        vc.s.h(this.f199086b, BaseScreen.class);
        vc.s.h(this.f199087c, ReferenceInputData.class);
        return new s(this.f199085a, this.f199086b, this.f199087c);
    }

    @Override // tqf.a
    public final tqf.a c(ReferenceInputData referenceInputData) {
        referenceInputData.getClass();
        this.f199087c = referenceInputData;
        return this;
    }
}
