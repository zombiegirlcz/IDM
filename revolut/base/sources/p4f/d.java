package p4f;

import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public TransferSubjectId u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hel.b f232919w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f232920x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f232921y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f232921y = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f232920x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f232921y.d(null, null, this);
    }
}
