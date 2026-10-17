package j73;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_screen.impl.kompot.card_activation_methods.screen.CardActivationMethodsScreenContract$InputData;
import java.util.Set;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardActivationMethodsScreenContract$InputData f171845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f171846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f171847c;

    public b(a aVar, CardActivationMethodsScreenContract$InputData cardActivationMethodsScreenContract$InputData) {
        this.f171845a = cardActivationMethodsScreenContract$InputData;
        int i = 10;
        this.f171846b = e4m.b.b(new ix5.b(this, 1, i));
        this.f171847c = e4m.b.b(new ix5.b(this, 0, i));
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
