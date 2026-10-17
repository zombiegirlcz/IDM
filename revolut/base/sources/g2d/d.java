package g2d;

import a82.q;
import aah.m;
import aii.u;
import akg.n;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import efm.d0;
import efm.r;
import et6.u1;
import fnk.o;
import g1i.i0;
import g1k.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.y;
import z0h.l;
import z0h.q1;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements x3d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aah.h f139961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1 f139962c;

    public d(aah.h wealthDisclaimersExtension, q1 wealthDisclaimersMapper, int i) {
        this.f139960a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(wealthDisclaimersExtension, "wealthDisclaimersExtension");
                Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
                this.f139961b = wealthDisclaimersExtension;
                this.f139962c = wealthDisclaimersMapper;
                break;
            default:
                Intrinsics.checkNotNullParameter(wealthDisclaimersExtension, "wealthDisclaimersExtension");
                Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
                this.f139961b = wealthDisclaimersExtension;
                this.f139962c = wealthDisclaimersMapper;
                break;
        }
    }

    @Override // x3d.b
    public final FavouritesAssetTypeKey a() {
        switch (this.f139960a) {
            case 0:
                y1d.b.Companion.getClass();
                return y1d.a.d;
            default:
                y1d.b.Companion.getClass();
                return y1d.a.f;
        }
    }

    @Override // x3d.b
    public final Flow b() {
        switch (this.f139960a) {
            case 0:
                d0 d0VarG = g();
                i0 i0Var = new i0(4, new g1.b(this, 16));
                d0VarG.getClass();
                ufm.i iVar = new ufm.i(d0VarG, i0Var, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                r rVarX = ue0.e.I(iVar, h0.f322473a, new k(7)).x();
                Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                return rd0.e.b(rVarX);
            default:
                return new u1((n) e(), this, 19);
        }
    }

    @Override // x3d.b
    public final u c(ty0.a clickData) {
        switch (this.f139960a) {
            case 0:
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                break;
            default:
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                break;
        }
        return this.f139961b.M0(clickData);
    }

    @Override // x3d.b
    public final List d(Data data) {
        switch (this.f139960a) {
            case 0:
                List list = data != null ? (List) iii.c.f(data, new k(8), new g0c.h(14), new o(this, 13)) : null;
                if (list == null) {
                }
                break;
            default:
                List list2 = data != null ? (List) iii.c.f(data, new k(12), new g0c.h(18), new o(this, 15)) : null;
                if (list2 == null) {
                }
                break;
        }
        return f0.f322471a;
    }

    @Override // x3d.b
    public final Flow e() {
        switch (this.f139960a) {
            case 0:
                r map = g().x().map(new a31.o(19, b.f139958a));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return new y(new c(2, 0, null), rd0.e.e(rd0.e.b(map), h0.f322473a, new q(3, 21, null)));
            default:
                return nim.a.v(this.f139961b.f2828l.w0(), new k(11));
        }
    }

    public List f(a aVar) {
        List listC = ((m) this.f139962c).c(zhm.u.c(new l(aVar.f139957a.f318484a)), aVar.f139957a.f318485b);
        int i = R$attr.uikit_dp0;
        yp0.b.q(listC, i, i, 0, 0, 12);
        return listC;
    }

    public d0 g() {
        d0 d0VarFirstOrError = m70.a.h(rd0.e.c(this.f139961b.f2828l.s1(), kotlin.coroutines.g.f186406a), new fq7.k(3), null, new g0c.h(15), 2).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }
}
