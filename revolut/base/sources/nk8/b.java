package nk8;

import com.revolut.feature.junior_progression.impl.push.JuniorProgressionRefreshWorker;
import gim.c;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends c {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorProgressionRefreshWorker v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f216756w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(JuniorProgressionRefreshWorker juniorProgressionRefreshWorker, Continuation continuation) {
        super(continuation);
        this.v = juniorProgressionRefreshWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f216756w |= Integer.MIN_VALUE;
        return this.v.doWork(this);
    }
}
