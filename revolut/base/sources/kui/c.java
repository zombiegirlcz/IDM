package kui;

import bti.m;
import cli.y;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPassAdmission;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.AsftPassDetailsScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking.AsftManageBookingPayload;
import java.util.List;
import kog.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlin.text.z;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AsftPassDetailsScreen f189818w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AsftPassDetailsScreen asftPassDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f189818w = asftPassDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f189818w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f189818w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((koi.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AsftPass asftPass;
        String str;
        List list;
        AsftPassAdmission asftPassAdmission;
        m mVar;
        int i = this.u;
        AsftPassDetailsScreen asftPassDetailsScreen = this.f189818w;
        switch (i) {
            case 0:
                String menuItemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarE3 = asftPassDetailsScreen.R2();
                Intrinsics.h(menuItemId);
                y yVar = hVarE3.f189828s;
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (menuItemId.equals("ID_MENU_ITEM_SETTINGS") && (asftPass = (AsftPass) ((e) ((j2) yVar.f22677a).getValue()).f189819a.getContent()) != null && (str = (String) ((e) ((j2) yVar.f22677a).getValue()).f189820b.getContent()) != null) {
                    hVarE3.C2(new f(new AsftManageBookingPayload(str, asftPass.f98713a, asftPass.i, asftPass.o, asftPass.u)));
                }
                break;
            default:
                koi.j jVar = (koi.j) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarE32 = asftPassDetailsScreen.R2();
                String listId = jVar.getF55055b();
                y yVar2 = hVarE32.f189828s;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Integer numM = z.m(d0.e0(listId, "ID_ITEM_PASS_CARD_"));
                if (numM != null) {
                    int iIntValue = numM.intValue();
                    AsftPass asftPass2 = (AsftPass) ((e) ((j2) yVar2.f22677a).getValue()).f189819a.getContent();
                    if (asftPass2 != null && (list = asftPass2.f98726t) != null && (asftPassAdmission = (AsftPassAdmission) zhm.d0.e0(iIntValue, list)) != null && (mVar = asftPassAdmission.f98727a) != null && mVar != ((e) ((j2) yVar2.f22677a).getValue()).f189821c) {
                        hVarE32.H2(yVar2, new k(mVar, 26));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
