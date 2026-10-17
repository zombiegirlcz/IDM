package em3;

import ald.m;
import aw0.n6;
import com.revolut.feature.contacts.impl.ui.contact.screen.details.block_user.BlockUserBottomSheetController;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BlockUserBottomSheetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(BlockUserBottomSheetController blockUserBottomSheetController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = blockUserBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BlockUserBottomSheetController blockUserBottomSheetController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVar = (e) blockUserBottomSheetController.T.getValue();
                int i2 = d.f127597a[eVar.o.f65981b.ordinal()];
                if (i2 == 1) {
                    eVar.l2(new m((Object) eVar, (Object) "BLOCK_BUTTON_LOADING_TAG", true, (Continuation) null, 14), new ei8.d(eVar, 18));
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.l2(new m((Object) eVar, (Object) "UNBLOCK_BUTTON_LOADING_TAG", false, (Continuation) null, 14), new ei8.d(eVar, 18));
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((e) blockUserBottomSheetController.T.getValue()).C2(el3.g.f127239a);
                return Unit.f186387a;
        }
    }
}
