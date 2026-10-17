package vaa;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.impl.flow.pix_area.screens.pix_area.PixAreaScreen;
import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixAreaScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PixAreaScreen pixAreaScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixAreaScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        a0 a0VarE3 = this.v.R2();
        Intrinsics.h(model);
        f0 f0Var = (f0) a0VarE3;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof PixKey) {
            f0Var.C2(new x((PixKey) obj3));
        } else if (obj3 instanceof ty9.a) {
            f0Var.u.Z2();
        } else if (obj3 instanceof a) {
            f0Var.I2((a) obj3);
        } else {
            String str = model.f53228a;
            int iHashCode = str.hashCode();
            if (iHashCode != -2012462237) {
                if (iHashCode != -179715487) {
                    if (iHashCode == 1813092566 && str.equals("PIX_AUTOMATICO_ID")) {
                        f0Var.C2(q.f287211a);
                    }
                } else if (str.equals("TRANSACTION_LIMITS_ID")) {
                    f0Var.C1(new SecurityHubDestination((SecurityHubStartScreen) SecurityHubStartScreen.TransactionsDayNightLimitsWithoutSecurityHub.f85388a, false, (String) null, false, 30));
                }
            } else if (str.equals("TRUSTED_PEOPLE_ID")) {
                f0Var.C2(w.f287217a);
            }
        }
        return Unit.f186387a;
    }
}
