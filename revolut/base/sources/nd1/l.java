package nd1;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends gim.c {
    public hf1.f A;
    public int B;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ lmg.k f214299w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f214300x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f214301y;
    public List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(lmg.k kVar, Continuation continuation) {
        super(continuation);
        this.f214299w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f214299w.emit(null, this);
    }
}
