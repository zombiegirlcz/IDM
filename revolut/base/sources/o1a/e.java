package o1a;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.payments.bills_chooser.api.common.SplitMethod;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.payments.splitbill.impl.ui_new.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f221369w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AccountId.Joint f221370x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SplitMethod f221371y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.payments.splitbill.impl.ui_new.e eVar, List list, AccountId.Joint joint, SplitMethod splitMethod, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f221369w = list;
        this.f221370x = joint;
        this.f221371y = splitMethod;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, this.f221369w, this.f221370x, this.f221371y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            SplitMethod splitMethod = this.f221371y;
            com.revolut.feature.payments.splitbill.impl.ui_new.e eVar = this.v;
            com.revolut.feature.payments.splitbill.impl.ui_new.a aVar2 = new com.revolut.feature.payments.splitbill.impl.ui_new.a(eVar, this.f221369w, this.f221370x, splitMethod, null);
            this.u = 1;
            if (eVar.p2(this, aVar2) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
