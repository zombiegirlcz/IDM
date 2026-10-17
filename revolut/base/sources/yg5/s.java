package yg5;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yh5.d;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ArrayList f313537w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.v = uVar;
        this.f313537w = arrayList;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new s(this.v, this.f313537w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((s) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            u uVar = this.v;
            vh5.a aVar2 = uVar.f313543s;
            r rVar = new r(uVar, this.f313537w, null, 0);
            this.u = 1;
            if (aVar2.Z2((3 & 1) != 0, d.a.f313774a, rVar, this) == aVar) {
                return aVar;
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
