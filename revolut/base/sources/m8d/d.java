package m8d;

import com.revolut.feature.shared.help_centre.impl.faq.screens.pigeon.content.PigeonContentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PigeonContentScreen f203491w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(PigeonContentScreen pigeonContentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f203491w = pigeonContentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f203491w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f203491w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d(this.f203491w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            default:
                d dVar4 = new d(this.f203491w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        PigeonContentScreen pigeonContentScreen = this.f203491w;
        switch (i) {
            case 0:
                ip0.y clickData = (ip0.y) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarT2 = pigeonContentScreen.T2();
                Intrinsics.h(clickData);
                h0 h0Var = (h0) uVarT2;
                h0Var.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                h0Var.u.v1(clickData);
                break;
            case 1:
                String itemId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarT22 = pigeonContentScreen.T2();
                Intrinsics.h(itemId);
                h0 h0Var2 = (h0) uVarT22;
                h0Var2.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (Intrinsics.f(itemId, "DONE_BUTTON_ITEM_ID")) {
                    h0Var2.v2(o.f203517a);
                }
                break;
            case 2:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarT23 = pigeonContentScreen.T2();
                String url2 = aVar3.f275445a;
                h0 h0Var3 = (h0) uVarT23;
                h0Var3.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                h0Var3.n2(new m2f.b0(h0Var3, url2, continuation, 11), new whi.b(6));
                break;
            default:
                ty0.a aVar5 = (ty0.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarT24 = pigeonContentScreen.T2();
                String itemId2 = aVar5.f275445a;
                Object obj3 = aVar5.d;
                h0 h0Var4 = (h0) uVarT24;
                h0Var4.getClass();
                Intrinsics.checkNotNullParameter(itemId2, "itemId");
                if (obj3 instanceof aj0.g) {
                    h0Var4.n2(new e0(h0Var4, (aj0.g) obj3, null, 0), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
