package ga9;

import com.revolut.feature.address.models.Address;

/* JADX INFO: loaded from: classes5.dex */
public final class i0 extends gim.c {
    public Address u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v f142083w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f142084x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.revolut.feature.onboarding.impl.onboarding.v vVar, gim.c cVar) {
        super(cVar);
        this.f142083w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f142084x |= Integer.MIN_VALUE;
        return this.f142083w.W2(null, null, this);
    }
}
