package yo5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingpicker.CryptoAddressHostingPickerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoAddressHostingPickerContract$InputData f315581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f315582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f315583c;

    public t(w wVar, s sVar, CryptoAddressHostingPickerContract$InputData cryptoAddressHostingPickerContract$InputData) {
        this.f315581a = cryptoAddressHostingPickerContract$InputData;
        int i = 29;
        this.f315582b = e4m.b.b(new xsl.q(wVar, this, 1, i));
        this.f315583c = e4m.b.b(new xsl.q(wVar, this, 0, i));
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
