package fe8;

import com.revolut.feature.junior_coparent.impl.services.JuniorCoparentService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
public final class f extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f134465w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f134465w = iVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new f(this.f134465w, continuation, 0).invokeSuspend(Unit.f186387a);
            default:
                return new f(this.f134465w, continuation, 1).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                i iVar = this.f134465w;
                if (i == 0) {
                    o.b(obj2);
                    JuniorCoparentService juniorCoparentService = iVar.f134469a;
                    this.v = 1;
                    obj2 = juniorCoparentService.getCoparentRequests(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                ArrayList arrayListA = i2b.a.A((List) obj2);
                iVar.f134473h.f(Unit.f186387a);
                return arrayListA;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                i iVar2 = this.f134465w;
                if (i2 == 0) {
                    o.b(obj2);
                    JuniorCoparentService juniorCoparentService2 = iVar2.f134469a;
                    this.v = 1;
                    obj2 = juniorCoparentService2.getInvitationApplications(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                ArrayList arrayListY = ifk.b.y((List) obj2);
                iVar2.f.f(Unit.f186387a);
                return arrayListY;
        }
    }
}
