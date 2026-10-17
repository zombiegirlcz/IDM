package hvf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transport.impl.ui.transit_checkout.date_input.DateInputScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateInputScreenContract$InputData f155891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f155892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f155893c;
    public final e4m.e d;

    public e(q qVar, DateInputScreenContract$InputData dateInputScreenContract$InputData) {
        this.f155892b = qVar;
        this.f155891a = dateInputScreenContract$InputData;
        int i = 22;
        this.f155893c = e4m.b.b(new gff.a(this, 1, i));
        this.d = e4m.b.b(new gff.a(this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f155892b.f155949n.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
