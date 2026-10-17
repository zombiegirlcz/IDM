package dam;

import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f112595w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f112596x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(s sVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f112596x = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f112596x, continuation, 0);
                uVar.f112595w = obj2;
                return uVar;
            default:
                u uVar2 = new u(this.f112596x, continuation, 1);
                uVar2.f112595w = obj2;
                return uVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        cam.c cVar = (cam.c) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((u) create(cVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws JSONException {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                s sVar = this.f112596x;
                if (i == 0) {
                    yhm.o.b(obj2);
                    cam.c cVar = (cam.c) this.f112595w;
                    cVar.getClass();
                    Objects.toString(cVar.f22670b);
                    this.v = 1;
                    if (sVar.I(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                sVar.H(m.USER_AUTHENTICATED.f112581a, new JSONObject());
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    cam.c cVar2 = (cam.c) this.f112595w;
                    cVar2.getClass();
                    Object obj3 = cVar2.f22670b;
                    Objects.toString(obj3);
                    JSONObject jSONObject = (JSONObject) obj3;
                    if (jSONObject != null) {
                        this.v = 1;
                        Object objC = ((z9m.k) this.f112596x.f112592h.getValue()).c(jSONObject, this);
                        if (objC != aVar2) {
                            objC = Unit.f186387a;
                        }
                        if (objC == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
