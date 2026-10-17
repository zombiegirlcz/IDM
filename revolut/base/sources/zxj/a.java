package zxj;

import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import efm.r;
import ffk.t;
import kbb.c;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import osg.b;
import rd0.e;
import ufm.i;
import w4l.h;
import wsg.n;
import zp5.f;
import zs4.d;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements uxj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f326346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f326347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hj8.a f326348c;
    public final t d;
    public final ayj.a e;

    public a(c juniorConfigInteractor, n walletsInteractor, hj8.a juniorProfileInteractor, t pricingPlanInteractor, ayj.a commandProvider) {
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(commandProvider, "commandProvider");
        this.f326346a = juniorConfigInteractor;
        this.f326347b = walletsInteractor;
        this.f326348c = juniorProfileInteractor;
        this.d = pricingPlanInteractor;
        this.e = commandProvider;
    }

    public final i a(FeatureCommand nextCommand) {
        Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
        t tVar = this.d;
        h hVar = h.f294642c;
        r rVarV = tVar.v(hVar);
        r rVarN = tVar.n();
        r rVarQ = b.q(this.f326347b, false);
        r rVarC = e.c(((nj8.n) this.f326348c).k(null, hVar), g.f186406a);
        c cVar = this.f326346a;
        d0 d0VarFirstOrError = m70.a.g(mif.a.h(rVarV, rVarN, rVarQ, rVarC, cVar.O(false), cVar.I()), null, new d(16), 1).firstOrError();
        zx0.b bVar = new zx0.b(new f(this, nextCommand, 22), 16);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
