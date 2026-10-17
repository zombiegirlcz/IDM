package jc7;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import gim.i;
import gsh.n;
import ish.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ HomeFeedWidgetContext.Personal f172743w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ BaseDraggableWidgetDelegate.a f172744x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, HomeFeedWidgetContext.Personal personal, BaseDraggableWidgetDelegate.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f172743w = personal;
        this.f172744x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f172743w, this.f172744x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            ash.i iVar = this.v.f172747c;
            String str = ((q0) this.f172744x).f55476b;
            this.u = 1;
            z zVar = (z) iVar;
            zVar.getClass();
            Object objG = ((n) zVar.c(this.f172743w)).g(u.c(str), this);
            if (objG != aVar) {
                objG = Unit.f186387a;
            }
            if (objG != aVar) {
                objG = Unit.f186387a;
            }
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
