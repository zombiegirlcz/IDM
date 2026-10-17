package ofc;

import com.revolut.feature.revpro.card_reader.order.impl.ui.screen.vat.VatInputScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BaseScreen f224797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VatInputScreenContract$InputData f224798b;

    private a() {
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        throw null;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        s.h(this.f224797a, BaseScreen.class);
        s.h(this.f224798b, VatInputScreenContract$InputData.class);
        return new b(this.f224798b);
    }
}
