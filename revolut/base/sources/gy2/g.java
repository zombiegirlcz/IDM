package gy2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_design.impl.card_design.card_personalisation_info.CardPersonalisationInfoScreenContract$InputData;
import g9g.e0;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardPersonalisationInfoScreenContract$InputData f147803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f147804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f147805c;
    public final e4m.e d;

    public g(d dVar, CardPersonalisationInfoScreenContract$InputData cardPersonalisationInfoScreenContract$InputData) {
        this.f147804b = dVar;
        this.f147803a = cardPersonalisationInfoScreenContract$InputData;
        this.f147805c = e4m.b.b(new e0(dVar, this, 1, 23));
        this.d = e4m.b.b(new e0(dVar, this, 0, 23));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f147804b.z.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
