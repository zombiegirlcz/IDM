package f5f;

import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public dj0.d u;
    public TransferSubjectId v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hel.b f132304w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f132305x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f132306y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f132306y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f132305x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f132306y.b(null, null, null, this);
    }
}
