package o1a;

import com.revolut.core.model.account.AccountId;
import gim.i;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.payments.splitbill.impl.ui_new.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Map f221375w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ArrayList f221376x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AccountId.Joint f221377y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.payments.splitbill.impl.ui_new.e eVar, Map map, ArrayList arrayList, AccountId.Joint joint, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f221375w = map;
        this.f221376x = arrayList;
        this.f221377y = joint;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f221375w, this.f221376x, this.f221377y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        AccountId.Joint joint = this.f221377y;
        com.revolut.feature.payments.splitbill.impl.ui_new.e eVar = this.v;
        f fVar = new f(eVar, this.f221375w, this.f221376x, joint, null);
        this.u = 1;
        Object objP2 = eVar.p2(this, fVar);
        return objP2 == aVar ? aVar : objP2;
    }
}
