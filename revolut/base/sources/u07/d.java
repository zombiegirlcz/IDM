package u07;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.freelancer.impl.ui.profile.tax.screen.settings.FreelancerTaxSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerTaxSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FreelancerTaxSettingsScreen freelancerTaxSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerTaxSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        j jVar;
        FreelancerTaxProfile freelancerTaxProfile;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = (l) this.v.P.getValue();
        String listId = model.f53228a;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode != 505085138) {
            if (iHashCode != 1191792607) {
                if (iHashCode == 1207333006 && listId.equals("LIST_ID_TAX_DATES")) {
                    lVar.C2(f.f276079a);
                }
            } else if (listId.equals("ITEM_ID_PRO_VAT")) {
                lVar.C2(h.f276081a);
            }
        } else if (listId.equals("ITEM_ID_PRO_VAT_REMINDER") && (jVar = (j) ((e) ((j2) lVar.f276090t.f22677a).getValue()).f276078a.getContent()) != null && (freelancerTaxProfile = jVar.f276083b) != null) {
            lVar.C2(new g(freelancerTaxProfile.f73474a));
        }
        return Unit.f186387a;
    }
}
