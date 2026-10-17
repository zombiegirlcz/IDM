package qic;

import aw0.n6;
import com.revolut.feature.rewards.impl.ui.details.status.expired.PerkDetailsExpiredPerkScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PerkDetailsExpiredPerkScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(PerkDetailsExpiredPerkScreen perkDetailsExpiredPerkScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = perkDetailsExpiredPerkScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        a aVar = a.f246694a;
        PerkDetailsExpiredPerkScreen perkDetailsExpiredPerkScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                perkDetailsExpiredPerkScreen.c3(aVar);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                perkDetailsExpiredPerkScreen.c3(aVar);
                break;
        }
        return Unit.f186387a;
    }
}
