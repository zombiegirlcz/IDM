package nsh;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ish.z;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import yhm.m;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f218878w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(o oVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f218878w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f218878w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j(this.f218878w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
            default:
                j jVar3 = new j(this.f218878w, continuation, 2);
                jVar3.v = obj2;
                return jVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((ky0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((dsh.o) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((ash.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        MutableStateFlow mutableStateFlow;
        ish.l lVar;
        fd0.d dVar;
        ConcurrentHashMap concurrentHashMap;
        int i = this.u;
        o oVar = this.f218878w;
        switch (i) {
            case 0:
                ky0.b bVar = (ky0.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!(bVar instanceof ky0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                SmallActionButtonDelegate.Model model = ((ky0.a) bVar).f190614a;
                if (Intrinsics.f(model.f53337a, "WIDGETS_DECORATION_ADD_BTN_ID")) {
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        Object obj3 = model.f53342j;
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.widgets.api.dependencies.WidgetContext");
                        oVar.b3((WidgetContext) obj3);
                        objA = Unit.f186387a;
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
                    break;
                } else {
                    Unit unit = Unit.f186387a;
                }
                return Unit.f186387a;
            case 1:
                dsh.o oVar2 = (dsh.o) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                WidgetContext widgetContext = jsh.a.a(oVar2.f117335b);
                ash.i iVar = oVar.f218889n;
                String widgetId = oVar2.f117334a;
                z zVar = (z) iVar;
                zVar.getClass();
                Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
                Intrinsics.checkNotNullParameter(widgetId, "widgetId");
                ConcurrentHashMap concurrentHashMap2 = zVar.f168301c;
                ish.l lVar2 = (ish.l) concurrentHashMap2.get(widgetContext.getClass());
                if (lVar2 != null) {
                    ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) lVar2.f168267b.c(widgetContext);
                    ish.m mVar = concurrentHashMap3 != null ? (ish.m) concurrentHashMap3.get(widgetId) : null;
                    if ((mVar != null ? mVar.f168269a : null) != null && (lVar = (ish.l) concurrentHashMap2.get(widgetContext.getClass())) != null && (dVar = lVar.f168267b) != null && (concurrentHashMap = (ConcurrentHashMap) dVar.c(widgetContext)) != null) {
                    }
                    ConcurrentHashMap concurrentHashMap4 = (ConcurrentHashMap) lVar2.f168266a.c(widgetContext);
                    if (concurrentHashMap4 != null && (mutableStateFlow = (MutableStateFlow) concurrentHashMap4.get(widgetId)) != null) {
                        mutableStateFlow.k(new Object());
                    }
                }
                return Unit.f186387a;
            default:
                ash.c cVar = (ash.c) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (cVar.f8930b != ash.b.INITIAL_LOADING && oVar.f218895w.getValue() != null) {
                    oVar.f218896x.k(Unit.f186387a);
                }
                return Unit.f186387a;
        }
    }
}
