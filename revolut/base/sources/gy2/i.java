package gy2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_design.impl.card_design.local_global_card_info.LocalGlobalCardInfoScreenContract$InputData;
import g9g.e0;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalGlobalCardInfoScreenContract$InputData f147809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f147810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f147811c;
    public final e4m.e d;

    public i(d dVar, LocalGlobalCardInfoScreenContract$InputData localGlobalCardInfoScreenContract$InputData) {
        this.f147810b = dVar;
        this.f147809a = localGlobalCardInfoScreenContract$InputData;
        this.f147811c = e4m.b.b(new e0(dVar, this, 1, 25));
        this.d = e4m.b.b(new e0(dVar, this, 0, 25));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f147810b.z.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
