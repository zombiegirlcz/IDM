package yw9;

import e60.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import vkm.j2;
import zhm.h0;
import zlg.r;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f317369w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(w wVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f317369w = wVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f317369w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(this.f317369w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
            case 2:
                o oVar3 = new o(this.f317369w, continuation, 2);
                oVar3.v = obj2;
                return oVar3;
            case 3:
                o oVar4 = new o(this.f317369w, continuation, 3);
                oVar4.v = obj2;
                return oVar4;
            case 4:
                o oVar5 = new o(this.f317369w, continuation, 4);
                oVar5.v = obj2;
                return oVar5;
            default:
                o oVar6 = new o(this.f317369w, continuation, 5);
                oVar6.v = obj2;
                return oVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((do3.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create((iw9.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((o) create((dpg.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((o) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((o) create((iw9.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((e60.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        final iw9.c cVar;
        int i = this.u;
        Object obj3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final int i2 = 1;
        w wVar = this.f317369w;
        switch (i) {
            case 0:
                do3.n nVar = (do3.n) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wVar.H2(wVar.f317387t, new a2f.j(nVar, 23));
                break;
            case 1:
                iw9.b bVar = (iw9.b) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cli.y yVar = wVar.f317387t;
                wVar.H2(yVar, new yuc.p(bVar, 10));
                if (d0.W(((e) ((j2) yVar.f22677a).getValue()).f317355a) && (cVar = (iw9.c) zhm.d0.d0(bVar.f168999a)) != null) {
                    wVar.J2(cVar.f169000a);
                    final int i3 = 0;
                    wVar.H2(yVar, new Function1() { // from class: yw9.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i3) {
                                case 0:
                                    e update = (e) obj4;
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    return e.a(update, null, new dpg.a(r.c.f323267a, cVar.f169000a), null, null, null, 29);
                                default:
                                    return e.a((e) obj4, null, null, null, null, cVar, 15);
                            }
                        }
                    });
                }
                break;
            case 2:
                dpg.a aVar3 = (dpg.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wVar.H2(wVar.f317387t, new epg.s(aVar3, 1));
                break;
            case 3:
                String str = (String) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                iw9.b bVar2 = ((e) ((j2) wVar.f317387t.f22677a).getValue()).d;
                if (bVar2 != null) {
                    Iterator it8 = bVar2.f168999a.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            Object next = it8.next();
                            if (Intrinsics.f(((iw9.c) next).f169000a, str)) {
                                obj3 = next;
                            }
                        }
                    }
                }
                break;
            case 4:
                final iw9.c cVar2 = (iw9.c) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wVar.H2(wVar.f317387t, new Function1() { // from class: yw9.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        switch (i2) {
                            case 0:
                                e update = (e) obj4;
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                return e.a(update, null, new dpg.a(r.c.f323267a, cVar2.f169000a), null, null, null, 29);
                            default:
                                return e.a((e) obj4, null, null, null, null, cVar2, 15);
                        }
                    }
                });
                break;
            default:
                e60.l lVar = (e60.l) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                int i5 = 26;
                if (lVar instanceof e60.m) {
                    wVar.l2(new r(wVar, ((e60.m) lVar).b(), objArr2 == true ? 1 : 0, i2), new yi5.b(i5));
                } else if (lVar instanceof l.a) {
                    wVar.l2(new n(wVar, objArr == true ? 1 : 0, i2), new yi5.b(i5));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Unsupported result: ".concat(lVar.getClass().getSimpleName()));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                break;
        }
        return Unit.f186387a;
    }
}
