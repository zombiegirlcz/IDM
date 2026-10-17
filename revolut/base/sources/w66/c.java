package w66;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.defi.trade.impl.ui.asset_picker.DeFiAssetPickerContract$InputData;
import java.util.Set;
import vzc.j;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiAssetPickerContract$InputData f295394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f295395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f295396c;

    public c(e eVar, DeFiAssetPickerContract$InputData deFiAssetPickerContract$InputData) {
        this.f295394a = deFiAssetPickerContract$InputData;
        int i = 18;
        this.f295395b = e4m.b.b(new j(eVar, this, 1, i));
        this.f295396c = e4m.b.b(new j(eVar, this, 0, i));
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
