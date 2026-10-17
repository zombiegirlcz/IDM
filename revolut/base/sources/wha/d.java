package wha;

import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.s0;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public e A;
    public int B;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f297448w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f297449x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public od0.i f297450y;
    public FreelancerAccountOnboardingState z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(s0 s0Var, Continuation continuation) {
        super(continuation);
        this.f297448w = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f297448w.emit(null, this);
    }
}
