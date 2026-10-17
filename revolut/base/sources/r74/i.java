package r74;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.CreditPromptScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.CreditPromptScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.a;
import com.revolut.kompot.common.ModalDestination;
import ht3.e0;
import ht3.f0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.m;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ CreditPromptScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CreditPromptScreen creditPromptScreen, Continuation continuation) {
        super(2, continuation);
        this.u = creditPromptScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        Object next;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b) this.u.d();
        bVar.getClass();
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = (ht3.o) zi0.c.I(((j) ((j2) bVar.f67336q.f22677a).getValue()).f251990a);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        f0 f0Var = null;
        if (objA instanceof yhm.n) {
            objA = null;
        }
        ht3.o oVar = (ht3.o) objA;
        if (oVar != null) {
            ht3.i iVar = oVar.f155295c;
            String str = iVar != null ? iVar.f155281c : null;
            List list = oVar.k;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (Intrinsics.f(((e0) next).f155265a, str)) {
                        break;
                    }
                }
                e0 e0Var = (e0) next;
                if (e0Var != null) {
                    f0Var = e0Var.f155266b;
                }
            }
            if (f0Var != null) {
                oki.h.v2(bVar.f67337r, new CreditPromptScreenContract$ModalStep.Info(f0Var.f155267a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            } else {
                bVar.C2(a.b.f67334a);
            }
        }
        return Unit.f186387a;
    }
}
