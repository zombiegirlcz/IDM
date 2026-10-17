package ho8;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.junior_settings.impl.R$string;
import com.revolut.feature.junior_settings.impl.ui_kompot.coparents.CoparentsSettingsScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.tm0;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ngm.n;
import rp0.t;
import rp0.y;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CoparentsSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CoparentsSettingsScreen coparentsSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = coparentsSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model item = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.Y.getValue();
        Intrinsics.h(item);
        j jVar = (j) fVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        Object obj3 = item.u;
        if (Intrinsics.f(obj3, "INVITE_COPARENT")) {
            jVar.n2(new i(jVar, null), new whi.b(6));
        } else if (obj3 instanceof vd8.a) {
            vd8.a aVar2 = (vd8.a) obj3;
            jVar.f154253w.x(new y(u.c(new um0("DIALOG_BUTTON_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_remove, null, null, 14), false, null, null, 56), (Object) aVar2, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new t(new TextLocalisedClause(R$string.rev_u18_account_settings_coparent_list_remove_dialog_title, u.c(n.n(aVar2)), null, 12), new TextLocalisedClause(R$string.rev_u18_account_settings_coparent_list_remove_dialog_subtitle, null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, 1016));
        }
        return Unit.f186387a;
    }
}
