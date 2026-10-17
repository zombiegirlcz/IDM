package lpf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transfer.core.api.reason.ReasonForTransferInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements qji.a, oqf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReasonForTransferInputData f199015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f199016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f199017c = this;
    public final e4m.e d = e4m.b.b(new ljl.n(this, 12));

    public d(i iVar, ReasonForTransferInputData reasonForTransferInputData) {
        this.f199016b = iVar;
        this.f199015a = reasonForTransferInputData;
    }

    @Override // oqf.a
    public final u b() {
        return new u(this.f199016b, this.f199017c, 0);
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
