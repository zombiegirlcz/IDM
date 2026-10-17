package c84;

import android.content.Intent;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class x extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ Intent v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f22110w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Intent intent, z zVar, Continuation continuation) {
        super(1, continuation);
        this.v = intent;
        this.f22110w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new x(this.v, this.f22110w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((x) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            u uVarA = v.a(this.v);
            z zVar = this.f22110w;
            g gVar = zVar.f22113l;
            it3.d dVar = uVarA != null ? uVarA.f22108b : null;
            NaviCommand finishCommand = (uVarA == null || !uVarA.f22107a) ? new FinishCommand(null, null, null, 7) : zVar.f22114m.f258504c.c();
            this.u = 1;
            if (g.f3(gVar, dVar, finishCommand, false, this, 12) == aVar) {
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
