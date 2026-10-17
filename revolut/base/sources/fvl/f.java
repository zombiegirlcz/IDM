package fvl;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import fv6.n;
import ip0.yj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f138494b;

    public /* synthetic */ f(h hVar, int i) {
        this.f138493a = i;
        this.f138494b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List listC;
        boolean z;
        switch (this.f138493a) {
            case 0:
                rdh.a it8 = (rdh.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((gah.g) this.f138494b.f138496a).e(it8, "POCKET_PICKER_DISCLAIMER_LIST_ID_CRYPTO", yj0.START, Integer.valueOf(R$attr.uikit_colorGreyTone50));
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                ArrayList arrayList = new ArrayList();
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    a0.x(((xdf.i) it9.next()).f304438b, arrayList);
                }
                if (!arrayList.isEmpty()) {
                    Iterator it10 = arrayList.iterator();
                    while (it10.hasNext()) {
                        l4l.a aVar = ((xdf.h) it10.next()).f304435b;
                        l4l.a aVar2 = l4l.a.CRYPTO;
                        if (aVar == aVar2) {
                            TextDelegate.Model model = (TextDelegate.Model) y.r(y.x(y.n(d0.Q(list2), new n(11)), new f(this.f138494b, 0)));
                            return (model == null || (listC = u.c(new Pair(new cvl.k(aVar2), model))) == null) ? f0.f322471a : listC;
                        }
                    }
                }
                return f0.f322471a;
            case 2:
                List pocketSections = (List) obj2;
                Intrinsics.checkNotNullParameter(pocketSections, "pocketSections");
                return y.J(y.x(y.n(y.n(y.t(d0.Q(pocketSections), new n(15)), new n(16)), new f(this.f138494b, 3)), new n(17)));
            default:
                xdf.h group = (xdf.h) obj2;
                Intrinsics.checkNotNullParameter(group, "group");
                nkm.g gVar = new nkm.g(y.n(d0.Q(group.f304436c), g.f138495a));
                while (true) {
                    if (gVar.hasNext()) {
                        SourcePocket.Holding holding = (SourcePocket.Holding) gVar.next();
                        this.f138494b.getClass();
                        if (holding.f91778c) {
                            kel.b bVar = holding.f91776a;
                            if (!Intrinsics.f(bVar.e, bVar.d)) {
                                z = true;
                            }
                        }
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
