package ysk;

import cel.k;
import cel.m;
import com.google.crypto.tink.shaded.protobuf.t1;
import gim.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import xsk.n;
import yhm.o;
import yhm.r;
import yo7.p;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f316507w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f316507w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f316507w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f316507w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((xsk.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        m mVar;
        Pair pair;
        List listA;
        Object next2;
        int i = this.u;
        d dVar = this.f316507w;
        switch (i) {
            case 0:
                xsk.f fVar = (xsk.f) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                dVar.X2(dVar.o, new p(fVar, 20));
                return Unit.f186387a;
            default:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (iVar.d()) {
                    xsk.f fVar2 = (xsk.f) iVar.c();
                    fuk.a aVar3 = dVar.f316508l;
                    vki.a aVar4 = dVar.o;
                    xsk.c cVar = (xsk.c) ((j2) aVar4.f22677a).getValue();
                    Iterator<E> it8 = n.a().iterator();
                    while (it8.hasNext()) {
                        int i2 = b.f316506a[((n) it8.next()).ordinal()];
                        int i3 = 3;
                        if (i2 == 1) {
                            r rVar = (r) t1.u(fVar2.f308560c, fVar2.d, fVar2.e).getContent();
                            dVar.X2(aVar4, new usk.f(rVar != null ? aVar3.a(cVar.f308555b.f308564b, (cel.n) rVar.f314201a, (cel.n) rVar.f314202b, (cel.n) rVar.f314203c) : vrk.d.f291612a, 1));
                        } else {
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            vrk.c cVar2 = cVar.f308555b.f308565c;
                            vrk.c cVar3 = vrk.a.f291609a;
                            if (Intrinsics.f(cVar2, cVar3)) {
                                r rVar2 = (r) t1.u(fVar2.f, fVar2.f308561g, fVar2.f308562h).getContent();
                                if (rVar2 != null) {
                                    cel.n nVar = (cel.n) rVar2.f314201a;
                                    cel.n nVar2 = (cel.n) rVar2.f314202b;
                                    cel.n nVar3 = (cel.n) rVar2.f314203c;
                                    vrk.c barSelection = cVar.f308555b.f308565c;
                                    cel.n[] charts = {nVar, nVar2, nVar3};
                                    l80.e eVar = aVar3.f138226a;
                                    Intrinsics.checkNotNullParameter(barSelection, "barSelection");
                                    Intrinsics.checkNotNullParameter(charts, "charts");
                                    if (Intrinsics.f(barSelection, cVar3)) {
                                        l80.f fVar3 = (l80.f) eVar;
                                        int monthValue = (fVar3.e().getMonthValue() / 4) + 1;
                                        Iterator<E> it9 = k.a().iterator();
                                        while (true) {
                                            if (it9.hasNext()) {
                                                next = it9.next();
                                                if (((k) next).b() == monthValue) {
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        k kVar = (k) next;
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 < i3) {
                                                List<m> listA2 = charts[i5].a();
                                                if (!(listA2 instanceof Collection) || !listA2.isEmpty()) {
                                                    for (m mVar2 : listA2) {
                                                        if (mVar2.f23505b == fVar3.j() && mVar2.f23506c == kVar) {
                                                            pair = new Pair(Integer.valueOf(fVar3.j()), kVar);
                                                        }
                                                    }
                                                }
                                                i5++;
                                                i3 = 3;
                                            } else {
                                                int i6 = i3;
                                                int i21 = 0;
                                                while (true) {
                                                    if (i21 < i6) {
                                                        Iterator it10 = charts[i21].a().iterator();
                                                        while (true) {
                                                            if (it10.hasNext()) {
                                                                next2 = it10.next();
                                                                if (((m) next2).f23505b == fVar3.j()) {
                                                                }
                                                            } else {
                                                                next2 = null;
                                                            }
                                                        }
                                                        mVar = (m) next2;
                                                        if (mVar == null) {
                                                            i21++;
                                                            i6 = 3;
                                                        }
                                                    } else {
                                                        mVar = null;
                                                    }
                                                }
                                                if (mVar == null) {
                                                    cel.n nVar4 = (cel.n) kotlin.collections.d.P(charts);
                                                    mVar = (nVar4 == null || (listA = nVar4.a()) == null) ? null : (m) d0.d0(listA);
                                                }
                                                pair = mVar != null ? new Pair(Integer.valueOf(mVar.f23505b), mVar.f23506c) : null;
                                            }
                                        }
                                        if (pair != null) {
                                            int iIntValue = ((Number) pair.f186385a).intValue();
                                            k kVar2 = (k) pair.f186386b;
                                            barSelection = kVar2 != null ? new vrk.b(iIntValue, kVar2) : null;
                                            if (barSelection != null) {
                                            }
                                        }
                                    } else if (!(barSelection instanceof vrk.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar3 = barSelection;
                                }
                                dVar.X2(aVar4, new usk.e(cVar3, 2));
                            } else {
                                continue;
                            }
                        }
                    }
                }
                return Unit.f186387a;
        }
    }
}
