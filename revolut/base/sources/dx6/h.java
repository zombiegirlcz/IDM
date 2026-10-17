package dx6;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.extension.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f120899w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.freelancer.impl.ui.extension.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f120899w |= Integer.MIN_VALUE;
        return this.v.h3(this);
    }
}
