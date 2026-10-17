package com.revolut.feature.credit.application.plugins.impl.ui.rollee;

import cli.y;
import elm.f;
import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import qc0.w;
import qh4.b0;
import qh4.s;
import skm.e0;
import skm.p0;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f68339w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(b0 b0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f68339w = b0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f68339w, continuation, 0);
            default:
                return new d(this.f68339w, continuation, 1);
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
        int i = this.u;
        Continuation continuation = null;
        b0 b0Var = this.f68339w;
        switch (i) {
            case 0:
                y yVar = b0Var.f246454r;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    cy3.a aVar2 = b0Var.f246453q;
                    String str = ((s) ((j2) yVar.f22677a).getValue()).f246474a.f66498a;
                    h1 h1VarA9 = b0Var.o.a9();
                    this.v = 1;
                    g44.b bVar = aVar2.f110037a;
                    bVar.getClass();
                    g44.a aVar3 = new g44.a(bVar, h1VarA9, str, (Continuation) null);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(f.f127540b, aVar3, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                b0Var.H2(yVar, new w((String) obj2, 12));
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    d dVar = new d(b0Var, continuation, 0);
                    this.v = 1;
                    if (b0Var.p2(this, dVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
