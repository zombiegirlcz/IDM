package qmg;

import com.revolut.feature.user.checklist.api.UserChecklistContentType;
import com.revolut.feature.user.checklist.api.UserChecklistSource;
import com.revolut.feature.user.checklist.impl.ui.screen.UserChecklistContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Continuation continuation) {
        super(2, continuation);
        this.v = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objM;
        l lVar = this.v;
        UserChecklistContract$InputData userChecklistContract$InputData = lVar.f247835t;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            lVar.I2().b(cmg.a.NONE);
            UserChecklistSource userChecklistSource = userChecklistContract$InputData.f94612a;
            if (Intrinsics.f(userChecklistSource, UserChecklistSource.Other.f94600a)) {
                this.u = 1;
                UserChecklistContentType userChecklistContentType = userChecklistContract$InputData.f94613b;
                if (Intrinsics.f(userChecklistContentType, UserChecklistContentType.AdoptionJourney.f94595a)) {
                    objM = lVar.f247832q.n(this);
                    if (objM != aVar) {
                        objM = Unit.f186387a;
                    }
                } else {
                    if (!Intrinsics.f(userChecklistContentType, UserChecklistContentType.FincrimeChecklist.f94596a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objM = lVar.f247833r.m(this);
                    if (objM != aVar) {
                        objM = Unit.f186387a;
                    }
                }
                if (objM == aVar) {
                    return aVar;
                }
            } else if (!Intrinsics.f(userChecklistSource, UserChecklistSource.SlotTiles.f94601a)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
