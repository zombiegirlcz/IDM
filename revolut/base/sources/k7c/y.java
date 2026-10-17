package k7c;

import com.revolut.feature.revolutpay.impl.data.service.RevolutPayService;
import h7c.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ u6c.u A;
    public final /* synthetic */ xi0.b B;
    public int u;
    public final /* synthetic */ z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f182019w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f182020x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u6c.t f182021y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, String str, String str2, u6c.t tVar, String str3, u6c.u uVar, xi0.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = zVar;
        this.f182019w = str;
        this.f182020x = str2;
        this.f182021y = tVar;
        this.z = str3;
        this.A = uVar;
        this.B = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new y(this.v, this.f182019w, this.f182020x, this.f182021y, this.z, this.A, this.B, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f182020x;
        String str2 = this.f182019w;
        z zVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            RevolutPayService revolutPayService = zVar.f182025a;
            h7c.a aVar2 = new h7c.a(new a.C0862a(str2, str), null, 2);
            this.u = 1;
            if (revolutPayService.updateUserPreferences(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        zVar.getClass();
        ne0.j jVar = zVar.f182026b;
        String strH = z.h(this.f182021y, this.z, this.A, this.B);
        v7c.b bVar = (v7c.b) jVar.get(strH);
        if (bVar != null) {
            jVar.f(strH, v7c.b.a(bVar, null, str2, str, 1));
            x4l.c.a(zVar.f182028g, new d(5));
        }
        return Unit.f186387a;
    }
}
