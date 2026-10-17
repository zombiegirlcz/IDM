package hvf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transport.impl.ui.activation.flow.TransitTicketActivationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransitTicketActivationFlowContract$InputData f155927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f155928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f155929c;

    public l(q qVar, TransitTicketActivationFlowContract$InputData transitTicketActivationFlowContract$InputData) {
        this.f155927a = transitTicketActivationFlowContract$InputData;
        int i = 8;
        this.f155928b = e4m.b.b(new hjg.b(qVar, this, 1, i));
        this.f155929c = e4m.b.b(new hjg.b(qVar, this, 0, i));
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
