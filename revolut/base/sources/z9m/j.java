package z9m;

import dam.s;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f320534w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f320535x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f320535x = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f320535x, continuation, 0);
                jVar.f320534w = obj2;
                return jVar;
            default:
                j jVar2 = new j(this.f320535x, continuation, 1);
                jVar2.f320534w = obj2;
                return jVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        cam.c cVar = (cam.c) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(cVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws JSONException {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    cam.c cVar = (cam.c) this.f320534w;
                    k kVar = this.f320535x;
                    kVar.getClass();
                    cVar.getClass();
                    Object obj3 = cVar.f22670b;
                    Objects.toString(obj3);
                    s sVar = kVar.f320536a;
                    dam.m mVar = dam.m.UPDATE_URL;
                    JSONObject jSONObjectPut = new JSONObject().put("url", obj3);
                    this.v = 1;
                    if (sVar.i(mVar, jSONObjectPut, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                k kVar2 = this.f320535x;
                if (i2 == 0) {
                    o.b(obj2);
                    cam.c cVar2 = (cam.c) this.f320534w;
                    kVar2.getClass();
                    cVar2.getClass();
                    Object obj4 = cVar2.f22670b;
                    Objects.toString(obj4);
                    s sVar2 = kVar2.f320536a;
                    dam.m mVar2 = dam.m.SDK_ERROR;
                    JSONObject jSONObjectPut2 = new JSONObject().put("type", dam.k.NAVIGATION_ERROR.f112579a).put("data", new JSONObject().put("url", String.valueOf(obj4)));
                    this.v = 1;
                    if (sVar2.i(mVar2, jSONObjectPut2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                s sVar3 = kVar2.f320536a;
                this.v = 2;
                if (sVar3.I(this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
