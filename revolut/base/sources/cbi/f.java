package cbi;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.n1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_retail_user_declarations.email_verification.b f22865w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature_retail_user_declarations.email_verification.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f22865w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f22865w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f22865w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n1 n1Var = (n1) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(n1Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h.D2(this.f22865w.f97614s);
                break;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                boolean z = n1Var instanceof l1;
                com.revolut.feature_retail_user_declarations.email_verification.b bVar = this.f22865w;
                if (z) {
                    bVar.l2(new com.revolut.feature_retail_user_declarations.email_verification.a(bVar, null), new bwc.i(1, bVar, com.revolut.feature_retail_user_declarations.email_verification.b.class, "onInitError", "onInitError(Ljava/lang/Throwable;)Z", 0, 12));
                } else {
                    h.D2(bVar.f97614s);
                }
                break;
        }
        return Unit.f186387a;
    }
}
