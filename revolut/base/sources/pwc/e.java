package pwc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.security_hub.api.models.StreetModeInfo;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState;
import com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WealthProtectionLimitChangeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WealthProtectionLimitChangeScreen wealthProtectionLimitChangeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = wealthProtectionLimitChangeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        StreetModeInfo streetModeInfo;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.e3();
        String listId = model.f53228a;
        com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar2 = (com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a) pVarE3;
        cli.y yVar = aVar2.D;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "STREET_MODE_ITEM_LIST_ID") && (data = ((g) ((j2) yVar.f22677a).getValue()).f240404h) != null && (streetModeInfo = (StreetModeInfo) data.getContent()) != null) {
            if (streetModeInfo.f85423a) {
                aVar2.H2(yVar, new s(streetModeInfo, aVar2, 0));
            } else {
                WealthProtectionFeatureState.Visible visible = ((g) ((j2) yVar.f22677a).getValue()).f240400a;
                if (visible instanceof WealthProtectionFeatureState.Visible.Disabled) {
                    aVar2.J2(streetModeInfo, 0L);
                } else {
                    if (!(visible instanceof WealthProtectionFeatureState.Visible.Enabled)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.J2(streetModeInfo, ((WealthProtectionFeatureState.Visible.Enabled) visible).f85447b.f115082a);
                }
            }
        }
        return Unit.f186387a;
    }
}
