package p68;

import com.revolut.feature.junior.account_activation.impl.ui.screen.terms_conditions.TermsAndConditionsDetailsScreen;
import com.revolut.kompot.common.ExternalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TermsAndConditionsDetailsScreen f233225w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TermsAndConditionsDetailsScreen termsAndConditionsDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f233225w = termsAndConditionsDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f233225w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f233225w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ty0.a aVar = (ty0.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TermsAndConditionsDetailsScreen termsAndConditionsDetailsScreen = this.f233225w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVarE3 = termsAndConditionsDetailsScreen.e3();
                Intrinsics.h(clickData);
                i iVar = (i) fVarE3;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                String str = obj3 instanceof String ? (String) obj3 : null;
                if (str == null) {
                    throw new IllegalArgumentException(j6.a.s("Cannot handle click on footer terms id=", clickData.f275445a, ", text=", clickData.f275446b, ". Parcel is not a valid link."));
                }
                iVar.C1(new ExternalDestination.Browser(str, null));
                return Unit.f186387a;
            default:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVarE32 = termsAndConditionsDetailsScreen.e3();
                Intrinsics.h(clickData2);
                i iVar2 = (i) fVarE32;
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                Object obj4 = clickData2.d;
                String str2 = obj4 instanceof String ? (String) obj4 : null;
                if (str2 == null) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.s("Cannot handle click on row terms id=", clickData2.f275445a, ", text=", clickData2.f275446b, ". Parcel is not a valid link."));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                } else {
                    iVar2.C1(new ExternalDestination.Browser(str2, null));
                }
                return Unit.f186387a;
        }
    }
}
