package gy2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_design.impl.card_design.rev_points_price_breakdown.RevPointsPriceBreakdownControllerContract$InputData;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPriceBreakdownControllerContract$InputData f147812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f147813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f147814c;
    public final e4m.e d;

    public j(d dVar, RevPointsPriceBreakdownControllerContract$InputData revPointsPriceBreakdownControllerContract$InputData) {
        this.f147813b = dVar;
        this.f147812a = revPointsPriceBreakdownControllerContract$InputData;
        int i = 5;
        this.f147814c = e4m.b.b(new gff.a(this, 1, i));
        this.d = e4m.b.b(new gff.a(this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f147813b.z.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
