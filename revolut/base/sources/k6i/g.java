package k6i;

import com.revolut.feature.shared.savings.models.SavingsAccountDetails;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.c {
    public String u;
    public SavingsAccountDetails v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f181733w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f181734x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f181735y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, gim.c cVar) {
        super(cVar);
        this.f181734x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f181733w = obj2;
        this.f181735y |= Integer.MIN_VALUE;
        return this.f181734x.c(null, this);
    }
}
