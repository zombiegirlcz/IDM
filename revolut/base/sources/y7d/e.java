package y7d;

import com.revolut.feature.shared.help_centre.impl.faq.screens.ai_search.v2.AskAiScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y20.a1;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AskAiScreen f311471w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(AskAiScreen askAiScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f311471w = askAiScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f311471w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f311471w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e(this.f311471w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            default:
                e eVar4 = new e(this.f311471w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AskAiScreen askAiScreen = this.f311471w;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarT2 = askAiScreen.T2();
                Intrinsics.h(bool);
                boolean zBooleanValue = bool.booleanValue();
                x xVar = (x) nVarT2;
                xVar.getClass();
                xVar.x2(new xyh.n(zBooleanValue, 3));
                break;
            case 1:
                String str = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarT22 = askAiScreen.T2();
                Intrinsics.h(str);
                ((x) nVarT22).B2(str);
                break;
            case 2:
                String str2 = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarT23 = askAiScreen.T2();
                Intrinsics.h(str2);
                ((x) nVarT23).B2(str2);
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarT24 = askAiScreen.T2();
                Intrinsics.h(clickData);
                x xVar2 = (x) nVarT24;
                xVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                String str3 = clickData.f275445a;
                if (obj3 instanceof a8d.c) {
                    xVar2.n2(new a1(xVar2, str3, null, 10), new whi.b(6));
                } else if (Intrinsics.f(str3, "TRY_AGAIN_ITEM_ID")) {
                    xVar2.A2();
                }
                break;
        }
        return Unit.f186387a;
    }
}
