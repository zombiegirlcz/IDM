package m3c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.DeliveryAddressScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeliveryAddressScreenContract$InputData f202323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f202324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f202325c;

    public b(j jVar, e eVar, DeliveryAddressScreenContract$InputData deliveryAddressScreenContract$InputData) {
        this.f202323a = deliveryAddressScreenContract$InputData;
        int i = 15;
        this.f202324b = e4m.b.b(new lzk.b(jVar, this, 1, i));
        this.f202325c = e4m.b.b(new lzk.b(jVar, this, 0, i));
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
