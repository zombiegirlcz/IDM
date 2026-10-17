package z73;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_screen.impl.kompot.reactivate.chargeback.TerminatedCardChargebackScreenContract$InputData;
import java.util.Set;
import z0g.k0;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TerminatedCardChargebackScreenContract$InputData f319901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f319902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f319903c;

    public h(b bVar, c cVar, TerminatedCardChargebackScreenContract$InputData terminatedCardChargebackScreenContract$InputData) {
        this.f319901a = terminatedCardChargebackScreenContract$InputData;
        int i = 13;
        this.f319902b = e4m.b.b(new k0(bVar, this, 1, i));
        this.f319903c = e4m.b.b(new k0(bVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
