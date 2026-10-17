package th6;

import com.revolut.feature.external_accounts.impl.repository.network.EarlyCreditService;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qr0.i f271272w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dj0.d f271273x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f271274y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(qr0.i iVar, dj0.d dVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f271272w = iVar;
        this.f271273x = dVar;
        this.f271274y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f271272w, this.f271273x, this.f271274y, continuation, 0);
            default:
                return new e(this.f271272w, this.f271273x, this.f271274y, continuation, 1);
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
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        String str = this.f271274y;
        dj0.d dVar = this.f271273x;
        qr0.i iVar = this.f271272w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    d0<uh6.h> d0VarRequestConsentRequired = ((EarlyCreditService) iVar.f248595b).requestConsentRequired(new uh6.g(mo3.a.p(dVar), str));
                    this.v = 1;
                    obj2 = nim.a.b(d0VarRequestConsentRequired, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Boolean.valueOf(Intrinsics.f(((uh6.h) obj2).getStatus(), "CONSENT_REQUIRED"));
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    EarlyCreditService earlyCreditService = (EarlyCreditService) iVar.f248595b;
                    uh6.g gVar = new uh6.g(mo3.a.p(dVar), str);
                    EarlyCreditService.Companion companion = EarlyCreditService.INSTANCE;
                    efm.b bVarProvideConsent = earlyCreditService.provideConsent(gVar, new wj0.b("PROVIDE_EARLY_CREDIT_CONSENT_IDEMPOTENCY_KEY"));
                    this.v = 1;
                    if (nim.a.a(bVarProvideConsent, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
