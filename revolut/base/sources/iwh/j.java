package iwh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen.ShowCardPinScreenContract$InputData;
import java.util.Collections;
import java.util.Set;
import us6.r2;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169108a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ShowCardPinScreenContract$InputData f169109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f169110c;
    public final e4m.e d;
    public final Object e;

    public j(uv2.a aVar, ShowCardPinScreenContract$InputData showCardPinScreenContract$InputData) {
        this.e = aVar;
        this.f169109b = showCardPinScreenContract$InputData;
        int i = 5;
        this.f169110c = e4m.b.b(new r2(aVar, this, 1, i));
        this.d = e4m.b.b(new r2(aVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f169108a) {
            case 0:
                return ImmutableSet.of();
            default:
                return Collections.EMPTY_SET;
        }
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f169108a) {
            case 0:
                return ImmutableSet.of();
            default:
                return Collections.EMPTY_SET;
        }
    }

    public j(c cVar, e eVar, ShowCardPinScreenContract$InputData showCardPinScreenContract$InputData) {
        this.e = cVar;
        this.f169109b = showCardPinScreenContract$InputData;
        int i = 10;
        this.f169110c = e4m.b.b(new iwb.b(cVar, this, 1, i));
        this.d = e4m.b.b(new iwb.b(cVar, this, 0, i));
    }
}
