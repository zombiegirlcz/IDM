package d0a;

import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import oim.n;
import yhm.o;
import zz9.p;
import zz9.s;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements n {
    public /* synthetic */ od0.i u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ boolean f110335w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f110336x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(s sVar, Continuation continuation) {
        super(4, continuation);
        this.f110336x = sVar;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        a aVar = new a(this.f110336x, (Continuation) obj5);
        aVar.u = (od0.i) obj2;
        aVar.v = zBooleanValue;
        aVar.f110335w = zBooleanValue2;
        return aVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        od0.i iVar = this.u;
        boolean z = this.v;
        boolean z3 = this.f110335w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        return new p((MessageType.Sticker) iVar.f224257a, this.f110336x == s.USER_IS_COMPLETELY_BLOCKED, z, z3);
    }
}
