package mek;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cli.y;
import com.revolut.retail.feature.pod_nominees.impl.edit.PodNomineeEditScreen;
import com.revolut.retail.feature.pod_nominees.impl.edit.PodNomineeEditScreenContract$InputData;
import com.revolut.retail.feature.pod_nominees.impl.edit.PodNomineeEditScreenContract$LaunchType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PodNomineeEditScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PodNomineeEditScreen podNomineeEditScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = podNomineeEditScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PodNomineeEditScreen podNomineeEditScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                podNomineeEditScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = PodNomineeEditScreen.T;
                podNomineeEditScreen.d3().f143313c.setExpanded(false, true);
                RecyclerView.LayoutManager layoutManager = podNomineeEditScreen.d3().d.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    podNomineeEditScreen.d3().d.smoothScrollToPosition(linearLayoutManager.getItemCount() - 1);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.pod_nominees.impl.edit.c cVar = (com.revolut.retail.feature.pod_nominees.impl.edit.c) podNomineeEditScreen.R2();
                y yVar = cVar.f102602t;
                o oVar = cVar.f102600r;
                PodNomineeEditScreenContract$InputData podNomineeEditScreenContract$InputData = cVar.o;
                PodNomineeEditScreenContract$LaunchType podNomineeEditScreenContract$LaunchType = podNomineeEditScreenContract$InputData.f102589a;
                if (podNomineeEditScreenContract$LaunchType instanceof PodNomineeEditScreenContract$LaunchType.Create) {
                    oVar.Z2((g) ((j2) yVar.f22677a).getValue());
                } else {
                    if (!(podNomineeEditScreenContract$LaunchType instanceof PodNomineeEditScreenContract$LaunchType.Edit)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oVar.b3((g) ((j2) yVar.f22677a).getValue(), ((PodNomineeEditScreenContract$LaunchType.Edit) podNomineeEditScreenContract$InputData.f102589a).f102593a.f102617a);
                }
                return Unit.f186387a;
        }
    }
}
