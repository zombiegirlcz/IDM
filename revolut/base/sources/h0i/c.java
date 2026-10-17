package h0i;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_crypto_picker.api.CryptoPickerDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import e4m.e;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements k0i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoPickerDestination.CryptoPickerInputData f148412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f148413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f148414c;
    public final e d;

    public c(a aVar, ViewController viewController, CryptoPickerDestination.CryptoPickerInputData cryptoPickerInputData) {
        this.f148412a = cryptoPickerInputData;
        this.f148413b = viewController;
        this.f148414c = e4m.b.b(new b(aVar, this, 1));
        this.d = e4m.b.b(new b(aVar, this, 0));
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
