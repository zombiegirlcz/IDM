package lpf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transfer.core.api.reason.ReasonForTransferInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements qji.a, oqf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReasonForTransferInputData f199012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f199013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f199014c = this;
    public final e4m.e d = e4m.b.b(new ljl.n(this, 11));

    public c(i iVar, ReasonForTransferInputData reasonForTransferInputData) {
        this.f199013b = iVar;
        this.f199012a = reasonForTransferInputData;
    }

    @Override // oqf.a
    public final u b() {
        return new u(this.f199013b, this.f199014c, 1);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
