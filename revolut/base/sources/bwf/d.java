package bwf;

import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.feature.transport.impl.ui.hub.TransportHubFlow;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransportHubFlow f19325w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TransportHubFlow transportHubFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f19325w = transportHubFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f19325w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f19325w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d(this.f19325w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            default:
                d dVar4 = new d(this.f19325w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransportHubFlow transportHubFlow = this.f19325w;
        switch (i) {
            case 0:
                h hVar = (h) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = TransportHubFlow.X;
                transportHubFlow.Y2().f129785b.setMenuItems(hVar.f19330b);
                break;
            case 1:
                String str = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarZ2 = transportHubFlow.Z2();
                Intrinsics.h(str);
                ((com.revolut.feature.transport.impl.ui.hub.a) gVarZ2).s2(str);
                break;
            case 2:
                List list = (List) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr2 = TransportHubFlow.X;
                DraggableTabsView transportHubTabs = transportHubFlow.Y2().f129786c;
                Intrinsics.checkNotNullExpressionValue(transportHubTabs, "transportHubTabs");
                DraggableTabsView.setItems$default(transportHubTabs, list, null, 2, null);
                break;
            default:
                String str2 = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr3 = TransportHubFlow.X;
                DraggableTabsView transportHubTabs2 = transportHubFlow.Y2().f129786c;
                Intrinsics.checkNotNullExpressionValue(transportHubTabs2, "transportHubTabs");
                int i2 = DraggableTabsView.f58519q;
                transportHubTabs2.o(str2, true, false);
                break;
        }
        return Unit.f186387a;
    }
}
