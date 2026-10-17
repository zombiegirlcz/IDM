package gy2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_design.impl.card_limit_controller.CardLimitControllerScreenContract$InputData;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardLimitControllerScreenContract$InputData f147800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f147801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f147802c = e4m.b.b(new gp8.c(this, 11));

    public f(d dVar, CardLimitControllerScreenContract$InputData cardLimitControllerScreenContract$InputData) {
        this.f147801b = dVar;
        this.f147800a = cardLimitControllerScreenContract$InputData;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f147801b.z.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
