package gy2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_design.impl.card_design.card_video_preview.CardVideoPreviewScreenContract$InputData;
import g9g.e0;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardVideoPreviewScreenContract$InputData f147806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f147807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f147808c;
    public final e4m.e d;

    public h(d dVar, CardVideoPreviewScreenContract$InputData cardVideoPreviewScreenContract$InputData) {
        this.f147807b = dVar;
        this.f147806a = cardVideoPreviewScreenContract$InputData;
        int i = 24;
        this.f147808c = e4m.b.b(new e0(dVar, this, 1, i));
        this.d = e4m.b.b(new e0(dVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f147807b.z.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
