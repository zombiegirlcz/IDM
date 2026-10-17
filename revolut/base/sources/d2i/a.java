package d2i;

import cie.l1;
import com.revolut.data.model.Data;
import com.revolut.feature.exchange.models.ExchangeResult;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreen;
import cui.v;
import d27.d0;
import d27.g0;
import efm.h0;
import efm.w;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.Function;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements o, p, kfm.g, kfm.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f110846b;

    public /* synthetic */ a(Function function, int i) {
        this.f110845a = i;
        this.f110846b = function;
    }

    @Override // kfm.h
    public Object a(Object p0, Object p17, Object p2) {
        l1 l1Var = (l1) this.f110846b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        return (List) l1Var.invoke(p0, p17, p2);
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f110845a) {
            case 16:
                ((d6l.a) this.f110846b).invoke(obj2);
                break;
            default:
                ((cn7.c) this.f110846b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f110845a) {
            case 0:
                g0 g0Var = (g0) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) g0Var.invoke(p0);
            case 1:
                d0 d0Var = (d0) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (io3.d) d0Var.invoke(p0);
            case 2:
                a5b.a aVar = (a5b.a) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar.invoke(p0);
            case 3:
                d0 d0Var2 = (d0) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) d0Var2.invoke(p0);
            case 4:
                i iVar = (i) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) iVar.invoke(p0);
            case 5:
                i iVar2 = (i) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) iVar2.invoke(p0);
            case 6:
                v vVar = (v) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) vVar.invoke(p0);
            case 7:
                d0 d0Var3 = (d0) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                d0Var3.invoke(p0);
                return ExchangeResult.InvestSuccess.f72149a;
            case 8:
                d0 d0Var4 = (d0) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) d0Var4.invoke(p0);
            case 9:
                d0 d0Var5 = (d0) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) d0Var5.invoke(p0);
            case 10:
                d34.b bVar = (d34.b) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) bVar.invoke(p0);
            case 11:
                a6j.a aVar2 = (a6j.a) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) aVar2.invoke(p0);
            case 12:
                d62.a aVar3 = (d62.a) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xo9.h) aVar3.invoke(p0);
            case 13:
                d34.b bVar2 = (d34.b) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) bVar2.invoke(p0);
            case 14:
            case 15:
            case 16:
            case 17:
            case 21:
            case 23:
            default:
                d73.m mVar = (d73.m) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) mVar.invoke(p0);
            case 18:
                d6j.b bVar3 = (d6j.b) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) bVar3.invoke(p0);
            case 19:
                d73.b bVar4 = (d73.b) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) bVar4.invoke(p0);
            case 20:
                d6j.b bVar5 = (d6j.b) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) bVar5.invoke(p0);
            case 22:
                d6j.b bVar6 = (d6j.b) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) bVar6.invoke(p0);
            case 24:
                a5b.b bVar7 = (a5b.b) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) bVar7.invoke(p0);
            case 25:
                d73.b bVar8 = (d73.b) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) bVar8.invoke(p0);
            case 26:
                g0 g0Var2 = (g0) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) g0Var2.invoke(p0);
            case 27:
                d6j.b bVar9 = (d6j.b) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) bVar9.invoke(p0);
            case 28:
                d73.b bVar10 = (d73.b) this.f110846b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) bVar10.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f110845a;
        Function function = this.f110846b;
        switch (i) {
            case 14:
                CommodityAssetDetailsScreen.Companion companion = CommodityAssetDetailsScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 15:
                CommodityAssetDetailsScreen.Companion companion2 = CommodityAssetDetailsScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((d6j.b) function).invoke(p0)).booleanValue();
    }
}
