package s2g;

import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceVisitorsSelection;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.model.TravelExperienceOptionSelectionV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f259326w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TravelExperienceOptionSelectionV2 f259327x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(w wVar, TravelExperienceOptionSelectionV2 travelExperienceOptionSelectionV2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f259326w = wVar;
        this.f259327x = travelExperienceOptionSelectionV2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f259326w, this.f259327x, continuation, 0);
            default:
                return new s(this.f259326w, this.f259327x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        pyf.a aVar;
        String str;
        switch (this.u) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                w wVar = this.f259326w;
                c1g.y yVar = wVar.f259332r;
                u2g.a aVar3 = wVar.u;
                myf.a experience = wVar.f259335w.a();
                TravelExperienceVisitorsSelection visitorsSelection = ((j) wVar.t2()).d.f240825b;
                xi0.b currency = wVar.f259330p.d;
                u2g.b bVar = (u2g.b) aVar3;
                bVar.getClass();
                TravelExperienceOptionSelectionV2 selection = this.f259327x;
                Intrinsics.checkNotNullParameter(selection, "selection");
                Intrinsics.checkNotNullParameter(experience, "experience");
                Intrinsics.checkNotNullParameter(visitorsSelection, "visitorsSelection");
                Intrinsics.checkNotNullParameter(currency, "currency");
                if (selection instanceof TravelExperienceOptionSelectionV2.Option) {
                    aVar = new pyf.a(experience.f210451a, ((TravelExperienceOptionSelectionV2.Option) selection).f93096a.f92869a.f92859a, a1g.f.f(bVar.a(selection)), currency.f306286a, null, visitorsSelection.f92916a);
                } else {
                    if (!(selection instanceof TravelExperienceOptionSelectionV2.OptionWithTimes)) {
                        throw new IllegalStateException("Cannot provide availability params from NoSelection type");
                    }
                    String str2 = experience.f210451a;
                    TravelExperienceOptionSelectionV2.OptionWithTimes optionWithTimes = (TravelExperienceOptionSelectionV2.OptionWithTimes) selection;
                    aVar = new pyf.a(str2, optionWithTimes.f93097a.f92869a.f92859a, a1g.f.f(bVar.a(selection)), currency.f306286a, optionWithTimes.f93098b.f92856a.toString(), visitorsSelection.f92916a);
                }
                this.v = 1;
                Object objA = yVar.f20514a.a(aVar, this);
                return objA == aVar2 ? aVar2 : objA;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                w wVar2 = this.f259326w;
                c1g.y yVar2 = wVar2.f259332r;
                String str3 = wVar2.f259335w.a().f210451a;
                TravelExperienceOptionSelectionV2 travelExperienceOptionSelectionV2 = this.f259327x;
                if (travelExperienceOptionSelectionV2 instanceof TravelExperienceOptionSelectionV2.Option) {
                    str = ((TravelExperienceOptionSelectionV2.Option) travelExperienceOptionSelectionV2).f93096a.f92869a.f92859a;
                } else {
                    if (!(travelExperienceOptionSelectionV2 instanceof TravelExperienceOptionSelectionV2.OptionWithTimes)) {
                        throw new IllegalStateException("Cannot provide option ID from NoSelection type");
                    }
                    str = ((TravelExperienceOptionSelectionV2.OptionWithTimes) travelExperienceOptionSelectionV2).f93097a.f92869a.f92859a;
                }
                this.v = 1;
                Object objB = yVar2.f20514a.b(str3, str, this);
                return objB == aVar4 ? aVar4 : objB;
        }
    }
}
