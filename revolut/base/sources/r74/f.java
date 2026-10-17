package r74;

import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.CreditPromptScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.CreditPromptScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.a;
import com.revolut.kompot.common.ModalDestination;
import ht3.e0;
import ht3.f0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditPromptScreen f251989w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(CreditPromptScreen creditPromptScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f251989w = creditPromptScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f251989w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f251989w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            case 2:
                f fVar3 = new f(this.f251989w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
            case 3:
                f fVar4 = new f(this.f251989w, continuation, 3);
                fVar4.v = obj2;
                return fVar4;
            default:
                f fVar5 = new f(this.f251989w, continuation, 4);
                fVar5.v = obj2;
                return fVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((ht3.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e0 e0Var;
        List list;
        Object next;
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        CreditPromptScreen creditPromptScreen = this.f251989w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE3 = creditPromptScreen.d();
                Intrinsics.h(aVar);
                ((com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b) lVarE3).J2(aVar);
                break;
            case 1:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE32 = creditPromptScreen.d();
                Intrinsics.h(clickData);
                com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b) lVarE32;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                bVar.n2(new s(bVar, clickData, null, 0), new whi.b(6));
                break;
            case 2:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE33 = creditPromptScreen.d();
                Intrinsics.h(clickData2);
                com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b bVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b) lVarE33;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                Object content = ((j) ((j2) bVar2.f67336q.f22677a).getValue()).f251990a.getContent();
                ht3.o oVar = content instanceof ht3.o ? (ht3.o) content : null;
                if (oVar == null || (list = oVar.k) == null) {
                    e0Var = null;
                } else {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            String str = ((e0) next).f155265a;
                            String str2 = clickData2.f275445a;
                            if (Intrinsics.f(str, kotlin.text.d0.w0('/', str2, str2))) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    e0Var = (e0) next;
                }
                if (e0Var != null) {
                    oki.h.v2(bVar2.f67337r, new CreditPromptScreenContract$ModalStep.Info(e0Var.f155266b.f155267a), bottom_dialog);
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown link");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                }
                break;
            case 3:
                ty0.a clickData3 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE34 = creditPromptScreen.d();
                Intrinsics.h(clickData3);
                com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b bVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b) lVarE34;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(clickData3, "clickData");
                if (Intrinsics.f(clickData3.f275445a, "INTRO_PROMPT_LINK_ITEM_ID")) {
                    Object obj3 = clickData3.d;
                    f0 f0Var = obj3 instanceof f0 ? (f0) obj3 : null;
                    if (f0Var != null) {
                        oki.h.v2(bVar3.f67337r, new CreditPromptScreenContract$ModalStep.Info(f0Var.f155267a), bottom_dialog);
                    } else {
                        bVar3.C2(a.b.f67334a);
                    }
                } else {
                    bVar3.n2(new s(bVar3, clickData3, null, 1), new whi.b(6));
                }
                break;
            default:
                ht3.a action = (ht3.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b bVar4 = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b) creditPromptScreen.d();
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                bVar4.C2(new k(ht3.d.ITEM_BUTTON, action));
                break;
        }
        return Unit.f186387a;
    }
}
