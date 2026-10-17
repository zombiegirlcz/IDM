package cvl;

import b8f.z;
import com.revolut.data.model.Data;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import cul.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.a0;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.screens.pocket_picker.b f109486w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.trading.orders.ui.screens.pocket_picker.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f109486w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f109486w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            case 1:
                h hVar2 = new h(this.f109486w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
            case 2:
                h hVar3 = new h(this.f109486w, continuation, 2);
                hVar3.v = obj2;
                return hVar3;
            case 3:
                h hVar4 = new h(this.f109486w, continuation, 3);
                hVar4.v = obj2;
                return hVar4;
            case 4:
                h hVar5 = new h(this.f109486w, continuation, 4);
                hVar5.v = obj2;
                return hVar5;
            case 5:
                h hVar6 = new h(this.f109486w, continuation, 5);
                hVar6.v = obj2;
                return hVar6;
            default:
                h hVar7 = new h(this.f109486w, continuation, 6);
                hVar7.v = obj2;
                return hVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((h) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((d1h.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        SourcePocket sourcePocket;
        Object next;
        int i = this.u;
        com.revolut.trading.orders.ui.screens.pocket_picker.b bVar = this.f109486w;
        switch (i) {
            case 0:
                Data data2 = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.getState(), new w0(data2, 22));
                break;
            case 1:
                Data data3 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.getState(), new w0(data3, 23));
                break;
            case 2:
                Data pocketSections = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fvl.l lVar = bVar.f107056s;
                l currentState = (l) ((j2) bVar.getState().f22677a).getValue();
                lVar.getClass();
                Intrinsics.checkNotNullParameter(currentState, "currentState");
                Intrinsics.checkNotNullParameter(pocketSections, "pocketSections");
                SourcePocket sourcePocket2 = currentState.f109491c;
                if (sourcePocket2 == null) {
                    String str = lVar.f138500a.f224463b;
                    try {
                        Object content = pocketSections.getContent();
                        if (content != null) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it8 = ((List) content).iterator();
                            while (it8.hasNext()) {
                                a0.x(((xdf.i) it8.next()).f304438b, arrayList);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it9 = arrayList.iterator();
                            while (it9.hasNext()) {
                                a0.x(((xdf.h) it9.next()).f304436c, arrayList2);
                            }
                            Iterator it10 = arrayList2.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    next = it10.next();
                                    if (Intrinsics.f(((SourcePocket) next).getF91780a(), str)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            sourcePocket = (SourcePocket) next;
                        } else {
                            sourcePocket = null;
                        }
                        data = new Data(sourcePocket, pocketSections.getError(), pocketSections.getLoading());
                    } catch (Throwable th10) {
                        data = new Data(null, th10, pocketSections.getLoading());
                    }
                    sourcePocket2 = (SourcePocket) data.getContent();
                }
                bVar.H2(bVar.getState(), new cui.v(sourcePocket2, pocketSections, 10));
                break;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.getState(), new w0(data4, 24));
                break;
            case 4:
                Pair pair = (Pair) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.getState(), new a82.n(((Boolean) pair.f186385a).booleanValue(), ((Boolean) pair.f186386b).booleanValue(), 4));
                break;
            case 5:
                Data data5 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.getState(), new w0(data5, 25));
                break;
            default:
                d1h.g gVar = (d1h.g) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.getState(), new z(gVar, 4));
                break;
        }
        return Unit.f186387a;
    }
}
