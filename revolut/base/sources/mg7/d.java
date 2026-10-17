package mg7;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.incentive_reward.impl.ui.incentive_selection.screen.selection.IncentiveSelectionController;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.i3;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IncentiveSelectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(IncentiveSelectionController incentiveSelectionController, Continuation continuation) {
        super(2, continuation);
        this.v = incentiveSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = ((RowDelegate.Model) model.f53305b).u;
        g option = obj3 instanceof g ? (g) obj3 : null;
        if (option != null) {
            u uVar = (u) this.v.d();
            uVar.getClass();
            Intrinsics.checkNotNullParameter(option, "option");
            y yVar = uVar.u;
            Data data = ((j) ((j2) yVar.f22677a).getValue()).f205172a;
            i iVar = (i) data.getContent();
            if (iVar == null) {
                RuntimeException runtimeException = new RuntimeException("Content is null");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var);
            } else {
                List<g> list = iVar.d;
                ArrayList options = new ArrayList(zhm.w.t(list, 10));
                for (g gVar : list) {
                    boolean zF = Intrinsics.f(gVar, option);
                    if (gVar.f != zF) {
                        String rewardId = gVar.f205164a;
                        i3 i3Var = gVar.f205165b;
                        String title = gVar.f205166c;
                        String successMessage = gVar.d;
                        List subCategories = gVar.e;
                        Intrinsics.checkNotNullParameter(rewardId, "rewardId");
                        Intrinsics.checkNotNullParameter(title, "title");
                        Intrinsics.checkNotNullParameter(successMessage, "successMessage");
                        Intrinsics.checkNotNullParameter(subCategories, "subCategories");
                        gVar = new g(rewardId, i3Var, title, successMessage, subCategories, zF);
                    }
                    options.add(gVar);
                }
                String title2 = iVar.f205169a;
                String subtitle = iVar.f205170b;
                String terms = iVar.f205171c;
                Intrinsics.checkNotNullParameter(title2, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(terms, "terms");
                Intrinsics.checkNotNullParameter(options, "options");
                uVar.H2(yVar, new me7.h(Data.copy$default(data, new i(title2, subtitle, terms, options), null, false, 6, null), 3));
            }
        }
        return Unit.f186387a;
    }
}
