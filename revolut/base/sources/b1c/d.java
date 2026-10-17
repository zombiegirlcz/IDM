package b1c;

import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.feature.lifestyle.core.api.model.savings.LifestyleSavingsSummary$SavingsHighlight;
import com.revolut.feature.rev_points.impl.ui.trophy_room.home.RevPointsTrophyRoomHomeScreen;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsTrophyRoomHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RevPointsTrophyRoomHomeScreen revPointsTrophyRoomHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsTrophyRoomHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((BigTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BigTileDelegate.Model model = (BigTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.impl.ui.trophy_room.home.b bVar = (com.revolut.feature.rev_points.impl.ui.trophy_room.home.b) mVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f51742s;
        d1c.i iVar = obj3 instanceof d1c.i ? (d1c.i) obj3 : null;
        if (iVar != null) {
            int i = iVar.f110638b;
            String str = iVar.f110637a;
            if (str != null) {
                bVar.C2(new j(str));
            } else {
                y19.h hVar = (y19.h) ((i) ((j2) bVar.f83931s.f22677a).getValue()).f11782b.getContent();
                ArrayList arrayList = hVar != null ? hVar.f310347b : null;
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : arrayList) {
                        LifestyleSavingsSummary$SavingsHighlight lifestyleSavingsSummary$SavingsHighlight = (LifestyleSavingsSummary$SavingsHighlight) obj4;
                        if (lifestyleSavingsSummary$SavingsHighlight.d && lifestyleSavingsSummary$SavingsHighlight.f78057g == null) {
                            arrayList2.add(obj4);
                        }
                    }
                    LifestyleSavingsSummary$SavingsHighlight lifestyleSavingsSummary$SavingsHighlight2 = (LifestyleSavingsSummary$SavingsHighlight) d0.e0(i, arrayList);
                    Intrinsics.checkNotNullParameter(arrayList2, "<this>");
                    int iIndexOf = arrayList2.indexOf(lifestyleSavingsSummary$SavingsHighlight2);
                    if (iIndexOf < 0) {
                        iIndexOf = 0;
                    }
                    bVar.C2(new k(iIndexOf, arrayList2));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(a0.d.n("Highlights not ready when tapping on highlight at position ", i));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
            }
        }
        return Unit.f186387a;
    }
}
