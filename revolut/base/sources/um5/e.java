package um5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.tfr.validation.impl.lei.LegalEntityIdScreenContract$InputData;
import java.util.Set;
import ufg.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LegalEntityIdScreenContract$InputData f281245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f281246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f281247c;

    public e(c cVar, LegalEntityIdScreenContract$InputData legalEntityIdScreenContract$InputData) {
        this.f281245a = legalEntityIdScreenContract$InputData;
        int i = 9;
        this.f281246b = e4m.b.b(new k0(cVar, this, 1, i));
        this.f281247c = e4m.b.b(new k0(cVar, this, 0, i));
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
