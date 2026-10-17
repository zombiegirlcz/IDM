package owf;

import com.revolut.core.model.FileExtension;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f230446w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
        this.f230446w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f230446w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        m mVar = this.v;
        if (i == 0) {
            o.b(obj2);
            ufm.n nVarB = mVar.f230448p.b(this.f230446w, true, FileExtension.Pdf.f51406b);
            this.u = 1;
            obj2 = nim.a.b(nVarB, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        mVar.H2(mVar.f230450r, new b22.j((File) obj2, 5));
        return Unit.f186387a;
    }
}
