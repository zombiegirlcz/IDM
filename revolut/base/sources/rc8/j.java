package rc8;

import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f253229w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
        this.f253229w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f253229w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f253229w;
        k kVar = this.v;
        if (i == 0) {
            o.b(obj2);
            ufm.i iVarB3 = k.b3(kVar, str);
            this.u = 1;
            obj2 = nim.a.b(iVarB3, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        kVar.N2(kVar.o2(new kn8.a(((f) obj2).f253227a, str)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new qi3.i(1, kVar, k.class, "handleConfirmationResult", "handleConfirmationResult(Lcom/revolut/feature/junior_settings/api/navigation/JuniorAccountClosureConfirmationPublicContract$OutputData;)V", 0, 28));
        return Unit.f186387a;
    }
}
