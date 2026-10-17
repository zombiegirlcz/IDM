package jpl;

import akl.e1;
import akl.f0;
import akl.o0;
import com.revolut.data.model.Data;
import go.g;
import jij.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rqk.m;
import w4l.i;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends n implements gjl.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f0 f177323l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o0 f177324m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f177325n;
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vki.a f177326p;

    public d(f0 oauthUserInfoRepository, o0 revolutAccountUserInfoRepository, boolean z, m userInfoFromAppProvider) {
        Intrinsics.checkNotNullParameter(oauthUserInfoRepository, "oauthUserInfoRepository");
        Intrinsics.checkNotNullParameter(revolutAccountUserInfoRepository, "revolutAccountUserInfoRepository");
        Intrinsics.checkNotNullParameter(userInfoFromAppProvider, "userInfoFromAppProvider");
        this.f177323l = oauthUserInfoRepository;
        this.f177324m = revolutAccountUserInfoRepository;
        this.f177325n = z;
        this.o = userInfoFromAppProvider;
        this.f177326p = pyd.c.a(this, new gjl.a(new Data(null, null, true, 3, null)));
    }

    @Override // yji.n
    public final void D2() {
        Flow gVar;
        x4l.c cVar = ((e1) this.f177324m).f6009l;
        Unit unit = Unit.f186387a;
        i iVar = i.f294643c;
        akg.n nVarV = nim.a.v(cVar.b(unit, iVar), new jn2.a(27));
        Continuation continuation = null;
        if (this.f177325n) {
            gVar = nim.a.A(nim.a.u(new c(this, null), this.f177323l.d.b(unit, iVar)), new jn2.a(28));
        } else {
            gVar = new g(new Data(zhm.f0.f322471a, null, false, 6, null), 2);
        }
        n.j2(this, nim.a.v(u0.m(nVarV, gVar), new jn2.a(29)), null, new h(this, continuation, 15), 3);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f177326p;
    }
}
