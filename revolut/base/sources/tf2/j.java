package tf2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import vkm.j2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f270217w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(m mVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f270217w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f270217w, continuation, 0);
            default:
                return new j(this.f270217w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        m mVar = this.f270217w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    uvl.c cVar = mVar.o;
                    this.v = 1;
                    cVar.getClass();
                    vf2.a aVar2 = new vf2.a(cVar, null);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, aVar2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                mVar.H2(mVar.f270221p, new td1.f((e) obj2, 11));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    e eVar = ((d) ((j2) mVar.f270221p.f22677a).getValue()).f270211a;
                    if (eVar == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    l lVar = new l(mVar, eVar, null);
                    this.v = 1;
                    obj2 = u0.b0(mVar.X(), "SUBMIT_BUTTON_TAG", lVar, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                nii.e eVar2 = (nii.e) obj2;
                if (eVar2 instanceof nii.d) {
                    mVar.C2(new f((k71.i) ((nii.d) eVar2).f216133a));
                }
                return Unit.f186387a;
        }
    }
}
