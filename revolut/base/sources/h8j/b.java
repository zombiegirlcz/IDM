package h8j;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.crypto.asset_details.common.impl.glossary.CryptoStatsGlossaryContract$InputData;
import java.util.Set;
import xki.e;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoStatsGlossaryContract$InputData f150060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f150061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f150062c;

    public b(a aVar, CryptoStatsGlossaryContract$InputData cryptoStatsGlossaryContract$InputData) {
        this.f150060a = cryptoStatsGlossaryContract$InputData;
        int i = 11;
        this.f150061b = e4m.b.b(new gff.a(this, 1, i));
        this.f150062c = e4m.b.b(new gff.a(this, 0, i));
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
