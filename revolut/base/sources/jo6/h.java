package jo6;

import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.CrossBorderInstitutionsScreen;
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.CrossBorderInstitutionsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CrossBorderInstitutionsScreen f176873w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(CrossBorderInstitutionsScreen crossBorderInstitutionsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f176873w = crossBorderInstitutionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f176873w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            case 1:
                h hVar2 = new h(this.f176873w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
            default:
                h hVar3 = new h(this.f176873w, continuation, 2);
                hVar3.v = obj2;
                return hVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CrossBorderInstitutionsScreen crossBorderInstitutionsScreen = this.f176873w;
        switch (i) {
            case 0:
                se6.d institution = (se6.d) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.b bVar = (com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.b) crossBorderInstitutionsScreen.d();
                bVar.getClass();
                Intrinsics.checkNotNullParameter(institution, "institution");
                bVar.C2(new m(institution));
                break;
            case 1:
                String query = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE3 = crossBorderInstitutionsScreen.d();
                Intrinsics.h(query);
                com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.b bVar2 = (com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.b) nVarE3;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                bVar2.H2(bVar2.f73080s, new jb8.a(query, 9));
                break;
            default:
                String str = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(str, "ITEM_ID_COUNTRY_DROPDOWN")) {
                    com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.b bVar3 = (com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.b) crossBorderInstitutionsScreen.d();
                    k kVar = (k) ((j2) bVar3.f73080s.f22677a).getValue();
                    boolean z = kVar.d;
                    List list = kVar.f;
                    wi0.b bVar4 = kVar.e;
                    if (z && bVar4 != null && !list.isEmpty()) {
                        com.revolut.kompot.navigable.vc.modal.a aVar4 = bVar3.f73081t;
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((wi0.b) it8.next()).f297794a);
                        }
                        oki.h.v2(aVar4, new CrossBorderInstitutionsScreenContract$ModalStep.CountryPicker(bVar4.f297794a, arrayList), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
