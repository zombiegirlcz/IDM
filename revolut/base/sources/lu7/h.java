package lu7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.bottom_sheet.EmbeddedBottomSheetScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EmbeddedBottomSheetScreenContract$InputData f200103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f200104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f200105c;

    public h(s sVar, EmbeddedBottomSheetScreenContract$InputData embeddedBottomSheetScreenContract$InputData) {
        this.f200103a = embeddedBottomSheetScreenContract$InputData;
        int i = 11;
        this.f200104b = e4m.b.b(new lti.l(sVar, this, 1, i));
        this.f200105c = e4m.b.b(new lti.l(sVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
