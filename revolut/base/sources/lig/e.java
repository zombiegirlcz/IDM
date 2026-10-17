package lig;

import a41.j1;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.search.location_picker.TravelMilesFlightLocationPickerScreen;
import hfg.q;
import hfg.u;
import hfg.v;
import hfg.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mig.b;
import mig.f;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesFlightLocationPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelMilesFlightLocationPickerScreen travelMilesFlightLocationPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesFlightLocationPickerScreen;
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
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarD = this.v.d();
        Intrinsics.h(model);
        p pVar = (p) lVarD;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof f.b) {
            f.b bVar = (f.b) obj3;
            if (bVar instanceof mig.g) {
                w wVar = ((mig.g) obj3).f205845a;
                if (wVar instanceof u) {
                    u uVar = (u) wVar;
                    String str = uVar.f151892a;
                    String str2 = uVar.f151893b;
                    pVar.l2(new j1(pVar, str, str2, uVar.f151894c, uVar.d, new i(str2, str), (Continuation) null, 22), new yi5.b(26));
                } else {
                    if (!(wVar instanceof v)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    v vVar = (v) wVar;
                    pVar.l2(new km2.n(18, pVar, vVar.f151895a, vVar.f151896b, vVar.f151897c, (Continuation) null), new yi5.b(26));
                }
            } else {
                if (!(bVar instanceof mig.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                q qVar = ((mig.h) obj3).f205846a;
                pVar.l2(new km2.n(18, pVar, qVar.f151881a, qVar.f151882b, qVar.f151883c, (Continuation) null), new yi5.b(26));
            }
        } else if (obj3 instanceof b.AbstractC1167b) {
            b.AbstractC1167b abstractC1167b = (b.AbstractC1167b) obj3;
            if (abstractC1167b instanceof mig.c) {
                mig.c cVar = (mig.c) obj3;
                hfg.o oVar = cVar.f205842b;
                String str3 = oVar.f151874a;
                String str4 = oVar.f151875b;
                String str5 = oVar.f151876c;
                String str6 = cVar.f205841a.f151868a;
                pVar.l2(new j1(pVar, str6, str3, str4, str5, new i(str3, str6), (Continuation) null, 22), new yi5.b(26));
            } else {
                if (!(abstractC1167b instanceof mig.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                hfg.o oVar2 = ((mig.d) obj3).f205843a;
                pVar.l2(new km2.n(18, pVar, oVar2.f151874a, oVar2.f151875b, oVar2.f151876c, (Continuation) null), new yi5.b(26));
            }
        }
        return Unit.f186387a;
    }
}
