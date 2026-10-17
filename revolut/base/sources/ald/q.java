package ald;

import com.revolut.feature.slot_manager.api.model.SlotContext;
import cp4.i0;
import dp4.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KTypeProjection;
import skm.e0;
import wim.z;
import zh9.u0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class q extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f6241w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f6242x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f6242x = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                q qVar = new q((r) this.f6242x, (Continuation) obj4, 0);
                qVar.v = (SlotContext) obj2;
                qVar.f6241w = (tkd.l) obj3;
                return qVar.invokeSuspend(Unit.f186387a);
            case 1:
                q qVar2 = new q((o0) this.f6242x, (Continuation) obj4, 1);
                qVar2.v = (i0) obj2;
                qVar2.f6241w = (cl4.m) obj3;
                return qVar2.invokeSuspend(Unit.f186387a);
            case 2:
                q qVar3 = new q((ff8.d) this.f6242x, (Continuation) obj4, 2);
                qVar3.v = (String) obj2;
                qVar3.f6241w = (List) obj3;
                return qVar3.invokeSuspend(Unit.f186387a);
            case 3:
                q qVar4 = new q((hi3.i) this.f6242x, (Continuation) obj4, 3);
                qVar4.v = (hi3.e) obj2;
                qVar4.f6241w = (List) obj3;
                return qVar4.invokeSuspend(Unit.f186387a);
            case 4:
                q qVar5 = new q((qj8.j) this.f6242x, (Continuation) obj4, 4);
                qVar5.v = (String) obj2;
                qVar5.f6241w = (List) obj3;
                return qVar5.invokeSuspend(Unit.f186387a);
            case 5:
                q qVar6 = new q((vpk.p) this.f6242x, (Continuation) obj4, 5);
                qVar6.v = (vpk.g) obj2;
                qVar6.f6241w = (qta.b) obj3;
                return qVar6.invokeSuspend(Unit.f186387a);
            case 6:
                q qVar7 = new q((xr3.k) this.f6242x, (Continuation) obj4, 6);
                qVar7.v = (xr3.i) obj2;
                qVar7.f6241w = (it3.i) obj3;
                return qVar7.invokeSuspend(Unit.f186387a);
            default:
                q qVar8 = new q((zuh.o) this.f6242x, (Continuation) obj4, 7);
                qVar8.v = (pil.d) obj2;
                qVar8.f6241w = (List) obj3;
                return qVar8.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Object obj3 = this.f6242x;
        switch (i) {
            case 0:
                SlotContext slotContext = (SlotContext) this.v;
                tkd.l lVar = (tkd.l) this.f6241w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar = (r) obj3;
                rVar.d.G(lVar, rVar.b(slotContext), z.d(kotlin.jvm.internal.o0.b(tkd.l.class)));
                break;
            case 1:
                i0 i0Var = (i0) this.v;
                cl4.m mVar = (cl4.m) this.f6241w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o0) obj3).f116673c.b(i0Var, ko4.b.b(mVar));
                break;
            case 2:
                String str = (String) this.v;
                List list = (List) this.f6241w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ff8.d) obj3).f134770c.G(ue8.b.c(list), ff8.c.a(ff8.d.Companion, str), kii.e.o(bf8.b.class, KTypeProjection.INSTANCE, List.class));
                break;
            case 3:
                hi3.e eVar = (hi3.e) this.v;
                List list2 = (List) this.f6241w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((hi3.i) obj3).f152490c;
                String strC = eVar.c("pre_orders");
                List list3 = list2;
                ArrayList arrayList = new ArrayList(w.t(list3, 10));
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    arrayList.add(gc0.c.x((pi3.l) it8.next()));
                }
                cVar.G(arrayList, strC, kii.e.o(mi3.c.class, KTypeProjection.INSTANCE, List.class));
                break;
            case 4:
                String str2 = (String) this.v;
                List list4 = (List) this.f6241w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qj8.j jVar = (qj8.j) obj3;
                e0.C(jVar.d, null, null, new qj8.i(jVar.f, null, jVar, str2, list4, 0), 3);
                break;
            case 5:
                vpk.g gVar = (vpk.g) this.v;
                qta.b bVar = (qta.b) this.f6241w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                epk.b bVarS = io3.h.S(gVar.c());
                jpk.c cVar2 = ((vpk.p) obj3).d;
                jpk.a aVarV = d8l.d.v(bVar, cp5.d.d(gVar.a()), bVarS.a());
                List listA = bVar.a();
                ArrayList arrayList2 = new ArrayList(w.t(listA, 10));
                Iterator it9 = listA.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(d8l.d.w((qta.j) it9.next()));
                }
                cVar2.b(aVarV, arrayList2);
                break;
            case 6:
                xr3.i iVar = (xr3.i) this.v;
                it3.i iVar2 = (it3.i) this.f6241w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xr3.k) obj3).d.G(u0.X(iVar2), xr3.k.a(iVar), z.d(kotlin.jvm.internal.o0.b(tr3.c.class)));
                break;
            default:
                pil.d dVar = (pil.d) this.v;
                List list5 = (List) this.f6241w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((zuh.o) obj3).f325480a.G(list5, zuh.o.b(dVar), kii.e.o(String.class, KTypeProjection.INSTANCE, List.class));
                break;
        }
        return Unit.f186387a;
    }
}
