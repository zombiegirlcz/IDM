package k4a;

import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer.NewTransferScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ NewTransferScreen f180871w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(NewTransferScreen newTransferScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f180871w = newTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f180871w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            default:
                j jVar2 = new j(this.f180871w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        NewTransferScreen newTransferScreen = this.f180871w;
        switch (i) {
            case 0:
                String buttonId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE3 = newTransferScreen.e3();
                Intrinsics.h(buttonId);
                u uVar = (u) lVarE3;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(buttonId, "buttonId");
                uVar.f180887s.getClass();
                uVar.C1(h3a.p.a(buttonId));
                break;
            default:
                String listId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE32 = newTransferScreen.e3();
                Intrinsics.h(listId);
                u uVar2 = (u) lVarE32;
                uVar2.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "PAY_WITH_PHOTO_MENU_ID")) {
                    uVar2.B.Z2();
                }
                break;
        }
        return Unit.f186387a;
    }
}
