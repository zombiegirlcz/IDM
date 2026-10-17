package whc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rewards.impl.ui.concierge.screen.additionalinfo.AdditionalInfoBottomSheetContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdditionalInfoBottomSheetContract$InputData f297515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f297516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f297517c;
    public final e4m.e d;

    public f(s sVar, ViewController viewController, AdditionalInfoBottomSheetContract$InputData additionalInfoBottomSheetContract$InputData) {
        this.f297515a = additionalInfoBottomSheetContract$InputData;
        this.f297516b = e4m.b.b(e4m.c.a(viewController));
        int i = 26;
        this.f297517c = e4m.b.b(new vzc.j(sVar, this, 1, i));
        this.d = e4m.b.b(new vzc.j(sVar, this, 0, i));
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
