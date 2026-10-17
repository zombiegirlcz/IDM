package ge5;

import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d38.e f143225w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f143226x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Data f143227y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d38.e eVar, Continuation continuation) {
        super(continuation);
        this.f143225w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f143225w.emit(null, this);
    }
}
