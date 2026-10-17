package bn2;

import com.revolut.feature.backgroundpicker.api.model.BackgroundKey;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.c {
    public Iterator A;
    public BackgroundKey B;
    public Object C;
    public Map D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ahe.f0 f17025w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f17026x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Map f17027y;
    public Map z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ahe.f0 f0Var, Continuation continuation) {
        super(continuation);
        this.f17025w = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f17025w.emit(null, this);
    }
}
