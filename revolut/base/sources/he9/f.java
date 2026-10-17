package he9;

import com.revolut.feature.passcode.PasscodeScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import ljl.h0;
import ljl.q;
import ljl.q0;
import ljl.y0;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f151615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PasscodeScreenContract$InputData f151616c;
    public final Object d;
    public final Object e;

    public /* synthetic */ f(Object obj2, Object obj3, int i) {
        this.f151614a = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f151614a) {
            case 0:
                this.f151615b = baseScreen;
                break;
            case 1:
                this.f151615b = baseScreen;
                break;
            case 2:
                this.f151615b = baseScreen;
                break;
            case 3:
                this.f151615b = baseScreen;
                break;
            case 4:
                this.f151615b = baseScreen;
                break;
            case 5:
                this.f151615b = baseScreen;
                break;
            default:
                this.f151615b = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f151614a) {
            case 0:
                s.h(this.f151615b, BaseScreen.class);
                s.h(this.f151616c, PasscodeScreenContract$InputData.class);
                return new g((e) this.d, (d) this.e, this.f151615b, this.f151616c);
            case 1:
                s.h(this.f151615b, BaseScreen.class);
                s.h(this.f151616c, PasscodeScreenContract$InputData.class);
                return new y0((q0) this.d, (q) this.e, this.f151615b, this.f151616c);
            case 2:
                s.h(this.f151615b, BaseScreen.class);
                s.h(this.f151616c, PasscodeScreenContract$InputData.class);
                return new y0((q0) this.d, (ljl.g) this.e, this.f151615b, this.f151616c);
            case 3:
                s.h(this.f151615b, BaseScreen.class);
                s.h(this.f151616c, PasscodeScreenContract$InputData.class);
                return new y0((q0) this.d, (h0) this.e, this.f151615b, this.f151616c);
            case 4:
                s.h(this.f151615b, BaseScreen.class);
                s.h(this.f151616c, PasscodeScreenContract$InputData.class);
                return new qc9.b((qc9.c) this.d, (qc9.d) this.e, this.f151615b, this.f151616c);
            case 5:
                s.h(this.f151615b, BaseScreen.class);
                s.h(this.f151616c, PasscodeScreenContract$InputData.class);
                return new g((re9.a) this.d, (re9.b) this.e, this.f151615b, this.f151616c);
            default:
                s.h(this.f151615b, BaseScreen.class);
                s.h(this.f151616c, PasscodeScreenContract$InputData.class);
                return new g((tl9.c) this.d, (tl9.a) this.e, this.f151615b, this.f151616c);
        }
    }
}
