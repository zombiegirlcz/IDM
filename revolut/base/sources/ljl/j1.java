package ljl;

import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreenContract$InputData;

/* JADX INFO: loaded from: classes12.dex */
public final class j1 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f196002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f196003c;
    public IdentifierInputScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ j1(q0 q0Var, Object obj2, int i) {
        this.f196001a = i;
        this.f196002b = q0Var;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f196001a) {
            case 0:
                this.f196003c = baseScreen;
                break;
            case 1:
                this.f196003c = baseScreen;
                break;
            default:
                this.f196003c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f196001a) {
            case 0:
                vc.s.h(this.f196003c, BaseScreen.class);
                vc.s.h(this.d, IdentifierInputScreenContract$InputData.class);
                return new k1(this.f196002b, (c) this.e, this.d);
            case 1:
                vc.s.h(this.f196003c, BaseScreen.class);
                vc.s.h(this.d, IdentifierInputScreenContract$InputData.class);
                return new k1(this.f196002b, (w0) this.e, this.d);
            default:
                vc.s.h(this.f196003c, BaseScreen.class);
                vc.s.h(this.d, IdentifierInputScreenContract$InputData.class);
                return new k1(this.f196002b, (j) this.e, this.d);
        }
    }
}
