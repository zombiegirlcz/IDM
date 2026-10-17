package ghh;

import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.c {
    public TransferSubjectId u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f143926w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f143927x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f143928y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f143927x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f143926w = obj2;
        this.f143928y |= Integer.MIN_VALUE;
        return this.f143927x.c(null, null, this);
    }
}
