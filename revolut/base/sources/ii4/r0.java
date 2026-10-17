package ii4;

import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class r0 extends gim.i implements Function2 {
    public final /* synthetic */ s0 A;
    public final /* synthetic */ long B;
    public s0 u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f161550w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f161551x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f161552y;
    public final /* synthetic */ ArrayList z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(ArrayList arrayList, s0 s0Var, long j2, Continuation continuation) {
        super(2, continuation);
        this.z = arrayList;
        this.A = s0Var;
        this.B = j2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new r0(this.z, this.A, this.B, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        s0 s0Var;
        long j2;
        Iterator it8;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i2 = this.f161552y;
        if (i2 == 0) {
            yhm.o.b(obj2);
            Iterator it9 = this.z.iterator();
            i = 0;
            s0Var = this.A;
            j2 = this.B;
            it8 = it9;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.f161551x;
            j2 = this.f161550w;
            it8 = this.v;
            s0Var = this.u;
            yhm.o.b(obj2);
        }
        while (it8.hasNext()) {
            s0Var.H2(s0Var.f161556r, new b((SpinnerConfiguration.Content.SpinnerContent) it8.next(), 1));
            this.u = s0Var;
            this.v = it8;
            this.f161550w = j2;
            this.f161551x = i;
            this.f161552y = 1;
            if (skm.k0.b(j2, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f186387a;
    }
}
