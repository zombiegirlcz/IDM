package hvf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transport.impl.ui.extend.ExtendTicketScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtendTicketScreenContract$InputData f155903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f155904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f155905c = e4m.b.b(new hm9.d(this, 11));

    public g(q qVar, ExtendTicketScreenContract$InputData extendTicketScreenContract$InputData) {
        this.f155904b = qVar;
        this.f155903a = extendTicketScreenContract$InputData;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f155904b.f155949n.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
