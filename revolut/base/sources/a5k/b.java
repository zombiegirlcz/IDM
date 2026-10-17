package a5k;

import com.revolut.domain.models.beneficiary.ConfirmationResult;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public ConfirmationResult.ResultCode u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f1433w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f1434x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1435y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f1434x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f1433w = obj2;
        this.f1435y |= Integer.MIN_VALUE;
        return this.f1434x.Z2(null, null, null, false, this);
    }
}
