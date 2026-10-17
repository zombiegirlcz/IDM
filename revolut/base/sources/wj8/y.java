package wj8;

import com.revolut.feature.junior_profile.api.models.WorkflowConfiguration;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f298019w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ WorkflowConfiguration f298020x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(c0 c0Var, WorkflowConfiguration workflowConfiguration, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f298019w = c0Var;
        this.f298020x = workflowConfiguration;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y(this.f298019w, this.f298020x, continuation, 0);
            default:
                return new y(this.f298019w, this.f298020x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((y) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                c0 c0Var = this.f298019w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    jvh.a aVar2 = c0Var.f298002s;
                    aim.f builder = new aim.f();
                    WorkflowConfiguration workflowConfiguration = this.f298020x;
                    builder.put(ib.b.Flow, workflowConfiguration.f77111a);
                    String str = workflowConfiguration.f77112b;
                    if (str != null) {
                    }
                    String str2 = workflowConfiguration.f77113c;
                    if (str2 != null) {
                    }
                    String str3 = workflowConfiguration.d;
                    if (str3 != null) {
                    }
                    String str4 = workflowConfiguration.e;
                    if (str4 != null) {
                    }
                    String str5 = workflowConfiguration.f;
                    if (str5 != null) {
                        builder.put("identityType", str5);
                    }
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    aim.f fVarB = builder.b();
                    this.v = 1;
                    obj2 = aVar2.b(fVarB, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                c0Var.C2(new n((String) obj2));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    c0 c0Var2 = this.f298019w;
                    y yVar = new y(c0Var2, this.f298020x, null, 0);
                    this.v = 1;
                    if (c0Var2.p2(this, yVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
