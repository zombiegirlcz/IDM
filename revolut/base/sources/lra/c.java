package lra;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.push_to_card.impl.data.network.PushToCardAddCardService;
import com.revolut.feature.push_to_card.impl.storage.PushToCardService;
import ecm.q;
import efm.d0;
import fqa.f;
import fqa.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lqa.n;
import mqa.e;
import mqa.l;
import mqa.o;
import te0.w;
import ufm.i;
import xo8.i0;
import xo8.u;
import xra.h;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f199475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f199476c;

    public /* synthetic */ c(d dVar, g gVar, int i) {
        this.f199474a = i;
        this.f199475b = dVar;
        this.f199476c = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        h hVar;
        PushToCardService pushToCardService;
        e eVar;
        int i = this.f199474a;
        g cardOwnerToSubmit = this.f199476c;
        d dVar = this.f199475b;
        switch (i) {
            case 0:
                String url2 = (String) obj2;
                Intrinsics.checkNotNullParameter(url2, "url");
                q qVar = dVar.f199479c;
                String pan = cardOwnerToSubmit.a().f137221a;
                Intrinsics.checkNotNullParameter(url2, "url");
                Intrinsics.checkNotNullParameter(pan, "pan");
                d0<n> d0VarSubmitPan = ((PushToCardAddCardService) qVar.f124861b).submitPan(url2, new o(pan));
                hqa.b bVar = hqa.b.f;
                h35.c cVar = new h35.c(7);
                d0VarSubmitPan.getClass();
                i iVar = new i(d0VarSubmitPan, cVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return w.i0(iVar);
            default:
                String cardToken = (String) obj2;
                Intrinsics.checkNotNullParameter(cardToken, "cardToken");
                h hVar2 = dVar.f199477a;
                hVar2.getClass();
                Intrinsics.checkNotNullParameter(cardOwnerToSubmit, "cardOwnerToSubmit");
                Intrinsics.checkNotNullParameter(cardToken, "cardToken");
                PushToCardService pushToCardService2 = hVar2.f308312a;
                Intrinsics.checkNotNullParameter(cardOwnerToSubmit, "cardOwnerToSubmit");
                Intrinsics.checkNotNullParameter(cardToken, "cardToken");
                if (cardOwnerToSubmit instanceof f) {
                    f fVar = (f) cardOwnerToSubmit;
                    fqa.c cVar2 = fVar.f137230a;
                    String strA = mra.f.a(cVar2.f137221a);
                    l lVarB = mra.f.b(cVar2.f137222b);
                    String str = cVar2.f137223c;
                    String str2 = cVar2.d;
                    String str3 = cVar2.e;
                    lqa.g gVar = lqa.g.SELF;
                    List list = cVar2.f;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                    for (Iterator it8 = list.iterator(); it8.hasNext(); it8 = it8) {
                        fqa.b bVar2 = (fqa.b) it8.next();
                        arrayList.add(new mqa.d(bVar2.f137219a, bVar2.f137220b));
                    }
                    hVar = hVar2;
                    pushToCardService = pushToCardService2;
                    eVar = new e(cardToken, strA, lVarB, str, str2, str3, gVar, null, null, null, arrayList, fVar.f137231b);
                } else {
                    hVar = hVar2;
                    pushToCardService = pushToCardService2;
                    if (!(cardOwnerToSubmit instanceof fqa.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fqa.e eVar2 = (fqa.e) cardOwnerToSubmit;
                    fqa.c cVar3 = eVar2.f137227a;
                    String strA2 = mra.f.a(cVar3.f137221a);
                    l lVarB2 = mra.f.b(cVar3.f137222b);
                    String str4 = cVar3.f137223c;
                    String str5 = cVar3.d;
                    String str6 = cVar3.e;
                    lqa.g gVar2 = lqa.g.OTHER;
                    fqa.d dVar2 = eVar2.f137228b;
                    String str7 = dVar2.f137224a;
                    String str8 = dVar2.f137225b;
                    Address address = dVar2.f137226c;
                    no3.b bVarD = address != null ? oo3.a.d(address) : null;
                    List list2 = cVar3.f;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        fqa.b bVar3 = (fqa.b) it9.next();
                        arrayList2.add(new mqa.d(bVar3.f137219a, bVar3.f137220b));
                        it9 = it9;
                        cardToken = cardToken;
                    }
                    eVar = new e(cardToken, strA2, lVarB2, str4, str5, str6, gVar2, str7, str8, bVarD, arrayList2, eVar2.f137229c);
                }
                d0<lqa.f> d0VarCreateCardOwner = pushToCardService.createCardOwner(eVar);
                xra.f fVar2 = xra.f.f;
                x2l.a aVar = new x2l.a(12, false);
                d0VarCreateCardOwner.getClass();
                i iVar2 = new i(new i(new i(d0VarCreateCardOwner, aVar, 1), new u(13, new xra.a(hVar, 0 == true ? 1 : 0)), 0), new u(14, new i0(24)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return w.i0(ue0.e.D(iVar2, new xra.a(hVar, 1))).g(sjg.a.a(dVar.d));
        }
    }
}
