package x13;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_holder_name.CardHolderNameControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardHolderNameControllerContract$InputData f302149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f302150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f302151c;
    public final e4m.e d;
    public final e4m.e e;

    public n(p pVar, q qVar, CardHolderNameControllerContract$InputData cardHolderNameControllerContract$InputData) {
        this.f302150b = pVar;
        this.f302151c = qVar;
        this.f302149a = cardHolderNameControllerContract$InputData;
        int i = 18;
        this.d = e4m.b.b(new whc.t(pVar, this, 1, i));
        this.e = e4m.b.b(new whc.t(pVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f302150b.V.get(), (yji.n) this.f302151c.f302183r.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
