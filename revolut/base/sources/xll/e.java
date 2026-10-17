package xll;

import com.revolut.sso.api.models.ConsentChallenge;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import vil.f;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.consent.app.b f307050w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ConsentChallenge f307051x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.sso.impl.ui.consent.app.b bVar, ConsentChallenge consentChallenge, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f307050w = bVar;
        this.f307051x = consentChallenge;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f307050w, this.f307051x, continuation, 0);
            default:
                return new e(this.f307050w, this.f307051x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((e) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        ConsentChallenge consentChallenge = this.f307051x;
        com.revolut.sso.impl.ui.consent.app.b bVar = this.f307050w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                f fVar = bVar.f106451r;
                String f105924a = consentChallenge.getF105924a();
                this.v = 1;
                akl.c cVar = ((xjl.b) fVar).f306551a;
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, new akl.a(cVar, f105924a, null), this);
                return objJ == aVar ? aVar : objJ;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                f fVar2 = bVar.f106451r;
                String f105924a2 = consentChallenge.getF105924a();
                this.v = 1;
                akl.c cVar2 = ((xjl.b) fVar2).f306551a;
                p0 p0Var2 = p0.f264001a;
                Object objJ2 = e0.J(elm.f.f127540b, new ad4.c(cVar2, f105924a2, null, 25), this);
                return objJ2 == aVar2 ? aVar2 : objJ2;
        }
    }
}
