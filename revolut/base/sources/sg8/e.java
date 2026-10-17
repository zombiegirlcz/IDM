package sg8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_graduation.impl.ui.screen.identification.JuniorIdentificationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorIdentificationScreenContract$InputData f262623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f262624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f262625c;

    public e(c cVar, b bVar, JuniorIdentificationScreenContract$InputData juniorIdentificationScreenContract$InputData) {
        this.f262623a = juniorIdentificationScreenContract$InputData;
        int i = 16;
        this.f262624b = e4m.b.b(new ryc.d(cVar, this, 1, i));
        this.f262625c = e4m.b.b(new ryc.d(cVar, this, 0, i));
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
