package xsh;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f308513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f308514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Clause f308515c;
    public final /* synthetic */ dsh.e d;

    public q(r rVar, String str, Clause clause, dsh.e eVar) {
        this.f308513a = rVar;
        this.f308514b = str;
        this.f308515c = clause;
        this.d = eVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        this.f308513a.x2(new rg3.h(1, this.f308514b, new wtl.f((BaseDraggableWidgetDelegate.Model) obj2, 28, this.f308515c, this.d)));
        return Unit.f186387a;
    }
}
