package nv4;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends gim.c {
    public h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.statement.export.b f219475w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f219476x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.credit.card.impl.ui.statement.export.b bVar, gim.c cVar) {
        super(cVar);
        this.f219475w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f219476x |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.card.impl.ui.statement.export.b.I2(this.f219475w, null, null, this);
    }
}
