package aj3;

import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements z7a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f5390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f5391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PickerScreenContract$InputData f5392c;
    public v7a.c d;

    public i(h hVar) {
        this.f5390a = hVar;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        this.f5391b = baseScreen;
        return this;
    }

    @Override // z7a.a
    public final z7a.a a0(PickerScreenContract$InputData pickerScreenContract$InputData) {
        this.f5392c = pickerScreenContract$InputData;
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        s.h(this.f5391b, BaseScreen.class);
        s.h(this.f5392c, PickerScreenContract$InputData.class);
        s.h(this.d, v7a.b.class);
        return new j(this.f5390a, this.f5392c, this.d);
    }

    @Override // z7a.a
    public final z7a.a q(v7a.c cVar) {
        this.d = cVar;
        return this;
    }
}
