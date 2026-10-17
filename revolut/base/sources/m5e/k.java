package m5e;

import avk.a0;
import avk.x;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f202920w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f202920w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f202920w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            case 1:
                k kVar2 = new k(this.f202920w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
            case 2:
                k kVar3 = new k(this.f202920w, continuation, 2);
                kVar3.v = obj2;
                return kVar3;
            case 3:
                k kVar4 = new k(this.f202920w, continuation, 3);
                kVar4.v = obj2;
                return kVar4;
            case 4:
                k kVar5 = new k(this.f202920w, continuation, 4);
                kVar5.v = obj2;
                return kVar5;
            case 5:
                k kVar6 = new k(this.f202920w, continuation, 5);
                kVar6.v = obj2;
                return kVar6;
            case 6:
                k kVar7 = new k(this.f202920w, continuation, 6);
                kVar7.v = obj2;
                return kVar7;
            case 7:
                k kVar8 = new k(this.f202920w, continuation, 7);
                kVar8.v = obj2;
                return kVar8;
            case 8:
                k kVar9 = new k(this.f202920w, continuation, 8);
                kVar9.v = obj2;
                return kVar9;
            case 9:
                k kVar10 = new k(this.f202920w, continuation, 9);
                kVar10.v = obj2;
                return kVar10;
            case 10:
                k kVar11 = new k(this.f202920w, continuation, 10);
                kVar11.v = obj2;
                return kVar11;
            case 11:
                k kVar12 = new k(this.f202920w, continuation, 11);
                kVar12.v = obj2;
                return kVar12;
            case 12:
                k kVar13 = new k(this.f202920w, continuation, 12);
                kVar13.v = obj2;
                return kVar13;
            case 13:
                k kVar14 = new k(this.f202920w, continuation, 13);
                kVar14.v = obj2;
                return kVar14;
            default:
                k kVar15 = new k(this.f202920w, continuation, 14);
                kVar15.v = obj2;
                return kVar15;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((w4e.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((k) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((k) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((k) create((a5e.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((k) create((s4e.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((k) create((t4e.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((k) create((y4e.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((k) create((x4e.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((k) create((e3h.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((k) create((h3h.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((k) create((z4e.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((u4e.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        m mVar = this.f202920w;
        switch (i) {
            case 0:
                w4e.b bVar = (w4e.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.H2(mVar.D, new m11.h(bVar, 16));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.H2(mVar.D, new m58.l(data, 4));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.H2(mVar.D, new m58.l(data2, 5));
                break;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.H2(mVar.D, new m58.l(data3, 6));
                break;
            case 4:
                List list = (List) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.H2(mVar.D, new lsl.d(list, 3));
                break;
            case 5:
                List list2 = (List) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.H2(mVar.D, new lsl.d(list2, 4));
                break;
            case 6:
                a5e.f fVar = (a5e.f) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.H2(mVar.D, new j(fVar, 0));
                break;
            case 7:
                s4e.d dVar = (s4e.d) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.H2(mVar.D, new m11.h(dVar, 17));
                break;
            case 8:
                t4e.d dVar2 = (t4e.d) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.H2(mVar.D, new m11.h(dVar2, 18));
                break;
            case 9:
                y4e.d dVar3 = (y4e.d) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.H2(mVar.D, new m11.h(dVar3, 19));
                break;
            case 10:
                x4e.d dVar4 = (x4e.d) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.H2(mVar.D, new l(dVar4, 0));
                break;
            case 11:
                e3h.c cVar = (e3h.c) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.H2(mVar.D, new x(cVar, 4));
                break;
            case 12:
                h3h.d dVar5 = (h3h.d) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.H2(mVar.D, new a0(dVar5, 2));
                break;
            case 13:
                z4e.d dVar6 = (z4e.d) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.H2(mVar.D, new m11.h(dVar6, 20));
                break;
            default:
                u4e.d dVar7 = (u4e.d) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.H2(mVar.D, new m11.h(dVar7, 21));
                break;
        }
        return Unit.f186387a;
    }
}
