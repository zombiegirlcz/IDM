package nnk;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n68.x;
import nnk.d;
import vkm.j2;
import wik.q;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends oki.h implements e {
    public final q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hk0.a f217721p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tqi.g f217722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f217723r;

    public h(n stateMapper, q pricingPlansTermsInteractor, hk0.a networkFileRepository, tqi.g shareNaviCommandFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pricingPlansTermsInteractor, "pricingPlansTermsInteractor");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        this.o = pricingPlansTermsInteractor;
        this.f217721p = networkFileRepository;
        this.f217722q = shareNaviCommandFactory;
        this.f217723r = mra.d.b(this, new c(new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new x(this, null, 24), new yi5.b(26));
    }

    public final void I2() {
        boolean z = ((c) ((j2) this.f217723r.f22677a).getValue()).f217713b;
        if (z) {
            C2(d.b.f217715a);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            C2(d.a.f217714a);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f217723r;
    }
}
