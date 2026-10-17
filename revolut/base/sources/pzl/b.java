package pzl;

import com.revolut.utils.job.workers.ApmMultibancoDynamicFeaturesWorker;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.c {
    public Boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ApmMultibancoDynamicFeaturesWorker f241017w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f241018x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ApmMultibancoDynamicFeaturesWorker apmMultibancoDynamicFeaturesWorker, Continuation continuation) {
        super(continuation);
        this.f241017w = apmMultibancoDynamicFeaturesWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f241018x |= Integer.MIN_VALUE;
        return this.f241017w.doWork(this);
    }
}
