package qhb;

import cli.y;
import fnc.s;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qc0.w;
import skm.e0;
import skm.p0;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f246596w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f246596w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f246596w, continuation, 0);
            default:
                return new e(this.f246596w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        f fVar = this.f246596w;
        switch (i) {
            case 0:
                y yVar = fVar.f246597p;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    fkg.a aVar2 = fVar.o;
                    String str = ((a) ((j2) yVar.f22677a).getValue()).f246591a;
                    this.v = 1;
                    ihb.a aVar3 = new ihb.a((s) aVar2.f135824b, str, null, 1);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, aVar3, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                fVar.H2(yVar, new w((String) obj2, 13));
                return Unit.f186387a;
            default:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    fkg.a aVar4 = fVar.o;
                    String str2 = ((a) ((j2) fVar.f246597p.f22677a).getValue()).f246591a;
                    this.v = 1;
                    ihb.a aVar5 = new ihb.a((s) aVar4.f135824b, str2, null, 2);
                    p0 p0Var2 = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, aVar5, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                fVar.C2(b.f246593a);
                return Unit.f186387a;
        }
    }
}
