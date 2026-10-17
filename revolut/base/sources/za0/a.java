package za0;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yc0.j;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) obj2;
        g gVar = (g) this.receiver;
        j jVar = gVar.f320550r;
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.i instanceof Action) {
            jVar.getClass();
            Intrinsics.checkNotNullParameter(model, "model");
            Object obj4 = model.i;
            Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.backend_flow.domain.models.Action");
            Action action = (Action) obj4;
            if (action instanceof Action.Dismiss) {
                j60.a.v(gVar.f320549q, false, null, 3);
            } else if (action instanceof Action.Deeplink) {
                gVar.f320551s.Z2(((Action.Deeplink) action).f63226c);
            } else {
                if (!(action instanceof Action.Submit)) {
                    throw new NoWhenBranchMatchedException();
                }
                BackendScreen screen = jVar.j(gVar.Z2(), (Action.Submit) action);
                Intrinsics.checkNotNullParameter(screen, "screen");
                gVar.f303769m.invoke(new ya0.b(screen));
            }
        } else {
            gVar.u.U0(gVar.Z2(), model);
        }
        return Unit.f186387a;
    }
}
