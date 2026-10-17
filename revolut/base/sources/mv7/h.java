package mv7;

import com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mv7.f;
import wli.x;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BottomSheet.Button f209161w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, BottomSheet.Button button, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f209161w = button;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, this.f209161w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        j jVar = this.v;
        if (i == 0) {
            o.b(obj2);
            x xVar = jVar.f209163p;
            String str = ((BottomSheet.Action.Deeplink) this.f209161w.f75889b).f75877b;
            lg0.a aVar2 = lg0.a.OPEN_BROWSER;
            this.u = 1;
            if (lg0.b.x1(xVar, str, aVar2, null, this, 4) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        jVar.C2(f.a.f209160a);
        return Unit.f186387a;
    }
}
