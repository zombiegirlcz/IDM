package gy2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_design.impl.card_design.carousel.CardDesignCarouselScreenContract$InputData;
import ehe.o;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardDesignCarouselScreenContract$InputData f147775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f147776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f147777c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f147778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f147779h;

    public c(d dVar, e eVar, CardDesignCarouselScreenContract$InputData cardDesignCarouselScreenContract$InputData) {
        this.f147776b = dVar;
        this.f147775a = cardDesignCarouselScreenContract$InputData;
        this.f147777c = e4m.b.b(new o(dVar, eVar, this, 2, 21));
        int i = 21;
        this.d = e4m.b.b(new o(dVar, eVar, this, 3, i));
        this.e = e4m.b.b(new o(dVar, eVar, this, 4, i));
        this.f = e4m.b.b(new o(dVar, eVar, this, 1, i));
        this.f147778g = e4m.b.b(new o(dVar, eVar, this, 5, i));
        this.f147779h = e4m.b.b(new o(dVar, eVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f147776b.z.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
