package lpf;

import com.revolut.feature.transfer.core.api.ui.reference.ReferenceInputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements tqf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f199077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f199078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f199079c;
    public ReferenceInputData d;

    public r(i iVar, f fVar) {
        this.f199077a = iVar;
        this.f199078b = fVar;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        this.f199079c = baseScreen;
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        vc.s.h(this.f199079c, BaseScreen.class);
        vc.s.h(this.d, ReferenceInputData.class);
        return new s(this.f199077a, this.f199078b, this.f199079c, this.d);
    }

    @Override // tqf.a
    public final tqf.a c(ReferenceInputData referenceInputData) {
        referenceInputData.getClass();
        this.d = referenceInputData;
        return this;
    }
}
