package eae;

import aw0.j0;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import f0d.m;
import java.util.ArrayList;
import k71.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import thf.k;
import thf.l;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f124218b;

    public /* synthetic */ e(h hVar, int i) {
        this.f124217a = i;
        this.f124218b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f124217a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                gae.d dVar = (gae.d) this.f124218b.f124221h;
                dVar.getClass();
                pfm.h hVar = new pfm.h(new a08.d(dVar, 23), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 1:
                gae.h transactionsData = (gae.h) obj2;
                Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
                jae.a aVar = this.f124218b.f124222j;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("LIST_ID_HEADER", null, new TextLocalisedClause(R$string.subscriptions_history_list_header_title, null, null, 14), null, new MoneyClause(transactionsData.f142154c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, j0.TRANSPARENT, null, null, false, false, null, null, 0, 0, 0, 0, 16777130);
                ArrayList arrayListE = l.e(aVar.f172475a, transactionsData.f142152a, transactionsData.f142153b, new k(1022, false, false, false, false, false), null, 24);
                yp0.b.k(arrayListE, 0, 0, 0, 0, 31);
                return i2b.a.q(model, arrayListE);
            default:
                RowDelegate.Model model2 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model2, "model");
                Object obj3 = model2.u;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.transactions.models.Transaction");
                i transactionDescriptor = q.P((a3) obj3);
                gae.d dVar2 = (gae.d) this.f124218b.f124221h;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
                pfm.h hVar2 = new pfm.h(new m(transactionDescriptor, dVar2, 22), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2;
        }
    }
}
