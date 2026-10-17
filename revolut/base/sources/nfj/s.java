package nfj;

import com.revolut.retail.feature.esim.impl.network.EsimEventsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;
import yhm.m;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ u A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int u;
    public u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f215029w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f215030x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f215031y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(u uVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.A = uVar;
        this.B = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.A, this.B, continuation, 0);
                sVar.z = obj2;
                return sVar;
            default:
                s sVar2 = new s(this.A, this.B, continuation, 1);
                sVar2.z = obj2;
                return sVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        Object objA2;
        int i = this.u;
        int i2 = 0;
        String str = this.B;
        u uVar = this.A;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.f215031y;
                try {
                } catch (Throwable th10) {
                    m.Companion companion = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    m.Companion companion2 = yhm.m.INSTANCE;
                    this.z = null;
                    this.v = uVar;
                    this.f215029w = str;
                    this.f215030x = 0;
                    this.f215031y = 1;
                    if (u.a(uVar, str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objA = (Response) obj2;
                        m.Companion companion3 = yhm.m.INSTANCE;
                        return new yhm.m(objA);
                    }
                    i2 = this.f215030x;
                    str = this.f215029w;
                    uVar = this.v;
                    yhm.o.b(obj2);
                }
                EsimEventsService esimEventsService = uVar.f215047a;
                this.z = null;
                this.v = null;
                this.f215029w = null;
                this.f215030x = i2;
                this.f215031y = 2;
                obj2 = esimEventsService.dismissEvent(str, this);
                if (obj2 == aVar) {
                    return aVar;
                }
                objA = (Response) obj2;
                m.Companion companion32 = yhm.m.INSTANCE;
                return new yhm.m(objA);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.f215031y;
                try {
                } catch (Throwable th11) {
                    m.Companion companion4 = yhm.m.INSTANCE;
                    objA2 = yhm.o.a(th11);
                }
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    m.Companion companion5 = yhm.m.INSTANCE;
                    this.z = null;
                    this.v = uVar;
                    this.f215029w = str;
                    this.f215030x = 0;
                    this.f215031y = 1;
                    if (u.a(uVar, str, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objA2 = (Response) obj2;
                        m.Companion companion6 = yhm.m.INSTANCE;
                        return new yhm.m(objA2);
                    }
                    i2 = this.f215030x;
                    str = this.f215029w;
                    uVar = this.v;
                    yhm.o.b(obj2);
                }
                EsimEventsService esimEventsService2 = uVar.f215047a;
                this.z = null;
                this.v = null;
                this.f215029w = null;
                this.f215030x = i2;
                this.f215031y = 2;
                obj2 = esimEventsService2.hideEvent(str, this);
                if (obj2 == aVar2) {
                    return aVar2;
                }
                objA2 = (Response) obj2;
                m.Companion companion62 = yhm.m.INSTANCE;
                return new yhm.m(objA2);
        }
    }
}
