package nme;

import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x19.a;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.lifestyle.impl.ui.screen.f f217296b;

    public /* synthetic */ d0(com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar, int i) {
        this.f217295a = i;
        this.f217296b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        md6.d dVar;
        boolean z;
        switch (this.f217295a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                x19.a aVar = (x19.a) pair.f186386b;
                if (aVar instanceof x19.b) {
                    dVar = md6.d.OPENED;
                } else {
                    if (!Intrinsics.f(aVar, a.C1673a.f302352a) && !Intrinsics.f(aVar, a.b.f302353a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = md6.d.DISCOVERY;
                }
                return nim.a.v(this.f217296b.H.g(new RetailBackgroundKey.RevPointsAccount(dVar)), new c0(3));
            case 1:
                hub.b result = (hub.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.f155599b) {
                    com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar = this.f217296b;
                    fVar.f89942b0.a();
                    fVar.c0.a();
                    fVar.f89943d0.a();
                }
                return Unit.f186387a;
            default:
                h19.g products = (h19.g) obj2;
                Intrinsics.checkNotNullParameter(products, "products");
                web.b bVar = this.f217296b.Y;
                List list = products.f148485b;
                ArrayList<h19.c> productTypes = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    productTypes.add(((h19.d) it8.next()).f148480b);
                }
                ((efb.g) bVar).getClass();
                Intrinsics.checkNotNullParameter(productTypes, "productTypes");
                if (productTypes.isEmpty()) {
                    z = false;
                } else {
                    for (h19.c cVar : productTypes) {
                        web.b.Companion.getClass();
                        if (web.a.f296709c.contains(cVar)) {
                            z = true;
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
