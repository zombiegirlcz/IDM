package xt1;

import c02.f;
import com.revolut.core.ui_kit.views.numpad.PosNumpadView;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.blik.BlikCode;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureBackendRequested;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureProgress;
import efm.h0;
import efm.n;
import efm.w;
import hx0.r;
import java.util.List;
import java.util.Set;
import kfm.g;
import kfm.o;
import kfm.p;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import org.reactivestreams.Publisher;
import x5f.m;
import xng.l;
import xub.e;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements o, g, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f308740b;

    public /* synthetic */ a(int i, Function1 function1) {
        this.f308739a = i;
        this.f308740b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f308739a;
        Function1 function1 = this.f308740b;
        switch (i) {
            case 9:
                ((xtg.c) function1).invoke(obj2);
                break;
            case 22:
                int i2 = PosNumpadView.i;
                ((xx0.a) function1).invoke(obj2);
                break;
            case 24:
                int i3 = PosNumpadView.i;
                ((xx0.a) function1).invoke(obj2);
                break;
            case 25:
                ((xpe.c) function1).invoke(obj2);
                break;
            default:
                ((xw9.c) function1).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f308739a) {
            case 0:
                xrl.a aVar = (xrl.a) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) aVar.invoke(p0);
            case 1:
                xrl.a aVar2 = (xrl.a) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BlikCode) aVar2.invoke(p0);
            case 2:
                xrl.a aVar3 = (xrl.a) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar3.invoke(p0);
            case 3:
                xrl.a aVar4 = (xrl.a) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) aVar4.invoke(p0);
            case 4:
                xrl.a aVar5 = (xrl.a) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) aVar5.invoke(p0);
            case 5:
                xrl.a aVar6 = (xrl.a) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BlikCode) aVar6.invoke(p0);
            case 6:
                l lVar = (l) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) lVar.invoke(p0);
            case 7:
                xrl.a aVar7 = (xrl.a) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (AccountClosureBackendRequested) aVar7.invoke(p0);
            case 8:
                xtg.c cVar = (xtg.c) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (AccountClosureProgress) cVar.invoke(p0);
            case 9:
            case 22:
            case 23:
            case 24:
            case 25:
            default:
                xx9.c cVar2 = (xx9.c) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) cVar2.invoke(p0);
            case 10:
                xtg.c cVar3 = (xtg.c) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) cVar3.invoke(p0);
            case 11:
                l lVar2 = (l) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ltg.c) lVar2.invoke(p0);
            case 12:
                xrl.a aVar8 = (xrl.a) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) aVar8.invoke(p0);
            case 13:
                r rVar = (r) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) rVar.invoke(p0);
            case 14:
                e eVar = (e) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) eVar.invoke(p0);
            case 15:
                l lVar3 = (l) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) lVar3.invoke(p0);
            case 16:
                l lVar4 = (l) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) lVar4.invoke(p0);
            case 17:
                e eVar2 = (e) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Set) eVar2.invoke(p0);
            case 18:
                e eVar3 = (e) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) eVar3.invoke(p0);
            case 19:
                m mVar = (m) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) mVar.invoke(p0);
            case 20:
                xwd.n nVar = (xwd.n) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) nVar.invoke(p0);
            case 21:
                xwd.n nVar2 = (xwd.n) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) nVar2.invoke(p0);
            case 26:
                e eVar4 = (e) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) eVar4.invoke(p0);
            case 27:
                xpe.c cVar4 = (xpe.c) this.f308740b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) cVar4.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        xx0.a aVar = (xx0.a) this.f308740b;
        int i = PosNumpadView.i;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) aVar.invoke(p0)).booleanValue();
    }
}
