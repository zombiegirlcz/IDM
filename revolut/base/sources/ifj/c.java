package ifj;

import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.esim.api.navigation.EsimFeatureConfig;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public int A;
    public boolean u;
    public TransitionAnimation v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public EsimFeatureConfig.HomeDestination f161024w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f161025x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f161026y;
    public final /* synthetic */ f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, gim.c cVar) {
        super(cVar);
        this.z = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f161026y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.d(false, null, this);
    }
}
