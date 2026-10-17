package mt9;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.f f208772w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f208773x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.f fVar, gim.c cVar) {
        super(cVar);
        this.f208772w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f208773x |= Integer.MIN_VALUE;
        return this.f208772w.Z2(null, this);
    }
}
