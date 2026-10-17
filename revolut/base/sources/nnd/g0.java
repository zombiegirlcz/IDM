package nnd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f217546w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f217547x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i0 f217548y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i, Continuation continuation, i0 i0Var) {
        super(3, continuation);
        this.u = i;
        this.f217548y = i0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                g0 g0Var = new g0(0, continuation, this.f217548y);
                g0Var.f217546w = flowCollector;
                g0Var.f217547x = obj3;
                return g0Var.invokeSuspend(Unit.f186387a);
            default:
                g0 g0Var2 = new g0(1, continuation, this.f217548y);
                g0Var2.f217546w = flowCollector;
                g0Var2.f217547x = obj3;
                return g0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        md6.b bVarA;
        md6.b bVar;
        md6.e eVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f217546w;
                    List analyticsAccounts = (List) this.f217547x;
                    qnd.b bVar2 = this.f217548y.f217554q;
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(analyticsAccounts, "analyticsAccounts");
                    i4b.f fVar = bVar2.f247937a;
                    List list = analyticsAccounts;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            c1 c1Var = (c1) it8.next();
                            if (c1Var instanceof y0) {
                                bVarA = qnd.b.b(md6.e.CURRENCY, ((y0) c1Var).f217608b);
                            } else if (c1Var instanceof z0) {
                                bVarA = qnd.b.c(((z0) c1Var).f217611b);
                            } else if (c1Var instanceof x0) {
                                bVarA = qnd.b.a(md6.e.CURRENCY);
                            } else if (c1Var instanceof r0) {
                                bVarA = qnd.b.b(md6.e.JOINT, ((r0) c1Var).f217586b);
                            } else if (c1Var instanceof t0) {
                                bVarA = qnd.b.c(((t0) c1Var).f217594b);
                            } else if (c1Var instanceof q0) {
                                bVarA = qnd.b.a(md6.e.JOINT);
                            } else if (c1Var instanceof a1) {
                                bVarA = qnd.b.a(md6.e.PRO);
                            } else if (c1Var instanceof b1) {
                                bVarA = qnd.b.b(md6.e.PRO, ((b1) c1Var).f217530b);
                            } else {
                                if (c1Var instanceof w0) {
                                    xi0.b bVar3 = ((w0) c1Var).f217603b.f115083b;
                                    bVar = new md6.b(md6.e.LINKED, qnd.b.d(bVar3), bVar3 != null ? md6.d.OPENED : md6.d.DISCOVERY, md6.f.SIMPLE);
                                } else if (c1Var instanceof o0) {
                                    dj0.d dVar = ((o0) c1Var).f217576b;
                                    bVarA = new md6.b(md6.e.CREDIT, qnd.b.d(dVar != null ? dVar.f115083b : null), (dVar != null ? dVar.f115083b : null) != null ? md6.d.OPENED : md6.d.DISCOVERY, md6.f.SIMPLE);
                                } else if (c1Var instanceof m0) {
                                    bVarA = qnd.b.a(md6.e.YOUTH);
                                } else if (c1Var instanceof u0) {
                                    bVarA = qnd.b.b(md6.e.YOUTH, ((u0) c1Var).f217597b);
                                } else if (c1Var instanceof p0) {
                                    rnd.d dVar2 = ((p0) c1Var).f217579b;
                                    ncd.g gVar = dVar2.f255602g;
                                    xi0.b bVar4 = dVar2.f255601c.f115083b;
                                    int i2 = gVar == null ? -1 : qnd.a.f247936a[gVar.ordinal()];
                                    if (i2 == -1) {
                                        eVar = md6.e.SAVINGS;
                                    } else if (i2 == 1 || i2 == 2) {
                                        eVar = md6.e.SAVINGS_DEPOSITS;
                                    } else {
                                        if (i2 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar = md6.e.SAVINGS_MMF;
                                    }
                                    bVar = new md6.b(eVar, qnd.b.d(bVar4), bVar4 != null ? md6.d.OPENED : md6.d.DISCOVERY, md6.f.SIMPLE);
                                } else if (c1Var instanceof v0) {
                                    rnd.e eVar2 = ((v0) c1Var).f217601b;
                                    bVar = new md6.b(md6.e.YOUTH_SAVINGS, qnd.b.d(eVar2.f255606c.f115083b), eVar2.f255606c.f115083b != null ? md6.d.OPENED : md6.d.DISCOVERY, md6.f.SIMPLE);
                                } else if (c1Var instanceof s0) {
                                    rnd.d dVar3 = ((s0) c1Var).f217591b;
                                    bVar = new md6.b(md6.e.JOINT_SAVINGS, qnd.b.d(dVar3.f255601c.f115083b), dVar3.f255601c.f115083b != null ? md6.d.OPENED : md6.d.DISCOVERY, md6.f.SIMPLE);
                                } else if (c1Var instanceof l0) {
                                    bVarA = qnd.b.a(md6.e.JOINT_SAVINGS);
                                } else {
                                    if (!(c1Var instanceof n0)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVarA = qnd.b.a(md6.e.SAVINGS);
                                }
                                bVarA = bVar;
                            }
                            arrayList.add(bVarA);
                        } else {
                            vkm.y yVarJ = fVar.j(new md6.c(arrayList));
                            this.f217546w = null;
                            this.f217547x = null;
                            this.v = 1;
                            if (vkm.q.u(flowCollector, yVarJ, this) == aVar) {
                                return aVar;
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f217546w;
                    i0 i0Var = this.f217548y;
                    c0 c0Var = i0Var.o;
                    Continuation continuation = null;
                    Flow flowH = xam.a.h(new nn7.d(c0Var, continuation, 2), ((rnd.y) c0Var.f217534a).d());
                    rnd.y yVar = (rnd.y) i0Var.f217553p;
                    int i5 = 21;
                    akg.n nVarV = nim.a.v(zh9.u0.i(flowH, vkm.q.q(vkm.q.Q(yVar.f255654n, new om4.r0(continuation, yVar, continuation, i5))), vkm.q.q(new lfg.d0(i0Var.f217558w, i5))), new nn3.z(i0Var, 8));
                    this.f217546w = null;
                    this.f217547x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVarV, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
