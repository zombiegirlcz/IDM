package u1m;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ awl.b f276468a;

    public f(awl.b bVar) {
        this.f276468a = bVar;
    }

    public final Unit a(Serializable serializable) {
        this.f276468a.c(serializable);
        return Unit.f186387a;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
        return a((Serializable) obj2);
    }
}
