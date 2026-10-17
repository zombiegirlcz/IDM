package ld1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.EditTaxRateScreenContract$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditTaxRateScreenContract$InputData f193949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f193950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f193951c;
    public final e4m.e d;

    public j(l lVar, p pVar, EditTaxRateScreenContract$InputData editTaxRateScreenContract$InputData) {
        this.f193950b = lVar;
        this.f193951c = pVar;
        this.f193949a = editTaxRateScreenContract$InputData;
        this.d = e4m.b.b(new g(lVar, this, 2));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
