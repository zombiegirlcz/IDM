package vy5;

import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f293217w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ io3.d f293218x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ sfe.m f293219y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, io3.d dVar, sfe.m mVar, Continuation continuation) {
        super(2, continuation);
        this.f293217w = wVar;
        this.f293218x = dVar;
        this.f293219y = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.f293217w, this.f293218x, this.f293219y, continuation);
        vVar.v = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((xfe.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xfe.e eVar = (xfe.e) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            if (eVar instanceof xfe.i) {
                w wVar = this.f293217w;
                if (((o8b.c) wVar.f293240y).g()) {
                    yji.n.P2(wVar, wVar.o2(new b2k.a(this.f293218x)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                } else {
                    boolean zF = ((xfe.i) eVar).f305253a.f(dj0.d.e);
                    this.v = null;
                    this.u = 1;
                    Object objY2 = wVar.Y2(this, new t(wVar, this.f293219y, zF, null));
                    if (objY2 != aVar) {
                        objY2 = Unit.f186387a;
                    }
                    if (objY2 == aVar) {
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
    }
}
