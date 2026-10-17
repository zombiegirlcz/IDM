package g2d;

import a82.q;
import aii.u;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import efm.d0;
import efm.r;
import fnk.o;
import g1i.i0;
import g1k.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tzg.m;
import vkm.y;
import z0h.c1;
import z0h.q1;
import z0h.t1;
import zh9.u0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements x3d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f139966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aah.h f139967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1 f139968c;

    public g(m wealthAccountsInteractor, aah.h wealthDisclaimersExtension, q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(wealthDisclaimersExtension, "wealthDisclaimersExtension");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f139966a = wealthAccountsInteractor;
        this.f139967b = wealthDisclaimersExtension;
        this.f139968c = wealthDisclaimersMapper;
    }

    @Override // x3d.b
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.e;
    }

    @Override // x3d.b
    public final Flow b() {
        d0 d0VarG = g();
        i0 i0Var = new i0(5, new g1.b(this, 17));
        d0VarG.getClass();
        ufm.i iVar = new ufm.i(d0VarG, i0Var, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        r rVarX = ue0.e.I(iVar, h0.f322473a, new k(9)).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return rd0.e.b(rVarX);
    }

    @Override // x3d.b
    public final u c(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        return this.f139967b.M0(clickData);
    }

    @Override // x3d.b
    public final List d(Data data) {
        List list = data != null ? (List) iii.c.f(data, new k(10), new g0c.h(17), new o(this, 14)) : null;
        return list == null ? f0.f322471a : list;
    }

    @Override // x3d.b
    public final Flow e() {
        r map = g().x().map(new a31.o(20, f.f139965a));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return new y(new c(2, 1, null), rd0.e.e(rd0.e.b(map), h0.f322473a, new q(3, 22, null)));
    }

    public final List f(e eVar) {
        t1 t1Var = eVar.f139963a;
        List listC = ((aah.m) this.f139968c).c(zhm.u.c(new c1(t1Var.f318563a, t1Var.f318564b, eVar.f139964b)), eVar.f139963a.f318564b);
        int i = R$attr.uikit_dp0;
        yp0.b.q(listC, i, i, 0, 0, 12);
        return listC;
    }

    public final d0 g() {
        d0 d0VarFirstOrError = m70.a.h(rd0.e.c(u0.m(m.c(this.f139966a, null, null, 3), this.f139967b.f2828l.w0()), kotlin.coroutines.g.f186406a), new fq7.k(4), null, new g0c.h(16), 2).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }
}
