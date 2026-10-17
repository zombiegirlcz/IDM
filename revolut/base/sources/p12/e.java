package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrDetailsInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements xki.c, r32.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QrDetailsInputData f231637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f231638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f231639c = this;
    public final e4m.e d = e4m.b.b(new ogf.b(this, 13));

    public e(d dVar, QrDetailsInputData qrDetailsInputData) {
        this.f231638b = dVar;
        this.f231637a = qrDetailsInputData;
    }

    @Override // r32.a
    public final h c() {
        return new h(this.f231638b, this.f231639c, 0);
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
