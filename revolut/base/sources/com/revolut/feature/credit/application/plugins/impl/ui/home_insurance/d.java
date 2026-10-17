package com.revolut.feature.credit.application.plugins.impl.ui.home_insurance;

import dc4.l;
import elm.f;
import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import n14.k;
import nii.g;
import nii.h;
import skm.e0;
import skm.p0;
import vkm.j2;
import wli.x;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f67780w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f67781x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f67780w = eVar;
        this.f67781x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f67780w, this.f67781x, continuation, 0);
            case 1:
                return new d(this.f67780w, this.f67781x, continuation, 1);
            case 2:
                return new d(this.f67780w, this.f67781x, continuation, 2);
            case 3:
                return new d(this.f67780w, this.f67781x, continuation, 3);
            default:
                return new d(this.f67780w, this.f67781x, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        e eVar;
        Object objV;
        e eVar2;
        Object objV2;
        int i = this.u;
        int i2 = 0;
        String str = this.f67781x;
        Continuation continuation = null;
        e eVar3 = this.f67780w;
        int i3 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                kx3.a aVar2 = eVar3.f67782p;
                h1 h1VarA9 = eVar3.f67783q.a9();
                this.v = 1;
                m34.c cVar = aVar2.f190377a;
                cVar.getClass();
                m34.b bVar = new m34.b(cVar, h1VarA9, this.f67781x, null, 0);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(f.f127540b, bVar, this);
                return objJ == aVar ? aVar : objJ;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                kx3.a aVar4 = eVar3.f67782p;
                h1 h1VarA92 = eVar3.f67783q.a9();
                this.v = 1;
                m34.c cVar2 = aVar4.f190377a;
                cVar2.getClass();
                m34.b bVar2 = new m34.b(cVar2, h1VarA92, this.f67781x, null, 1);
                p0 p0Var2 = p0.f264001a;
                Object objJ2 = e0.J(f.f127540b, bVar2, this);
                return objJ2 == aVar3 ? aVar3 : objJ2;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                x xVar = eVar3.f67784r;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, this.f67781x, null, null, this, 6);
                return objX1 == aVar5 ? aVar5 : objX1;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                e eVar4 = this.f67780w;
                if (i22 == 0) {
                    o.b(obj2);
                    an1.d dVar = new an1.d(eVar4, 10);
                    d dVar2 = new d(eVar4, str, continuation, i2);
                    this.v = 1;
                    eVar = eVar4;
                    objV = k.V(eVar, null, null, dVar, dVar2, this, 3);
                    if (objV == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objV = obj2;
                    eVar = eVar4;
                }
                h hVar = (h) objV;
                if (hVar instanceof g) {
                    g gVar = (g) hVar;
                    e.Q2(eVar, gVar.f216153b, (uy3.i) gVar.f216152a);
                }
                return Unit.f186387a;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                e eVar5 = this.f67780w;
                if (i32 == 0) {
                    o.b(obj2);
                    uy3.e eVar6 = ((HomeInsuranceFlowContract$State) ((j2) eVar5.f67786t.f22677a).getValue()).f67771a;
                    if (eVar6 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    an1.d dVar3 = new an1.d(eVar6, 11);
                    d dVar4 = new d(eVar5, str, continuation, i3);
                    this.v = 1;
                    eVar2 = eVar5;
                    objV2 = k.V(eVar2, null, null, dVar3, dVar4, this, 3);
                    if (objV2 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i32 != 1) {
                        if (i32 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    objV2 = obj2;
                    eVar2 = eVar5;
                }
                h hVar2 = (h) objV2;
                if (hVar2 instanceof g) {
                    l lVar = new l(eVar2, (g) hVar2, null, 0);
                    this.v = 2;
                    if (eVar2.p2(this, lVar) == aVar7) {
                        return aVar7;
                    }
                }
                return Unit.f186387a;
        }
    }
}
