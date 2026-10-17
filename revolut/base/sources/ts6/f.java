package ts6;

import com.revolut.retail.core.navigation.feature.FeatureConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.c {
    public FeatureConfig u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f274003w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f274004x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(s0 s0Var, gim.c cVar) {
        super(cVar);
        this.f274003w = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f274004x |= Integer.MIN_VALUE;
        return this.f274003w.c(null, this);
    }
}
