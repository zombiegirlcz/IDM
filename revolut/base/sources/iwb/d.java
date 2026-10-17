package iwb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.RevPointsGiftcardDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsGiftcardDetailsScreenContract$InputData f169012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f169013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f169014c;
    public final e4m.e d;
    public final e4m.e e;

    public d(e eVar, RevPointsGiftcardDetailsScreenContract$InputData revPointsGiftcardDetailsScreenContract$InputData) {
        this.f169013b = eVar;
        this.f169012a = revPointsGiftcardDetailsScreenContract$InputData;
        int i = 1;
        this.f169014c = e4m.b.b(new b(eVar, this, 2, i));
        this.d = e4m.b.b(new b(eVar, this, 1, i));
        this.e = e4m.b.b(new b(eVar, this, 0, i));
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
