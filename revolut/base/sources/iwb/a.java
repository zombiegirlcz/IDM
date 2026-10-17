package iwb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.giftcards.api.navigation.descriptor.RevPointsGiftcardsPurchaseController$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsGiftcardsPurchaseController$InputData f169003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f169004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f169005c;
    public final e4m.e d;

    public a(e eVar, RevPointsGiftcardsPurchaseController$InputData revPointsGiftcardsPurchaseController$InputData) {
        this.f169003a = revPointsGiftcardsPurchaseController$InputData;
        int i = 29;
        this.f169004b = e4m.b.b(new i9e.l(eVar, this, 1, i));
        this.f169005c = e4m.b.b(new i9e.l(eVar, this, 0, i));
        this.d = e4m.b.b(new i9e.l(eVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f169005c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
