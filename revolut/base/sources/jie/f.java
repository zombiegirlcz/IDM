package jie;

import ahe.t;
import ahe.w0;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import g48.r;
import ie7.h;
import iw6.l;
import jfb.v0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pfe.i;
import vge.x;
import vkm.q;
import zjh.j;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vge.d f174470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4b.f f174471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f174472c;
    public final d4m.a d;

    public f(vge.d productAccountInteractor, i4b.f legalEntityContextProvider, j legalEntityDisclaimerMapper, d4m.a totalWealthInteractor, jhe.i totalWealthLegalProductMapper) {
        Intrinsics.checkNotNullParameter(productAccountInteractor, "productAccountInteractor");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(totalWealthInteractor, "totalWealthInteractor");
        Intrinsics.checkNotNullParameter(totalWealthLegalProductMapper, "totalWealthLegalProductMapper");
        this.f174470a = productAccountInteractor;
        this.f174471b = legalEntityContextProvider;
        this.f174472c = legalEntityDisclaimerMapper;
        this.d = totalWealthInteractor;
    }

    @Override // pfe.i
    public final Flow t(ProductAccountDescriptor$Value descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Continuation continuation = null;
        return descriptor.getF89727a() == ProductId.TOTAL_WEALTH ? q.Q(q.q(new h(mo3.a.g(((w0) ((t) this.d.get())).f5042c.f4984a, null, new v0(12), 1), this, 14)), new l(continuation, this, 17)) : q.Q(new r(mo3.a.g(nim.a.v(((x) this.f174470a).e(descriptor), new jhi.a(28)), null, new v0(13), 1), 18), new eh9.j(continuation, descriptor, this, 27));
    }
}
