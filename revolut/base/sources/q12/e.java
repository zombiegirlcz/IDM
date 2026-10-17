package q12;

import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.c {
    public MoneyRequestChannel.APM u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f241319w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f241320x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f241321y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f241321y = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f241320x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f241321y.a(null, this);
    }
}
