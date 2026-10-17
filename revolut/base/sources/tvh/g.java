package tvh;

import anl.j;
import com.revolut.data.model.Data;
import jki.i;
import kotlin.jvm.internal.Intrinsics;
import vvh.l;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f274774p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kq.h f274775q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f274776r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f274777s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l contentInteractor, kq.h appWidgetsRepository, int i, j mapper) {
        super(mapper);
        Intrinsics.checkNotNullParameter(contentInteractor, "contentInteractor");
        Intrinsics.checkNotNullParameter(appWidgetsRepository, "appWidgetsRepository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f274774p = contentInteractor;
        this.f274775q = appWidgetsRepository;
        this.f274776r = i;
        this.f274777s = new c(new Data(null, null, true, 3, null), null);
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new tqh.j(this, null, 14), new whi.b(6));
    }

    @Override // jki.g
    public final i r2() {
        return this.f274777s;
    }
}
