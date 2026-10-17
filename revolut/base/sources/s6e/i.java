package s6e;

import com.revolut.feature.subaccount.api.models.Subaccount;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.c {
    public int A;
    public String u;
    public qua.p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Subaccount f260284w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f260285x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f260286y;
    public final /* synthetic */ z z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(z zVar, gim.c cVar) {
        super(cVar);
        this.z = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f260286y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.f(null, null, this);
    }
}
