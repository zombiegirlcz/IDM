package gy2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData;
import g9g.e0;
import java.util.Set;
import til.m;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardDesignFlowContract$InputData f147797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f147798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f147799c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public e(d dVar, CardDesignFlowContract$InputData cardDesignFlowContract$InputData) {
        this.f147798b = dVar;
        this.f147797a = cardDesignFlowContract$InputData;
        this.d = e4m.b.b(new e0(dVar, this, 1, 22));
        this.e = e4m.b.b(new e0(dVar, this, 0, 22));
        this.f = e4m.b.b(new e0(dVar, this, 2, 22));
    }

    public final kx2.a b() {
        d dVar = this.f147798b;
        m mVarA = dVar.f147789p.a();
        s.j(mVarA);
        jvh.a aVarA = dVar.f147790q.a();
        s.j(aVarA);
        return new kx2.a(mVarA, aVarA, dVar.f147791r.e(), dVar.f147785j.a());
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
