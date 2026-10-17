package wxe;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.topup_screen.api.model.StoredMethod;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.details.StoredMethodDetailsScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ StoredMethodDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(StoredMethodDetailsScreen storedMethodDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = storedMethodDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean zBooleanValue;
        aii.r sVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f0 f0Var = (f0) this.u.d();
        StoredMethod storedMethod = (StoredMethod) ((o) ((j2) f0Var.f300906q.f22677a).getValue()).f300910a.getContent();
        if (storedMethod == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Detailed method data should have content when on remove method clicked");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        } else {
            Boolean bool = storedMethod.f90531c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                IllegalStateException illegalStateException2 = new IllegalStateException("Info about deletion allowed not present");
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                zBooleanValue = true;
            }
            if (zBooleanValue) {
                sVar = new t(storedMethod);
            } else {
                String str = storedMethod.f90530b.f90532a;
                StoredMethod.Institution institution = storedMethod.f90529a;
                sVar = new s(str, institution.f90538a, institution.f90539b);
            }
            f0Var.C2(sVar);
        }
        return Unit.f186387a;
    }
}
