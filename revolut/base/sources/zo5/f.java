package zo5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoSendInput;
import java.util.Set;
import z0g.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements xki.c, hq5.b, cq5.b, nq5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoSendInput f323905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f323906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f323907c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public f(d dVar, CryptoSendInput cryptoSendInput) {
        this.f323906b = dVar;
        this.f323905a = cryptoSendInput;
        int i = 22;
        this.d = e4m.b.b(new k0(dVar, this, 1, i));
        this.e = e4m.b.b(new k0(dVar, this, 0, i));
        this.f = e4m.b.b(new k0(dVar, this, 2, i));
    }

    @Override // hq5.b
    public final hq5.a b() {
        return new n(this.f323906b, this.f323907c);
    }

    @Override // nq5.b
    public final nq5.a c() {
        return new q(this.f323906b, this.f323907c);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // cq5.b
    public final cq5.a j() {
        return new k(this.f323906b, this.f323907c);
    }
}
