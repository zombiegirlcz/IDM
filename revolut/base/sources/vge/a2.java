package vge;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class a2 extends gim.i implements Function2 {
    public final /* synthetic */ c2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(c2 c2Var, Continuation continuation) {
        super(2, continuation);
        this.u = c2Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a2(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        c2 c2Var = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        try {
            ProductAccountDescriptor$Value.Main mainB = c2.b(c2Var);
            if (mainB == null) {
                return null;
            }
            ProductAccountId.Payload payloadC = c2.c(c2Var, mainB);
            String id10 = mainB.f89728b.f89729a;
            Intrinsics.checkNotNullParameter(id10, "id");
            ProductAccountDescriptor$Value.Main mainC = ProductAccountDescriptor$Value.Main.c(mainB, null, new ProductAccountId(id10, payloadC), 1);
            if (c2Var.f288880c.a(mainC.f89727a, mainC.f89728b.f89730b)) {
                return mainC;
            }
            c2.a(c2Var, "Stored last selected product account is not visible in the current tab", mainC);
            c2Var.d();
            return null;
        } catch (Exception e) {
            c2Var.getClass();
            if (e instanceof CancellationException) {
                throw e;
            }
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, "ProductAccountLastSelectedStorage", null, e, h0Var);
            c2Var.d();
            return null;
        }
    }
}
