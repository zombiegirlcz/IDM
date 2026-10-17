package q50;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.i3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f242222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f242223b;

    public f(String str, g gVar) {
        this.f242222a = str;
        this.f242223b = gVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        if (Intrinsics.f(((RowDelegate.Model) ((i3) obj2).f54274b).f53228a, this.f242222a)) {
            j jVar = this.f242223b.f242225a;
            jVar.T2(new pwb.p(jVar, null, 12), new yi5.b(27));
        }
        return Unit.f186387a;
    }
}
