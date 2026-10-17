package ts5;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.c {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q3j.b f273972w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f273973x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Clause f273974y;
    public List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q3j.b bVar, Continuation continuation) {
        super(continuation);
        this.f273972w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f273972w.emit(null, this);
    }
}
