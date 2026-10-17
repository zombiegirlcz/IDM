package hsd;

import amd.u;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.api.R$string;
import io3.g;
import io3.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;
import w38.y;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155033a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n38.a f155034b;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f155033a) {
            case 0:
                Pair pair = (Pair) obj2;
                List pocketBalances = (List) pair.f186385a;
                xi0.b bVar = (xi0.b) pair.f186386b;
                AccountId.Joint jointAccountId = l38.a.c(this.f155034b);
                dj0.d dVarX = yoj.b.x(pocketBalances, bVar);
                Intrinsics.checkNotNullParameter(jointAccountId, "jointAccountId");
                Intrinsics.checkNotNullParameter(pocketBalances, "pocketBalances");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : pocketBalances) {
                    if (((g) obj3).f163163a.i >= 0) {
                        arrayList.add(obj3);
                    }
                }
                List listP0 = d0.P0(arrayList, new a());
                ArrayList arrayList2 = new ArrayList(w.t(listP0, 10));
                Iterator it8 = listP0.iterator();
                while (it8.hasNext()) {
                    io3.d dVar = ((g) it8.next()).f163163a;
                    xi0.a aVar = xi0.b.Companion;
                    String str = dVar.f163147c;
                    String str2 = dVar.f163147c;
                    aVar.getClass();
                    arrayList2.add(new amd.f(new CurrencyClause(xi0.a.a(str), null, null, 6), dVar.e == l.INHERITANCE ? new TextLocalisedClause(R$string.account_switcher_sub_space_bereavement_title, null, null, 14) : null, new MoneyClause(new dj0.d(dVar.i, xi0.a.a(str2)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, new CurrencyImage(str2, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, new u(dVar, jointAccountId), 160));
                }
                return new amd.d(amd.e.JOINT, arrayList2, f0.f322471a, dVarX);
            default:
                n38.a aVar2 = this.f155034b;
                Pair pair2 = (Pair) obj2;
                Data data = (Data) pair2.f186385a;
                nce.a aVar3 = (nce.a) pair2.f186386b;
                try {
                    Object content = data.getContent();
                    return new Data(content != null ? new y(aVar2, (i7) content, aVar3) : null, data.getError(), data.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data.getLoading());
                }
        }
    }

    public /* synthetic */ d(n38.a aVar) {
        this.f155034b = aVar;
    }
}
