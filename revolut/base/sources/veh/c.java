package veh;

import com.revolut.feature.wealth.options.ui.impl.ui.tab.OptionsTabController;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ OptionsTabController f288320w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(OptionsTabController optionsTabController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f288320w = optionsTabController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f288320w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f288320w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        OptionsTabController optionsTabController = this.f288320w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) optionsTabController.P.getValue();
                Intrinsics.h(id10);
                kVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                kVar.I2(new t5g.h(kVar, LocalDate.parse(id10), 5));
                break;
            default:
                String id11 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar2 = (k) optionsTabController.P.getValue();
                Intrinsics.h(id11);
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(id11, "id");
                Intrinsics.checkNotNullParameter(id11, "<this>");
                qel.b bVar = id11.equals("PUT") ? qel.b.PUT : id11.equals("CALL") ? qel.b.CALL : null;
                if (bVar != null) {
                    kVar2.I2(new vdl.a(kVar2, bVar, 11));
                }
                break;
        }
        return Unit.f186387a;
    }
}
