package h32;

import ack.n;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f149010w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f149010w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f149010w, continuation, 0);
            case 1:
                return new i(this.f149010w, continuation, 1);
            default:
                return new i(this.f149010w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objP;
        int i = this.u;
        Continuation continuation = null;
        k kVar = this.f149010w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    h hVar = new h(kVar, null);
                    this.v = 1;
                    if (u0.b0(kVar.X(), "MAIN_BUTTON_LOADING_TAG", hVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    int i5 = 2;
                    dx6.m mVar = new dx6.m(kVar, i5);
                    n nVar = new n(20);
                    g gVar = new g(kVar, continuation, i5);
                    this.v = 1;
                    objP = n14.k.P(kVar.X(), null, mVar, nVar, gVar, this);
                    if (objP == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objP = obj2;
                }
                nii.e eVar = (nii.e) objP;
                if (eVar instanceof nii.c) {
                    k.Companion.getClass();
                    Intrinsics.checkNotNullExpressionValue("k", "<get-APM_TAG>(...)");
                    Throwable th10 = ((nii.c) eVar).f216123a;
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "k", null, th10, h0Var);
                    kVar.B2();
                } else {
                    if (!(eVar instanceof nii.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    k.Companion.getClass();
                    Intrinsics.checkNotNullExpressionValue("k", "<get-APM_TAG>(...)");
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    nii.d dVar = (nii.d) eVar;
                    rd0.d.b(rd0.c.INFO, "k", j6.a.q("APM Confirmation Screen: tx success: ", ((d02.b) dVar.f216133a).f110284h), null, null, 16);
                    kVar.H2(kVar.f149015r, new j(dVar, 0));
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    g gVar2 = new g(kVar, continuation, 4);
                    this.v = 1;
                    if (u0.b0(kVar.X(), "SECONDARY_BUTTON_LOADING_TAG", gVar2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
