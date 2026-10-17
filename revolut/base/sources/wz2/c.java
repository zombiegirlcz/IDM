package wz2;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.common.flow.permissions.a;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import rp0.l;
import rp0.t;
import rp0.y;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.kompot.common.flow.permissions.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f301357w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a f301358x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.kompot.common.flow.permissions.a aVar, d dVar, a aVar2, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f301357w = dVar;
        this.f301358x = aVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f301357w, this.f301358x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            a.C0596a c0596a = a.C0596a.f98352a;
            com.revolut.kompot.common.flow.permissions.a aVar2 = this.v;
            boolean zF = Intrinsics.f(aVar2, c0596a);
            d dVar = this.f301357w;
            if (zF) {
                this.u = 1;
                if (dVar.c3(this.f301358x, this) == aVar) {
                    return aVar;
                }
            } else if (aVar2 instanceof sii.d) {
                j60.a aVar3 = dVar.f301360m;
                dVar.f301361n.getClass();
                t tVar = new t(new TextLocalisedClause(R$string.card_location_security_turn_on_title, null, null, 14), new TextLocalisedClause(R$string.card_location_security_turn_on_description, null, null, 14), null, 28);
                l lVar = l.WINDOW;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.uicomponent.R$string.permission_storage_reason_action, null, null, 14);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                int i2 = R$attr.uikit_dp24;
                int i3 = R$attr.uikit_dp16;
                LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("LOCATION_SETTINGS_POSITIVE_BUTTON_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i2, R$attr.uikit_dp8, i3, i3, 496);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_not_now, null, null, 14);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
                int i5 = R$attr.uikit_dp8;
                int i6 = R$attr.uikit_dp16;
                aVar3.x(new y(v.k(model, new LargeActionButtonDelegate.Model("LOCATION_SETTINGS_NEGATIVE_BUTTON_ID", defaultFilledButton2, null, textLocalisedClause2, false, null, null, i5, R$attr.uikit_dp24, i6, i6, 496)), tVar, lVar, null, null, null, 1016));
            } else if (!(aVar2 instanceof sii.c)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
