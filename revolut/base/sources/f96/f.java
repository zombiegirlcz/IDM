package f96;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.account.DirectDepositAccountScreen;
import ip0.t5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DirectDepositAccountScreen f132841w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(DirectDepositAccountScreen directDepositAccountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f132841w = directDepositAccountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f132841w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f132841w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((sa) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((t5) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DirectDepositAccountScreen directDepositAccountScreen = this.f132841w;
        switch (i) {
            case 0:
                sa model = (sa) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                c cVar = (c) directDepositAccountScreen.Q.getValue();
                Intrinsics.h(model);
                i iVar = (i) cVar;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f54700a, "DIRECT_DEPOSIT_ACTION_ID")) {
                    iVar.C2(b.f132837a);
                }
                break;
            default:
                t5 model2 = (t5) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                c cVar2 = (c) directDepositAccountScreen.Q.getValue();
                Intrinsics.h(model2);
                i iVar2 = (i) cVar2;
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                Object obj3 = model2.e;
                String str = obj3 instanceof String ? (String) obj3 : null;
                if (str != null) {
                    iVar2.f132844r.c(null, str, true, new f2i.b(23));
                }
                break;
        }
        return Unit.f186387a;
    }
}
