package u1m;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ awl.b f276456a;

    public d(awl.b bVar) {
        this.f276456a = bVar;
    }

    public final Object a(String str) {
        this.f276456a.b(str);
        return Unit.f186387a;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
        return a((String) obj2);
    }
}
