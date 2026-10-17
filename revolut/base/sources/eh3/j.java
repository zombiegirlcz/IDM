package eh3;

import aw0.n6;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreen;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ChecklistCollectionScreen f125716w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(ChecklistCollectionScreen checklistCollectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f125716w = checklistCollectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f125716w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j(this.f125716w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
            default:
                j jVar3 = new j(this.f125716w, continuation, 2);
                jVar3.v = obj2;
                return jVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        String str;
        xg3.f fVar;
        int i = this.u;
        ChecklistCollectionScreen checklistCollectionScreen = this.f125716w;
        switch (i) {
            case 0:
                n6 n6Var = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarE3 = checklistCollectionScreen.R2();
                String loadingTag = n6Var.f;
                com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a aVar2 = (com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a) qVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(loadingTag, "loadingTag");
                aVar2.n2(new e8e.w(aVar2, new w(aVar2, loadingTag, null, 0), (Continuation) null), new whi.b(6));
                break;
            case 1:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarE32 = checklistCollectionScreen.R2();
                String id10 = aVar3.f275445a;
                com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a aVar5 = (com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a) qVarE32;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "DISCLAIMER_BUTTON_CLICK_ID")) {
                    aVar5.n2(new e8e.w(aVar5, new v(aVar5, null, 2), (Continuation) null), new whi.b(6));
                } else {
                    hx7.e.n(new IllegalArgumentException(j6.a.q("Unknown text click id: ", id10)));
                }
                break;
            default:
                String id11 = (String) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarE33 = checklistCollectionScreen.R2();
                Intrinsics.h(id11);
                com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a aVar7 = (com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a) qVarE33;
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(id11, "id");
                if (id11.equals("MENU_ITEM_INFO")) {
                    xg3.c cVar = (xg3.c) ((l) ((j2) aVar7.f65822y.f22677a).getValue()).f125717a.getContent();
                    if (cVar == null || (fVar = cVar.f305484a) == null || (str = fVar.d) == null) {
                        str = "question.checklist-challenge-conditions";
                    }
                    aVar7.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(str, 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                } else {
                    hx7.e.n(new IllegalArgumentException("Unknown menu item id: ".concat(id11)));
                }
                break;
        }
        return Unit.f186387a;
    }
}
