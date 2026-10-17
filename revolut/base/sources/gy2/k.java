package gy2;

import com.google.common.collect.ImmutableSet;
import com.revolut.cards.shared.ui.screen.catalogue.SharedCardDesignCatalogueScreenContract$InputData;
import ehe.o;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedCardDesignCatalogueScreenContract$InputData f147815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f147816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f147817c;
    public final e4m.e d;

    public k(d dVar, e eVar, SharedCardDesignCatalogueScreenContract$InputData sharedCardDesignCatalogueScreenContract$InputData) {
        this.f147816b = dVar;
        this.f147815a = sharedCardDesignCatalogueScreenContract$InputData;
        this.f147817c = e4m.b.b(new o(dVar, eVar, this, 1, 22));
        this.d = e4m.b.b(new o(dVar, eVar, this, 0, 22));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f147816b.z.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
