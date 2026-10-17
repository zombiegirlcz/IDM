package vv7;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vc2.s;
import wli.x;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.a f292465w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f292466x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.a aVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f292465w = aVar;
        this.f292466x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f292465w, this.f292466x, continuation, 0);
            default:
                return new k(this.f292465w, this.f292466x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                x xVar = this.f292465w.f76130p;
                lg0.a aVar2 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, this.f292466x, aVar2, null, this, 4);
                return objX1 == aVar ? aVar : objX1;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.a aVar4 = this.f292465w;
                    s sVar = new s(aVar4, this.f292466x, null, 26);
                    this.v = 1;
                    if (u0.b0(aVar4.X(), "MAKE_CLAIM_LOADING_BUTTON_TAG", sVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
