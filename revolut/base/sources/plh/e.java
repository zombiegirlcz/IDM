package plh;

import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import pkf.d1;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.c {
    public Iterator A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d1 f237400w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f237401x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TradingLegalEntityInformation f237402y;
    public Collection z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d1 d1Var, Continuation continuation) {
        super(continuation);
        this.f237400w = d1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f237400w.emit(null, this);
    }
}
