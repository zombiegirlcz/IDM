package x13;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.CardExtraSecurityControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardExtraSecurityControllerContract$InputData f302146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f302147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f302148c;
    public final e4m.e d;
    public final e4m.e e;

    public m(p pVar, q qVar, CardExtraSecurityControllerContract$InputData cardExtraSecurityControllerContract$InputData) {
        this.f302147b = pVar;
        this.f302148c = qVar;
        this.f302146a = cardExtraSecurityControllerContract$InputData;
        int i = 17;
        this.d = e4m.b.b(new whc.t(pVar, this, 1, i));
        this.e = e4m.b.b(new whc.t(pVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f302147b.V.get(), (yji.n) this.f302148c.f302183r.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
