package re0;

import gim.i;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends i implements Function3 {
    public /* synthetic */ Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function2 f253480w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f253481x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function1 f253482y;
    public final /* synthetic */ Type z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function2 function2, d dVar, Function1 function1, Type type, Continuation continuation) {
        super(3, continuation);
        this.f253480w = function2;
        this.f253481x = dVar;
        this.f253482y = function1;
        this.z = type;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Function1 function1 = this.f253482y;
        Type type = this.z;
        b bVar = new b(this.f253480w, this.f253481x, function1, type, (Continuation) obj4);
        bVar.u = obj2;
        bVar.v = obj3;
        return bVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3 = this.u;
        Object obj4 = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object value = this.f253480w.invoke(obj3, obj4);
        String key = (String) this.f253482y.invoke(obj3);
        d dVar = this.f253481x;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Type type = this.z;
        Intrinsics.checkNotNullParameter(type, "type");
        dVar.f253485b.G(value, key, type);
        return Unit.f186387a;
    }
}
