package gob;

import com.revolut.feature.retail.savings.api.navigation.providers.SavingsNavigationProvider$TopUpConfig;
import pcd.s;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.c {
    public s u;
    public SavingsNavigationProvider$TopUpConfig v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f145125w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f145126x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f145127y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f145126x = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f145125w = obj2;
        this.f145127y |= Integer.MIN_VALUE;
        return this.f145126x.a(null, null, this);
    }
}
