package he2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.swish.impl.ui.confirmation.SwishConfirmationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwishConfirmationScreenContract$InputData f151534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f151535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f151536c;
    public final e4m.e d;

    public d(c cVar, SwishConfirmationScreenContract$InputData swishConfirmationScreenContract$InputData) {
        this.f151535b = cVar;
        this.f151534a = swishConfirmationScreenContract$InputData;
        int i = 24;
        this.f151536c = e4m.b.b(new h08.e(cVar, this, 1, i));
        this.d = e4m.b.b(new h08.e(cVar, this, 0, i));
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
