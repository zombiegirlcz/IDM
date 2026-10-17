package wtc;

import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeaturesState;

/* JADX INFO: loaded from: classes7.dex */
public final class z0 extends gim.c {
    public final /* synthetic */ a1 A;
    public int B;
    public WealthProtectionFeaturesState u;
    public WealthProtectionFeatureState v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public WealthProtectionFeatureState f299925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public WealthProtectionFeatureState f299926x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public WealthProtectionFeatureState f299927y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, gim.c cVar) {
        super(cVar);
        this.A = a1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.d(null, this);
    }
}
