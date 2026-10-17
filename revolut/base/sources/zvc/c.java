package zvc;

import android.content.Intent;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.TrustedWifisListScreen;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TrustedWifisListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TrustedWifisListScreen trustedWifisListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = trustedWifisListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVarD3 = this.v.R2();
        String listId = model.f52373a;
        com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a aVar2 = (com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a) fVarD3;
        aVar2.getClass();
        com.revolut.kompot.navigable.a aVar3 = aVar2.f85704r;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "TRUSTED_WIFIS_EMPTY_STATE_NO_LOCATION_ID")) {
            int i = j.f325651a[aVar2.f85705s.d(aVar3.m2(), u.c("android.permission.ACCESS_FINE_LOCATION")).ordinal()];
            if (i == 1) {
                aVar2.l2(new zp5.g(aVar2, null, 6), new yi5.b(26));
            } else if (i == 2) {
                aVar2.C1(new ExternalDestination.ByIntent(((s70.b) aVar2.f85706t).b(), null));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar3.L2(YearClass.CLASS_2009, u.c("android.permission.ACCESS_FINE_LOCATION"));
            }
        } else if (Intrinsics.f(listId, "TRUSTED_WIFIS_EMPTY_STATE_NO_CONNECTION_ID")) {
            aVar2.u.getClass();
            aVar2.C1(new ExternalDestination.ByIntent(new Intent("android.settings.WIFI_SETTINGS"), null));
        }
        return Unit.f186387a;
    }
}
