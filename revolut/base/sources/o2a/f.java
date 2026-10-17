package o2a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.style.TransferPersonalisationStyleSelectorContract$InputData;
import java.util.Set;
import nng.n;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferPersonalisationStyleSelectorContract$InputData f221609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f221610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f221611c;

    public f(b bVar, TransferPersonalisationStyleSelectorContract$InputData transferPersonalisationStyleSelectorContract$InputData) {
        this.f221610b = bVar;
        this.f221609a = transferPersonalisationStyleSelectorContract$InputData;
        this.f221611c = e4m.b.b(new n(bVar, this, 13));
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
