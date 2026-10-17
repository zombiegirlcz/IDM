package j2g;

import com.revolut.feature.travel.experiences.api.models.config.TravelExperiencesSelectedLocation;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import efm.d0;
import j2g.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f170885w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = yVar;
        this.f170885w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new v(this.v, this.f170885w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((v) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = this.v;
        cli.y yVar2 = yVar.f170892x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            c1g.l lVar = yVar.v;
            TravelExperienceDatesSelection datesSelection = ((h) ((j2) yVar2.f22677a).getValue()).f170866a;
            lVar.getClass();
            String str = this.f170885w;
            Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-travel-experiences-api-models-search-LocationId-DestinationId$-destinationId$0");
            Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
            w4l.h loadingStrategy = w4l.h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            d0 d0VarFirstOrError = zi0.c.J(lVar.a(str, datesSelection, loadingStrategy)).firstOrError();
            Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
            pfm.z zVarF = ue0.e.F(zi0.c.s(nim.a.x(d0VarFirstOrError, new c09.a(4))), Boolean.FALSE);
            this.u = 1;
            obj2 = nim.a.b(zVarF, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Boolean bool = (Boolean) obj2;
        TravelExperienceDatesSelection travelExperienceDatesSelection = ((h) ((j2) yVar2.f22677a).getValue()).f170866a;
        TravelExperiencesSelectedLocation travelExperiencesSelectedLocation = ((h) ((j2) yVar2.f22677a).getValue()).f170867b;
        Intrinsics.h(bool);
        yVar.C2(new k.a(travelExperienceDatesSelection, travelExperiencesSelectedLocation, bool.booleanValue()));
        return Unit.f186387a;
    }
}
