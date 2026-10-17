package qg7;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.n1;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f245686w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f245687x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f245688y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(u uVar, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f245686w = uVar;
        this.f245687x = str;
        this.f245688y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q(this.f245686w, this.f245687x, this.f245688y, continuation, 0);
                qVar.v = obj2;
                return qVar;
            default:
                q qVar2 = new q(this.f245686w, this.f245687x, this.f245688y, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n1 n1Var = (n1) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(n1Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        String str = this.f245687x;
        switch (i) {
            case 0:
                n1 n1Var = (n1) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    u uVar = this.f245686w;
                    String str2 = this.f245688y;
                    int i2 = 0;
                    uVar.n2(new p(uVar, "claimReward", str2, new m(uVar, str, continuation, i2), (Continuation) null), new j(uVar, str, str2, i2));
                }
                break;
            default:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var2 instanceof l1) {
                    u uVar2 = this.f245686w;
                    uVar2.getClass();
                    String str3 = this.f245688y;
                    uVar2.n2(new p(uVar2, "rejectReward", str3, new m(uVar2, str, continuation, 2), (Continuation) null), new j(uVar2, str, str3, 1));
                }
                break;
        }
        return Unit.f186387a;
    }
}
