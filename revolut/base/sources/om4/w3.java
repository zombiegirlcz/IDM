package om4;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class w3 extends gim.i implements Function2 {
    public /* synthetic */ boolean u;
    public final /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y3 f226735w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w4l.k f226736x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f226737y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(Object obj2, Continuation continuation, y3 y3Var, w4l.k kVar, boolean z) {
        super(2, continuation);
        this.v = obj2;
        this.f226735w = y3Var;
        this.f226736x = kVar;
        this.f226737y = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        w3 w3Var = new w3(this.v, continuation, this.f226735w, this.f226736x, this.f226737y);
        w3Var.u = ((Boolean) obj2).booleanValue();
        return w3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.getClass();
        return ((w3) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (!z) {
            return new go.g(new Data(this.v, null, false, 6, null), 2);
        }
        return this.f226735w.f226759a.a(this.f226736x, this.f226737y);
    }
}
