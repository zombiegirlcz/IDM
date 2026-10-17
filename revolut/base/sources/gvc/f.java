package gvc;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.security_hub.impl.ui.secure_account.SecureAccountController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ SecureAccountController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SecureAccountController secureAccountController, Continuation continuation) {
        super(2, continuation);
        this.u = secureAccountController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((aw0.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        KProperty[] kPropertyArr = SecureAccountController.U;
        SecureAccountController secureAccountController = this.u;
        RecyclerView.Adapter adapter = ((ScreenContentRecyclerView) secureAccountController.P.getValue()).getAdapter();
        Integer num = adapter != null ? new Integer(adapter.getItemCount()) : null;
        com.revolut.feature.security_hub.impl.ui.secure_account.a aVar2 = (com.revolut.feature.security_hub.impl.ui.secure_account.a) secureAccountController.R2();
        aVar2.getClass();
        if (num != null && num.intValue() > 0) {
            aVar2.H2(aVar2.f85635t, new ai7.a(1, num));
        }
        return Unit.f186387a;
    }
}
