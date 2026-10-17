package q49;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.feature.main_screen_ui_customization.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mii.k;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function1 {
    public h u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f242088w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Continuation continuation) {
        super(1, continuation);
        this.f242088w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.f242088w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h hVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        h hVar2 = this.f242088w;
        if (i == 0) {
            o.b(obj2);
            List list = ((c) ((j2) hVar2.f242091r.f22677a).getValue()).f242084b;
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                ekg.g gVar = hVar2.f242089p;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(((FloatingBottomBarView.Item) list.get(i2)).f58588a);
                }
                this.u = hVar2;
                this.v = 1;
                if (gVar.m(arrayList, this) == aVar) {
                    return aVar;
                }
                hVar = hVar2;
            }
            hVar2.B2();
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hVar = this.u;
        o.b(obj2);
        hVar.X1(new k("CHANGES_APPLIED_DIALOG_ID", new TextLocalisedClause(R$string.retail_tab_bar_tab_organiser_items_customize_navigation_order_changes_applied, null, null, 14), null, null, null, 28));
        hVar2.B2();
        return Unit.f186387a;
    }
}
