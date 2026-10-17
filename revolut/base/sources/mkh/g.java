package mkh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.ui.impl.disclosures.DisclosuresControllerContract$Input;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisclosuresControllerContract$Input f206325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f206326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f206327c;
    public final e4m.e d;

    public g(s sVar, DisclosuresControllerContract$Input disclosuresControllerContract$Input) {
        this.f206326b = sVar;
        this.f206325a = disclosuresControllerContract$Input;
        int i = 1;
        this.f206327c = e4m.b.b(new mil.a(this, 1, i));
        this.d = e4m.b.b(new mil.a(this, 0, i));
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
