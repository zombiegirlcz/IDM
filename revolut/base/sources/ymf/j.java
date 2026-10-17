package ymf;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import xkf.b2;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.c {
    public Collection A;
    public File B;
    public int C;
    public int D;
    public int E;
    public int F;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b2 f314981w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f314982x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Collection f314983y;
    public Iterator z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b2 b2Var, Continuation continuation) {
        super(continuation);
        this.f314981w = b2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f314981w.emit(null, this);
    }
}
